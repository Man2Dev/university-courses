package ir.ac.guilan.ce.ap97.Hendiani.Gui;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import ir.ac.guilan.ce.ap97.Hendiani.Function.Function;

import java.awt.Component;
import javax.swing.Box;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DropMode;

public class Gui {
	protected static JTextField namefil1;
	protected static JTextField lastfil1;
	protected static JTextField counfil1;
	protected static JTextField anifil1;
	protected static JTextField fruifil1;
	protected static JTextField pointfil1;
	protected static JTextField lettfil1;
	protected static JTextField lettfil2;
	protected static JTextField lettfil3;
	protected static JTextField lettfil4;
	protected static JTextField lettfil5;
	protected static JTextField namefil2;
	protected static JTextField lastfil2;
	protected static JTextField counfil2;
	protected static JTextField anifil2;
	protected static JTextField fruifil2;
	protected static JTextField pointfil2;
	protected static JTextField namefil3;
	protected static JTextField lastfil3;
	protected static JTextField counfil3;
	protected static JTextField anifil3;
	protected static JTextField fruifil3;
	protected static JTextField pointfil3;
	protected static JTextField namefil4;
	protected static JTextField lastfil4;
	protected static JTextField counfil4;
	protected static JTextField anifil4;
	protected static JTextField fruifil4;
	protected static JTextField pointfil4;
	protected static JTextField namefil5;
	protected static JTextField lastfil5;
	protected static JTextField counfil5;
	protected static JTextField anifil5;
	protected static JTextField fruifil5;
	protected static JTextField pointfil5;
	protected static boolean gameStarted = false;
	protected static String name = "";
	protected static int timer = 180;
	protected static JFrame frmGameV;
	protected static JTabbedPane tabbedPane;
	protected static JLabel lblPic;
	protected static JLabel data;
	protected static JLabel time;
	protected static JButton btnEnter;
	protected static JButton btnStop;
	protected static int round = 1;
	protected static int numWin = 0;
	protected static int numLost = 0;
	protected static int point1 = 0;
	protected static int point2 = 0;
	protected static int point3 = 0;
	protected static int point4 = 0;
	protected static int point5 = 0;
	protected static String title;
	protected static String title2;

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
							if (gameStarted) {
								timer--;
								time.setText(timer + "\t");
								if (timer < 0) {
									time.setText("0");
									try {
										Function.endOfGame(0);
									} catch (Exception e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}
							}
						}
					}, 0, 1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private JPanel profilePanel;
	private JPanel GamePanel;
	private JPanel payingPalen;
	private JPanel dataPanel;
	private JLabel lblWinnsAndLouses;
	private JLabel lblLastName;
	private JLabel lblCountry;
	private JLabel lblAnimal;
	private JLabel lblFtuits;
	private JLabel lblPoints;
	private JLabel lblLetter;
	private JLabel lblNewLabel;
	private JLabel lblRound;
	private JLabel lblRound_1;
	private JLabel lblRound_2;
	private JLabel lblRound_3;
	private JLabel label_1;
	private JLabel label_2;
	private JTextField textField;
	private JComboBox comboBox_1;
	private JButton button_1;

	/**
	 * Create the application.
	 * 
	 * @wbp.parser.entryPoint
	 */
	public Gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGameV = new JFrame();
		frmGameV.getContentPane().setBackground(SystemColor.inactiveCaption);
		frmGameV.setTitle("NameGame v0.1");
		frmGameV.setBackground(Color.DARK_GRAY);
		frmGameV.setBounds(100, 100, 1388, 429);
		// frmGameV.setExtendedState(JFrame.MAXIMIZED_BOTH);
		// frmGameV.setBounds(100, 100, 1380, 732);

		frmGameV.setLocationRelativeTo(null);
		frmGameV.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(Color.PINK);
		tabbedPane.setForeground(SystemColor.infoText);
		tabbedPane.setFont(new Font("Algerian", Font.PLAIN, 18));
		tabbedPane.setBorder(UIManager.getBorder("DesktopIcon.border"));

		frmGameV.getContentPane().add(tabbedPane, BorderLayout.CENTER);

		profilePanel = new JPanel();
		profilePanel.setBorder(UIManager.getBorder("DesktopIcon.border"));
		profilePanel.setBackground(new Color(0, 139, 139));
		tabbedPane.addTab("PROFILE", null, profilePanel, null);
		SpringLayout sl_profilePanel = new SpringLayout();
		profilePanel.setLayout(sl_profilePanel);

		btnEnter = new JButton("ENTER");
		sl_profilePanel.putConstraint(SpringLayout.WEST, btnEnter, 10, SpringLayout.WEST, profilePanel);
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// if the name field is empty.
				if (textField.getText().toString().equals("")) {
					JOptionPane.showMessageDialog(null, "Must enter name.", "Error", JOptionPane.ERROR_MESSAGE, null);
				} else {
					name = textField.getText().toString();
					title = comboBox_1.getSelectedItem().toString();
					// TODO BOTH CANT BE HOST.
					// title2 = comboBox_1.getSelectedItem().toString();
					// making the main Gui invisible.
					frmGameV.setVisible(false);
					// selecting picture.
					// setting up the lists of names and... .
					Function.list();
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								// the things that should be done when game starts.
								EnterActions window = new EnterActions();
								window.frmSelectImage.setVisible(true);
							} catch (Exception e) {
							}
						}
					});
				}
			}
		});
		btnEnter.setFont(new Font("Algerian", Font.PLAIN, 18));
		btnEnter.setBackground(Color.GREEN);
		profilePanel.add(btnEnter);

		label_1 = new JLabel("NAME SURNAME :");
		sl_profilePanel.putConstraint(SpringLayout.WEST, label_1, 10, SpringLayout.WEST, profilePanel);
		sl_profilePanel.putConstraint(SpringLayout.SOUTH, label_1, -191, SpringLayout.SOUTH, profilePanel);
		label_1.setForeground(Color.BLACK);
		label_1.setFont(new Font("Algerian", Font.PLAIN, 18));
		profilePanel.add(label_1);

		label_2 = new JLabel("HOST/JOIN(IP) :");
		sl_profilePanel.putConstraint(SpringLayout.WEST, label_2, 10, SpringLayout.WEST, profilePanel);
		sl_profilePanel.putConstraint(SpringLayout.NORTH, btnEnter, 6, SpringLayout.SOUTH, label_2);
		sl_profilePanel.putConstraint(SpringLayout.NORTH, label_2, 6, SpringLayout.SOUTH, label_1);
		label_2.setForeground(Color.BLACK);
		label_2.setFont(new Font("Algerian", Font.PLAIN, 18));
		profilePanel.add(label_2);

		textField = new JTextField();
		sl_profilePanel.putConstraint(SpringLayout.WEST, textField, 9, SpringLayout.EAST, label_1);
		sl_profilePanel.putConstraint(SpringLayout.SOUTH, textField, 0, SpringLayout.SOUTH, label_1);
		sl_profilePanel.putConstraint(SpringLayout.NORTH, textField, 0, SpringLayout.NORTH, label_1);
		sl_profilePanel.putConstraint(SpringLayout.EAST, textField, -7, SpringLayout.EAST, profilePanel);
		textField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				textField.setText("");
			}
		});
		textField.setText("NARUTO UZUMAKI");
		textField.setForeground(Color.RED);
		textField.setFont(new Font("Algerian", Font.PLAIN, 18));
		textField.setColumns(10);
		textField.setBackground(Color.LIGHT_GRAY);
		profilePanel.add(textField);

		comboBox_1 = new JComboBox();
		sl_profilePanel.putConstraint(SpringLayout.WEST, comboBox_1, 164, SpringLayout.WEST, profilePanel);
		sl_profilePanel.putConstraint(SpringLayout.EAST, label_2, -9, SpringLayout.WEST, comboBox_1);
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// TODO FIX
				String temp = "";
				// comboBox_1.getSelectedItem().toString();
				if (temp.equals("HOST")) {
					comboBox_1.removeAllItems();
					comboBox_1.addItem("JOIN");
					comboBox_1.addItem("HOST");
				} else {
					comboBox_1.removeAllItems();
					comboBox_1.addItem("HOST");
					comboBox_1.addItem("JOIN");
				}
			}
		});
		sl_profilePanel.putConstraint(SpringLayout.NORTH, comboBox_1, 2, SpringLayout.NORTH, label_2);
		sl_profilePanel.putConstraint(SpringLayout.SOUTH, comboBox_1, 2, SpringLayout.SOUTH, label_2);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "HOST", "JOIN" }));
		comboBox_1.setBackground(Color.PINK);
		profilePanel.add(comboBox_1);

		button_1 = new JButton("+");
		sl_profilePanel.putConstraint(SpringLayout.EAST, comboBox_1, -6, SpringLayout.WEST, button_1);
		sl_profilePanel.putConstraint(SpringLayout.NORTH, button_1, 2, SpringLayout.NORTH, label_2);
		sl_profilePanel.putConstraint(SpringLayout.WEST, button_1, 1286, SpringLayout.WEST, profilePanel);
		sl_profilePanel.putConstraint(SpringLayout.SOUTH, button_1, 2, SpringLayout.SOUTH, label_2);
		sl_profilePanel.putConstraint(SpringLayout.EAST, button_1, 0, SpringLayout.EAST, textField);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try { // adding new category.
					String name = JOptionPane.showInputDialog(null, "Eneter your IP address.", "ENTER",
							JOptionPane.INFORMATION_MESSAGE);
					if (name.length() > 8) {
						comboBox_1.addItem(name);
					} else {
						JOptionPane.showMessageDialog(null, "Sorry but the word has to contain at least one letter.",
								"Error", JOptionPane.ERROR_MESSAGE, null);
					}
				} catch (Exception ev) {
				}
			}
		});
		button_1.setBackground(Color.PINK);
		profilePanel.add(button_1);

		GamePanel = new JPanel();
		GamePanel.setBackground(new Color(0, 139, 139));
		GamePanel.setBorder(UIManager.getBorder("DesktopIcon.border"));
		tabbedPane.addTab("Game", null, GamePanel, null);
		tabbedPane.setEnabledAt(1, false);
		GamePanel.setLayout(new BorderLayout(0, 0));

		payingPalen = new JPanel();
		payingPalen.setBorder(null);
		GamePanel.add(payingPalen);
		SpringLayout sl_payingPalen = new SpringLayout();
		payingPalen.setLayout(sl_payingPalen);

		lblLetter = new JLabel("LETTER");
		sl_payingPalen.putConstraint(SpringLayout.NORTH, lblLetter, 22, SpringLayout.NORTH, payingPalen);
		sl_payingPalen.putConstraint(SpringLayout.WEST, lblLetter, 10, SpringLayout.WEST, payingPalen);
		sl_payingPalen.putConstraint(SpringLayout.EAST, lblLetter, -1137, SpringLayout.EAST, payingPalen);
		lblLetter.setFont(new Font("Adobe Devanagari", Font.PLAIN, 15));
		payingPalen.add(lblLetter);

		JLabel lblFuirstName = new JLabel("FIRST NAME");
		sl_payingPalen.putConstraint(SpringLayout.SOUTH, lblLetter, -6, SpringLayout.NORTH, lblFuirstName);
		sl_payingPalen.putConstraint(SpringLayout.NORTH, lblFuirstName, 57, SpringLayout.NORTH, payingPalen);
		sl_payingPalen.putConstraint(SpringLayout.WEST, lblFuirstName, 10, SpringLayout.WEST, payingPalen);
		sl_payingPalen.putConstraint(SpringLayout.EAST, lblFuirstName, -1137, SpringLayout.EAST, payingPalen);
		lblFuirstName.setFont(new Font("Adobe Devanagari", Font.PLAIN, 15));
		payingPalen.add(lblFuirstName);

		lblLastName = new JLabel("LAST NAME");
		sl_payingPalen.putConstraint(SpringLayout.NORTH, lblLastName, 6, SpringLayout.SOUTH, lblFuirstName);
		sl_payingPalen.putConstraint(SpringLayout.WEST, lblLastName, 10, SpringLayout.WEST, payingPalen);
		sl_payingPalen.putConstraint(SpringLayout.EAST, lblLastName, -1137, SpringLayout.EAST, payingPalen);
		lblLastName.setFont(new Font("Adobe Devanagari", Font.PLAIN, 15));
		payingPalen.add(lblLastName);

		lblCountry = new JLabel("COUNTRY");
		sl_payingPalen.putConstraint(SpringLayout.NORTH, lblCountry, 6, SpringLayout.SOUTH, lblLastName);
		sl_payingPalen.putConstraint(SpringLayout.WEST, lblCountry, 10, SpringLayout.WEST, payingPalen);
		sl_payingPalen.putConstraint(SpringLayout.EAST, lblCountry, -1137, SpringLayout.EAST, payingPalen);
		lblCountry.setFont(new Font("Adobe Devanagari", Font.PLAIN, 15));
		payingPalen.add(lblCountry);

		lblAnimal = new JLabel("ANIMAL");
		sl_payingPalen.putConstraint(SpringLayout.NORTH, lblAnimal, 6, SpringLayout.SOUTH, lblCountry);
		sl_payingPalen.putConstraint(SpringLayout.WEST, lblAnimal, 10, SpringLayout.WEST, payingPalen);
		sl_payingPalen.putConstraint(SpringLayout.EAST, lblAnimal, -1137, SpringLayout.EAST, payingPalen);
		lblAnimal.setFont(new Font("Adobe Devanagari", Font.PLAIN, 15));
		payingPalen.add(lblAnimal);

		lblFtuits = new JLabel("FRUITS");
		sl_payingPalen.putConstraint(SpringLayout.NORTH, lblFtuits, 6, SpringLayout.SOUTH, lblAnimal);
		sl_payingPalen.putConstraint(SpringLayout.WEST, lblFtuits, 10, SpringLayout.WEST, payingPalen);
		sl_payingPalen.putConstraint(SpringLayout.EAST, lblFtuits, -1137, SpringLayout.EAST, payingPalen);
		lblFtuits.setFont(new Font("Adobe Devanagari", Font.PLAIN, 15));
		payingPalen.add(lblFtuits);

		lblPoints = new JLabel("POINTS");
		sl_payingPalen.putConstraint(SpringLayout.NORTH, lblPoints, 6, SpringLayout.SOUTH, lblFtuits);
		sl_payingPalen.putConstraint(SpringLayout.WEST, lblPoints, 10, SpringLayout.WEST, payingPalen);
		sl_payingPalen.putConstraint(SpringLayout.EAST, lblPoints, -1137, SpringLayout.EAST, payingPalen);
		lblPoints.setFont(new Font("Adobe Devanagari", Font.PLAIN, 15));
		payingPalen.add(lblPoints);

		lettfil1 = new JTextField();
		sl_payingPalen.putConstraint(SpringLayout.WEST, lettfil1, 6, SpringLayout.EAST, lblLetter);
		sl_payingPalen.putConstraint(SpringLayout.SOUTH, lettfil1, 0, SpringLayout.SOUTH, lblLetter);
		lettfil1.setEditable(false);
		lettfil1.setHorizontalAlignment(SwingConstants.CENTER);
		lettfil1.setFont(new Font("Trebuchet MS", Font.BOLD, 11));
		lettfil1.setColumns(10);
		lettfil1.setBackground(SystemColor.inactiveCaption);
		payingPalen.add(lettfil1);

		namefil1 = new JTextField();
		sl_payingPalen.putConstraint(SpringLayout.NORTH, namefil1, 0, SpringLayout.NORTH, lblFuirstName);
		sl_payingPalen.putConstraint(SpringLayout.WEST, namefil1, 6, SpringLayout.EAST, lblFuirstName);
		sl_payingPalen.putConstraint(SpringLayout.SOUTH, namefil1, 0, SpringLayout.SOUTH, lblFuirstName);
		namefil1.setBackground(Color.LIGHT_GRAY);
		namefil1.setFont(new Font("Adobe Devanagari", Font.PLAIN, 15));
		payingPalen.add(namefil1);
		namefil1.setColumns(10);

		lastfil1 = new JTextField();
		sl_payingPalen.putConstraint(SpringLayout.NORTH, lastfil1, 0, SpringLayout.NORTH, lblLastName);
		sl_payingPalen.putConstraint(SpringLayout.WEST, lastfil1, 6, SpringLayout.EAST, lblLastName);
		sl_payingPalen.putConstraint(SpringLayout.SOUTH, lastfil1, 0, SpringLayout.SOUTH, lblLastName);
		lastfil1.setFont(new Font("Adobe Devanagari", Font.PLAIN, 15));
		lastfil1.setColumns(10);
		lastfil1.setBackground(Color.LIGHT_GRAY);
		payingPalen.add(lastfil1);

		counfil1 = new JTextField();
		sl_payingPalen.putConstraint(SpringLayout.WEST, counfil1, 6, SpringLayout.EAST, lblCountry);
		sl_payingPalen.putConstraint(SpringLayout.NORTH, counfil1, 0, SpringLayout.NORTH, lblCountry);
		sl_payingPalen.putConstraint(SpringLayout.SOUTH, counfil1, 0, SpringLayout.SOUTH, lblCountry);
		counfil1.setFont(new Font("Adobe Devanagari", Font.PLAIN, 15));
		counfil1.setColumns(10);
		counfil1.setBackground(Color.LIGHT_GRAY);
		payingPalen.add(counfil1);

		anifil1 = new JTextField();
		sl_payingPalen.putConstraint(SpringLayout.WEST, anifil1, 6, SpringLayout.EAST, lblAnimal);
		sl_payingPalen.putConstraint(SpringLayout.NORTH, anifil1, 0, SpringLayout.NORTH, lblAnimal);
		sl_payingPalen.putConstraint(SpringLayout.SOUTH, anifil1, 0, SpringLayout.SOUTH, lblAnimal);
		anifil1.setFont(new Font("Adobe Devanagari", Font.PLAIN, 15));
		anifil1.setColumns(10);
		anifil1.setBackground(Color.LIGHT_GRAY);
		payingPalen.add(anifil1);

		fruifil1 = new JTextField();
		sl_payingPalen.putConstraint(SpringLayout.WEST, fruifil1, 6, SpringLayout.EAST, lblFtuits);
		sl_payingPalen.putConstraint(SpringLayout.SOUTH, fruifil1, 0, SpringLayout.SOUTH, lblFtuits);
		sl_payingPalen.putConstraint(SpringLayout.NORTH, fruifil1, 0, SpringLayout.NORTH, lblFtuits);
		fruifil1.setFont(new Font("Adobe Devanagari", Font.PLAIN, 15));
		fruifil1.setColumns(10);
		fruifil1.setBackground(Color.LIGHT_GRAY);
		payingPalen.add(fruifil1);

		pointfil1 = new JTextField();
		sl_payingPalen.putConstraint(SpringLayout.WEST, pointfil1, 6, SpringLayout.EAST, lblPoints);
		sl_payingPalen.putConstraint(SpringLayout.NORTH, pointfil1, 0, SpringLayout.NORTH, lblPoints);
		sl_payingPalen.putConstraint(SpringLayout.SOUTH, pointfil1, 0, SpringLayout.SOUTH, lblPoints);
		pointfil1.setHorizontalAlignment(SwingConstants.CENTER);
		pointfil1.setEditable(false);
		pointfil1.setFont(new Font("Adobe Devanagari", Font.PLAIN, 15));
		pointfil1.setColumns(10);
		pointfil1.setBackground(new Color(153, 153, 204));
		payingPalen.add(pointfil1);

		lettfil2 = new JTextField();
		sl_payingPalen.putConstraint(SpringLayout.WEST, lettfil2, 390, SpringLayout.WEST, payingPalen);
		sl_payingPalen.putConstraint(SpringLayout.EAST, lettfil1, -6, SpringLayout.WEST, lettfil2);
		sl_payingPalen.putConstraint(SpringLayout.SOUTH, lettfil2, 0, SpringLayout.SOUTH, lblLetter);
		sl_payingPalen.putConstraint(SpringLayout.NORTH, lettfil2, 0, SpringLayout.NORTH, lblLetter);
		lettfil2.setEditable(false);
		lettfil2.setHorizontalAlignment(SwingConstants.CENTER);
		lettfil2.setFont(new Font("Trebuchet MS", Font.BOLD, 11));
		lettfil2.setColumns(10);
		lettfil2.setBackground(SystemColor.inactiveCaption);
		payingPalen.add(lettfil2);

		lettfil3 = new JTextField();
		sl_payingPalen.putConstraint(SpringLayout.EAST, lettfil2, -6, SpringLayout.WEST, lettfil3);
		sl_payingPalen.putConstraint(SpringLayout.SOUTH, lettfil3, 0, SpringLayout.SOUTH, lblLetter);
		sl_payingPalen.putConstraint(SpringLayout.NORTH, lettfil3, 0, SpringLayout.NORTH, lblLetter);
		lettfil3.setEditable(false);
		lettfil3.setHorizontalAlignment(SwingConstants.CENTER);
		sl_payingPalen.putConstraint(SpringLayout.EAST, lettfil3, -567, SpringLayout.EAST, payingPalen);
		sl_payingPalen.putConstraint(SpringLayout.WEST, lettfil3, 580, SpringLayout.WEST, payingPalen);
		lettfil3.setFont(new Font("Trebuchet MS", Font.BOLD, 11));
		lettfil3.setColumns(10);
		lettfil3.setBackground(SystemColor.inactiveCaption);
		payingPalen.add(lettfil3);

		lettfil4 = new JTextField();
		sl_payingPalen.putConstraint(SpringLayout.NORTH, lettfil4, 0, SpringLayout.NORTH, lblLetter);
		sl_payingPalen.putConstraint(SpringLayout.WEST, lettfil4, 6, SpringLayout.EAST, lettfil3);
		sl_payingPalen.putConstraint(SpringLayout.SOUTH, lettfil4, 0, SpringLayout.SOUTH, lblLetter);
		lettfil4.setHorizontalAlignment(SwingConstants.CENTER);
		lettfil4.setEditable(false);
		lettfil4.setFont(new Font("Trebuchet MS", Font.BOLD, 11));
		lettfil4.setColumns(10);
		lettfil4.setBackground(SystemColor.inactiveCaption);
		payingPalen.add(lettfil4);

		lettfil5 = new JTextField();
		sl_payingPalen.putConstraint(SpringLayout.EAST, lettfil4, -6, SpringLayout.WEST, lettfil5);
		sl_payingPalen.putConstraint(SpringLayout.SOUTH, lettfil5, 0, SpringLayout.SOUTH, lblLetter);
		sl_payingPalen.putConstraint(SpringLayout.NORTH, lettfil5, 0, SpringLayout.NORTH, lblLetter);
		sl_payingPalen.putConstraint(SpringLayout.WEST, lettfil5, 960, SpringLayout.WEST, payingPalen);
		sl_payingPalen.putConstraint(SpringLayout.EAST, lettfil5, -187, SpringLayout.EAST, payingPalen);
		lettfil5.setEditable(false);
		lettfil5.setHorizontalAlignment(SwingConstants.CENTER);
		lettfil5.setFont(new Font("Trebuchet MS", Font.BOLD, 11));
		lettfil5.setColumns(10);
		lettfil5.setBackground(SystemColor.inactiveCaption);
		payingPalen.add(lettfil5);

		namefil2 = new JTextField();
		sl_payingPalen.putConstraint(SpringLayout.WEST, namefil2, 390, SpringLayout.WEST, payingPalen);
		sl_payingPalen.putConstraint(SpringLayout.EAST, namefil1, -6, SpringLayout.WEST, namefil2);
		sl_payingPalen.putConstraint(SpringLayout.SOUTH, namefil2, 0, SpringLayout.SOUTH, lblFuirstName);
		sl_payingPalen.putConstraint(SpringLayout.NORTH, namefil2, 0, SpringLayout.NORTH, lblFuirstName);
		namefil2.setFont(new Font("Adobe Devanagari", Font.PLAIN, 15));
		namefil2.setColumns(10);
		namefil2.setBackground(Color.LIGHT_GRAY);
		payingPalen.add(namefil2);

		lastfil2 = new JTextField();
		sl_payingPalen.putConstraint(SpringLayout.WEST, lastfil2, 390, SpringLayout.WEST, payingPalen);
		sl_payingPalen.putConstraint(SpringLayout.EAST, lastfil1, -6, SpringLayout.WEST, lastfil2);
		sl_payingPalen.putConstraint(SpringLayout.SOUTH, lastfil2, 0, SpringLayout.SOUTH, lblLastName);
		sl_payingPalen.putConstraint(SpringLayout.NORTH, lastfil2, 0, SpringLayout.NORTH, lblLastName);
		lastfil2.setFont(new Font("Adobe Devanagari", Font.PLAIN, 15));
		lastfil2.setColumns(10);
		lastfil2.setBackground(Color.LIGHT_GRAY);
		payingPalen.add(lastfil2);

		counfil2 = new JTextField();
		sl_payingPalen.putConstraint(SpringLayout.WEST, counfil2, 390, SpringLayout.WEST, payingPalen);
		sl_payingPalen.putConstraint(SpringLayout.EAST, counfil1, -6, SpringLayout.WEST, counfil2);
		sl_payingPalen.putConstraint(SpringLayout.SOUTH, counfil2, 0, SpringLayout.SOUTH, lblCountry);
		sl_payingPalen.putConstraint(SpringLayout.NORTH, counfil2, 0, SpringLayout.NORTH, lblCountry);
		counfil2.setFont(new Font("Adobe Devanagari", Font.PLAIN, 15));
		counfil2.setColumns(10);
		counfil2.setBackground(Color.LIGHT_GRAY);
		payingPalen.add(counfil2);

		anifil2 = new JTextField();
		sl_payingPalen.putConstraint(SpringLayout.WEST, anifil2, 390, SpringLayout.WEST, payingPalen);
		sl_payingPalen.putConstraint(SpringLayout.EAST, anifil1, -6, SpringLayout.WEST, anifil2);
		sl_payingPalen.putConstraint(SpringLayout.SOUTH, anifil2, 0, SpringLayout.SOUTH, lblAnimal);
		sl_payingPalen.putConstraint(SpringLayout.NORTH, anifil2, 0, SpringLayout.NORTH, lblAnimal);
		anifil2.setFont(new Font("Adobe Devanagari", Font.PLAIN, 15));
		anifil2.setColumns(10);
		anifil2.setBackground(Color.LIGHT_GRAY);
		payingPalen.add(anifil2);

		fruifil2 = new JTextField();
		sl_payingPalen.putConstraint(SpringLayout.WEST, fruifil2, 390, SpringLayout.WEST, payingPalen);
		sl_payingPalen.putConstraint(SpringLayout.EAST, fruifil1, -6, SpringLayout.WEST, fruifil2);
		sl_payingPalen.putConstraint(SpringLayout.SOUTH, fruifil2, 0, SpringLayout.SOUTH, lblFtuits);
		sl_payingPalen.putConstraint(SpringLayout.NORTH, fruifil2, 0, SpringLayout.NORTH, lblFtuits);
		fruifil2.setFont(new Font("Adobe Devanagari", Font.PLAIN, 15));
		fruifil2.setColumns(10);
		fruifil2.setBackground(Color.LIGHT_GRAY);
		payingPalen.add(fruifil2);

		pointfil2 = new JTextField();
		sl_payingPalen.putConstraint(SpringLayout.WEST, pointfil2, 390, SpringLayout.WEST, payingPalen);
		sl_payingPalen.putConstraint(SpringLayout.EAST, pointfil1, -6, SpringLayout.WEST, pointfil2);
		sl_payingPalen.putConstraint(SpringLayout.NORTH, pointfil2, 0, SpringLayout.NORTH, lblPoints);
		sl_payingPalen.putConstraint(SpringLayout.SOUTH, pointfil2, 0, SpringLayout.SOUTH, lblPoints);
		pointfil2.setHorizontalAlignment(SwingConstants.CENTER);
		pointfil2.setEditable(false);
		pointfil2.setFont(new Font("Adobe Devanagari", Font.PLAIN, 15));
		pointfil2.setColumns(10);
		pointfil2.setBackground(new Color(153, 153, 204));
		payingPalen.add(pointfil2);

		namefil3 = new JTextField();
		sl_payingPalen.putConstraint(SpringLayout.WEST, namefil3, 580, SpringLayout.WEST, payingPalen);
		sl_payingPalen.putConstraint(SpringLayout.EAST, namefil2, -6, SpringLayout.WEST, namefil3);
		sl_payingPalen.putConstraint(SpringLayout.SOUTH, namefil3, 0, SpringLayout.SOUTH, lblFuirstName);
		sl_payingPalen.putConstraint(SpringLayout.NORTH, namefil3, 0, SpringLayout.NORTH, lblFuirstName);
		namefil3.setFont(new Font("Adobe Devanagari", Font.PLAIN, 15));
		namefil3.setColumns(10);
		namefil3.setBackground(Color.LIGHT_GRAY);
		payingPalen.add(namefil3);

		lastfil3 = new JTextField();
		sl_payingPalen.putConstraint(SpringLayout.WEST, lastfil3, 580, SpringLayout.WEST, payingPalen);
		sl_payingPalen.putConstraint(SpringLayout.EAST, lastfil2, -6, SpringLayout.WEST, lastfil3);
		sl_payingPalen.putConstraint(SpringLayout.SOUTH, lastfil3, 0, SpringLayout.SOUTH, lblLastName);
		sl_payingPalen.putConstraint(SpringLayout.NORTH, lastfil3, 0, SpringLayout.NORTH, lblLastName);
		lastfil3.setFont(new Font("Adobe Devanagari", Font.PLAIN, 15));
		lastfil3.setColumns(10);
		lastfil3.setBackground(Color.LIGHT_GRAY);
		payingPalen.add(lastfil3);

		counfil3 = new JTextField();
		sl_payingPalen.putConstraint(SpringLayout.WEST, counfil3, 580, SpringLayout.WEST, payingPalen);
		sl_payingPalen.putConstraint(SpringLayout.EAST, counfil2, -6, SpringLayout.WEST, counfil3);
		sl_payingPalen.putConstraint(SpringLayout.NORTH, counfil3, 0, SpringLayout.NORTH, lblCountry);
		sl_payingPalen.putConstraint(SpringLayout.SOUTH, counfil3, 0, SpringLayout.SOUTH, lblCountry);
		counfil3.setFont(new Font("Adobe Devanagari", Font.PLAIN, 15));
		counfil3.setColumns(10);
		counfil3.setBackground(Color.LIGHT_GRAY);
		payingPalen.add(counfil3);

		anifil3 = new JTextField();
		sl_payingPalen.putConstraint(SpringLayout.WEST, anifil3, 580, SpringLayout.WEST, payingPalen);
		sl_payingPalen.putConstraint(SpringLayout.EAST, anifil2, -6, SpringLayout.WEST, anifil3);
		sl_payingPalen.putConstraint(SpringLayout.NORTH, anifil3, 0, SpringLayout.NORTH, lblAnimal);
		sl_payingPalen.putConstraint(SpringLayout.SOUTH, anifil3, 0, SpringLayout.SOUTH, lblAnimal);
		anifil3.setFont(new Font("Adobe Devanagari", Font.PLAIN, 15));
		anifil3.setColumns(10);
		anifil3.setBackground(Color.LIGHT_GRAY);
		payingPalen.add(anifil3);

		fruifil3 = new JTextField();
		sl_payingPalen.putConstraint(SpringLayout.WEST, fruifil3, 580, SpringLayout.WEST, payingPalen);
		sl_payingPalen.putConstraint(SpringLayout.EAST, fruifil2, -6, SpringLayout.WEST, fruifil3);
		sl_payingPalen.putConstraint(SpringLayout.SOUTH, fruifil3, 0, SpringLayout.SOUTH, lblFtuits);
		sl_payingPalen.putConstraint(SpringLayout.NORTH, fruifil3, 0, SpringLayout.NORTH, lblFtuits);
		fruifil3.setFont(new Font("Adobe Devanagari", Font.PLAIN, 15));
		fruifil3.setColumns(10);
		fruifil3.setBackground(Color.LIGHT_GRAY);
		payingPalen.add(fruifil3);

		pointfil3 = new JTextField();
		sl_payingPalen.putConstraint(SpringLayout.WEST, pointfil3, 580, SpringLayout.WEST, payingPalen);
		sl_payingPalen.putConstraint(SpringLayout.EAST, pointfil2, -6, SpringLayout.WEST, pointfil3);
		sl_payingPalen.putConstraint(SpringLayout.NORTH, pointfil3, 0, SpringLayout.NORTH, lblPoints);
		sl_payingPalen.putConstraint(SpringLayout.SOUTH, pointfil3, 0, SpringLayout.SOUTH, lblPoints);
		pointfil3.setEditable(false);
		pointfil3.setHorizontalAlignment(SwingConstants.CENTER);
		pointfil3.setFont(new Font("Adobe Devanagari", Font.PLAIN, 15));
		pointfil3.setColumns(10);
		pointfil3.setBackground(new Color(153, 153, 204));
		payingPalen.add(pointfil3);

		namefil4 = new JTextField();
		sl_payingPalen.putConstraint(SpringLayout.EAST, namefil3, -6, SpringLayout.WEST, namefil4);
		sl_payingPalen.putConstraint(SpringLayout.WEST, namefil4, 0, SpringLayout.WEST, lettfil4);
		sl_payingPalen.putConstraint(SpringLayout.NORTH, namefil4, 0, SpringLayout.NORTH, lblFuirstName);
		sl_payingPalen.putConstraint(SpringLayout.SOUTH, namefil4, 0, SpringLayout.SOUTH, lblFuirstName);
		namefil4.setFont(new Font("Adobe Devanagari", Font.PLAIN, 15));
		namefil4.setColumns(10);
		namefil4.setBackground(Color.LIGHT_GRAY);
		payingPalen.add(namefil4);

		lastfil4 = new JTextField();
		sl_payingPalen.putConstraint(SpringLayout.EAST, lastfil3, -6, SpringLayout.WEST, lastfil4);
		sl_payingPalen.putConstraint(SpringLayout.WEST, lastfil4, 0, SpringLayout.WEST, lettfil4);
		sl_payingPalen.putConstraint(SpringLayout.SOUTH, lastfil4, 0, SpringLayout.SOUTH, lblLastName);
		sl_payingPalen.putConstraint(SpringLayout.NORTH, lastfil4, 0, SpringLayout.NORTH, lblLastName);
		lastfil4.setFont(new Font("Adobe Devanagari", Font.PLAIN, 15));
		lastfil4.setColumns(10);
		lastfil4.setBackground(Color.LIGHT_GRAY);
		payingPalen.add(lastfil4);

		counfil4 = new JTextField();
		sl_payingPalen.putConstraint(SpringLayout.EAST, counfil3, -6, SpringLayout.WEST, counfil4);
		sl_payingPalen.putConstraint(SpringLayout.WEST, counfil4, 0, SpringLayout.WEST, lettfil4);
		sl_payingPalen.putConstraint(SpringLayout.SOUTH, counfil4, 0, SpringLayout.SOUTH, lblCountry);
		sl_payingPalen.putConstraint(SpringLayout.NORTH, counfil4, 0, SpringLayout.NORTH, lblCountry);
		counfil4.setFont(new Font("Adobe Devanagari", Font.PLAIN, 15));
		counfil4.setColumns(10);
		counfil4.setBackground(Color.LIGHT_GRAY);
		payingPalen.add(counfil4);

		anifil4 = new JTextField();
		sl_payingPalen.putConstraint(SpringLayout.EAST, anifil3, -6, SpringLayout.WEST, anifil4);
		sl_payingPalen.putConstraint(SpringLayout.WEST, anifil4, 0, SpringLayout.WEST, lettfil4);
		sl_payingPalen.putConstraint(SpringLayout.SOUTH, anifil4, 0, SpringLayout.SOUTH, lblAnimal);
		sl_payingPalen.putConstraint(SpringLayout.NORTH, anifil4, 0, SpringLayout.NORTH, lblAnimal);
		anifil4.setFont(new Font("Adobe Devanagari", Font.PLAIN, 15));
		anifil4.setColumns(10);
		anifil4.setBackground(Color.LIGHT_GRAY);
		payingPalen.add(anifil4);

		fruifil4 = new JTextField();
		sl_payingPalen.putConstraint(SpringLayout.EAST, fruifil3, -6, SpringLayout.WEST, fruifil4);
		sl_payingPalen.putConstraint(SpringLayout.WEST, fruifil4, 0, SpringLayout.WEST, lettfil4);
		sl_payingPalen.putConstraint(SpringLayout.SOUTH, fruifil4, 0, SpringLayout.SOUTH, lblFtuits);
		sl_payingPalen.putConstraint(SpringLayout.NORTH, fruifil4, 0, SpringLayout.NORTH, lblFtuits);
		fruifil4.setFont(new Font("Adobe Devanagari", Font.PLAIN, 15));
		fruifil4.setColumns(10);
		fruifil4.setBackground(Color.LIGHT_GRAY);
		payingPalen.add(fruifil4);

		pointfil4 = new JTextField();
		sl_payingPalen.putConstraint(SpringLayout.EAST, pointfil3, -6, SpringLayout.WEST, pointfil4);
		sl_payingPalen.putConstraint(SpringLayout.WEST, pointfil4, 0, SpringLayout.WEST, lettfil4);
		sl_payingPalen.putConstraint(SpringLayout.NORTH, pointfil4, 0, SpringLayout.NORTH, lblPoints);
		sl_payingPalen.putConstraint(SpringLayout.SOUTH, pointfil4, 0, SpringLayout.SOUTH, lblPoints);
		pointfil4.setHorizontalAlignment(SwingConstants.CENTER);
		pointfil4.setEditable(false);
		pointfil4.setFont(new Font("Adobe Devanagari", Font.PLAIN, 15));
		pointfil4.setColumns(10);
		pointfil4.setBackground(new Color(153, 153, 204));
		payingPalen.add(pointfil4);

		namefil5 = new JTextField();
		sl_payingPalen.putConstraint(SpringLayout.WEST, namefil5, 960, SpringLayout.WEST, payingPalen);
		sl_payingPalen.putConstraint(SpringLayout.EAST, namefil5, -187, SpringLayout.EAST, payingPalen);
		sl_payingPalen.putConstraint(SpringLayout.EAST, namefil4, -6, SpringLayout.WEST, namefil5);
		sl_payingPalen.putConstraint(SpringLayout.SOUTH, namefil5, 0, SpringLayout.SOUTH, lblFuirstName);
		sl_payingPalen.putConstraint(SpringLayout.NORTH, namefil5, 0, SpringLayout.NORTH, lblFuirstName);
		namefil5.setFont(new Font("Adobe Devanagari", Font.PLAIN, 15));
		namefil5.setColumns(10);
		namefil5.setBackground(Color.LIGHT_GRAY);
		payingPalen.add(namefil5);

		lastfil5 = new JTextField();
		sl_payingPalen.putConstraint(SpringLayout.WEST, lastfil5, 960, SpringLayout.WEST, payingPalen);
		sl_payingPalen.putConstraint(SpringLayout.EAST, lastfil5, -187, SpringLayout.EAST, payingPalen);
		sl_payingPalen.putConstraint(SpringLayout.EAST, lastfil4, -6, SpringLayout.WEST, lastfil5);
		sl_payingPalen.putConstraint(SpringLayout.SOUTH, lastfil5, 0, SpringLayout.SOUTH, lblLastName);
		sl_payingPalen.putConstraint(SpringLayout.NORTH, lastfil5, 0, SpringLayout.NORTH, lblLastName);
		lastfil5.setFont(new Font("Adobe Devanagari", Font.PLAIN, 15));
		lastfil5.setColumns(10);
		lastfil5.setBackground(Color.LIGHT_GRAY);
		payingPalen.add(lastfil5);

		counfil5 = new JTextField();
		sl_payingPalen.putConstraint(SpringLayout.WEST, counfil5, 960, SpringLayout.WEST, payingPalen);
		sl_payingPalen.putConstraint(SpringLayout.EAST, counfil5, -187, SpringLayout.EAST, payingPalen);
		sl_payingPalen.putConstraint(SpringLayout.EAST, counfil4, -6, SpringLayout.WEST, counfil5);
		sl_payingPalen.putConstraint(SpringLayout.SOUTH, counfil5, 0, SpringLayout.SOUTH, lblCountry);
		sl_payingPalen.putConstraint(SpringLayout.NORTH, counfil5, 0, SpringLayout.NORTH, lblCountry);
		counfil5.setFont(new Font("Adobe Devanagari", Font.PLAIN, 15));
		counfil5.setColumns(10);
		counfil5.setBackground(Color.LIGHT_GRAY);
		payingPalen.add(counfil5);

		anifil5 = new JTextField();
		sl_payingPalen.putConstraint(SpringLayout.WEST, anifil5, 960, SpringLayout.WEST, payingPalen);
		sl_payingPalen.putConstraint(SpringLayout.EAST, anifil5, -187, SpringLayout.EAST, payingPalen);
		sl_payingPalen.putConstraint(SpringLayout.EAST, anifil4, -6, SpringLayout.WEST, anifil5);
		sl_payingPalen.putConstraint(SpringLayout.SOUTH, anifil5, 0, SpringLayout.SOUTH, lblAnimal);
		sl_payingPalen.putConstraint(SpringLayout.NORTH, anifil5, 0, SpringLayout.NORTH, lblAnimal);
		anifil5.setFont(new Font("Adobe Devanagari", Font.PLAIN, 15));
		anifil5.setColumns(10);
		anifil5.setBackground(Color.LIGHT_GRAY);
		payingPalen.add(anifil5);

		fruifil5 = new JTextField();
		sl_payingPalen.putConstraint(SpringLayout.WEST, fruifil5, 960, SpringLayout.WEST, payingPalen);
		sl_payingPalen.putConstraint(SpringLayout.EAST, fruifil5, -187, SpringLayout.EAST, payingPalen);
		sl_payingPalen.putConstraint(SpringLayout.EAST, fruifil4, -6, SpringLayout.WEST, fruifil5);
		sl_payingPalen.putConstraint(SpringLayout.SOUTH, fruifil5, 0, SpringLayout.SOUTH, lblFtuits);
		sl_payingPalen.putConstraint(SpringLayout.NORTH, fruifil5, 0, SpringLayout.NORTH, lblFtuits);
		fruifil5.setFont(new Font("Adobe Devanagari", Font.PLAIN, 15));
		fruifil5.setColumns(10);
		fruifil5.setBackground(Color.LIGHT_GRAY);
		payingPalen.add(fruifil5);

		pointfil5 = new JTextField();
		sl_payingPalen.putConstraint(SpringLayout.WEST, pointfil5, 960, SpringLayout.WEST, payingPalen);
		sl_payingPalen.putConstraint(SpringLayout.EAST, pointfil5, -187, SpringLayout.EAST, payingPalen);
		sl_payingPalen.putConstraint(SpringLayout.EAST, pointfil4, -6, SpringLayout.WEST, pointfil5);
		sl_payingPalen.putConstraint(SpringLayout.NORTH, pointfil5, 0, SpringLayout.NORTH, lblPoints);
		sl_payingPalen.putConstraint(SpringLayout.SOUTH, pointfil5, 0, SpringLayout.SOUTH, lblPoints);
		pointfil5.setHorizontalAlignment(SwingConstants.CENTER);
		pointfil5.setEditable(false);
		pointfil5.setFont(new Font("Adobe Devanagari", Font.PLAIN, 15));
		pointfil5.setColumns(10);
		pointfil5.setBackground(new Color(153, 153, 204));
		payingPalen.add(pointfil5);

		lblNewLabel = new JLabel("ROUND 1");
		sl_payingPalen.putConstraint(SpringLayout.NORTH, lettfil1, 1, SpringLayout.SOUTH, lblNewLabel);
		sl_payingPalen.putConstraint(SpringLayout.WEST, lblNewLabel, 200, SpringLayout.WEST, payingPalen);
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Algerian", Font.PLAIN, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		sl_payingPalen.putConstraint(SpringLayout.NORTH, lblNewLabel, 2, SpringLayout.NORTH, payingPalen);
		payingPalen.add(lblNewLabel);

		lblRound = new JLabel("ROUND 2");
		sl_payingPalen.putConstraint(SpringLayout.WEST, lblRound, 390, SpringLayout.WEST, payingPalen);
		sl_payingPalen.putConstraint(SpringLayout.EAST, lblNewLabel, -6, SpringLayout.WEST, lblRound);
		sl_payingPalen.putConstraint(SpringLayout.NORTH, lblRound, 0, SpringLayout.NORTH, lblNewLabel);
		sl_payingPalen.putConstraint(SpringLayout.SOUTH, lblRound, 0, SpringLayout.SOUTH, lblNewLabel);
		lblRound.setHorizontalAlignment(SwingConstants.CENTER);
		lblRound.setForeground(Color.RED);
		lblRound.setFont(new Font("Algerian", Font.PLAIN, 14));
		payingPalen.add(lblRound);

		lblRound_1 = new JLabel("ROUND 3");
		sl_payingPalen.putConstraint(SpringLayout.WEST, lblRound_1, 580, SpringLayout.WEST, payingPalen);
		sl_payingPalen.putConstraint(SpringLayout.EAST, lblRound, -6, SpringLayout.WEST, lblRound_1);
		sl_payingPalen.putConstraint(SpringLayout.NORTH, lblRound_1, 0, SpringLayout.NORTH, lblNewLabel);
		sl_payingPalen.putConstraint(SpringLayout.SOUTH, lblRound_1, 0, SpringLayout.SOUTH, lblNewLabel);
		lblRound_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblRound_1.setForeground(Color.RED);
		lblRound_1.setFont(new Font("Algerian", Font.PLAIN, 14));
		payingPalen.add(lblRound_1);

		lblRound_2 = new JLabel("ROUND 4");
		sl_payingPalen.putConstraint(SpringLayout.WEST, lblRound_2, 770, SpringLayout.WEST, payingPalen);
		sl_payingPalen.putConstraint(SpringLayout.EAST, lblRound_1, -6, SpringLayout.WEST, lblRound_2);
		sl_payingPalen.putConstraint(SpringLayout.NORTH, lblRound_2, 0, SpringLayout.NORTH, lblNewLabel);
		lblRound_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblRound_2.setForeground(Color.RED);
		lblRound_2.setFont(new Font("Algerian", Font.PLAIN, 14));
		payingPalen.add(lblRound_2);

		lblRound_3 = new JLabel("ROUND 5");
		sl_payingPalen.putConstraint(SpringLayout.WEST, lblRound_3, 960, SpringLayout.WEST, payingPalen);
		sl_payingPalen.putConstraint(SpringLayout.EAST, lblRound_3, -187, SpringLayout.EAST, payingPalen);
		sl_payingPalen.putConstraint(SpringLayout.EAST, lblRound_2, -6, SpringLayout.WEST, lblRound_3);
		sl_payingPalen.putConstraint(SpringLayout.NORTH, lblRound_3, 0, SpringLayout.NORTH, lblNewLabel);
		lblRound_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblRound_3.setForeground(Color.RED);
		lblRound_3.setFont(new Font("Algerian", Font.PLAIN, 14));
		payingPalen.add(lblRound_3);

		dataPanel = new JPanel();
		sl_payingPalen.putConstraint(SpringLayout.SOUTH, dataPanel, 0, SpringLayout.SOUTH, payingPalen);
		payingPalen.add(dataPanel);
		dataPanel.setBorder(UIManager.getBorder("DesktopIcon.border"));
		dataPanel.setBackground(Color.LIGHT_GRAY);

		lblPic = new JLabel("");

		lblWinnsAndLouses = new JLabel("wins & losses: ");
		lblWinnsAndLouses.setForeground(Color.BLUE);
		lblWinnsAndLouses.setFont(new Font("Bell MT", Font.BOLD, 20));

		data = new JLabel("(" + numWin + " & " + numLost + ")");
		data.setForeground(Color.BLACK);
		data.setFont(new Font("Bell MT", Font.BOLD, 20));

		btnStop = new JButton("STOP ROUND (" + round + ")");
		btnStop.setEnabled(false);
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Function.endOfGame(1);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnStop.setToolTipText("");
		btnStop.setForeground(Color.RED);
		btnStop.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btnStop.setBackground(new Color(47, 79, 79));

		time = new JLabel("180");
		time.setVerticalAlignment(SwingConstants.BOTTOM);
		time.setHorizontalAlignment(SwingConstants.RIGHT);
		time.setForeground(Color.RED);
		time.setFont(new Font("Old English Text MT", Font.PLAIN, 30));
		GroupLayout gl_dataPanel = new GroupLayout(dataPanel);
		gl_dataPanel.setHorizontalGroup(gl_dataPanel.createParallelGroup(Alignment.LEADING).addGroup(gl_dataPanel
				.createSequentialGroup().addGap(6).addComponent(lblPic).addGap(5).addComponent(lblWinnsAndLouses)
				.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(data).addGap(323).addComponent(btnStop).addGap(489).addComponent(time).addGap(229)));
		gl_dataPanel.setVerticalGroup(gl_dataPanel.createParallelGroup(Alignment.TRAILING).addGroup(gl_dataPanel
				.createSequentialGroup()
				.addGroup(gl_dataPanel.createParallelGroup(Alignment.LEADING).addGroup(gl_dataPanel
						.createSequentialGroup().addGap(6)
						.addGroup(gl_dataPanel.createParallelGroup(Alignment.LEADING).addComponent(lblPic)
								.addGroup(gl_dataPanel.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblWinnsAndLouses).addComponent(data).addComponent(btnStop))))
						.addComponent(time))
				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		dataPanel.setLayout(gl_dataPanel);
	}
}
