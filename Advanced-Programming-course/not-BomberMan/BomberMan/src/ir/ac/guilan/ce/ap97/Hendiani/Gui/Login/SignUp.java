package ir.ac.guilan.ce.ap97.Hendiani.Gui.Login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.SpringLayout;
import javax.swing.filechooser.FileNameExtensionFilter;

import ir.ac.guilan.ce.ap97.Hendiani.Function.Function;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Toolkit;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class SignUp {

	protected JFrame frmSignUp;
	private JTextField txtName;
	private JPasswordField txtPassword;
	private JPasswordField passwordField_1;
	private JTextField txtUsername;
	private JTextField txtEmail;
	private JButton btnNewButton;
	private JComboBox comboBox;
	private boolean activation = true;
	private File file;
	protected JLabel lblPic;

	public static ArrayList<String> temp = new ArrayList<String>();

	/**
	 * Create the application.
	 */
	public SignUp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSignUp = new JFrame();
		frmSignUp.setResizable(false);
		frmSignUp.setIconImage(Toolkit.getDefaultToolkit()
				.getImage(SignUp.class.getResource("/ir/ac/guilan/ce/ap97/Hendiani/Gui/Icon/pen.png")));
		frmSignUp.setTitle("SIGN UP");
		frmSignUp.setBounds(100, 100, 458, 486);
		frmSignUp.setLocationRelativeTo(null);
		frmSignUp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(103, 128, 159));
		frmSignUp.getContentPane().add(panel, BorderLayout.CENTER);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(SignUp.class.getResource("/ir/ac/guilan/ce/ap97/Hendiani/Gui/Icon/contract.png")));
		sl_panel.putConstraint(SpringLayout.NORTH, label, 10, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, label, 10, SpringLayout.WEST, panel);
		panel.add(label);

		JSeparator separator = new JSeparator();
		sl_panel.putConstraint(SpringLayout.NORTH, separator, 9, SpringLayout.SOUTH, label);
		sl_panel.putConstraint(SpringLayout.WEST, separator, 10, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, separator, 11, SpringLayout.SOUTH, label);
		sl_panel.putConstraint(SpringLayout.EAST, separator, -10, SpringLayout.EAST, panel);
		panel.add(separator);

		JLabel lblNewLabel = new JLabel("REGISTER");
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel, 0, SpringLayout.NORTH, label);
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel, 122, SpringLayout.EAST, label);
		lblNewLabel.setFont(new Font("Algerian", Font.PLAIN, 17));
		panel.add(lblNewLabel);

		JLabel lblNameA = new JLabel("Name surname");
		sl_panel.putConstraint(SpringLayout.NORTH, lblNameA, 6, SpringLayout.SOUTH, separator);
		sl_panel.putConstraint(SpringLayout.WEST, lblNameA, 10, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, lblNameA, -343, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, lblNameA, -330, SpringLayout.EAST, panel);
		panel.add(lblNameA);

		JLabel lblNewLabel_1 = new JLabel("Username");
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 6, SpringLayout.SOUTH, lblNameA);
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel_1, 0, SpringLayout.WEST, label);
		sl_panel.putConstraint(SpringLayout.SOUTH, lblNewLabel_1, -314, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel_1, -330, SpringLayout.EAST, panel);
		panel.add(lblNewLabel_1);

		JLabel lblEmail = new JLabel("E-Mail");
		sl_panel.putConstraint(SpringLayout.NORTH, lblEmail, 6, SpringLayout.SOUTH, lblNewLabel_1);
		sl_panel.putConstraint(SpringLayout.WEST, lblEmail, 10, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, lblEmail, -330, SpringLayout.EAST, panel);
		panel.add(lblEmail);

		JLabel lblPassword = new JLabel("Password");
		sl_panel.putConstraint(SpringLayout.SOUTH, lblEmail, -6, SpringLayout.NORTH, lblPassword);
		sl_panel.putConstraint(SpringLayout.NORTH, lblPassword, 178, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lblPassword, 10, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, lblPassword, -256, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, lblPassword, 0, SpringLayout.EAST, lblNameA);
		panel.add(lblPassword);

		JLabel lblNewLabel_2 = new JLabel("Confirm Password");
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 6, SpringLayout.SOUTH, lblPassword);
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel_2, 10, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, lblNewLabel_2, -227, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel_2, 0, SpringLayout.EAST, lblNameA);
		panel.add(lblNewLabel_2);

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
		sl_panel.putConstraint(SpringLayout.WEST, txtName, 6, SpringLayout.EAST, lblNameA);
		sl_panel.putConstraint(SpringLayout.EAST, txtName, -10, SpringLayout.EAST, panel);
		sl_panel.putConstraint(SpringLayout.NORTH, txtName, 6, SpringLayout.SOUTH, separator);
		txtName.setText("John Doe");
		txtName.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtName.setText("");
			}
		});
		txtName.setForeground(new Color(228, 241, 254));
		txtName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtName.setBackground(new Color(108, 122, 137));
		panel.add(txtName);

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
		sl_panel.putConstraint(SpringLayout.WEST, txtPassword, 6, SpringLayout.EAST, lblPassword);
		sl_panel.putConstraint(SpringLayout.EAST, txtPassword, -10, SpringLayout.EAST, panel);
		txtPassword.setText("password");
		txtPassword.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtPassword.setText("");
			}
		});
		txtPassword.setForeground(new Color(228, 241, 254));
		txtPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtPassword.setBackground(new Color(108, 122, 137));
		panel.add(txtPassword);

		passwordField_1 = new JPasswordField();
		passwordField_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				if (!txtPassword.getText().equals(passwordField_1.getText())) {
					txtPassword.setBackground(new Color(207, 0, 15));
					passwordField_1.setBackground(new Color(207, 0, 15));
				} else {
					txtPassword.setBackground(new Color(108, 122, 137));
					passwordField_1.setBackground(new Color(108, 122, 137));
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
		sl_panel.putConstraint(SpringLayout.NORTH, passwordField_1, 207, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, passwordField_1, 6, SpringLayout.EAST, lblNewLabel_2);
		sl_panel.putConstraint(SpringLayout.EAST, passwordField_1, -10, SpringLayout.EAST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, txtPassword, -6, SpringLayout.NORTH, passwordField_1);
		sl_panel.putConstraint(SpringLayout.SOUTH, passwordField_1, -227, SpringLayout.SOUTH, panel);
		passwordField_1.setText("password");
		passwordField_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				passwordField_1.setText("");
			}
		});
		passwordField_1.setForeground(new Color(228, 241, 254));
		passwordField_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		passwordField_1.setBackground(new Color(108, 122, 137));
		panel.add(passwordField_1);

		txtUsername = new JTextField();
		txtUsername.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				if (Login.getUsernames().contains(txtUsername.getText())) {
					txtUsername.setBackground(new Color(207, 0, 15));
				} else {
					txtUsername.setBackground(new Color(108, 122, 137));
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
		sl_panel.putConstraint(SpringLayout.NORTH, txtUsername, 6, SpringLayout.SOUTH, txtName);
		sl_panel.putConstraint(SpringLayout.WEST, txtUsername, 6, SpringLayout.EAST, lblNewLabel_1);
		sl_panel.putConstraint(SpringLayout.EAST, txtUsername, -10, SpringLayout.EAST, panel);
		txtUsername.setText("example");
		txtUsername.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtUsername.setText("");
			}
		});
		txtUsername.setForeground(new Color(228, 241, 254));
		txtUsername.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtUsername.setBackground(new Color(108, 122, 137));
		panel.add(txtUsername);

		txtEmail = new JTextField();
		txtEmail.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				if (Login.getEmails().contains(txtEmail.getText())) {
					txtEmail.setBackground(new Color(207, 0, 15));
				} else {
					txtEmail.setBackground(new Color(108, 122, 137));
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
		sl_panel.putConstraint(SpringLayout.NORTH, txtPassword, 6, SpringLayout.SOUTH, txtEmail);
		sl_panel.putConstraint(SpringLayout.SOUTH, txtUsername, -6, SpringLayout.NORTH, txtEmail);
		sl_panel.putConstraint(SpringLayout.SOUTH, txtEmail, 0, SpringLayout.SOUTH, lblEmail);
		sl_panel.putConstraint(SpringLayout.NORTH, txtEmail, 0, SpringLayout.NORTH, lblEmail);
		sl_panel.putConstraint(SpringLayout.WEST, txtEmail, 6, SpringLayout.EAST, lblEmail);
		sl_panel.putConstraint(SpringLayout.EAST, txtEmail, -10, SpringLayout.EAST, panel);
		txtEmail.setText("temp@example.com");
		txtEmail.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtEmail.setText("");
			}
		});
		txtEmail.setForeground(new Color(228, 241, 254));
		txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtEmail.setBackground(new Color(108, 122, 137));
		panel.add(txtEmail);

		JCheckBox chckbxIAgreeTo = new JCheckBox("I agree to all terms and conditions");
		sl_panel.putConstraint(SpringLayout.WEST, chckbxIAgreeTo, 0, SpringLayout.WEST, txtName);
		chckbxIAgreeTo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// activating button if agreed to terms stated in package.
				btnNewButton.setEnabled(chckbxIAgreeTo.isSelected());
			}
		});
		chckbxIAgreeTo.setBackground(new Color(189, 195, 199));
		panel.add(chckbxIAgreeTo);

		lblPic = new JLabel("");
		sl_panel.putConstraint(SpringLayout.NORTH, lblPic, 7, SpringLayout.SOUTH, lblNewLabel_2);
		sl_panel.putConstraint(SpringLayout.WEST, lblPic, 0, SpringLayout.WEST, label);
		sl_panel.putConstraint(SpringLayout.EAST, lblPic, 0, SpringLayout.EAST, lblNameA);
		lblPic.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JFileChooser fileChooser = new JFileChooser();
				FileNameExtensionFilter filter = new FileNameExtensionFilter("JPEG file", "jpg", "jpeg");
				fileChooser.addChoosableFileFilter(filter);

				if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
					try {
						file = fileChooser.getSelectedFile();
						Image image = ImageIO.read(fileChooser.getSelectedFile());
						lblPic.setIcon(new ImageIcon(image.getScaledInstance(93, 96, image.SCALE_DEFAULT)));
						frmSignUp.setVisible(true);
						activation = false;
					} catch (IOException e) {
					}
				}
			}
		});
		lblPic.setIcon(new ImageIcon(SignUp.class.getResource("/ir/ac/guilan/ce/ap97/Hendiani/Gui/Icon/Barkeep.png")));
		panel.add(lblPic);

		btnNewButton = new JButton("ENTER");
		sl_panel.putConstraint(SpringLayout.NORTH, btnNewButton, 310, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, btnNewButton, -124, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, btnNewButton, 0, SpringLayout.WEST, lblNewLabel);
		sl_panel.putConstraint(SpringLayout.EAST, btnNewButton, 0, SpringLayout.EAST, lblNewLabel);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// checking what's filled.
				if (txtPassword.getText().toString().equals("") || passwordField_1.getText().toString().equals("")
						|| txtName.getText().toString().equals("") || txtUsername.getText().toString().equals("")
						|| txtEmail.getText().toString().equals("")) {
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

					JOptionPane.showMessageDialog(null, "All fields must be filled.", "Error",
							JOptionPane.ERROR_MESSAGE, null);
				} else if (Login.getUsernames().contains(txtUsername.getText())
						|| Login.getEmails().contains(txtEmail.getText())) {
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
					// if passwords are not equals.
					JOptionPane.showMessageDialog(null, "Confirm Password field is not the same as password field.",
							"Error", JOptionPane.ERROR_MESSAGE, null);
				} else {
					temp.clear();
					String[] atemp = (txtPassword.getText().toString() + passwordField_1.getText().toString()
							+ txtName.getText().toString() + txtUsername.getText().toString()
							+ txtEmail.getText().toString()).split("");
					for (int i = 0; i < atemp.length; i++) {
						temp.add(atemp[i]);
					}
					if (temp.contains(",") || temp.contains("-") || temp.contains("_")) {
						JOptionPane.showMessageDialog(null, "You cant use ( - & , & _ ).", "Error",
								JOptionPane.ERROR_MESSAGE, null);
					} else {
						String picPath = null;
						try {
							if (activation) {
								// if default picture.
								if (comboBox.getSelectedIndex() == 0) {
									picPath = "/ir/ac/guilan/ce/ap97/Hendiani/Gui/Icon/Barkeep.png";
								} else {
									picPath = "/ir/ac/guilan/ce/ap97/Hendiani/Gui/Icon/Barmaid.png";
								}
							} else {
								picPath = file + "";
							}
						} catch (Exception E) {
						}

						// TODO FIX SCORE.
						String tempp = txtUsername.getText().toString().replaceAll(" ", "_") + ","
								+ txtPassword.getText().toString().replaceAll(" ", "_") + ","
								+ txtName.getText().toString().replaceAll(" ", "_") + ","
								+ txtEmail.getText().toString().replaceAll(" ", "_") + "," + comboBox.getSelectedIndex()
								+ "," + picPath + "," + "0_0-0_0";
						// entering users Data in data base.
						Function.writeDatabase(tempp);
						// for adding the data to array list.
						Function.addList(txtUsername.getText().toString().replaceAll(" ", "_"),
								txtPassword.getText().toString().replaceAll(" ", "_"),
								txtName.getText().toString().replaceAll(" ", "_"),
								txtEmail.getText().toString().replaceAll(" ", "_"), comboBox.getSelectedIndex() + "",
								picPath, "0_0-0_0", tempp);

						// sending it to login page for ux management.
						Login.logingUser.setText(txtUsername.getText());
						Login.loginPass.setText(txtPassword.getText());
						frmSignUp.setVisible(false);
						Login.frmLogin.setVisible(true);
					}
				}
			}
		});
		btnNewButton.setBackground(new Color(3, 166, 120));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setEnabled(false);
		panel.add(btnNewButton);

		JButton btnCancel = new JButton("CANCEL");
		sl_panel.putConstraint(SpringLayout.WEST, btnCancel, 354, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, btnCancel, -10, SpringLayout.EAST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, chckbxIAgreeTo, -6, SpringLayout.WEST, btnCancel);
		sl_panel.putConstraint(SpringLayout.SOUTH, btnCancel, -169, SpringLayout.SOUTH, panel);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmSignUp.setVisible(false);
				Login.frmLogin.setVisible(true);
			}
		});
		btnCancel.setForeground(Color.BLACK);
		btnCancel.setBackground(new Color(211, 84, 0));
		panel.add(btnCancel);

		comboBox = new JComboBox();
		sl_panel.putConstraint(SpringLayout.NORTH, btnCancel, 6, SpringLayout.SOUTH, comboBox);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (activation) {
					if (comboBox.getSelectedIndex() == 1) {
						lblPic.setIcon(new ImageIcon(
								SignUp.class.getResource("/ir/ac/guilan/ce/ap97/Hendiani/Gui/Icon/Barmaid.png")));
					} else {
						lblPic.setIcon(new ImageIcon(
								SignUp.class.getResource("/ir/ac/guilan/ce/ap97/Hendiani/Gui/Icon/Barkeep.png")));
					}
				}
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Male", "Female" }));
		sl_panel.putConstraint(SpringLayout.NORTH, chckbxIAgreeTo, 6, SpringLayout.SOUTH, comboBox);
		sl_panel.putConstraint(SpringLayout.SOUTH, comboBox, 29, SpringLayout.SOUTH, passwordField_1);
		comboBox.setForeground(new Color(228, 241, 254));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox.setBackground(new Color(108, 122, 137));
		sl_panel.putConstraint(SpringLayout.NORTH, comboBox, 6, SpringLayout.SOUTH, passwordField_1);
		sl_panel.putConstraint(SpringLayout.WEST, comboBox, 0, SpringLayout.WEST, txtName);
		sl_panel.putConstraint(SpringLayout.EAST, comboBox, 314, SpringLayout.WEST, txtName);
		panel.add(comboBox);
	}
}
