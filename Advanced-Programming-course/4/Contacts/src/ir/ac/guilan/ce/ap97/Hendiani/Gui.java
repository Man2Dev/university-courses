package ir.ac.guilan.ce.ap97.Hendiani;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.ObjectInputStream.GetField;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DropMode;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import com.toedter.calendar.JDateChooser;

import ir.ac.guilan.ce.ap97.Hendiani.Function.AddressBook;
import ir.ac.guilan.ce.ap97.Hendiani.Function.Group;
import ir.ac.guilan.ce.ap97.Hendiani.Function.Location;
import ir.ac.guilan.ce.ap97.Hendiani.Function.Output;
import ir.ac.guilan.ce.ap97.Hendiani.ListGroups.Groups;
import ir.ac.guilan.ce.ap97.Hendiani.ListName.Contacts;
import java.awt.BorderLayout;

public class Gui {
	private static int count = 0;
	public static ArrayList<Double> radius = new ArrayList<Double>();
	public static ArrayList<String> groups = new ArrayList<String>();
	public static ArrayList<String> names = new ArrayList<String>();
	public static ArrayList<String> numbers = new ArrayList<String>();
	public static ArrayList<String> dates = new ArrayList<String>();
	public static ArrayList<Double> x = new ArrayList<Double>();
	public static ArrayList<Double> y = new ArrayList<Double>();
	public static ArrayList<String> genders = new ArrayList<String>();
	public static ArrayList<String> emails = new ArrayList<String>();

	public int getCount() {
		return count;
	}

