package ir.ac.guilan.ce.ap97.Hendiani.Gui.Profile;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;

import ir.ac.guilan.ce.ap97.Hendiani.Function.Function;
import ir.ac.guilan.ce.ap97.Hendiani.Gui.Lists.Lists;
import ir.ac.guilan.ce.ap97.Hendiani.Gui.Login.Login;
import ir.ac.guilan.ce.ap97.Hendiani.Gui.Login.SignUp;
import ir.ac.guilan.ce.ap97.Hendiani.Gui.StartGame.StartOffline;
import ir.ac.guilan.ce.ap97.Hendiani.Gui.StartGame.StartOnline;

import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import java.awt.Toolkit;
import javax.swing.JProgressBar;

public class Profile {

	public static JFrame frmProfile;
	private JLabel lalPic;
	private JPanel panProfile;
	private JTextField txtName;
	private JTextField txtUsername;
	private JTextField txtEmail;
	private JPasswordField passwordField_1;
	private JComboBox comboBox;
	private JButton btnOnline;
	private JButton btnOfline;
	private boolean activation;
	private boolean activation2 = false;
	private JPasswordField txtPassword;
	private JButton btnStistic;
	private int gender;
	private File file;
	private String picPath = "C:\\Users\\Administrator\\eclipse-workspace\\BomberMan\\src\\ir\\ac\\guilan\\ce\\ap97\\Hendiani\\Gui\\Icon\\Barkeep.png";
	private String path2 = null;

	public static ArrayList<String> temp = new ArrayList<String>();
	// the original user and email.
	public static ArrayList<String> username2 = new ArrayList<String>();
	public static ArrayList<String> email2 = new ArrayList<String>();

	private void uneditedData() {
		// if picture location has not written to database correctly.
		if (Login.getPictures().get(Login.getPositionInList()).equals("null")) {
			Login.pictures.set(Login.getPositionInList(), picPath);
		}
		username2.clear();
		email2.clear();
		// setting original username without edit.
		username2.add(Login.getUsernames().get(Login.getPositionInList()));
		// setting original email without edit.
		email2.add(Login.getEmails().get(Login.getPositionInList()));
	}

