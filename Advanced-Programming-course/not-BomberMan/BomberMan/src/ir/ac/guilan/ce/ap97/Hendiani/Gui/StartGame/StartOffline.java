package ir.ac.guilan.ce.ap97.Hendiani.Gui.StartGame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JSpinner;
import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import javax.swing.SpinnerNumberModel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import ir.ac.guilan.ce.ap97.Hendiani.Function.Function;
import ir.ac.guilan.ce.ap97.Hendiani.Gui.Login.Login;
import ir.ac.guilan.ce.ap97.Hendiani.Gui.Login.SignUp;
import ir.ac.guilan.ce.ap97.Hendiani.Gui.OfflineGame.OfflineGame;
import ir.ac.guilan.ce.ap97.Hendiani.Gui.Profile.Profile;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JSlider;
import javax.swing.JToggleButton;

public class StartOffline {

	public static JFrame frmEnter;
	public static JSpinner spinY;
	public static JSpinner spinX;
	public static JSpinner numEnemy;
	public static int theX = 600;
	public static int theY = 600;
	public static int enemy = 1;
	public static int count = 0;
	public static int millisec1 = 1000;
	public static int millisec2 = 500;
	public static int theBombTime = 3;
	public static int explodTime = 4;
	private JToggleButton edit;
	private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

