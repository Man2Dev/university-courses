package Gui;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Toolkit;

import javax.swing.JFrame;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JRadioButton;
import javax.swing.border.SoftBevelBorder;

import Function.Function;

import javax.swing.border.AbstractBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.BoxLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Area;
import java.awt.geom.RoundRectangle2D;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Font;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Label;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.GridLayout;
import net.miginfocom.swing.MigLayout;

public class Gui {

	private JFrame frame;
	public static JTextField textField;
	private JButton btnNewButton;
	public static JPanel panel;
	public static String[][] elements = { { "ace", "Very good" }, { "act", "Take action" },
			{ "add", "Join (something) to something else" }, { "age", "Grow old" }, { "ago", "Before the present" },
			{ "aid", "Help, assist, or support" }, { "aim", "Point or direct" },
			{ "air", "Invisible gaseous substance" }, { "all", "Used to refer to the whole quantity" },
			{ "amp", "Unit of measure for the strength of an electrical current" }, { "and", "Used to connect words" },
			{ "ant", "A small insect" }, { "any", "Used to refer to one or some of a thing" },
			{ "ape", "A large primate" }, { "apt", "Appropriate or suitable in the circumstances" },
			{ "arc", "A part of the circumference of a curve" },
			{ "are", "Unit of measure, equal to 100 square meters" }, { "ark", "The ship built by Noah" },
			{ "arm", "Two upper limbs of the human body" },
			{ "art", "Expression or application of human creative skill" },
			{ "ash", "Powdery residue left after the burning" },
			{ "ask", "Say something in order to obtain information" } };

