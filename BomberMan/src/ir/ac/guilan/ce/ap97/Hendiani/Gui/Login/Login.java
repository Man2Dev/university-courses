package ir.ac.guilan.ce.ap97.Hendiani.Gui.Login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.SpringLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;

import ir.ac.guilan.ce.ap97.Hendiani.Function.Function;
import ir.ac.guilan.ce.ap97.Hendiani.Gui.Profile.Profile;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	public static JFrame frmLogin;
	public static JTextField logingUser;
	public static JPasswordField loginPass;
	private static int positionInList;
	private JLabel lblFbdfgbdffndfnfdn;
	public static boolean errorAvoid;

	public static ArrayList<String> userData = new ArrayList<String>();
	public static ArrayList<String> usernames = new ArrayList<String>();
	public static ArrayList<String> passwords = new ArrayList<String>();
	public static ArrayList<String> names = new ArrayList<String>();
	public static ArrayList<String> emails = new ArrayList<String>();
	public static ArrayList<String> genders = new ArrayList<String>();
	public static ArrayList<String> pictures = new ArrayList<String>();
	public static ArrayList<String> scores = new ArrayList<String>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setResizable(false);
		frmLogin.setIconImage(Toolkit.getDefaultToolkit()
				.getImage(Login.class.getResource("/ir/ac/guilan/ce/ap97/Hendiani/Gui/Icon/key.png")));
		frmLogin.setTitle("LOGIN");
		frmLogin.setBounds(100, 100, 450, 300);
		frmLogin.setLocationRelativeTo(null);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// setting the array lists.
		Function.addList();
		JPanel panel = new JPanel();
		panel.setBackground(new Color(103, 128, 159));
		frmLogin.getContentPane().add(panel, BorderLayout.CENTER);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);

		JLabel lblNewLabel = new JLabel("Username");
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel, 7, SpringLayout.WEST, panel);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Password");
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 121, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel_1, 7, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, lblNewLabel_1, -125, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, lblNewLabel, -6, SpringLayout.NORTH, lblNewLabel_1);
		sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel, 0, SpringLayout.EAST, lblNewLabel_1);
		panel.add(lblNewLabel_1);

		JSeparator separator = new JSeparator();
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel, 6, SpringLayout.SOUTH, separator);
		sl_panel.putConstraint(SpringLayout.EAST, separator, 434, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, separator, -185, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, separator, 10, SpringLayout.WEST, panel);
		panel.add(separator);

		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				errorAvoid = false;
				// Check if username and email exists in server.
				for (int i = 0; i < Login.userData.size(); i++) {
					String username = Login.usernames.get(i);
					String password = Login.passwords.get(i);
					if ((username + password).toString().equals(
							logingUser.getText().replaceAll(" ", "_") + loginPass.getText().replaceAll(" ", "_"))) {
						// setting the position in which user data can bes found.
						setPositionInList(i);
						// if user exist.
						frmLogin.setVisible(false);
						// clearing error label.
						lblFbdfgbdffndfnfdn.setText("");
						EventQueue.invokeLater(new Runnable() {
							public void run() {
								try {
									Profile window = new Profile();
									window.frmProfile.setVisible(true);
								} catch (Exception e) {
									e.printStackTrace();
								}
							}
						});
						break;
					} else {
						if (!errorAvoid) {
							lblFbdfgbdffndfnfdn.setText("Username and or password doesn't exist please sign up.");
						}
					}
				}
			}
		});
		sl_panel.putConstraint(SpringLayout.SOUTH, btnLogin, -35, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, btnLogin, -226, SpringLayout.EAST, panel);
		btnLogin.setBackground(new Color(3, 166, 120));
		btnLogin.setForeground(new Color(0, 0, 0));
		panel.add(btnLogin);

		JButton btnS = new JButton("SIGN UP");
		sl_panel.putConstraint(SpringLayout.NORTH, btnS, 0, SpringLayout.NORTH, btnLogin);
		sl_panel.putConstraint(SpringLayout.WEST, btnS, 6, SpringLayout.EAST, btnLogin);
		btnS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmLogin.setVisible(false);
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							SignUp window = new SignUp();
							window.frmSignUp.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnS.setBackground(new Color(211, 84, 0));
		btnS.setForeground(new Color(0, 0, 0));
		panel.add(btnS);

		JLabel lblNewLabel_3 = new JLabel("LOGIN SYSTEM");
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_3, 24, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel_3, -94, SpringLayout.EAST, panel);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Algerian", Font.PLAIN, 17));
		panel.add(lblNewLabel_3);

		JLabel label = new JLabel("");
		sl_panel.putConstraint(SpringLayout.NORTH, separator, 0, SpringLayout.SOUTH, label);
		sl_panel.putConstraint(SpringLayout.SOUTH, label, -187, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel_3, 30, SpringLayout.EAST, label);
		sl_panel.putConstraint(SpringLayout.WEST, label, 10, SpringLayout.WEST, panel);
		label.setIcon(new ImageIcon(Login.class.getResource("/ir/ac/guilan/ce/ap97/Hendiani/Gui/Icon/lock.png")));
		panel.add(label);

		logingUser = new JTextField();
		sl_panel.putConstraint(SpringLayout.WEST, logingUser, 6, SpringLayout.EAST, lblNewLabel);
		sl_panel.putConstraint(SpringLayout.EAST, logingUser, -10, SpringLayout.EAST, panel);
		logingUser.setText("example");
		logingUser.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				logingUser.setText("");
			}
		});
		sl_panel.putConstraint(SpringLayout.SOUTH, logingUser, -156, SpringLayout.SOUTH, panel);
		logingUser.setForeground(new Color(228, 241, 254));
		logingUser.setFont(new Font("Tahoma", Font.PLAIN, 14));
		logingUser.setBackground(new Color(108, 122, 137));
		panel.add(logingUser);

		loginPass = new JPasswordField();
		sl_panel.putConstraint(SpringLayout.NORTH, loginPass, 8, SpringLayout.SOUTH, logingUser);
		sl_panel.putConstraint(SpringLayout.WEST, loginPass, 79, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, loginPass, -67, SpringLayout.NORTH, btnLogin);
		sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel_1, -6, SpringLayout.WEST, loginPass);
		sl_panel.putConstraint(SpringLayout.EAST, loginPass, -10, SpringLayout.EAST, panel);
		loginPass.setText("password");
		loginPass.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				loginPass.setText("");
			}
		});
		loginPass.setForeground(new Color(228, 241, 254));
		loginPass.setFont(new Font("Tahoma", Font.PLAIN, 14));
		loginPass.setBackground(new Color(108, 122, 137));
		panel.add(loginPass);

		lblFbdfgbdffndfnfdn = new JLabel("");
		lblFbdfgbdffndfnfdn.setFont(new Font("Algerian", Font.PLAIN, 14));
		sl_panel.putConstraint(SpringLayout.WEST, lblFbdfgbdffndfnfdn, 3, SpringLayout.WEST, lblNewLabel);
		sl_panel.putConstraint(SpringLayout.EAST, lblFbdfgbdffndfnfdn, 0, SpringLayout.EAST, separator);
		lblFbdfgbdffndfnfdn.setHorizontalAlignment(SwingConstants.CENTER);
		lblFbdfgbdffndfnfdn.setForeground(new Color(150, 40, 27));
		sl_panel.putConstraint(SpringLayout.NORTH, lblFbdfgbdffndfnfdn, 6, SpringLayout.SOUTH, lblNewLabel_1);
		panel.add(lblFbdfgbdffndfnfdn);
	}

	public static int getPositionInList() {
		return positionInList;
	}

	public void setPositionInList(int positionInList) {
		this.positionInList = positionInList;
	}

	public static ArrayList<String> getUserData() {
		return userData;
	}

	public static void setUserData(ArrayList<String> userData) {
		Login.userData = userData;
	}

	public static ArrayList<String> getPasswords() {
		return passwords;
	}

	public static void setPasswords(ArrayList<String> passwords) {
		Login.passwords = passwords;
	}

	public static ArrayList<String> getNames() {
		return names;
	}

	public static void setNames(ArrayList<String> names) {
		Login.names = names;
	}

	public static ArrayList<String> getEmails() {
		return emails;
	}

	public static void setEmails(ArrayList<String> emails) {
		Login.emails = emails;
	}

	public static ArrayList<String> getGenders() {
		return genders;
	}

	public static void setGenders(ArrayList<String> genders) {
		Login.genders = genders;
	}

	public static ArrayList<String> getUsernames() {
		return usernames;
	}

	public static void setUsernames(ArrayList<String> usernames) {
		Login.usernames = usernames;
	}

	public static ArrayList<String> getPictures() {
		return pictures;
	}

	public static void setPictures(ArrayList<String> pictures) {
		Login.pictures = pictures;
	}

	public static ArrayList<String> getScores() {
		return scores;
	}

	public static void setScores(ArrayList<String> scores) {
		Login.scores = scores;
	}
}