	/**
	 * Create the application.
	 */
	public StartOffline() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEnter = new JFrame();
		frmEnter.setTitle("Ready");
		frmEnter.setIconImage(Toolkit.getDefaultToolkit()
				.getImage(StartOffline.class.getResource("/ir/ac/guilan/ce/ap97/Hendiani/Gui/Icon/sword.png")));
		frmEnter.setBounds(100, 100, 485, 164);
		frmEnter.setLocationRelativeTo(null);
		frmEnter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEnter.getContentPane().setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		panel.setBackground(new Color(103, 128, 159));
		frmEnter.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel = new JLabel(" screen aspect ratio ");
		lblNewLabel.setBackground(new Color(52, 73, 94));
		lblNewLabel.setFont(new Font("Algerian", Font.PLAIN, 13));
		lblNewLabel.setForeground(Color.BLACK);
		panel.add(lblNewLabel, BorderLayout.WEST);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(103, 128, 159));
		panel.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new BorderLayout(0, 0));

		spinX = new JSpinner();
		spinX.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				frmEnter.setBounds(100, 100, Integer.parseInt(spinX.getValue().toString()),
						Integer.parseInt(spinY.getValue().toString()));
				frmEnter.setLocationRelativeTo(null);
				theX = Integer.parseInt(spinX.getValue().toString());
			}
		});
		int temp1 = (int) screenSize.getWidth();
		spinX.setModel(new SpinnerNumberModel(600, 600, temp1, 1));
		spinX.setForeground(Color.BLACK);
		spinX.setBackground(new Color(34, 49, 63));
		panel_2.add(spinX, BorderLayout.NORTH);

		spinY = new JSpinner();
		spinY.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				frmEnter.setBounds(100, 100, Integer.parseInt(spinX.getValue().toString()),
						Integer.parseInt(spinY.getValue().toString()));
				frmEnter.setLocationRelativeTo(null);
				theY = Integer.parseInt(spinY.getValue().toString());
			}
		});
		int temp2 = (int) screenSize.getHeight();
		spinY.setModel(new SpinnerNumberModel(600, 600, temp2, 1));
		spinY.setForeground(Color.BLACK);
		panel_2.add(spinY, BorderLayout.SOUTH);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(103, 128, 159));
		frmEnter.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));

		JPanel panel_4 = new JPanel();
		panel_4.setForeground(new Color(0, 0, 0));
		panel_4.setBackground(new Color(103, 128, 159));
		panel_1.add(panel_4, BorderLayout.NORTH);
		panel_4.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel_1 = new JLabel(" Number of enemies ");
		lblNewLabel_1.setBackground(new Color(52, 73, 94));
		panel_4.add(lblNewLabel_1, BorderLayout.WEST);
		lblNewLabel_1.setFont(new Font("Algerian", Font.PLAIN, 13));
		lblNewLabel_1.setForeground(Color.BLACK);

		numEnemy = new JSpinner();
		numEnemy.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				enemy = Integer.parseInt(numEnemy.getValue().toString());
			}
		});
		numEnemy.setModel(new SpinnerNumberModel(1, 1, 23, 1));
		panel_4.add(numEnemy, BorderLayout.CENTER);

		JLabel lblBack = new JLabel("");
		lblBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmEnter.setVisible(false);
				Profile.frmProfile.setVisible(true);
			}
		});
		lblBack.setIcon(
				new ImageIcon(StartOffline.class.getResource("/ir/ac/guilan/ce/ap97/Hendiani/Gui/Icon/exit (2).png")));
		lblBack.setVerticalAlignment(SwingConstants.BOTTOM);
		lblBack.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1.add(lblBack, BorderLayout.WEST);

		JLabel lblStart = new JLabel("");
		lblStart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frmEnter.setBounds(100, 100, Integer.parseInt(spinX.getValue().toString()),
						Integer.parseInt(spinY.getValue().toString()));
				frmEnter.setLocationRelativeTo(null);
				frmEnter.setVisible(false);
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							OfflineGame window = new OfflineGame();
							window.frmBomberman.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							try {
								if (edit.isSelected()) {
									Function.GameMode("boost");
								} else {
									Function.GameMode("g");
								}
								count = 0;
							} catch (Exception e1) {
							}

							// setting up the timer and adding it to the label.
							Timer t = new Timer();
							// activating timer.
							t.scheduleAtFixedRate(new TimerTask() {
								@Override
								public void run() {
									try {
										if (OfflineGame.currentLife > 0) {
											OfflineGame.timer++;
											OfflineGame.lblTime.setText(OfflineGame.timer + "\t");
										}

										// random hart appearance.
										if ((OfflineGame.timer != 0 && OfflineGame.timer % 40 == 0)
												|| OfflineGame.shouldCount20Sec) {
											if (OfflineGame.timer % 40 == 0) {
												Function.setItems(1, 3);
												OfflineGame.shouldCount20Sec = true;
											}
											OfflineGame.sec20Count++;
											// if it gets 20 second it should disappear.
											if (OfflineGame.sec20Count == 20 && Function.hartPositions.size() > 0) {
												// Reseting data.
												Function.removeAhart();
												OfflineGame.shouldCount20Sec = false;
												OfflineGame.sec20Count = 0;
											}
										}
									} catch (Exception e) {
									}

									try {

										try {
											// when should star appear.
											if (OfflineGame.timer != 0
													&& OfflineGame.timer % OfflineGame.whenShouldStartApear == 0) {
												// resetting a random time.
												OfflineGame.whenShouldStartApear = Integer
														.parseInt(Function.ran(1, 9) + "0");
												Function.setItems(1, 4);
												OfflineGame.numSatarAearing++;
												// TODO maximum number of stars able to exists on the board.
												if (Function.starPositions.size() > OfflineGame.maxNumbStarOnScrean
														&& OfflineGame.numSatarAearing > OfflineGame.maxNumbStarOnScrean) {
													Function.removeAstar();
												}
											}
										} catch (Exception e) {
										}
									} catch (NumberFormatException e) {
									}

									try {
										// if user gets 1 star.
										if (OfflineGame.starCount == 1) {
											OfflineGame.sec40Count++;
											// if it gets 40 second its effects should disappear.
											if (OfflineGame.sec40Count == 40) {
												// Reseting data.
												OfflineGame.sec40Count = 0;
												OfflineGame.starCount -= 1;
											}
										}
										// if user gets 2 star.
										if (OfflineGame.starCount == 2) {
											OfflineGame.sec40Count2++;
											// if it gets 40 second its effects should disappear.
											if (OfflineGame.sec40Count2 == 40) {
												// Reseting data.
												OfflineGame.sec40Count2 = 0;
												OfflineGame.starCount -= 1;
											}
										}
										// if user gets 3 star.
										if (OfflineGame.starCount == 3) {
											OfflineGame.sec40Count3++;
											// if it gets 40 second its effects should disappear.
											if (OfflineGame.sec40Count3 == 40) {
												// Reseting data.
												OfflineGame.sec40Count3 = 0;
												OfflineGame.starCount -= 1;
											}
										}
									} catch (Exception e) {
									}

									try {
										// if bomb has bean activated.
										if (OfflineGame.bombActive) {
											OfflineGame.bombTimer++;
											// it should explode.
											if (OfflineGame.bombTimer == theBombTime) {
												Function.explosion(Function.bombX, Function.bombY);
												// resetting data.
												OfflineGame.currentNumBomb--;
												OfflineGame.stop = false;
											}
										}
									} catch (Exception e) {
									}

								}
							}, 0, millisec1);

							// refresh 0.5 FPS.
							Timer t2 = new Timer();
							// activating timer.
							t2.scheduleAtFixedRate(new TimerTask() {
								@Override
								public void run() {
									if (OfflineGame.currentLife > 0) {
										Function.ranMove();
									}

									try {
										// in the same position as bomb.
										if (OfflineGame.bombTimer == theBombTime) {
											if (Function.x == Function.bombX && Function.y == Function.bombY) {
												OfflineGame.currentLife = (float) 0.5;
												OfflineGame.stop = true;
											}
										}

										// making explosion go away
										if (OfflineGame.bombTimer > explodTime) {
											OfflineGame.bombTimer = 0;
											OfflineGame.canExplode = true;
											OfflineGame.bombActive = false;
											Function.removeExplosions();
										}

										// showing number of starts and setting radius of bomb.
										if (OfflineGame.starCount == 1) {
											OfflineGame.lblStar1.show();
											OfflineGame.lblStar2.hide();
											OfflineGame.lblStar3.hide();
											OfflineGame.bombradios = 4;
										} else if (OfflineGame.starCount == 2) {
											OfflineGame.lblStar2.show();
											OfflineGame.lblStar1.show();
											OfflineGame.lblStar3.hide();
											OfflineGame.bombradios = 6;
										} else if (OfflineGame.starCount == 3) {
											OfflineGame.lblStar3.show();
											OfflineGame.lblStar1.show();
											OfflineGame.lblStar2.show();
											OfflineGame.bombradios = 8;
										} else {
											OfflineGame.lblStar1.hide();
											OfflineGame.lblStar2.hide();
											OfflineGame.lblStar3.hide();
											OfflineGame.bombradios = 2;
										}

										// setting the life span.
										if (OfflineGame.currentLife == 1) {
											OfflineGame.lblLife.setIcon(new ImageIcon(OfflineGame.class.getResource(
													"/ir/ac/guilan/ce/ap97/Hendiani/image/hude/hud_heartFull.png")));
										} else if (OfflineGame.currentLife == 0.5) {
											OfflineGame.lblLife.setIcon(new ImageIcon(OfflineGame.class.getResource(
													"/ir/ac/guilan/ce/ap97/Hendiani/image/hude/hud_heartHalf.png")));
										} else {
											OfflineGame.lblLife.setIcon(new ImageIcon(OfflineGame.class.getResource(
													"/ir/ac/guilan/ce/ap97/Hendiani/image/hude/hud_heartEmpty.png")));
											if (count == 0) {
												// you have lost.
												Function.score(0);
												JOptionPane.showMessageDialog(null,
														"Your score is(" + Function.s + ").", "YOU DIED!!!",
														JOptionPane.QUESTION_MESSAGE, null);
												count += 1;
											}
											OfflineGame.frmBomberman.setVisible(false);
											// StartOffline.frmEnter.setVisible(true);
											// TODO X
											System.exit(0);
										}
									} catch (Exception e) {
									}

									if (Function.explosionIsRemoved)
										Function.removeExplosions();

									// user has won.
									if (Function.enemyPositions.size() == 0) {
										Function.score(1);
										JOptionPane.showMessageDialog(null, "Your score is(" + Function.s + ").",
												"YOU WON!!!", JOptionPane.QUESTION_MESSAGE, null);
										// StartOffline.frmEnter.setVisible(true);
										// TODO X
										System.exit(0);
									}

									// Function.show(); //TODO SHOW.
									if (OfflineGame.currentLife > 0) {
										Function.show();
										Function.setGui();
									}

								}
							}, 0, millisec2);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});

		edit = new JToggleButton("Normal");
		edit.setForeground(Color.BLACK);
		edit.setBackground(new Color(30, 130, 76));
		edit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (edit.isSelected()) {
					edit.setText("Overclock");
					UIManager.put("ToggleButton.select", new Color(150, 40, 27));
					SwingUtilities.updateComponentTreeUI(edit);
				} else {
					edit.setText("Normal");
					edit.setBackground(new Color(30, 130, 76));
				}
			}
		});
		panel_1.add(edit, BorderLayout.CENTER);
		lblStart.setHorizontalAlignment(SwingConstants.RIGHT);
		lblStart.setVerticalAlignment(SwingConstants.BOTTOM);
		lblStart.setIcon(new ImageIcon(
				StartOffline.class.getResource("/ir/ac/guilan/ce/ap97/Hendiani/Gui/Icon/power-button.png")));
		panel_1.add(lblStart, BorderLayout.EAST);
	}
}