	public static ArrayList<String> ele = new ArrayList<String>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui window = new Gui();
					window.frame.setVisible(true);
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
		frame = new JFrame();
		frame.setBounds(100, 100, 649, 487);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Gui.class.getResource("/Resources/hash.png")));
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(38, 50, 56));
		panel_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		frame.getContentPane().add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new BorderLayout(0, 0));

		JPanel panel_2 = new JPanel();
		panel_2.setOpaque(false);
		panel_1.add(panel_2, BorderLayout.WEST);

		ButtonGroup group = new ButtonGroup();
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.X_AXIS));

		JRadioButton rdbtnNewRadioButton = new JRadioButton("Insert");
		rdbtnNewRadioButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		rdbtnNewRadioButton.setForeground(new Color(228, 241, 254));
		rdbtnNewRadioButton.setOpaque(false);
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnNewButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/locked (1).png")));
				textField.requestFocus();
				textField.selectAll();
			}
		});
		rdbtnNewRadioButton.setFocusPainted(false);
		group.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setSelected(true);
		panel_2.add(rdbtnNewRadioButton);

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Remove");
		rdbtnNewRadioButton_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		rdbtnNewRadioButton_1.setForeground(new Color(228, 241, 254));
		rdbtnNewRadioButton_1.setOpaque(false);
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnNewButton
						.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/encryption (1).png")));
				textField.requestFocus();
				textField.selectAll();
			}
		});
		rdbtnNewRadioButton_1.setFocusPainted(false);
		group.add(rdbtnNewRadioButton_1);
		panel_2.add(rdbtnNewRadioButton_1);

		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Find");
		rdbtnNewRadioButton_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		rdbtnNewRadioButton_2.setForeground(new Color(228, 241, 254));
		rdbtnNewRadioButton_2.setOpaque(false);
		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnNewButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/search (1).png")));
				textField.requestFocus();
				textField.selectAll();
			}
		});
		rdbtnNewRadioButton_2.setFocusPainted(false);
		group.add(rdbtnNewRadioButton_2);
		panel_2.add(rdbtnNewRadioButton_2);

		JPanel panel_3 = new JPanel();
		panel_3.setOpaque(false);
		panel_1.add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		textField = new JTextField(10) {
			@Override
			protected void paintComponent(Graphics g) {
				if (textField.isEditable()) {
					int w = getWidth() - 1;
					int h = getHeight() - 1;
					Graphics2D g2 = (Graphics2D) g.create();
					g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
					g2.setPaint(new Color(39, 128, 105));
					// g2.setPaint(new Color(106, 194, 89));
					g2.fillRoundRect(0, 0, w, h, h, h);
					g2.setPaint(panel_1.getBackground());
					g2.drawRoundRect(0, 0, w, h, h, h);
					g2.dispose();
				}
				super.paintComponent(g);
			}

			@Override
			public void updateUI() {
				super.updateUI();
				setOpaque(false);
				setBorder(BorderFactory.createEmptyBorder(4, 8, 4, 8));
			}
		};
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				textField.selectAll();
			}
		});
		textField.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				if ((arg0.getKeyChar() + "").equals("\n")) {
					if (rdbtnNewRadioButton.isSelected()) {
						try {
							String[] obj = textField.getText().split(";");

							for (int i = 0; i < obj.length + 1; i++) {
								String[] obj2 = obj[i].split(",");
								// System.out.println(obj2[0]+"-"+obj2[1]);
								Function.insertIndex(obj2[0], obj2[1]);
							}
						} catch (Exception e) {
						}
					} else if (rdbtnNewRadioButton_1.isSelected()) {
						Function.removeIndex(textField.getText());
					} else if (rdbtnNewRadioButton_2.isSelected()) {
						textField.setText(Function.findIndex(textField.getText()));
					}
				}
			}
		});
		panel_3.add(textField);
		textField.setEditable(true);
		textField.setForeground(new Color(228, 241, 254));

		JPanel panel_4 = new JPanel();
		panel_4.setOpaque(false);
		panel_1.add(panel_4, BorderLayout.EAST);
		panel_4.setLayout(new BorderLayout(0, 0));

		btnNewButton = new JButton("");
		btnNewButton.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseReleased(MouseEvent arg0) {
				textField.requestFocus();
				textField.selectAll();
				
				if (rdbtnNewRadioButton.isSelected()) {
					btnNewButton
							.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/locked (1).png")));
					try {
						String[] obj = textField.getText().split(";");

						for (int i = 0; i < obj.length + 1; i++) {
							String[] obj2 = obj[i].split(",");
							// System.out.println(obj2[0]+"-"+obj2[1]);
							Function.insertIndex(obj2[0], obj2[1]);
						}
					} catch (Exception e) {
					}
				} else if (rdbtnNewRadioButton_1.isSelected()) {
					btnNewButton.setIcon(
							new javax.swing.ImageIcon(getClass().getResource("/Resources/encryption (1).png")));
					Function.removeIndex(textField.getText());
				} else if (rdbtnNewRadioButton_2.isSelected()) {
					btnNewButton
							.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/search (1).png")));
					textField.setText(Function.findIndex(textField.getText()));
				}
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				btnNewButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/checked (0).png")));
			}
		});
		panel_4.add(btnNewButton);

		btnNewButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/locked (1).png")));
		btnNewButton.setOpaque(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setFocusPainted(false);

		panel = new JPanel();
		// panel.setBackground(new Color(38, 50, 56));
		panel.setBackground(new Color(25, 42, 86));
		// panel.setBackground(new Color(39, 60, 117));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new MigLayout("", "[]", "[][]"));

//		LinkedList<LinkedList<String>> outer = new LinkedList<LinkedList<String>>();
//		LinkedList<String> inner = new LinkedList<String>();
//		// setting empty nodes.
//		for (int i = 0; i < elements.length; i++) {
//			inner = new LinkedList<String>();
//			inner.add("Null");
//			outer.add(inner);
//		}
//		// filling nodes with keys and definitions.
//		for (int i = 0; i < elements.length; i++) {
//			int g = Function.hashFunction(elements[i][0], elements.length);
//			String temp = (elements[i][0]);
//
//			if (!outer.get(g).isEmpty()) {
//				// if the inner node is full.
//				outer.get(g).add(temp);
//			} else {
//				// if the node is empty.
//				inner = new LinkedList<String>();
//				inner.add(temp);
//				outer.add(inner);
//			}
//		}
//		System.out.println(outer);
		Function.insert(elements);
		textField.requestFocus();
	}
}