	private void setUserData() {
		uneditedData();
		// setting the users image.
		File file = new File(Login.getPictures().get(Login.getPositionInList()));
		path2 = Login.getPictures().get(Login.getPositionInList());

		Image image = null;
		try {
			image = ImageIO.read(file);
		} catch (IOException e) {
		}
		lalPic.setIcon(new ImageIcon(image.getScaledInstance(93, 96, image.SCALE_DEFAULT)));
		// setting name.
		txtName.setText(Login.getNames().get(Login.getPositionInList()).replaceAll("_", " "));
		// setting usernsme.
		txtUsername.setText(Login.getUsernames().get(Login.getPositionInList()).replaceAll("_", " "));
		// setting email.
		txtEmail.setText(Login.getEmails().get(Login.getPositionInList()).replaceAll("_", " "));
		// setting passwords.
		txtPassword.setText(Login.getPasswords().get(Login.getPositionInList()).replaceAll("_", " "));
		passwordField_1.setText(Login.getPasswords().get(Login.getPositionInList()).replaceAll("_", " "));
		// setting gender.
		gender = Integer.parseInt(Login.getGenders().get(Login.getPositionInList()));

		if (gender == 0) {
			comboBox.setModel(new DefaultComboBoxModel(new String[] { "Male", "Female" }));
			comboBox.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if (activation) {
						if (comboBox.getSelectedIndex() == 0) {
							gender = 0;
							lalPic.setIcon(new ImageIcon(
									SignUp.class.getResource("/ir/ac/guilan/ce/ap97/Hendiani/Gui/Icon/Barkeep.png")));
						} else {
							gender = 1;
							lalPic.setIcon(new ImageIcon(
									SignUp.class.getResource("/ir/ac/guilan/ce/ap97/Hendiani/Gui/Icon/Barmaid.png")));
						}
					}
				}
			});
		} else {
			comboBox.setModel(new DefaultComboBoxModel(new String[] { "Female", "Male" }));
			comboBox.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent arg0) {
					if (activation) {
						if (comboBox.getSelectedIndex() == 0) {
							gender = 1;
							lalPic.setIcon(new ImageIcon(
									SignUp.class.getResource("/ir/ac/guilan/ce/ap97/Hendiani/Gui/Icon/Barmaid.png")));
						} else {
							gender = 0;
							lalPic.setIcon(new ImageIcon(
									SignUp.class.getResource("/ir/ac/guilan/ce/ap97/Hendiani/Gui/Icon/Barkeep.png")));
						}
					}
				}

			});
		}
	}

	/**
	 * Create the application.
	 */
	public Profile() {
		initialize();
		setUserData();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmProfile = new JFrame();
		frmProfile.setIconImage(Toolkit.getDefaultToolkit()
				.getImage(Profile.class.getResource("/ir/ac/guilan/ce/ap97/Hendiani/Gui/Icon/user.png")));
		frmProfile.setTitle("Profile");
		frmProfile.setBackground(new Color(34, 49, 63));
		frmProfile.setBounds(100, 100, 583, 352);
		frmProfile.setLocationRelativeTo(null);
		frmProfile.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmProfile.getContentPane().setLayout(new BorderLayout(0, 0));

		panProfile = new JPanel();
		panProfile.setBorder(UIManager.getBorder("DesktopIcon.border"));
		panProfile.setBackground(new Color(52, 73, 94));
		SpringLayout sl_panProfile = new SpringLayout();
		panProfile.setLayout(sl_panProfile);
		frmProfile.getContentPane().add(panProfile, BorderLayout.CENTER);

		lalPic = new JLabel("");
		lalPic.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (lalPic.isEnabled()) {
					JFileChooser fileChooser = new JFileChooser();
					FileNameExtensionFilter filter = new FileNameExtensionFilter("JPEG file", "jpg", "jpeg");
					fileChooser.addChoosableFileFilter(filter);

					if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
						try {
							file = fileChooser.getSelectedFile();
							Image image = ImageIO.read(fileChooser.getSelectedFile());
							lalPic.setIcon(new ImageIcon(image.getScaledInstance(93, 96, image.SCALE_DEFAULT)));
							frmProfile.setVisible(true);
							activation2 = true;
							activation = false;
						} catch (IOException e) {
						}
					}
				}
			}
		});
		lalPic.setEnabled(false);
		sl_panProfile.putConstraint(SpringLayout.WEST, lalPic, 10, SpringLayout.WEST, panProfile);
		lalPic.setIcon(new ImageIcon(Profile.class.getResource("/ir/ac/guilan/ce/ap97/Hendiani/Gui/Icon/Barkeep.png")));
		panProfile.add(lalPic);

		txtName = new JTextField();
		txtName.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyChar() == ',' || e.getKeyChar() == '-' || e.getKeyChar() == '_') {
					JOptionPane.showMessageDialog(null, "You cant use ( - & , & _ ).", "Error",
							JOptionPane.ERROR_MESSAGE, null);
				}
			}
		});
		sl_panProfile.putConstraint(SpringLayout.NORTH, txtName, 10, SpringLayout.NORTH, panProfile);
		sl_panProfile.putConstraint(SpringLayout.WEST, txtName, 109, SpringLayout.WEST, panProfile);
		sl_panProfile.putConstraint(SpringLayout.EAST, txtName, -10, SpringLayout.EAST, panProfile);
		sl_panProfile.putConstraint(SpringLayout.NORTH, lalPic, 0, SpringLayout.NORTH, txtName);
		txtName.setHorizontalAlignment(SwingConstants.CENTER);
		txtName.setForeground(new Color(228, 241, 254));
		txtName.setFont(new Font("Algerian", Font.PLAIN, 18));
		txtName.setEditable(false);
		txtName.setColumns(10);
		txtName.setBackground(new Color(103, 128, 159));
		panProfile.add(txtName);

		txtUsername = new JTextField();
		txtUsername.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				if ((Login.getUsernames().contains(txtUsername.getText()))
						&& (!txtUsername.getText().equals(username2.get(0)))) {
					txtUsername.setBackground(new Color(207, 0, 15));
				} else {
					txtUsername.setBackground(new Color(103, 128, 159));
				}
			}

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyChar() == ',' || e.getKeyChar() == '-' || e.getKeyChar() == '_') {
					JOptionPane.showMessageDialog(null, "You cant use ( - & , & _ ).", "Error",
							JOptionPane.ERROR_MESSAGE, null);
				}
			}
		});
		sl_panProfile.putConstraint(SpringLayout.NORTH, txtUsername, 6, SpringLayout.SOUTH, txtName);
		sl_panProfile.putConstraint(SpringLayout.WEST, txtUsername, 6, SpringLayout.EAST, lalPic);
		sl_panProfile.putConstraint(SpringLayout.EAST, txtUsername, -10, SpringLayout.EAST, panProfile);
		txtUsername.setHorizontalAlignment(SwingConstants.CENTER);
		txtUsername.setForeground(new Color(228, 241, 254));
		txtUsername.setFont(new Font("Algerian", Font.PLAIN, 18));
		txtUsername.setEditable(false);
		txtUsername.setColumns(10);
		txtUsername.setBackground(new Color(103, 128, 159));
		panProfile.add(txtUsername);

		txtEmail = new JTextField();
		txtEmail.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				if ((Login.getEmails().contains(txtEmail.getText())) && (!txtEmail.getText().equals(email2.get(0)))) {
					txtEmail.setBackground(new Color(207, 0, 15));
				} else {
					txtEmail.setBackground(new Color(103, 128, 159));
				}
			}

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyChar() == ',' || e.getKeyChar() == '-' || e.getKeyChar() == '_') {
					JOptionPane.showMessageDialog(null, "You cant use ( - & , & _ ).", "Error",
							JOptionPane.ERROR_MESSAGE, null);
				}
			}
		});
		sl_panProfile.putConstraint(SpringLayout.NORTH, txtEmail, 6, SpringLayout.SOUTH, txtUsername);
		sl_panProfile.putConstraint(SpringLayout.WEST, txtEmail, 6, SpringLayout.EAST, lalPic);
		sl_panProfile.putConstraint(SpringLayout.EAST, txtEmail, -10, SpringLayout.EAST, panProfile);
		txtEmail.setHorizontalAlignment(SwingConstants.CENTER);
		txtEmail.setForeground(new Color(228, 241, 254));
		txtEmail.setFont(new Font("Algerian", Font.PLAIN, 18));
		txtEmail.setEditable(false);
		txtEmail.setColumns(10);
		txtEmail.setBackground(new Color(103, 128, 159));
		panProfile.add(txtEmail);

		comboBox = new JComboBox();
		sl_panProfile.putConstraint(SpringLayout.NORTH, comboBox, 6, SpringLayout.SOUTH, lalPic);
		sl_panProfile.putConstraint(SpringLayout.WEST, comboBox, 0, SpringLayout.WEST, lalPic);
		sl_panProfile.putConstraint(SpringLayout.EAST, comboBox, 0, SpringLayout.EAST, lalPic);
		comboBox.setEnabled(false);
		comboBox.setForeground(new Color(228, 241, 254));
		comboBox.setFont(new Font("Algerian", Font.PLAIN, 16));
		comboBox.setBackground(new Color(103, 128, 159));
		panProfile.add(comboBox);

		passwordField_1 = new JPasswordField();
		passwordField_1.hide();
		passwordField_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				if (!txtPassword.getText().equals(passwordField_1.getText())) {
					txtPassword.setBackground(new Color(207, 0, 15));
					passwordField_1.setBackground(new Color(207, 0, 15));
				} else {
					txtPassword.setBackground(new Color(103, 128, 159));
					passwordField_1.setBackground(new Color(103, 128, 159));
				}
			}

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyChar() == ',' || e.getKeyChar() == '-' || e.getKeyChar() == '_') {
					JOptionPane.showMessageDialog(null, "You cant use ( - & , & _ ).", "Error",
							JOptionPane.ERROR_MESSAGE, null);
				}
			}
		});
		sl_panProfile.putConstraint(SpringLayout.WEST, passwordField_1, 0, SpringLayout.WEST, txtName);
		sl_panProfile.putConstraint(SpringLayout.EAST, passwordField_1, 0, SpringLayout.EAST, txtName);
		passwordField_1.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField_1.setForeground(new Color(228, 241, 254));
		passwordField_1.setFont(new Font("Algerian", Font.PLAIN, 18));
		passwordField_1.setEditable(false);
		passwordField_1.setColumns(10);
		passwordField_1.setBackground(new Color(103, 128, 159));
		panProfile.add(passwordField_1);

		JSeparator separator = new JSeparator();
		sl_panProfile.putConstraint(SpringLayout.NORTH, separator, 6, SpringLayout.SOUTH, passwordField_1);
		sl_panProfile.putConstraint(SpringLayout.WEST, separator, 0, SpringLayout.WEST, lalPic);
		sl_panProfile.putConstraint(SpringLayout.SOUTH, separator, -103, SpringLayout.SOUTH, panProfile);
		sl_panProfile.putConstraint(SpringLayout.EAST, separator, 0, SpringLayout.EAST, txtName);
		panProfile.add(separator);

		btnOfline = new JButton("Offline");
		btnOfline.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmProfile.setVisible(false);
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							StartOffline window = new StartOffline();
							window.frmEnter.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnOfline.setForeground(Color.BLACK);
		btnOfline.setFont(new Font("Algerian", Font.PLAIN, 13));
		btnOfline.setBackground(new Color(46, 204, 113));
		panProfile.add(btnOfline);

		btnOnline = new JButton("Online");
		btnOnline.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmProfile.setVisible(false);
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							StartOnline window = new StartOnline();
							window.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnOnline.setForeground(Color.BLACK);
		btnOnline.setFont(new Font("Algerian", Font.PLAIN, 13));
		sl_panProfile.putConstraint(SpringLayout.SOUTH, btnOnline, -7, SpringLayout.SOUTH, panProfile);
		sl_panProfile.putConstraint(SpringLayout.NORTH, btnOfline, 0, SpringLayout.NORTH, btnOnline);
		sl_panProfile.putConstraint(SpringLayout.EAST, btnOfline, -6, SpringLayout.WEST, btnOnline);
		sl_panProfile.putConstraint(SpringLayout.EAST, btnOnline, 0, SpringLayout.EAST, txtName);
		btnOnline.setBackground(new Color(137, 196, 244));
		panProfile.add(btnOnline);

		JPanel panel_1 = new JPanel();
		sl_panProfile.putConstraint(SpringLayout.NORTH, panel_1, 6, SpringLayout.SOUTH, comboBox);
		sl_panProfile.putConstraint(SpringLayout.WEST, panel_1, 0, SpringLayout.WEST, lalPic);
		sl_panProfile.putConstraint(SpringLayout.SOUTH, panel_1, 0, SpringLayout.SOUTH, passwordField_1);
		sl_panProfile.putConstraint(SpringLayout.EAST, panel_1, 0, SpringLayout.EAST, lalPic);
		panProfile.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));

		JToggleButton edit = new JToggleButton("Edit");
		panel_1.add(edit, BorderLayout.CENTER);
		sl_panProfile.putConstraint(SpringLayout.EAST, edit, 152, SpringLayout.EAST, lalPic);
		edit.setForeground(Color.BLACK);
		edit.setBackground(new Color(30, 130, 76));
		edit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (edit.isSelected()) {
					edit.setText("Save");
					UIManager.put("ToggleButton.select", new Color(150, 40, 27));
					SwingUtilities.updateComponentTreeUI(edit);

					String a1 = "C:\\Users\\Administrator\\eclipse-workspace\\BomberMan\\src\\ir\\ac\\guilan\\ce\\ap97\\Hendiani\\Gui\\Icon\\Barkeep.png";
					String a2 = "C:\\Users\\Administrator\\eclipse-workspace\\BomberMan\\src\\ir\\ac\\guilan\\ce\\ap97\\Hendiani\\Gui\\Icon\\Barmaid.png";
					if (a1.equals(Login.getPictures().get(Login.getPositionInList()))
							|| a2.equals(Login.getPictures().get(Login.getPositionInList()))) {
						activation = true;
					}
					txtName.setEditable(true);
					txtUsername.setEditable(true);
					txtEmail.setEditable(true);
					txtPassword.setEditable(true);
					passwordField_1.setEditable(true);
					passwordField_1.show();
					comboBox.setEnabled(true);
					lalPic.setEnabled(true);
					btnOnline.setEnabled(false);
					btnOfline.setEnabled(false);
				} else if (txtPassword.getText().toString().equals("")
						|| passwordField_1.getText().toString().equals("") || txtName.getText().toString().equals("")
						|| txtUsername.getText().toString().equals("") || txtEmail.getText().toString().equals("")) {
					// making empty fields empty.
					if (txtPassword.getText().toString().equals(""))
						txtPassword.setBackground(new Color(207, 0, 15));
					if (passwordField_1.getText().toString().equals(""))
						passwordField_1.setBackground(new Color(207, 0, 15));
					if (txtName.getText().toString().equals(""))
						txtName.setBackground(new Color(207, 0, 15));
					if (txtUsername.getText().toString().equals(""))
						txtUsername.setBackground(new Color(207, 0, 15));
					if (txtEmail.getText().toString().equals(""))
						txtEmail.setBackground(new Color(207, 0, 15));

					edit.setBackground(new Color(150, 40, 27));

					JOptionPane.showMessageDialog(null, "All fields must be filled.", "Error",
							JOptionPane.ERROR_MESSAGE, null);
				} else if ((Login.getUsernames().contains(txtUsername.getText())
						&& (!Login.getUsernames().contains(username2.get(0))))
						|| (Login.getEmails().contains(txtEmail.getText())
								&& (!Login.getEmails().contains(email2.get(0))))) {
					// making user name red.
					if (Login.getUsernames().contains(txtUsername.getText())) {
						txtUsername.setBackground(new Color(207, 0, 15));
					} else {
						txtUsername.setBackground(new Color(108, 122, 137));
					}
					// making email red.
					if (Login.getEmails().contains(txtEmail.getText())) {
						txtEmail.setBackground(new Color(207, 0, 15));
					} else {
						txtEmail.setBackground(new Color(108, 122, 137));
					}

					edit.setBackground(new Color(150, 40, 27));
					// if user name or email exists.
					JOptionPane.showMessageDialog(null, "Username and or Email already exists.", "Error",
							JOptionPane.ERROR_MESSAGE, null);
				} else if (!txtPassword.getText().toString().equals(passwordField_1.getText().toString())) {
					// making user passwords red.
					if (!txtPassword.getText().equals(passwordField_1.getText())) {
						txtPassword.setBackground(new Color(207, 0, 15));
						passwordField_1.setBackground(new Color(207, 0, 15));
					} else {
						txtPassword.setBackground(new Color(108, 122, 137));
						passwordField_1.setBackground(new Color(108, 122, 137));
					}

					edit.setBackground(new Color(150, 40, 27));
					// if passwords are not equals.
					JOptionPane.showMessageDialog(null, "Confirm Password field is not the same as password field.",
							"Error", JOptionPane.ERROR_MESSAGE, null);
				} else {
					temp.clear();
					// Checking if any fields contain "-" & ",".
					String[] atemp = (txtPassword.getText().toString() + passwordField_1.getText().toString()
							+ txtName.getText().toString() + txtUsername.getText().toString()
							+ txtEmail.getText().toString()).split("");
					for (int i = 0; i < atemp.length; i++) {
						temp.add(atemp[i]);
					}
					if (temp.contains(",") || temp.contains("-") || temp.contains("_")) {
						edit.setBackground(new Color(150, 40, 27));

						JOptionPane.showMessageDialog(null, "You cant use ( - & , & _ ).", "Error",
								JOptionPane.ERROR_MESSAGE, null);
					} else {
						edit.setText("Edit");
						edit.setBackground(new Color(30, 130, 76));

						txtName.setEditable(false);
						txtUsername.setEditable(false);
						txtEmail.setEditable(false);
						txtPassword.setEditable(false);
						passwordField_1.setEditable(false);
						passwordField_1.hide();
						comboBox.setEnabled(false);
						lalPic.setEnabled(false);
						btnOnline.setEnabled(true);
						btnOfline.setEnabled(true);
						// sending it to login page for ux management.
						Login.logingUser.setText(txtUsername.getText());
						Login.loginPass.setText(txtPassword.getText());

						try {
							if (activation) {
								// if default picture.
								if (gender == 0) {
									picPath = "C:\\Users\\Administrator\\eclipse-workspace\\BomberMan\\src\\ir\\ac\\guilan\\ce\\ap97\\Hendiani\\Gui\\Icon\\Barkeep.png";
								} else {
									picPath = "C:\\Users\\Administrator\\eclipse-workspace\\BomberMan\\src\\ir\\ac\\guilan\\ce\\ap97\\Hendiani\\Gui\\Icon\\Barmaid.png";
								}
							} else if (!activation) {
								picPath = file + "";
							}
						} catch (Exception e) {
						}

						if (comboBox.getSelectedItem().equals("Male")) {
							gender = 0;
						} else {
							gender = 1;
						}
						// Getting rid of error.
						if (!activation2) {
							// setting the users image.
							File file = new File(path2);
							path2 = Login.getPictures().get(Login.getPositionInList());

							Image image = null;
							try {
								image = ImageIO.read(file);
							} catch (IOException e) {
							}
							lalPic.setIcon(new ImageIcon(image.getScaledInstance(93, 96, image.SCALE_DEFAULT)));
							picPath = path2;
						}

						// SEND AND REPLACE IN SERVER AND IN ARRAY LIST.
						Login.usernames.set(Login.getPositionInList(), txtUsername.getText().replaceAll(" ", "_"));
						Login.passwords.set(Login.getPositionInList(), txtPassword.getText().replaceAll(" ", "_"));
						Login.names.set(Login.getPositionInList(), txtName.getText().replaceAll(" ", "_"));
						Login.emails.set(Login.getPositionInList(), txtEmail.getText().replaceAll(" ", "_"));
						Login.genders.set(Login.getPositionInList(), gender + "");
						Login.pictures.set(Login.getPositionInList(), picPath);
						Login.scores.set(Login.getPositionInList(), Login.getScores().get(Login.getPositionInList()));
						Function.clearDatabase();
						uneditedData();
					}
				}
			}
		});
		edit.setFont(new Font("Algerian", Font.PLAIN, 13));

		txtPassword = new JPasswordField();
		txtPassword.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyChar() == ',' || e.getKeyChar() == '-' || e.getKeyChar() == '_') {
					JOptionPane.showMessageDialog(null, "You cant use ( - & , & _ ).", "Error",
							JOptionPane.ERROR_MESSAGE, null);
				}
			}
		});
		sl_panProfile.putConstraint(SpringLayout.NORTH, passwordField_1, 6, SpringLayout.SOUTH, txtPassword);
		sl_panProfile.putConstraint(SpringLayout.NORTH, txtPassword, 6, SpringLayout.SOUTH, txtEmail);
		sl_panProfile.putConstraint(SpringLayout.WEST, txtPassword, 0, SpringLayout.WEST, txtName);
		sl_panProfile.putConstraint(SpringLayout.EAST, txtPassword, 0, SpringLayout.EAST, txtName);
		txtPassword.setHorizontalAlignment(SwingConstants.CENTER);
		txtPassword.setForeground(new Color(228, 241, 254));
		txtPassword.setFont(new Font("Algerian", Font.PLAIN, 18));
		txtPassword.setEditable(false);
		txtPassword.setColumns(10);
		txtPassword.setBackground(new Color(103, 128, 159));
		panProfile.add(txtPassword);

		JLabel label = new JLabel("");
		sl_panProfile.putConstraint(SpringLayout.NORTH, label, 66, SpringLayout.SOUTH, separator);
		sl_panProfile.putConstraint(SpringLayout.WEST, label, 0, SpringLayout.WEST, lalPic);
		sl_panProfile.putConstraint(SpringLayout.SOUTH, label, 0, SpringLayout.SOUTH, btnOfline);
		sl_panProfile.putConstraint(SpringLayout.EAST, label, -29, SpringLayout.EAST, lalPic);
		panProfile.add(label);
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frmProfile.setVisible(false);
				Login.frmLogin.setVisible(true);
				Login.errorAvoid = true;
			}
		});
		label.setIcon(new ImageIcon(Profile.class.getResource("/ir/ac/guilan/ce/ap97/Hendiani/Gui/Icon/exit.png")));

		btnStistic = new JButton("Statistic");
		btnStistic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Function.setStatistic();
				frmProfile.setVisible(false);
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Lists window = new Lists();
							window.frmScores.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnStistic.setForeground(Color.BLACK);
		sl_panProfile.putConstraint(SpringLayout.SOUTH, btnStistic, 0, SpringLayout.SOUTH, btnOfline);
		sl_panProfile.putConstraint(SpringLayout.EAST, btnStistic, -6, SpringLayout.WEST, btnOfline);
		btnStistic.setFont(new Font("Algerian", Font.PLAIN, 13));
		btnStistic.setBackground(new Color(211, 84, 0));
		panProfile.add(btnStistic);
	}
}
