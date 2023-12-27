package ir.ac.guilan.ce.ap97.Hendiani.Gui.Function;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.*;

import ir.ac.guilan.ce.ap97.Hendiani.Gui.Buttons;
import ir.ac.guilan.ce.ap97.Hendiani.Gui.ColorsEnum;
import ir.ac.guilan.ce.ap97.Hendiani.Gui.Gui;
import ir.ac.guilan.ce.ap97.Hendiani.Gui.Function.Function;

public class GamePanel extends Gui {
	int row = 1;
	int column = 1;
	int colorCount = 1;
	int maxMoveCount = 1;
	ArrayList<ColorsEnum> colors;
	Buttons[][] buttons;
	int ro;
	int col;
	ArrayList<Buttons> sameNeigbours;
	int shiftRow;
	int shiftCol;
	int time = 0;

	public GamePanel() {
		new GamePanel(row, column, colorCount, maxMoveCount);
	}

	public GamePanel(int row, int column, int colorCount, int maxMoveCount) {

		this.row = row;
		this.column = column;
		this.colorCount = colorCount;
		this.maxMoveCount = maxMoveCount;
		moveCount = 0;
		disabledCount = 0;

		initilize();

		decorateGame(row, column, colorCount);

	}

	private void initilize() {
		colors = new ArrayList<ColorsEnum>();
		colors.add(ColorsEnum.c1);
		colors.add(ColorsEnum.c2);
		colors.add(ColorsEnum.c3);
		colors.add(ColorsEnum.c4);
		colors.add(ColorsEnum.c5);
		colors.add(ColorsEnum.c6);
		colors.add(ColorsEnum.c7);
		colors.add(ColorsEnum.c8);
		colors.add(ColorsEnum.c9);
		colors.add(ColorsEnum.c10);
		colors.add(ColorsEnum.c11);
		colors.add(ColorsEnum.c12);
		colors.add(ColorsEnum.c13);
		colors.add(ColorsEnum.c14);
		colors.add(ColorsEnum.c15);
		colors.add(ColorsEnum.c16);
		colors.add(ColorsEnum.c17);
		colors.add(ColorsEnum.c18);
		colors.add(ColorsEnum.c19);
		colors.add(ColorsEnum.c20);
		colors.add(ColorsEnum.c21);
		colors.add(ColorsEnum.c22);
		colors.add(ColorsEnum.c23);
		colors.add(ColorsEnum.c24);
		colors.add(ColorsEnum.c25);
		colors.add(ColorsEnum.c26);
		colors.add(ColorsEnum.c27);
		colors.add(ColorsEnum.c28);
		colors.add(ColorsEnum.c29);
		colors.add(ColorsEnum.c30);
	}