	public static void main(String[] args) {
		/**
		 * Launch the application.
		 */
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui window = new Gui();
					window.frmContactAppV.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JFrame frmContactAppV;
	private int numOfGroups = 0;
	private static int locationCount = 0;
	private JTextField txtNameSurname;
	private JTextField textNum;
	private JTextField txtNamegmailcom;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField latitude;
	private JTextField langitude;
	private JComboBox<String> comboBox_country;
	private JComboBox<String> comboBox_Group;
	private JComboBox<String> comboBox_selectG;
	private JComboBox<String> comboBox_newG;
	private JComboBox<String> comboBox_Gender;
	private JComboBox<String> comboBox_AddressBook;
	private JDateChooser dateChooser;

	private JTextField textDeleteNum;

	private JTextField textDeleteName;
	private JTextField textDeleteGroup;
	private JTextField txtCityStreet;

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
		frmContactAppV = new JFrame();
		frmContactAppV.setTitle("Contact app v10.1");
		frmContactAppV.setBounds(100, 100, 648, 513);
		frmContactAppV.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmContactAppV.getContentPane().setLayout(new BorderLayout(0, 0));

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(Color.GRAY);
		tabbedPane.setBorder(UIManager.getBorder("DesktopIcon.border"));
		frmContactAppV.getContentPane().add(tabbedPane);

		JPanel add = new JPanel();
		add.setToolTipText("");
		add.setBackground(Color.GRAY);
		tabbedPane.addTab("add", null, add, "adding contact info.");
		SpringLayout sl_add = new SpringLayout();
		add.setLayout(sl_add);

		JLabel lblAdress = new JLabel("AddressBook");
		sl_add.putConstraint(SpringLayout.WEST, lblAdress, 10, SpringLayout.WEST, add);
		add.add(lblAdress);

		comboBox_AddressBook = new JComboBox();
		sl_add.putConstraint(SpringLayout.WEST, comboBox_AddressBook, 107, SpringLayout.WEST, add);
		sl_add.putConstraint(SpringLayout.EAST, lblAdress, -6, SpringLayout.WEST, comboBox_AddressBook);
		sl_add.putConstraint(SpringLayout.SOUTH, lblAdress, 0, SpringLayout.SOUTH, comboBox_AddressBook);
		sl_add.putConstraint(SpringLayout.NORTH, lblAdress, 0, SpringLayout.NORTH, comboBox_AddressBook);
		comboBox_AddressBook.setModel(new DefaultComboBoxModel(new String[] { "Default" }));
		add.add(comboBox_AddressBook);

		JButton button_2 = new JButton("Add");
		sl_add.putConstraint(SpringLayout.EAST, comboBox_AddressBook, -6, SpringLayout.WEST, button_2);
		sl_add.putConstraint(SpringLayout.WEST, button_2, 533, SpringLayout.WEST, add);
		sl_add.putConstraint(SpringLayout.EAST, button_2, -21, SpringLayout.EAST, add);
		sl_add.putConstraint(SpringLayout.SOUTH, comboBox_AddressBook, 0, SpringLayout.SOUTH, button_2);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try { // adding new group category.
					String name = JOptionPane.showInputDialog("Name of new AddressBook.");
					if (name.length() >= 1) {
						comboBox_AddressBook.addItem(name);
					} else {
						JOptionPane.showMessageDialog(null, "Sorry but the word has to contain at least one word.");
					}
				} catch (Exception e) {
				}
			}
		});
		add.add(button_2);

		JLabel lblNameSurname = new JLabel("Name Surname");
		sl_add.putConstraint(SpringLayout.NORTH, lblNameSurname, 10, SpringLayout.NORTH, add);
		sl_add.putConstraint(SpringLayout.WEST, lblNameSurname, 10, SpringLayout.WEST, add);
		sl_add.putConstraint(SpringLayout.EAST, lblNameSurname, -512, SpringLayout.EAST, add);
		lblNameSurname.setHorizontalAlignment(SwingConstants.LEFT);
		add.add(lblNameSurname);

		txtNameSurname = new JTextField();
		sl_add.putConstraint(SpringLayout.WEST, txtNameSurname, 0, SpringLayout.WEST, comboBox_AddressBook);
		sl_add.putConstraint(SpringLayout.EAST, txtNameSurname, -21, SpringLayout.EAST, add);
		sl_add.putConstraint(SpringLayout.NORTH, txtNameSurname, 10, SpringLayout.NORTH, add);
		txtNameSurname.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txtNameSurname.setText("");
			}
		});
		txtNameSurname.setHorizontalAlignment(SwingConstants.LEFT);
		txtNameSurname.setDropMode(DropMode.INSERT);
		txtNameSurname.setText("name Surname");
		add.add(txtNameSurname);
		txtNameSurname.setColumns(15);

		JLabel label_1 = new JLabel("Number");
		sl_add.putConstraint(SpringLayout.NORTH, label_1, 36, SpringLayout.NORTH, add);
		sl_add.putConstraint(SpringLayout.SOUTH, lblNameSurname, -6, SpringLayout.NORTH, label_1);
		sl_add.putConstraint(SpringLayout.WEST, label_1, 10, SpringLayout.WEST, add);
		add.add(label_1);

		textNum = new JTextField();
		sl_add.putConstraint(SpringLayout.NORTH, textNum, 7, SpringLayout.SOUTH, txtNameSurname);
		sl_add.putConstraint(SpringLayout.SOUTH, label_1, 0, SpringLayout.SOUTH, textNum);
		sl_add.putConstraint(SpringLayout.WEST, textNum, 107, SpringLayout.WEST, add);
		sl_add.putConstraint(SpringLayout.EAST, label_1, -6, SpringLayout.WEST, textNum);
		textNum.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				textNum.setText("");
			}
		});
		sl_add.putConstraint(SpringLayout.EAST, textNum, -21, SpringLayout.EAST, add);
		textNum.setDropMode(DropMode.INSERT);
		textNum.setText("09");
		textNum.setHorizontalAlignment(SwingConstants.LEFT);
		textNum.setToolTipText("");
		add.add(textNum);
		textNum.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Location");
		sl_add.putConstraint(SpringLayout.WEST, lblNewLabel_1, 10, SpringLayout.WEST, add);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		add.add(lblNewLabel_1);

		latitude = new JTextField();
		sl_add.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 0, SpringLayout.NORTH, latitude);
		sl_add.putConstraint(SpringLayout.SOUTH, lblNewLabel_1, 0, SpringLayout.SOUTH, latitude);
		sl_add.putConstraint(SpringLayout.EAST, lblNewLabel_1, -70, SpringLayout.WEST, latitude);
		sl_add.putConstraint(SpringLayout.WEST, latitude, 171, SpringLayout.WEST, add);
		sl_add.putConstraint(SpringLayout.EAST, latitude, -265, SpringLayout.EAST, add);
		latitude.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				latitude.setText("");
			}
		});
		latitude.setText("37.19545");
		add.add(latitude);
		latitude.setColumns(10);

		JLabel longitude = new JLabel("longitude");
		sl_add.putConstraint(SpringLayout.NORTH, longitude, 0, SpringLayout.NORTH, lblNewLabel_1);
		sl_add.putConstraint(SpringLayout.WEST, longitude, 6, SpringLayout.EAST, latitude);
		sl_add.putConstraint(SpringLayout.SOUTH, longitude, 0, SpringLayout.SOUTH, lblNewLabel_1);
		add.add(longitude);

		langitude = new JTextField();
		sl_add.putConstraint(SpringLayout.EAST, longitude, -6, SpringLayout.WEST, langitude);
		sl_add.putConstraint(SpringLayout.WEST, langitude, 429, SpringLayout.WEST, add);
		sl_add.putConstraint(SpringLayout.EAST, langitude, -21, SpringLayout.EAST, add);
		langitude.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				langitude.setText("");
			}
		});
		langitude.setText("49.63672");
		add.add(langitude);
		langitude.setColumns(10);

		JLabel lblGrupe = new JLabel("Group");
		sl_add.putConstraint(SpringLayout.WEST, lblGrupe, 10, SpringLayout.WEST, add);
		lblGrupe.setHorizontalAlignment(SwingConstants.LEFT);
		add.add(lblGrupe);

		comboBox_Group = new JComboBox();
		sl_add.putConstraint(SpringLayout.WEST, comboBox_Group, 107, SpringLayout.WEST, add);
		sl_add.putConstraint(SpringLayout.EAST, lblGrupe, -6, SpringLayout.WEST, comboBox_Group);
		sl_add.putConstraint(SpringLayout.SOUTH, lblGrupe, 0, SpringLayout.SOUTH, comboBox_Group);
		sl_add.putConstraint(SpringLayout.NORTH, lblGrupe, 0, SpringLayout.NORTH, comboBox_Group);
		sl_add.putConstraint(SpringLayout.NORTH, comboBox_Group, 148, SpringLayout.NORTH, add);
		comboBox_Group
				.setModel(new DefaultComboBoxModel(new String[] { "unasigned", "favorites", "friends", "family" }));
		add.add(comboBox_Group);

		JButton btnAdd = new JButton("Add");
		sl_add.putConstraint(SpringLayout.EAST, comboBox_Group, -6, SpringLayout.WEST, btnAdd);
		sl_add.putConstraint(SpringLayout.WEST, btnAdd, 533, SpringLayout.WEST, add);
		sl_add.putConstraint(SpringLayout.EAST, btnAdd, -21, SpringLayout.EAST, add);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try { // adding new group category.
					String name = JOptionPane.showInputDialog("Name of new group.");
					if (name.length() >= 1) {
						comboBox_Group.addItem(name);
						comboBox_selectG.addItem(name);
						comboBox_newG.addItem(name);
						numOfGroups++;
					} else {
						JOptionPane.showMessageDialog(null, "Sorry but the word has to contain at least one word.");
					}
				} catch (Exception e) {
				}
			}
		});
		add.add(btnAdd);

		JLabel label_3 = new JLabel("Gender");
		sl_add.putConstraint(SpringLayout.WEST, label_3, 10, SpringLayout.WEST, add);
		add.add(label_3);

		comboBox_Gender = new JComboBox();
		sl_add.putConstraint(SpringLayout.WEST, comboBox_Gender, 107, SpringLayout.WEST, add);
		sl_add.putConstraint(SpringLayout.EAST, comboBox_Gender, -21, SpringLayout.EAST, add);
		sl_add.putConstraint(SpringLayout.EAST, label_3, -6, SpringLayout.WEST, comboBox_Gender);
		sl_add.putConstraint(SpringLayout.NORTH, label_3, 0, SpringLayout.NORTH, comboBox_Gender);
		sl_add.putConstraint(SpringLayout.SOUTH, label_3, 22, SpringLayout.NORTH, comboBox_Gender);
		sl_add.putConstraint(SpringLayout.NORTH, btnAdd, 6, SpringLayout.SOUTH, comboBox_Gender);
		sl_add.putConstraint(SpringLayout.SOUTH, comboBox_Gender, -6, SpringLayout.NORTH, comboBox_Group);
		comboBox_Gender.setModel(new DefaultComboBoxModel(new String[] { "unasigned", "Male", "Female", "Other" }));
		add.add(comboBox_Gender);

		JLabel lblDate = new JLabel("Birthday");
		sl_add.putConstraint(SpringLayout.NORTH, lblDate, 6, SpringLayout.SOUTH, label_1);
		sl_add.putConstraint(SpringLayout.WEST, lblDate, 10, SpringLayout.WEST, add);
		sl_add.putConstraint(SpringLayout.SOUTH, lblDate, -6, SpringLayout.NORTH, lblNewLabel_1);
		sl_add.putConstraint(SpringLayout.EAST, lblDate, 0, SpringLayout.EAST, lblAdress);
		add.add(lblDate);

		dateChooser = new JDateChooser();
		sl_add.putConstraint(SpringLayout.WEST, dateChooser, 107, SpringLayout.WEST, add);
		sl_add.putConstraint(SpringLayout.EAST, dateChooser, -21, SpringLayout.EAST, add);
		dateChooser.setDate(new Date());
		dateChooser.setToolTipText("");
		sl_add.putConstraint(SpringLayout.NORTH, langitude, 6, SpringLayout.SOUTH, dateChooser);
		sl_add.putConstraint(SpringLayout.NORTH, latitude, 6, SpringLayout.SOUTH, dateChooser);
		sl_add.putConstraint(SpringLayout.NORTH, dateChooser, 6, SpringLayout.SOUTH, textNum);
		dateChooser.getCalendarButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		add.add(dateChooser);

		JLabel lblEmail = new JLabel("E-mail");
		sl_add.putConstraint(SpringLayout.WEST, lblEmail, 10, SpringLayout.WEST, add);
		add.add(lblEmail);

		txtNamegmailcom = new JTextField();
		sl_add.putConstraint(SpringLayout.WEST, txtNamegmailcom, 107, SpringLayout.WEST, add);
		sl_add.putConstraint(SpringLayout.EAST, lblEmail, -6, SpringLayout.WEST, txtNamegmailcom);
		sl_add.putConstraint(SpringLayout.NORTH, button_2, 5, SpringLayout.SOUTH, txtNamegmailcom);
		sl_add.putConstraint(SpringLayout.SOUTH, btnAdd, -6, SpringLayout.NORTH, txtNamegmailcom);
		sl_add.putConstraint(SpringLayout.NORTH, txtNamegmailcom, 6, SpringLayout.SOUTH, comboBox_Group);
		sl_add.putConstraint(SpringLayout.NORTH, comboBox_AddressBook, 6, SpringLayout.SOUTH, txtNamegmailcom);
		sl_add.putConstraint(SpringLayout.EAST, txtNamegmailcom, -21, SpringLayout.EAST, add);
		sl_add.putConstraint(SpringLayout.NORTH, lblEmail, 3, SpringLayout.NORTH, txtNamegmailcom);
		txtNamegmailcom.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txtNamegmailcom.setText("");
			}
		});
		txtNamegmailcom.setText("name@gmail.com");
		txtNamegmailcom.setHorizontalAlignment(SwingConstants.LEFT);
		add.add(txtNamegmailcom);
		txtNamegmailcom.setColumns(10);

		JLabel label_6 = new JLabel("");
		JLabel label_4 = new JLabel("");
		TextArea textArea_3 = new TextArea();
		TextArea textArea_2 = new TextArea();
		TextArea textArea = new TextArea();
		textArea.setEditable(false);
		JButton btnEnter = new JButton("Enter");
		sl_add.putConstraint(SpringLayout.WEST, btnEnter, 276, SpringLayout.WEST, add);
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {// making sure not to skip a count in case of error.
					setCount(getCount() + 1);
					// setting format for showing date
					SimpleDateFormat dateF = new SimpleDateFormat("dd/MMM/yyyy");
					String date = dateF.format(dateChooser.getDate());

					if (txtNameSurname.getText().equals("") || textNum.getText().equals("")) {
						// making sure name and number is filled.
						JOptionPane.showMessageDialog(null, "name and number must be filled.");
						setCount(getCount() - 1);
					} else {
						// making sure of no repeat entry.
						if (AddressBook.findClone(txtNameSurname.getText(), textNum.getText())) {
							// making the address string.
							String ad = comboBox_country.getSelectedItem() + " " + txtCityStreet.getText();
							Contacts o = new Contacts(comboBox_Group.getSelectedItem(), getCount(),
									comboBox_Group.getSelectedIndex(),
									comboBox_AddressBook.getSelectedItem().toString(),
									comboBox_Group.getSelectedItem().toString(), txtNameSurname.getText().toString(),
									textNum.getText().toString(), date, latitude.getText().toString(),
									langitude.getText().toString(), comboBox_Gender.getSelectedItem().toString(),
									txtNamegmailcom.getText().toString());

							// if x or y is empty.
							if (latitude.getText().equals("") || langitude.getText().equals("")) {
								latitude.setText("0.0");
								langitude.setText("0.0");
								locationCount--;
							}

							names.add(txtNameSurname.getText());
							numbers.add(textNum.getText());
							// dates.add(dateChooser.getDate().toString());
							x.add(Double.parseDouble(latitude.getText()));
							y.add(Double.parseDouble(langitude.getText()));
							// genders.add(comboBox_Gender.getItemAt(comboBox_Gender.getSelectedIndex()).toString());
							// addressBooks.add(comboBox_AddressBook.getSelectedItem().toString());
							groups.add(comboBox_Group.getSelectedItem().toString());

							// the number of contacts entered.
							label_4.setText(getCount() + "");
							// the number of location entered.
							if (Location.locationC(latitude.getText(), langitude.getText())) {
								setLocationCount(getLocationCount() + 1);
							}
							// entering it.
							label_6.setText(getLocationCount() + "");
							// putting text to the text area.
							Output t = new Output(ad, comboBox_AddressBook.getSelectedItem().toString(),
									comboBox_Group.getSelectedItem().toString(), txtNameSurname.getText().toString(),
									textNum.getText().toString(), date, latitude.getText().toString(),
									langitude.getText().toString(), comboBox_Gender.getSelectedItem().toString(),
									txtNamegmailcom.getText().toString());

							textArea.append(Output.show());
							// textArea_2.append(Output.show());
							// textArea_3.append(Output.show());

						} else {
							JOptionPane.showMessageDialog(null, "name and/or number has been entered before.");
							setCount(getCount() - 1);
						}
					}
				} catch (Exception E) {
					setCount(getCount() - 1);
				}

			}
		});
		add.add(btnEnter);

		JLabel lblAddress = new JLabel("Address");
		sl_add.putConstraint(SpringLayout.NORTH, lblAddress, 6, SpringLayout.SOUTH, lblAdress);
		sl_add.putConstraint(SpringLayout.WEST, lblAddress, 10, SpringLayout.WEST, add);
		add.add(lblAddress);

		comboBox_country = new JComboBox();
		sl_add.putConstraint(SpringLayout.SOUTH, lblAddress, 0, SpringLayout.SOUTH, comboBox_country);
		sl_add.putConstraint(SpringLayout.WEST, comboBox_country, 107, SpringLayout.WEST, add);
		sl_add.putConstraint(SpringLayout.EAST, lblAddress, -6, SpringLayout.WEST, comboBox_country);
		sl_add.putConstraint(SpringLayout.NORTH, btnEnter, 51, SpringLayout.SOUTH, comboBox_country);
		sl_add.putConstraint(SpringLayout.NORTH, comboBox_country, 5, SpringLayout.SOUTH, comboBox_AddressBook);
		comboBox_country.setModel(new DefaultComboBoxModel(new String[] { "country", "Iran", "Afghanistan", "Albania",
				"Algeria", "Andorra", "Angola", "Antigua and Barbuda", "Argentina", "Armenia", "Australia", "Austria",
				"Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin",
				"Bhutan", "Bolivia", "Bosnia and Herzegovina", "Botswana", "Brazil", "Brunei", "Bulgaria",
				"Burkina Faso", "Burundi", "Cabo Verde", "Cambodia", "Cameroon", "Canada",
				"Central African Republic (CAR)", "Chad", "Chile", "China", "Colombia", "Comoros",
				"Democratic Republic of the Congo", "Republic of the Congo", "Costa Rica", "Cote d'Ivoire", "Croatia",
				"Cuba", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "Ecuador",
				"Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Eswatini (formerly Swaziland)",
				"Ethiopia", "Fiji", "Finland", "France", "Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Greece",
				"Grenada", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Honduras", "Hungary", "Iceland",
				"India", "Indonesia", "Iraq", "Ireland", "Israel", "Italy", "Jamaica", "Japan", "Jordan", "Kazakhstan",
				"Kenya", "Kiribati", "Kosovo", "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon", "Lesotho",
				"Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Macedonia (FYROM)", "Madagascar",
				"Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Mauritania", "Mauritius",
				"Mexico", "Micronesia", "Moldova", "Monaco", "Mongolia", "Montenegro", "Morocco", "Mozambique",
				"Myanmar (formerly Burma)", "Namibia", "Nauru", "Nepal", "Netherlands", "New Zealand", "Nicaragua",
				"Niger", "Nigeria", "North Korea", "Norway", "Oman", "Pakistan", "Palau", "Palestine", "Panama",
				"Papua New Guinea", "Paraguay", "Peru", "Philippines", "Poland", "Portugal", "Qatar", "Romania",
				"Russia", "Rwanda", "Saint Kitts and Nevis", "Saint Lucia", "Saint Vincent and the Grenadines", "Samoa",
				"San Marino", "Sao Tome and Principe", "Saudi Arabia", "Senegal", "Serbia", "Seychelles",
				"Sierra Leone", "Singapore", "Slovakia", "Slovenia", "Solomon Islands", "Somalia", "South Africa",
				"South Korea", "South Sudan", "Spain", "Sri Lanka", "Sudan", "Suriname",
				"Swaziland (renamed to Eswatini)", "Sweden", "Switzerland", "Syria", "Taiwan", "Tajikistan", "Tanzania",
				"Thailand", "Timor-Leste", "Togo", "Tonga", "Trinidad and Tobago", "Tunisia", "Turkey", "Turkmenistan",
				"Tuvalu", "Uganda", "Ukraine", "United Arab Emirates (UAE)", "United Kingdom (UK)",
				"United States of America (USA)", "Uruguay", "Uzbekistan", "Vanuatu", "Vatican City (Holy See)",
				"Venezuela", "Vietnam", "Yemen", "Zambia", "Zimbabwe" }));
		comboBox_country.setToolTipText("country");
		add.add(comboBox_country);

		txtCityStreet = new JTextField();
		sl_add.putConstraint(SpringLayout.WEST, txtCityStreet, 354, SpringLayout.WEST, add);
		sl_add.putConstraint(SpringLayout.EAST, comboBox_country, -6, SpringLayout.WEST, txtCityStreet);
		txtCityStreet.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txtCityStreet.setText("");
			}
		});

		sl_add.putConstraint(SpringLayout.SOUTH, txtCityStreet, 0, SpringLayout.SOUTH, comboBox_country);
		txtCityStreet.setText("State, city, street, alley, No....");
		sl_add.putConstraint(SpringLayout.NORTH, txtCityStreet, 5, SpringLayout.SOUTH, comboBox_AddressBook);
		sl_add.putConstraint(SpringLayout.EAST, txtCityStreet, 0, SpringLayout.EAST, button_2);
		add.add(txtCityStreet);
		txtCityStreet.setColumns(10);

		JLabel label = new JLabel("latitude");
		sl_add.putConstraint(SpringLayout.NORTH, label, 0, SpringLayout.NORTH, lblNewLabel_1);
		sl_add.putConstraint(SpringLayout.WEST, label, 0, SpringLayout.WEST, comboBox_AddressBook);
		sl_add.putConstraint(SpringLayout.SOUTH, label, 0, SpringLayout.SOUTH, lblNewLabel_1);
		sl_add.putConstraint(SpringLayout.EAST, label, -6, SpringLayout.WEST, latitude);
		add.add(label);

		Panel contactList = new Panel();
		tabbedPane.addTab("contact list", null, contactList, "the contact list.");
		contactList.setLayout(null);

		textArea.setBackground(Color.LIGHT_GRAY);
		textArea.setBounds(0, 224, 625, 219);
		contactList.add(textArea);

		JPanel panel_7 = new JPanel();
		panel_7.setBorder(UIManager.getBorder("TableHeader.cellBorder"));
		panel_7.setBackground(Color.LIGHT_GRAY);
		panel_7.setBounds(10, 0, 603, 100);
		contactList.add(panel_7);

		JLabel label_5 = new JLabel("Contacts");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Blackadder ITC", Font.PLAIN, 64));
		label_5.setBackground(Color.DARK_GRAY);
		panel_7.add(label_5);

		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setToolTipText("individual person search.");
		panel_2.setBorder(UIManager.getBorder("OptionPane.border"));
		panel_2.setBounds(0, 184, 302, 39);
		contactList.add(panel_2);

		textDeleteName = new JTextField();
		textDeleteName.setColumns(10);
		textDeleteName.setBounds(53, 5, 150, 20);
		panel_2.add(textDeleteName);

		JButton btnDelete_name = new JButton("Delete");
		btnDelete_name.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					AddressBook object = new AddressBook();
					object.setCount(getCount());
					// Deleting it from group.
					AddressBook.deleteName(textDeleteName.getText());
					// Decreasing the number of contacts.
					// and inputing correct count after deleting.
					setCount(object.getCount());
					setCount(getCount() - 1);
					// Setting it to label.
					label_4.setText(getCount() + "");
					// putting text to the text area.
					textArea.setText(Contacts.gobj.toString());
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "must enter name.");
				}
			}
		});
		btnDelete_name.setBounds(213, 4, 89, 23);
		panel_2.add(btnDelete_name);

		JLabel lblName_1 = new JLabel("Name");
		lblName_1.setBounds(10, 8, 42, 14);
		panel_2.add(lblName_1);

		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setToolTipText("");
		panel_3.setBorder(UIManager.getBorder("OptionPane.border"));
		panel_3.setBounds(292, 184, 333, 39);
		contactList.add(panel_3);

		textDeleteNum = new JTextField();
		textDeleteNum.setColumns(10);
		textDeleteNum.setBounds(74, 5, 150, 20);
		panel_3.add(textDeleteNum);

		JButton btnDelete_num = new JButton("Delete");
		btnDelete_num.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					AddressBook object = new AddressBook();
					object.setCount(getCount());
					// Deleting it from group.
					AddressBook.deleteNumber(textDeleteNum.getText());
					// Decreasing the number of contacts.
					// and inputing correct count after deleting.
					setCount(object.getCount());
					setCount(getCount() - 1);
					// Setting it to label.
					label_4.setText(getCount() + "");
					// putting text to the text area.
					textArea.setText(Contacts.gobj.toString());
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "must enter number.");
				}
			}
		});
		btnDelete_num.setBounds(234, 4, 89, 23);
		panel_3.add(btnDelete_num);

		JLabel lblNumber = new JLabel("Number");
		lblNumber.setBounds(21, 8, 56, 14);
		panel_3.add(lblNumber);

		JLabel lblDeleteingYNumber = new JLabel("deleting by name.");
		lblDeleteingYNumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeleteingYNumber.setBounds(0, 131, 159, 53);
		contactList.add(lblDeleteingYNumber);

		JLabel lblDeletingByName = new JLabel("deleting by number.");
		lblDeletingByName.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeletingByName.setBounds(466, 131, 159, 53);
		contactList.add(lblDeletingByName);

		JLabel lblNewLabel = new JLabel("Number of contacts:");
		lblNewLabel.setBounds(10, 111, 118, 17);
		contactList.add(lblNewLabel);

		label_4.setBounds(138, 111, 455, 17);
		contactList.add(label_4);

		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setToolTipText("individual person search.");
		panel_5.setBorder(UIManager.getBorder("Menu.border"));
		panel_5.setBounds(158, 155, 310, 29);
		contactList.add(panel_5);

		textDeleteGroup = new JTextField();
		textDeleteGroup.setColumns(10);
		textDeleteGroup.setBounds(62, 5, 141, 20);
		panel_5.add(textDeleteGroup);

		JButton button_3 = new JButton("Delete");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Group object = new Group();
					object.setCount(getCount());
					// Deleting it from group.
					Group.deleteGroup(textDeleteGroup.getText());
					// Decreasing the number of contacts.
					// and inputing correct count after deleting.
					setCount(object.getCount());
					setCount(getCount() - 1);
					// Setting it to label.
					label_4.setText(getCount() + "");
					// putting text to the text area.
					textArea.setText(Contacts.gobj.toString());
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "must enter number.");
				}
			}
		});
		button_3.setBounds(213, 4, 89, 23);
		panel_5.add(button_3);

		JLabel lblGroup_1 = new JLabel("Group");
		lblGroup_1.setBounds(10, 8, 42, 14);
		panel_5.add(lblGroup_1);

		JLabel lblDeletingByGroup = new JLabel("deleting by group.");
		lblDeletingByGroup.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeletingByGroup.setBounds(0, 131, 625, 23);
		contactList.add(lblDeletingByGroup);

		Panel group = new Panel();
		group.setLayout(null);
		tabbedPane.addTab("group", null, group, "the groups.");

		textArea_2.setEditable(false);
		textArea_2.setBackground(Color.LIGHT_GRAY);
		textArea_2.setBounds(0, 224, 623, 219);
		group.add(textArea_2);

		JPanel panel_8 = new JPanel();
		panel_8.setBorder(UIManager.getBorder("TableHeader.cellBorder"));
		panel_8.setBackground(Color.LIGHT_GRAY);
		panel_8.setBounds(10, 0, 603, 100);
		group.add(panel_8);

		JLabel lblGroup = new JLabel("Group");
		lblGroup.setHorizontalAlignment(SwingConstants.CENTER);
		lblGroup.setFont(new Font("Blackadder ITC", Font.PLAIN, 64));
		lblGroup.setBackground(Color.DARK_GRAY);
		panel_8.add(lblGroup);

		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setToolTipText("individual person search.");
		panel_4.setBorder(UIManager.getBorder("OptionPane.border"));
		panel_4.setBounds(0, 190, 623, 39);
		group.add(panel_4);

		JLabel lblGroupName = new JLabel("Select group");
		lblGroupName.setBounds(10, 8, 73, 14);
		panel_4.add(lblGroupName);

		comboBox_selectG = new JComboBox();
		comboBox_selectG
				.setModel(new DefaultComboBoxModel(new String[] { "unasigned", "favorites", "friends", "family" }));
		comboBox_selectG.setBounds(93, 5, 150, 20);
		panel_4.add(comboBox_selectG);

		JLabel lblNewGroup = new JLabel("New group");
		lblNewGroup.setBounds(253, 8, 73, 14);
		panel_4.add(lblNewGroup);

		JButton button_enterG = new JButton("Enter");
		button_enterG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Group.groupEdit(comboBox_selectG.getSelectedItem(),
				// comboBox_newG.getSelectedItem());
				// putting text to the text area.
				// textArea.setText(Contacts.gobj.toString());
			}
		});

		comboBox_newG = new JComboBox();
		comboBox_newG
				.setModel(new DefaultComboBoxModel(new String[] { "unasigned", "favorites", "friends", "family" }));
		comboBox_newG.setBounds(336, 5, 162, 20);
		panel_4.add(comboBox_newG);

		JButton button_adding = new JButton("+");
		button_adding.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try { // adding new group category.
					String name = JOptionPane.showInputDialog("Name of new group.");
					if (name.length() >= 1) {
						comboBox_Group.addItem(name);
						comboBox_selectG.addItem(name);
						comboBox_newG.addItem(name);
						numOfGroups++;
					} else {
						JOptionPane.showMessageDialog(null, "Sorry but the word has to contain at least one word.");
					}
				} catch (Exception e) {
				}
			}
		});
		button_adding.setBounds(497, 5, 41, 20);
		panel_4.add(button_adding);
		button_enterG.setBounds(548, 4, 67, 23);
		panel_4.add(button_enterG);

		JButton button = new JButton("Enter");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String n = "";
				// setting the groups entered for number of each group member.
				Collections.sort(groups);
				for (int i = 0; i < (4 + numOfGroups); i++) {
					n += (comboBox_Group.getItemAt(i).toString() + "= "
							+ Collections.frequency(groups, comboBox_Group.getItemAt(i).toString())
							+ System.lineSeparator());
				}
				JOptionPane.showMessageDialog(null, n);
			}
		});
		button.setBounds(546, 156, 67, 23);
		group.add(button);

		JLabel lblNewLabel_2 = new JLabel("Get number of members of all groups.");
		lblNewLabel_2.setBounds(312, 156, 224, 23);
		group.add(lblNewLabel_2);

		Panel search = new Panel();
		search.setLayout(null);
		tabbedPane.addTab("search", null, search, "searching for neighbours or a specific individual.");

		textArea_3.setEditable(false);
		textArea_3.setBackground(Color.LIGHT_GRAY);
		textArea_3.setBounds(0, 225, 623, 218);
		search.add(textArea_3);

		JPanel panel_9 = new JPanel();
		panel_9.setBorder(UIManager.getBorder("TableHeader.cellBorder"));
		panel_9.setBackground(Color.LIGHT_GRAY);
		panel_9.setBounds(10, 0, 603, 100);
		search.add(panel_9);

		JLabel lblSearch = new JLabel("Search");
		lblSearch.setHorizontalAlignment(SwingConstants.CENTER);
		lblSearch.setFont(new Font("Blackadder ITC", Font.PLAIN, 64));
		lblSearch.setBackground(Color.DARK_GRAY);
		panel_9.add(lblSearch);

		JPanel panel = new JPanel();
		panel.setToolTipText("individual person search.");
		panel.setLayout(null);
		panel.setBorder(UIManager.getBorder("OptionPane.border"));
		panel.setBounds(0, 188, 292, 39);
		search.add(panel);

		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(203, 4, 89, 23);
		panel.add(btnSearch);

		JLabel lblName = new JLabel("Group");
		lblName.setBounds(10, 8, 43, 14);
		panel.add(lblName);

		textField_1 = new JTextField();
		textField_1.setBounds(62, 5, 131, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);

		JPanel panel_1 = new JPanel();
		panel_1.setToolTipText("searching for neighbours.");
		panel_1.setLayout(null);
		panel_1.setBorder(UIManager.getBorder("OptionPane.border"));
		panel_1.setBounds(290, 188, 333, 39);
		search.add(panel_1);

		JButton button_1 = new JButton("Search");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// checking if user has entered at least two contacts.
				if (locationCount >= 2) {
					// finding radius.
					Location.neighbour();
					textArea_3.setText(radius.toString().replaceAll(", ", System.lineSeparator()));
				} else {
					JOptionPane.showMessageDialog(null, "must have at least two contacts to have neighbors.");
				}
			}
		});
		button_1.setBounds(234, 4, 89, 23);
		panel_1.add(button_1);

		JLabel lblNeighbor = new JLabel("Neighbour");
		lblNeighbor.setBounds(10, 8, 61, 14);
		panel_1.add(lblNeighbor);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(80, 5, 144, 20);
		panel_1.add(textField_2);

		JLabel lblSearchingForNeighbours = new JLabel("searching for group.");
		lblSearchingForNeighbours.setHorizontalAlignment(SwingConstants.CENTER);
		lblSearchingForNeighbours.setBounds(0, 166, 321, 23);
		search.add(lblSearchingForNeighbours);

		JLabel label_2 = new JLabel("searching for neighbours.");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(302, 166, 321, 23);
		search.add(label_2);

		JLabel lblNumberOfLocations = new JLabel("Number of locations:");
		lblNumberOfLocations.setBounds(10, 111, 118, 17);
		search.add(lblNumberOfLocations);

		label_6.setBounds(138, 111, 465, 17);
		search.add(label_6);
	}

	public void setCount(int count) {
		this.count = count;
	}

	public static int getLocationCount() {
		return locationCount;
	}

	public void setLocationCount(int locationCount) {
		this.locationCount = locationCount;
	}
}
