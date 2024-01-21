package ir.ac.guilan.ce.ap97.Hendiani.Gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.UIManager;
import java.awt.CardLayout;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.TextArea;

import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.event.ChangeListener;

import ir.ac.guilan.ce.ap97.Hendiani.Gui.Function.Function;
import ir.ac.guilan.ce.ap97.Hendiani.Gui.Function.GamePanel;

import javax.swing.event.ChangeEvent;

public class Gui {

	protected static JFrame frmGameV;
	protected static JTextField txtNarutoUxumaki;
	protected static JTabbedPane tabbedPane;
	protected static JButton btnEnter;
	protected static int xNow = 3;
	protected static int yNow = 3;
	protected static int movNow = 1;
	protected static int colNow = 2;
	protected static int totalNumBlock = 0;
	protected static String space;
	protected static JButton btnNewGame;
	protected static JPanel panWinners;
	protected static JLabel lblPic;
	protected static JPanel theGamePanel;
	protected static int timer = 0;
	protected static int moveCount = 0;
	protected static int disabledCount = 0;
	protected static JLabel lblTime;
	protected static JLabel lblMoveBlock;
	protected static TextArea textArea;
	protected static JButton btnWinners;
	private static JPanel panGame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui window = new Gui();
					window.frmGameV.setVisible(true);
					// setting up the timer and adding it to the label.
					Timer t = new Timer();
					// activating timer.
					t.scheduleAtFixedRate(new TimerTask() {
						@Override
						public void run() {
							timer++;
							lblTime.setText(timer + "\t");
						}
					}, 0, 1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGameV = new JFrame();
		frmGameV.setTitle("GAME v2.0");
		frmGameV.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frmGameV.setBounds(100, 100, 1380, 732);
		frmGameV.setLocationRelativeTo(null);
		frmGameV.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGameV.getContentPane().setLayout(new CardLayout(0, 0));

		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(Color.PINK);
		tabbedPane.setBorder(UIManager.getBorder("DesktopIcon.border"));
		frmGameV.getContentPane().add(tabbedPane, "name_486870686133687");

		JPanel panProfile = new JPanel();
		panProfile.setBorder(UIManager.getBorder("DesktopIcon.border"));
		panProfile.setBackground(Color.GRAY);
		tabbedPane.addTab("PROFILE", null, panProfile, null);
		SpringLayout sl_panProfile = new SpringLayout();
		panProfile.setLayout(sl_panProfile);

		JLabel lblNameSurname = new JLabel("NAME SURNAME :");
		lblNameSurname.setForeground(Color.BLACK);
		lblNameSurname.setFont(new Font("Algerian", Font.PLAIN, 18));
		sl_panProfile.putConstraint(SpringLayout.NORTH, lblNameSurname, 10, SpringLayout.NORTH, panProfile);
		sl_panProfile.putConstraint(SpringLayout.WEST, lblNameSurname, 10, SpringLayout.WEST, panProfile);
		panProfile.add(lblNameSurname);

		JLabel lblNewLabel = new JLabel("DIMENSION :");
		lblNewLabel.setForeground(Color.BLACK);
		sl_panProfile.putConstraint(SpringLayout.NORTH, lblNewLabel, 6, SpringLayout.SOUTH, lblNameSurname);
		sl_panProfile.putConstraint(SpringLayout.WEST, lblNewLabel, 0, SpringLayout.WEST, lblNameSurname);
		sl_panProfile.putConstraint(SpringLayout.EAST, lblNewLabel, 0, SpringLayout.EAST, lblNameSurname);
		lblNewLabel.setFont(new Font("Algerian", Font.PLAIN, 18));
		panProfile.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("NUMBER OF MOVIES :");
		sl_panProfile.putConstraint(SpringLayout.WEST, lblNewLabel_1, 0, SpringLayout.WEST, lblNameSurname);
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Algerian", Font.PLAIN, 18));
		panProfile.add(lblNewLabel_1);

		JLabel lblNumberOfColors = new JLabel("NUMBER OF COLORS :");
		sl_panProfile.putConstraint(SpringLayout.NORTH, lblNumberOfColors, 6, SpringLayout.SOUTH, lblNewLabel_1);
		sl_panProfile.putConstraint(SpringLayout.EAST, lblNumberOfColors, 0, SpringLayout.EAST, lblNewLabel_1);
		lblNumberOfColors.setForeground(Color.BLACK);
		lblNumberOfColors.setFont(new Font("Algerian", Font.PLAIN, 18));
		panProfile.add(lblNumberOfColors);

		txtNarutoUxumaki = new JTextField();
		txtNarutoUxumaki.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txtNarutoUxumaki.setText("");
			}
		});
		txtNarutoUxumaki.setForeground(Color.RED);
		txtNarutoUxumaki.setFont(new Font("Algerian", Font.PLAIN, 18));
		sl_panProfile.putConstraint(SpringLayout.NORTH, txtNarutoUxumaki, 0, SpringLayout.NORTH, lblNameSurname);
		sl_panProfile.putConstraint(SpringLayout.WEST, txtNarutoUxumaki, 6, SpringLayout.EAST, lblNameSurname);
		sl_panProfile.putConstraint(SpringLayout.SOUTH, txtNarutoUxumaki, 24, SpringLayout.NORTH, lblNameSurname);
		sl_panProfile.putConstraint(SpringLayout.EAST, txtNarutoUxumaki, -17, SpringLayout.EAST, panProfile);
		txtNarutoUxumaki.setText("NARUTO UZUMAKI");
		txtNarutoUxumaki.setColumns(10);
		txtNarutoUxumaki.setBackground(Color.LIGHT_GRAY);
		panProfile.add(txtNarutoUxumaki);

		JSpinner spinX = new JSpinner();
		spinX.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				xNow = Integer.parseInt(spinX.getValue().toString());
			}
		});
		sl_panProfile.putConstraint(SpringLayout.NORTH, spinX, 4, SpringLayout.NORTH, lblNewLabel);
		sl_panProfile.putConstraint(SpringLayout.WEST, spinX, 10, SpringLayout.WEST, txtNarutoUxumaki);
		sl_panProfile.putConstraint(SpringLayout.EAST, spinX, -10, SpringLayout.EAST, txtNarutoUxumaki);
		spinX.setModel(new SpinnerNumberModel(3, 3, 30, 1));
		panProfile.add(spinX);

		JLabel lblNewLabel_5 = new JLabel("X");
		sl_panProfile.putConstraint(SpringLayout.NORTH, lblNewLabel_5, 7, SpringLayout.NORTH, lblNewLabel);
		sl_panProfile.putConstraint(SpringLayout.WEST, lblNewLabel_5, 6, SpringLayout.EAST, lblNewLabel);
		panProfile.add(lblNewLabel_5);

		JSpinner spinY = new JSpinner();
		spinY.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				yNow = Integer.parseInt(spinY.getValue().toString());
			}
		});
		spinY.setModel(new SpinnerNumberModel(3, 3, 20, 1));
		sl_panProfile.putConstraint(SpringLayout.NORTH, spinY, 7, SpringLayout.SOUTH, spinX);
		sl_panProfile.putConstraint(SpringLayout.WEST, spinY, 171, SpringLayout.WEST, panProfile);
		sl_panProfile.putConstraint(SpringLayout.EAST, spinY, -27, SpringLayout.EAST, panProfile);
		panProfile.add(spinY);

		JLabel label = new JLabel("Y");
		sl_panProfile.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 12, SpringLayout.SOUTH, label);
		sl_panProfile.putConstraint(SpringLayout.NORTH, label, 10, SpringLayout.SOUTH, lblNewLabel_5);
		sl_panProfile.putConstraint(SpringLayout.WEST, label, 0, SpringLayout.WEST, txtNarutoUxumaki);
		panProfile.add(label);

		JSpinner spinMove = new JSpinner();
		spinMove.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				movNow = Integer.parseInt(spinMove.getValue().toString());
			}
		});
		spinMove.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
		sl_panProfile.putConstraint(SpringLayout.WEST, spinMove, 6, SpringLayout.EAST, lblNewLabel_1);
		sl_panProfile.putConstraint(SpringLayout.SOUTH, spinMove, 0, SpringLayout.SOUTH, lblNewLabel_1);
		sl_panProfile.putConstraint(SpringLayout.EAST, spinMove, 0, SpringLayout.EAST, txtNarutoUxumaki);
		panProfile.add(spinMove);

		JSpinner spinColor = new JSpinner();
		spinColor.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				colNow = Integer.parseInt(spinColor.getValue().toString());
			}
		});
		spinColor.setModel(new SpinnerNumberModel(2, 2, 30, 1));
		sl_panProfile.putConstraint(SpringLayout.NORTH, spinColor, 0, SpringLayout.NORTH, lblNumberOfColors);
		sl_panProfile.putConstraint(SpringLayout.WEST, spinColor, 6, SpringLayout.EAST, lblNumberOfColors);
		sl_panProfile.putConstraint(SpringLayout.EAST, spinColor, 0, SpringLayout.EAST, txtNarutoUxumaki);
		panProfile.add(spinColor);

		btnEnter = new JButton("ENTER");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				// if the name field is empty.
				if (txtNarutoUxumaki.getText().toString().equals("")) {
					JOptionPane.showMessageDialog(null, "Must enter name.", "Error", JOptionPane.ERROR_MESSAGE, null);
				} else {
					// making the main Gui invisible.
					frmGameV.setVisible(false);
					// selecting picture.
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								// the things that should be done when game starts.
								EnterActions window = new EnterActions();
								window.frmSelectImage.setVisible(true);
								// game panel.
								new GamePanel(xNow, yNow, colNow, movNow);
								// new GamePanel(30, 20, 10, 5);
							} catch (Exception e) {
							}
						}
					});
				}
			}
		});
		sl_panProfile.putConstraint(SpringLayout.NORTH, btnEnter, 6, SpringLayout.SOUTH, lblNumberOfColors);
		sl_panProfile.putConstraint(SpringLayout.WEST, btnEnter, 10, SpringLayout.WEST, lblNumberOfColors);
		btnEnter.setFont(new Font("Algerian", Font.PLAIN, 18));
		btnEnter.setBackground(Color.GREEN);
		panProfile.add(btnEnter);

		btnWinners = new JButton("WINNERS");
		btnWinners.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// inputting text to text area.
				Function.inputTextarea();
				// Disabling the winners button.
				btnWinners.setEnabled(false);
				// making the winner tab visible.
				tabbedPane.setEnabledAt(2, true);
			}
		});
		sl_panProfile.putConstraint(SpringLayout.NORTH, btnWinners, 6, SpringLayout.SOUTH, lblNewLabel);
		sl_panProfile.putConstraint(SpringLayout.WEST, btnWinners, 10, SpringLayout.WEST, panProfile);
		sl_panProfile.putConstraint(SpringLayout.SOUTH, btnWinners, -57, SpringLayout.SOUTH, lblNumberOfColors);
		btnWinners.setFont(new Font("Algerian", Font.PLAIN, 18));
		btnWinners.setBackground(Color.RED);
		panProfile.add(btnWinners);

		panGame = new JPanel();
		panGame.setBorder(UIManager.getBorder("DesktopIcon.border"));
		panGame.setBackground(Color.GRAY);
		tabbedPane.addTab("GAME", null, panGame, null);
		tabbedPane.setEnabledAt(1, false);
		panGame.setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBorder(UIManager.getBorder("DesktopIcon.border"));
		panGame.add(panel, BorderLayout.NORTH);

		lblPic = new JLabel("");

		JLabel lblNewLabel_2 = new JLabel("number of moves done & blocks destroyed :  ");
		lblNewLabel_2.setForeground(Color.BLUE);
		lblNewLabel_2.setFont(new Font("Bell MT", Font.BOLD, 20));

		lblMoveBlock = new JLabel("");
		lblMoveBlock.setForeground(Color.BLACK);
		lblMoveBlock.setFont(new Font("Bell MT", Font.BOLD, 20));

		btnNewGame = new JButton("NEW GAME!");
		btnNewGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// showing massage.
				JOptionPane.showMessageDialog(null, "YOU QUIT!\nYOU DON'T HAVE A RANK.", "THAKS FOR PLAYING.",
						JOptionPane.INFORMATION_MESSAGE, null);
				// Disabling the button.
				btnNewGame.setEnabled(false);
				// Disabling the game tab.
				tabbedPane.setEnabledAt(1, false);
				// Enabling the profile tab & the enter bottom.
				btnEnter.setEnabled(true);
				tabbedPane.setEnabledAt(0, true);
			}
		});
		btnNewGame.setForeground(Color.RED);
		btnNewGame.setBackground(new Color(47, 79, 79));
		btnNewGame.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btnNewGame.setToolTipText("If you want to try again without finishing the game.");

		lblTime = new JLabel("");
		lblTime.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTime.setVerticalAlignment(SwingConstants.BOTTOM);
		lblTime.setForeground(Color.RED);
		lblTime.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 20));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup().addGap(6).addComponent(lblPic).addGap(5)
						.addComponent(lblNewLabel_2).addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(lblMoveBlock).addGap(148).addComponent(btnNewGame).addGap(497)
						.addComponent(lblTime).addGap(110)));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup().addGap(6).addComponent(lblPic))
				.addGroup(gl_panel.createSequentialGroup().addGap(6)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel_2)
								.addComponent(lblMoveBlock)))
				.addGroup(gl_panel.createSequentialGroup().addGap(6).addGroup(gl_panel
						.createParallelGroup(Alignment.BASELINE).addComponent(btnNewGame).addComponent(lblTime))));
		panel.setLayout(gl_panel);

		theGamePanel = new JPanel();
		theGamePanel.setBackground(Color.WHITE);
		theGamePanel.setBorder(UIManager.getBorder("DesktopIcon.border"));
		panGame.add(theGamePanel, BorderLayout.CENTER);

		panWinners = new JPanel();
		panWinners.setBorder(UIManager.getBorder("DesktopIcon.border"));
		panWinners.setBackground(Color.GRAY);
		tabbedPane.addTab("WINNERS", null, panWinners, null);
		tabbedPane.setEnabledAt(2, false);
		panWinners.setLayout(new BorderLayout(0, 0));

		textArea = new TextArea();
		textArea.setEditable(false);
		textArea.setFont(new Font("Times New Roman", Font.BOLD, 40));
		textArea.setForeground(Color.BLACK);
		textArea.setBackground(Color.LIGHT_GRAY);
		panWinners.add(textArea, BorderLayout.CENTER);
	}
}