	private void decorateGame(int row, int column, int colorCount) {
		theGamePanel.setLayout(new GridLayout(row, 1));
		buttons = new Buttons[row][column];
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				try {
					int i = 0;
					for (ro = 0; ro < row; ro++) {
						for (col = 0; col < column; col++, i++) {
							buttons[ro][col] = new Buttons();
							// Get a new random color.
							Random ran = new Random();
							int colorIndex = ran.nextInt(colorCount);
							Color randomColor = colors.get(colorIndex).getColor();
							buttons[ro][col].setColor(colors.get(colorIndex));
							buttons[ro][col].setBackground(randomColor);
							buttons[ro][col].setId(i);
							buttons[ro][col].setRow(ro);
							buttons[ro][col].setColumn(col);
							buttons[ro][col].setText("");
							// set action listener for clicking.
							buttons[ro][col].addActionListener(new ActionListener() {
								@Override
								public void actionPerformed(ActionEvent actionEvent) {
									// if user runs out of moves.
									if (moveCount > maxMoveCount) {
										Function.endOfGame(timer);
									}

									sameNeigbours = new ArrayList<>();
									Buttons obj = ((Buttons) actionEvent.getSource());
									// checking neighbors.
									checkNeigbours(obj.getRow(), obj.getColumn());

									// if it got three neighbors.
									if (sameNeigbours.size() >= 3) {
										moveCount++;
										// changing destroyed neighbors.
										for (Buttons selectedDooz : sameNeigbours) {
											selectedDooz.setEnabled(false);
											selectedDooz.setBackground(Color.WHITE);
											selectedDooz.setColor(ColorsEnum.WHITE);
										}

										// shift up.
										shiftUP();
										theGamePanel.repaint();
										// now shift right.
										shiftRight();
										theGamePanel.repaint();

										// Counting destroyed blocks.
										disabledCount = 0;
										for (shiftRow = 0; shiftRow < row; shiftRow++) {
											for (shiftCol = 0; shiftCol < col; shiftCol++) {
												if (!buttons[shiftRow][shiftCol].isEnabled()) {
													disabledCount++;
												}
											}
										}

										SwingUtilities.invokeLater(new Runnable() {
											public void run() {
												// setting the number of movies done and blocks destroyed.
												lblMoveBlock.setText(moveCount + " & " + disabledCount);
											}
										});
										// if number of blocks destroyed is equal to the total number of blocks made.
										if (disabledCount == (row * col)) {
											Function.endOfGame(timer);
											// if number of blocks left is less than 3.
										} else if (((row * col) - disabledCount) < 3) {
											Function.endOfGame(timer);
											// if number of moves done is equal to number of moves that can be done.
										} else if (moveCount >= maxMoveCount) {
											Function.endOfGame(timer);
											// Disabling all the buttons if game ends.
											for (shiftRow = 0; shiftRow < row; shiftRow++) {
												for (shiftCol = 0; shiftCol < col; shiftCol++) {
													buttons[shiftRow][shiftCol].setEnabled(false);
												}
											}
										}
									}

								}
							});
							// adding a new button to the panel.
							theGamePanel.add(buttons[ro][col], i);
						}

					}

				} catch (Exception e) {
				}
			}
		});

	}

	private void checkNeigbours(int checkRow, int checkCol) {
		
		if (!sameNeigbours.contains(buttons[checkRow][checkCol])) {
			sameNeigbours.add(buttons[checkRow][checkCol]);
			// TODO
			// System.out.println("button id: " + buttons[checkRow][checkCol]);

			// check for 8 neighbors.
			if (checkRow - 1 >= 0
					&& buttons[checkRow][checkCol].getColor().equals(buttons[checkRow - 1][checkCol].getColor())) {// top
																													// button
				checkNeigbours(checkRow - 1, checkCol);
			}

			if (checkRow - 1 >= 0 && checkCol - 1 >= 0
					&& buttons[checkRow][checkCol].getColor().equals(buttons[checkRow - 1][checkCol - 1].getColor())) // top
																														// left
																														// button
			{
				checkNeigbours(checkRow - 1, checkCol - 1);
			}

			if (checkCol - 1 >= 0
					&& buttons[checkRow][checkCol].getColor().equals(buttons[checkRow][checkCol - 1].getColor())) // left
																													// button
			{
				checkNeigbours(checkRow, checkCol - 1);
			}

			if (checkCol - 1 >= 0 && checkRow + 1 <= row - 1
					&& buttons[checkRow][checkCol].getColor().equals(buttons[checkRow + 1][checkCol - 1].getColor())) { // bottom
																														// left
																														// button
				checkNeigbours(checkRow + 1, checkCol - 1);
			}

			if (checkRow + 1 <= row - 1
					&& buttons[checkRow][checkCol].getColor().equals(buttons[checkRow + 1][checkCol].getColor())) { // bottom
																													// button
				checkNeigbours(checkRow + 1, checkCol);
			}
			if (checkRow + 1 <= row - 1 && checkCol + 1 <= col - 1
					&& buttons[checkRow][checkCol].getColor().equals(buttons[checkRow + 1][checkCol + 1].getColor())) { // bottom
																														// right
																														// button
				checkNeigbours(checkRow + 1, checkCol + 1);
			}
			if (checkCol + 1 <= col - 1
					&& buttons[checkRow][checkCol].getColor().equals(buttons[checkRow][checkCol + 1].getColor())) { // right
																													// button
				checkNeigbours(checkRow, checkCol + 1);
			}

			if (checkRow - 1 >= 0 && checkCol + 1 <= col - 1
					&& buttons[checkRow][checkCol].getColor().equals(buttons[checkRow - 1][checkCol + 1].getColor())) { // top
																														// right
																														// button
				checkNeigbours(checkRow - 1, checkCol + 1);
			}
		}
	}

	private void shiftUP() {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				try {
					for (shiftRow = row - 1; shiftRow > 0; shiftRow--) {
						for (shiftCol = 0; shiftCol < col; shiftCol++) {

							if (!buttons[shiftRow][shiftCol].isEnabled()) {

								// temp button for swamping.
								Buttons tempButton = new Buttons();
								tempButton.setColor(buttons[shiftRow][shiftCol].getColor());
								tempButton.setBackground(buttons[shiftRow][shiftCol].getColor().getColor());
								tempButton.setEnabled(buttons[shiftRow][shiftCol].isEnabled());

								int selectedRow = shiftRow - 1;
								int i = 0;

								while (i < shiftRow - 1 && !buttons[shiftRow - 1 - i][shiftCol].isEnabled()) {
									i++;
									selectedRow = shiftRow - 1 - i;
								}
								// TODO
								/*
								 * System.out.println("column : " + buttons[shiftRow][shiftCol] +
								 * " , replace by: " + buttons[selectedRow][shiftCol]);
								 */
								// replace button with top enable button.
								buttons[shiftRow][shiftCol].setColor(buttons[selectedRow][shiftCol].getColor());
								buttons[shiftRow][shiftCol]
										.setBackground(buttons[selectedRow][shiftCol].getColor().getColor());
								buttons[shiftRow][shiftCol].setEnabled(buttons[selectedRow][shiftCol].isEnabled());

								// replace temp with disabled button.
								buttons[selectedRow][shiftCol].setColor(tempButton.getColor());
								buttons[selectedRow][shiftCol].setBackground(tempButton.getColor().getColor());
								buttons[selectedRow][shiftCol].setEnabled(tempButton.isEnabled());
							}
						}
					}

				} catch (Exception e) {
				}

			}
		});

	}

	private void shiftRight() {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				try {
					for (shiftRow = 0; shiftRow < row; shiftRow++) {
						for (shiftCol = 0; shiftCol < col; shiftCol++) {

							if (!buttons[shiftRow][shiftCol].isEnabled()) {

								// temp button for swapping.
								Buttons tempButton = new Buttons();
								tempButton.setColor(buttons[shiftRow][shiftCol].getColor());
								tempButton.setBackground(buttons[shiftRow][shiftCol].getColor().getColor());
								tempButton.setEnabled(buttons[shiftRow][shiftCol].isEnabled());

								int selectedCol = shiftCol;
								int i = 0;
								// find right enabled button.
								while (shiftCol + i < col - 1 && !buttons[shiftRow][shiftCol + i].isEnabled()) {
									i++;
									selectedCol = shiftCol + i;

								}
								// TODO
								/*
								 * System.out.println("column : " + buttons[shiftRow][shiftCol] +
								 * " , replace by: " + buttons[shiftRow][selectedCol]);
								 */
								// replace button with right enable button.
								buttons[shiftRow][shiftCol].setColor(buttons[shiftRow][selectedCol].getColor());
								buttons[shiftRow][shiftCol]
										.setBackground(buttons[shiftRow][selectedCol].getColor().getColor());
								buttons[shiftRow][shiftCol].setEnabled(buttons[shiftRow][selectedCol].isEnabled());

								// replace temp with disabled button.
								buttons[shiftRow][selectedCol].setColor(tempButton.getColor());
								buttons[shiftRow][selectedCol].setBackground(tempButton.getColor().getColor());
								buttons[shiftRow][selectedCol].setEnabled(tempButton.isEnabled());
							}
						}
					}

				} catch (Exception e) {
				}

			}
		});

	}
}
