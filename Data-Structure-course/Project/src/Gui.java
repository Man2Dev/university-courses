import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JToggleButton;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.Panel;
import javax.swing.JButton;
import javax.swing.BorderFactory;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;

import javax.swing.event.ChangeEvent;
import javax.swing.JCheckBox;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Toolkit;
import java.util.ArrayList;

public class Gui {

	private static JTextField textField_2;
	private static JTextField textField_3;
	private static JTextField textField;
	private static JCheckBox chckbxSort = new JCheckBox("Sort answer ");
	private static JToggleButton JToggleButton = new JToggleButton("");

	private static JRadioButton rdb1 = new JRadioButton("All");

	private static JRadioButton rdb2 = new JRadioButton("A");

	private static JRadioButton rdb3 = new JRadioButton("B ");
	private static JRadioButton rdbtnNewRadioButton = new JRadioButton("Numbers");
	private static JSlider slider = new JSlider();
	private static JSlider slider_1 = new JSlider();
	private static JSlider slider_2 = new JSlider();

	private static JTextField textField_Union;
	private static JTextField textField_Intersection;
	private static JTextField textField_1;

	public static void ans() {
		// answer.
		if (JToggleButton.isSelected()) {

			Object[] temp = Function.union(Function.arrList1, Function.arrList2, chckbxSort.isSelected()).toArray();

			if (temp.length > 0) {

				String r = "";

				for (int i = 0; i < temp.length; i++) {
					r += temp[i];

					if ((temp.length - 1) > i) {
						r += ", ";
					}
				}
				textField.setText(r);

				// time complexity.
				String e = "";
				Object[] temp1 = Function.timeUnion.toArray();

				for (int i = 0; i < temp1.length; i++) {
					e += temp1[i];

					if ((temp1.length - 1) > i) {
						e += ", ";
					}
				}
				textField_1.setText(e);
				Function.timeUnion.clear();
			} else {
				textField.setText("-");
				textField_1.setText("-");
			}

		} else {
			Object[] temp = Function.intersection(Function.arrList1, Function.arrList2, chckbxSort.isSelected())
					.toArray();
			if (temp.length > 0) {

				String r = "";

				for (int i = 0; i < temp.length; i++) {
					r += temp[i];

					if ((temp.length - 1) > i) {
						r += ", ";
					}
				}
				textField.setText(r);

				// time complexity.
				String e = "";
				Object[] temp1 = Function.timeIntersection.toArray();

				for (int i = 0; i < temp1.length; i++) {
					e += temp1[i];

					if ((temp1.length - 1) > i) {
						e += ", ";
					}
				}
				textField_1.setText(e);
				Function.timeIntersection.clear();
			} else {
				textField.setText("-");
				textField_1.setText("-");
			}
		}
	}

	public static void ans2() {
		// Time complexity.
		Function.timeComplexity();

		if (rdbtnNewRadioButton.isSelected()) {

			try {
				String f = "";
				String r = "";
				Object[] temp1 = Function.timeIntersection.toArray();
				Object[] temp2 = Function.timeUnion.toArray();
				// Intersection.
				for (int i = 0; i < temp1.length; i++) {
					f += temp1[i];

					if ((temp1.length - 1) > i) {
						f += ", ";
					}
				}
				textField_Intersection.setText(f);
				// Union.
				for (int i = 0; i < temp2.length; i++) {
					r += temp2[i];

					if ((temp2.length - 1) > i) {
						r += ", ";
					}
				}
				textField_Union.setText(r);
			} catch (Exception e) {
			}

		} else {

			try {
				String f = "";
				String r = "";
				ArrayList<Long> temp1 = Function.timeIntersection;
				ArrayList<Long> temp2 = Function.timeUnion;
				// Intersection.
				for (int i = 0; i < temp1.size(); i++) {
					if (temp1.get(i) <= temp2.get(i)) {
						f += "O";

						if ((temp1.size() - 1) > i) {
							f += ", ";
						}
					} else {
						f += "\u03A9";

						if ((temp1.size() - 1) > i) {
							f += ", ";
						}
					}
				}
				textField_Intersection.setText(f);
				// Union.
				for (int i = 0; i < temp2.size(); i++) {
					if (temp2.get(i) <= temp1.get(i)) {
						r += "O";

						if ((temp2.size() - 1) > i) {
							r += ", ";
						}
					} else {
						r += "\u03A9";

						if ((temp2.size() - 1) > i) {
							r += ", ";
						}
					}
				}
				textField_Union.setText(r);
			} catch (Exception e) {
			}

		}
	}

	public static JCheckBox getChckbxSort() {
		return chckbxSort;
	}

	public static JToggleButton getJToggleButton() {
		return JToggleButton;
	}

	public static JSlider getSlider() {
		return slider;
	}

	public static JSlider getSlider_1() {
		return slider_1;
	}

	public static JSlider getSlider_2() {
		return slider_2;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
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

	public static void setChckbxSort(JCheckBox chckbxSort) {
		Gui.chckbxSort = chckbxSort;
	}

	public static void setJToggleButton(JToggleButton jToggleButton) {
		JToggleButton = jToggleButton;
	}

	public static void setSlider(JSlider slider) {
		Gui.slider = slider;
	}

	public static void setSlider_1(JSlider slider_1) {
		Gui.slider_1 = slider_1;
	}

	public static void setSlider_2(JSlider slider_2) {
		Gui.slider_2 = slider_2;
	}

	public static void update() {

		if (rdb1.isSelected()) {

			Function.arrList1.clear();
			Function.arrList2.clear();
			Function.arrList1.addAll(Function.ranArrL(getSlider().getValue(), getSlider_1().getValue()));
			Function.arrList2.addAll(Function.ranArrL(getSlider().getValue(), getSlider_1().getValue()));

			textField_2.setText("");
			textField_3.setText("");

			String a = "";
			for (int i = 0; i < Function.arrList1.size(); i++) {
				a += (Function.arrList1.get(i) + "");
				if ((Function.arrList1.size() - 1) > i) {
					a += ", ";
				}
			}
			textField_2.setText(a);

			String b = "";
			for (int i = 0; i < Function.arrList2.size(); i++) {
				b += (Function.arrList2.get(i) + "");
				if ((Function.arrList2.size() - 1) > i) {
					b += ", ";
				}
			}
			textField_3.setText(b);

		} else if (rdb2.isSelected()) {

			Function.arrList1.clear();
			Function.arrList1.addAll(Function.ranArrL(getSlider().getValue(), getSlider_1().getValue()));

			textField_2.setText("");

			String a = "";
			for (int i = 0; i < Function.arrList1.size(); i++) {
				a += (Function.arrList1.get(i) + "");
				if ((Function.arrList1.size() - 1) > i) {
					a += ", ";
				}
			}
			textField_2.setText(a);

		} else if (rdb3.isSelected()) {

			Function.arrList2.clear();
			Function.arrList2.addAll(Function.ranArrL(getSlider().getValue(), getSlider_1().getValue()));

			textField_3.setText("");

			String b = "";
			for (int i = 0; i < Function.arrList2.size(); i++) {
				b += (Function.arrList2.get(i) + "");
				if ((Function.arrList2.size() - 1) > i) {
					b += ", ";
				}
			}
			textField_3.setText(b);
		}
		ans();
	}

	private JFrame frame;

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
		int n = 15;
		int m = 50;
		int k = 10;
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Gui.class.getResource("/Resources/maintenance.png")));
		frame.setBounds(100, 100, 1373, 349);
		// frame.setBounds(100, 100, 1382, 312);
		// frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setExtendedState(Frame.MAXIMIZED_HORIZ);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));

		slider.setBackground(new Color(189, 195, 199));
		slider_1.setBackground(new Color(189, 195, 199));
		slider_2.setBackground(new Color(189, 195, 199));
		slider.setForeground(new Color(150, 40, 27));

		JPanel panel = new JPanel();
		panel.setBackground(new Color(189, 195, 199));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));

		JPanel panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new BorderLayout(0, 0));
		JToggleButton.setIcon(new ImageIcon(Gui.class.getResource("/Resources/intersection.png")));

		panel_1.add(JToggleButton, BorderLayout.WEST);

		JToggleButton.setForeground(Color.BLACK);
		JToggleButton.setBackground(new Color(39, 128, 105));
		JToggleButton.setFocusPainted(false);

		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2, BorderLayout.CENTER);
		ButtonGroup group = new ButtonGroup();
		panel_2.setLayout(new BorderLayout(0, 0));

		JPanel panel_9 = new JPanel();
		panel_2.add(panel_9, BorderLayout.WEST);
		panel_9.setLayout(new BorderLayout(0, 0));

		Panel panel_12 = new Panel();
		panel_9.add(panel_12, BorderLayout.CENTER);
		panel_12.setLayout(new GridLayout(0, 1, 0, 0));

		JPanel panel_17 = new JPanel();
		panel_17.setBackground(new Color(58, 83, 155));
		panel_12.add(panel_17);

		textField_2 = new JTextField();
		textField_2.setBackground(new Color(103, 128, 159));
		textField_2.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0, 0), 2));
		textField_2.setEditable(false);
		textField_3 = new JTextField();
		textField_3.setBackground(new Color(103, 128, 159));
		textField_3.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0, 0), 2));
		textField_3.setEditable(false);
		JRadioButton rdbtnManual = new JRadioButton();
		JButton btnNewButton = new JButton("");
		rdbtnManual.setBackground(new Color(72, 91, 114));
		rdbtnManual.setFocusPainted(false);
		rdbtnManual.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				textField_2.setEditable(true);
				textField_3.setEditable(true);
				textField_2.setBackground(new Color(241, 231, 254));
				textField_3.setBackground(new Color(241, 231, 254));
				textField.setText("-");
				textField_1.setText("-");
				btnNewButton.setEnabled(true);
				// btnNewButton.setBackground(new Color(128, 39, 63));
				// btnNewButton.setVisible(true);
				// btnNewButton.setEnabled(true);
				// btnNewButton.setBorder(new LineBorder(Color.gray));
				// btnNewButton.setIcon(new ImageIcon(Gui.class.getResource("/Resources/growth
				// (2).png")));
				textField_2.setBorder(new LineBorder(Color.gray));
				textField_3.setBorder(new LineBorder(Color.gray));
				rdb1.setEnabled(false);
				rdb2.setEnabled(false);
				rdb3.setEnabled(false);
				getSlider().setEnabled(false);
				getSlider_1().setEnabled(false);
			}
		});
		panel_17.setLayout(new BorderLayout(0, 0));
		rdbtnManual.setForeground(Color.BLACK);
		rdbtnManual.setHorizontalAlignment(SwingConstants.LEFT);
		panel_17.add(rdbtnManual);
		rdbtnManual.setText("Manual  ");
		group.add(rdbtnManual);

		JPanel panel_16 = new JPanel();
		panel_16.setBackground(new Color(58, 83, 155));
		panel_12.add(panel_16);
		JRadioButton rdbtnRandom = new JRadioButton();
		rdbtnRandom.setBackground(new Color(72, 91, 114));
		rdbtnRandom.setFocusPainted(false);
		rdbtnRandom.setSelected(true);
		rdbtnRandom.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField_2.setEditable(false);
				textField_3.setEditable(false);
				textField_2.setBackground(new Color(103, 128, 159));
				textField_3.setBackground(new Color(103, 128, 159));
				btnNewButton.setEnabled(false);
				// btnNewButton.setBackground(new Color(39, 107, 128));
				// btnNewButton.setVisible(false);
				// btnNewButton.setBorder(null);
				// btnNewButton.setEnabled(false);
				// btnNewButton.setIcon(new ImageIcon());
				textField_2.setBorder(null);
				textField_3.setBorder(null);
				rdb1.setEnabled(true);
				rdb2.setEnabled(true);
				rdb3.setEnabled(true);
				getSlider().setEnabled(true);
				getSlider_1().setEnabled(true);
				update();
			}
		});
		panel_16.setLayout(new BorderLayout(0, 0));
		rdbtnRandom.setForeground(Color.BLACK);
		rdbtnRandom.setHorizontalAlignment(SwingConstants.LEFT);
		panel_16.add(rdbtnRandom);
		rdbtnRandom.setText("Random");
		group.add(rdbtnRandom);

		JPanel panel_10 = new JPanel();
		panel_2.add(panel_10, BorderLayout.CENTER);

		JPanel panel_13 = new JPanel();
		panel_13.setBackground(new Color(103, 128, 159));
		panel_13.setLayout(new BorderLayout(0, 0));

		textField_2.setForeground(Color.BLACK);
		textField_2.setHorizontalAlignment(SwingConstants.LEFT);
		panel_13.add(textField_2, BorderLayout.CENTER);
		textField_2.setColumns(10);

		JPanel panel_14 = new JPanel();
		panel_14.setBackground(new Color(103, 128, 159));
		panel_14.setLayout(new BorderLayout(0, 0));

		textField_3.setForeground(Color.BLACK);
		textField_3.setHorizontalAlignment(SwingConstants.LEFT);
		panel_14.add(textField_3, BorderLayout.CENTER);
		textField_3.setColumns(10);
		panel_10.setLayout(new GridLayout(0, 1, 0, 0));
		panel_10.add(panel_13);

		JLabel label = new JLabel(" } ");
		label.setForeground(Color.BLACK);
		panel_13.add(label, BorderLayout.EAST);
		panel_10.add(panel_14);

		JLabel label_1 = new JLabel(" } ");
		label_1.setForeground(Color.BLACK);
		panel_14.add(label_1, BorderLayout.EAST);

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(189, 195, 199));
		panel.add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new BorderLayout(0, 0));

		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(189, 195, 199));
		panel_4.add(panel_5, BorderLayout.NORTH);
		panel_5.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel_1 = new JLabel(" Length of array(s):                                ");
		lblNewLabel_1.setForeground(Color.BLACK);
		panel_5.add(lblNewLabel_1, BorderLayout.WEST);

		JPanel panel_11 = new JPanel();
		panel_5.add(panel_11, BorderLayout.NORTH);
		panel_11.setLayout(new BorderLayout(0, 0));

		JSeparator separator = new JSeparator();
		panel_11.add(separator);

		Panel panel_15 = new Panel();
		panel_11.add(panel_15, BorderLayout.SOUTH);
		panel_15.setLayout(new BorderLayout(0, 0));

		JPanel panel_18 = new JPanel();
		panel_15.add(panel_18, BorderLayout.CENTER);
		panel_18.setLayout(new BorderLayout(0, 0));

		ButtonGroup bgroup = new ButtonGroup();

		JPanel panel_20 = new JPanel();
		panel_20.setBackground(new Color(189, 195, 199));
		panel_18.add(panel_20, BorderLayout.CENTER);
		panel_20.setLayout(new BorderLayout(0, 0));

		JPanel panel_34 = new JPanel();
		panel_34.setBackground(new Color(189, 195, 199));
		panel_20.add(panel_34, BorderLayout.WEST);
		panel_34.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel_5 = new JLabel(" Editing randomizer:                               ");
		panel_34.add(lblNewLabel_5);
		lblNewLabel_5.setForeground(Color.BLACK);

		JPanel panel_21 = new JPanel();
		panel_20.add(panel_21, BorderLayout.CENTER);
		panel_21.setLayout(new BorderLayout(0, 0));

		getSlider().setValue(n);
		getSlider().setMinimum(1);

		getSlider_1().setValue(m);
		getSlider_1().setMinimum(1);

		JPanel panel_22 = new JPanel();
		panel_21.add(panel_22, BorderLayout.WEST);
		panel_22.setLayout(new BorderLayout(0, 0));
		panel_22.add(rdb1);
		rdb1.setSelected(true);
		rdb1.setFocusPainted(false);
		rdb1.setForeground(Color.BLACK);
		rdb1.setBackground(new Color(72, 91, 114));
		bgroup.add(rdb1);

		JSeparator separator_9 = new JSeparator();
		separator_9.setOrientation(SwingConstants.VERTICAL);
		panel_22.add(separator_9, BorderLayout.WEST);

		JPanel panel_23 = new JPanel();
		panel_21.add(panel_23, BorderLayout.EAST);
		panel_23.setLayout(new BorderLayout(0, 0));

		chckbxSort.setForeground(Color.BLACK);
		chckbxSort.setBackground(new Color(189, 195, 199));
		chckbxSort.setHorizontalAlignment(SwingConstants.RIGHT);
		chckbxSort.setSelected(true);
		chckbxSort.setFocusPainted(false);
		panel_23.add(chckbxSort, BorderLayout.EAST);

		JToggleButton tglbtnNewToggleButton = new JToggleButton(" Show settings for time complexity tests ");
		panel_23.add(tglbtnNewToggleButton, BorderLayout.WEST);
		tglbtnNewToggleButton.setIcon(new ImageIcon(Gui.class.getResource("/Resources/efficiency (2).png")));
		tglbtnNewToggleButton.setForeground(Color.BLACK);
		tglbtnNewToggleButton.setBackground(new Color(39, 107, 128));
		// tglbtnNewToggleButton.setBorder(null);
		tglbtnNewToggleButton.setFocusPainted(false);

		JSeparator separator_11 = new JSeparator();
		separator_11.setOrientation(SwingConstants.VERTICAL);
		panel_23.add(separator_11, BorderLayout.CENTER);
		JPanel panel_6 = new JPanel();

		tglbtnNewToggleButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (tglbtnNewToggleButton.isSelected()) {

					tglbtnNewToggleButton.setText("Hide settings for time complexity tests");
					UIManager.put("ToggleButton.select", new Color(148, 124, 176));
					SwingUtilities.updateComponentTreeUI(tglbtnNewToggleButton);

					panel_6.setVisible(true);

					ans2();

				} else {
					tglbtnNewToggleButton.setText("Show settings for time complexity tests");

					panel_6.setVisible(false);
				}
			}
		});

		JPanel panel_24 = new JPanel();
		panel_21.add(panel_24, BorderLayout.CENTER);
		panel_24.setLayout(new BorderLayout(0, 0));

		panel_24.add(rdb2, BorderLayout.WEST);
		rdb2.setHorizontalAlignment(SwingConstants.CENTER);
		rdb2.setForeground(Color.BLACK);
		rdb2.setBackground(new Color(72, 91, 114));
		rdb2.setFocusPainted(false);
		bgroup.add(rdb2);

		JPanel panel_25 = new JPanel();
		panel_24.add(panel_25, BorderLayout.CENTER);
		panel_25.setLayout(new BorderLayout(0, 0));

		panel_25.add(rdb3, BorderLayout.WEST);
		rdb3.setForeground(Color.BLACK);
		rdb3.setBackground(new Color(72, 91, 114));
		rdb3.setFocusPainted(false);
		bgroup.add(rdb3);

		Panel panel_31 = new Panel();
		panel_25.add(panel_31, BorderLayout.NORTH);
		panel_31.setBackground(new Color(189, 195, 199));
		panel_31.setLayout(new BorderLayout(0, 0));

		JSeparator separator_7 = new JSeparator();
		separator_7.setOrientation(SwingConstants.VERTICAL);
		panel_31.add(separator_7, BorderLayout.EAST);

		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		panel_25.add(separator_1, BorderLayout.EAST);

		JPanel panel_30 = new JPanel();
		panel_25.add(panel_30, BorderLayout.CENTER);
		panel_30.setLayout(new BorderLayout(0, 0));
		panel_30.add(btnNewButton);
		btnNewButton.setBackground(new Color(128, 39, 63));
		btnNewButton.setEnabled(false);
		btnNewButton.setIcon(new ImageIcon(Gui.class.getResource("/Resources/search (2).png")));
		btnNewButton.setFocusPainted(false);
		// btnNewButton.setBorder(null);
		btnNewButton.setVisible(true);

		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Function.arrList1.clear();
				Function.arrList2.clear();

				String[] o = textField_2.getText().replaceAll(" ", "").toString().split(",");
				for (int i = 0; i < o.length; i++) {
					Function.arrList1.add(Integer.parseInt(o[i]));
				}

				String[] q = textField_3.getText().replaceAll(" ", "").toString().split(",");
				for (int i = 0; i < q.length; i++) {
					Function.arrList2.add(Integer.parseInt(q[i]));
				}
				ans();
			}
		});
		btnNewButton.setForeground(Color.BLACK);

		JSeparator separator_6 = new JSeparator();
		separator_6.setOrientation(SwingConstants.VERTICAL);
		panel_30.add(separator_6, BorderLayout.WEST);

		JLabel lblNewLabel_6 = new JLabel("");

		getSlider().addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				lblNewLabel_6.setText(getSlider().getValue() + "");
				update();
			}
		});
		panel_5.add(getSlider(), BorderLayout.CENTER);

		JPanel panel_37 = new JPanel();
		panel_37.setBackground(new Color(189, 195, 199));
		panel_5.add(panel_37, BorderLayout.EAST);
		panel_37.setLayout(new BorderLayout(0, 0));

		panel_37.add(lblNewLabel_6, BorderLayout.CENTER);
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6.setForeground(new Color(150, 40, 27));

		lblNewLabel_6.setText(n + "");

		JLabel lblNewLabel_15 = new JLabel(" ) ");
		lblNewLabel_15.setForeground(Color.BLACK);
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_37.add(lblNewLabel_15, BorderLayout.EAST);

		JLabel lblNewLabel_16 = new JLabel(" Value = ( ");
		lblNewLabel_16.setForeground(Color.BLACK);
		panel_37.add(lblNewLabel_16, BorderLayout.WEST);

		JLabel lblNewLabel_7 = new JLabel("");
		panel_6.setBackground(new Color(189, 195, 199));
		panel_4.add(panel_6, BorderLayout.CENTER);
		panel_6.setLayout(new BorderLayout(0, 0));
		getSlider_1().addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				lblNewLabel_7.setText(getSlider_1().getValue() + "");
				update();
			}
		});

		panel_6.setVisible(false);

		// having random entry for first start.
		Function.arrList1.addAll(Function.ranArrL(getSlider().getValue(), getSlider_1().getValue()));
		Function.arrList2.addAll(Function.ranArrL(getSlider().getValue(), getSlider_1().getValue()));

		String a = "";
		for (int i = 0; i < Function.arrList1.size(); i++) {
			a += (Function.arrList1.get(i) + "");
			if ((Function.arrList1.size() - 1) > i) {
				a += ", ";
			}
		}
		textField_2.setText(a);

		JPanel panel_27 = new JPanel();
		panel_27.setBackground(new Color(103, 128, 159));
		panel_13.add(panel_27, BorderLayout.WEST);
		panel_27.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel_3 = new JLabel(" = { ");
		panel_27.add(lblNewLabel_3, BorderLayout.EAST);
		lblNewLabel_3.setForeground(Color.BLACK);

		JLabel lblA = new JLabel(" A");
		lblA.setForeground(Color.BLACK);
		panel_27.add(lblA, BorderLayout.CENTER);

		String b = "";
		for (int i = 0; i < Function.arrList2.size(); i++) {
			b += (Function.arrList2.get(i) + "");
			if ((Function.arrList2.size() - 1) > i) {
				b += ", ";
			}
		}
		textField_3.setText(b);

		JPanel panel_29 = new JPanel();
		panel_29.setBackground(new Color(103, 128, 159));
		panel_14.add(panel_29, BorderLayout.WEST);
		panel_29.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel_4 = new JLabel(" = { ");
		panel_29.add(lblNewLabel_4, BorderLayout.EAST);
		lblNewLabel_4.setForeground(Color.BLACK);

		JLabel lblNewLabel_31 = new JLabel(" B");
		lblNewLabel_31.setForeground(Color.BLACK);
		panel_29.add(lblNewLabel_31, BorderLayout.CENTER);

		JPanel panel_19 = new JPanel();
		panel_19.setBackground(new Color(189, 195, 199));
		panel_1.add(panel_19, BorderLayout.SOUTH);
		panel_19.setLayout(new BorderLayout(0, 0));

		JSeparator separator_4 = new JSeparator();
		panel_19.add(separator_4, BorderLayout.NORTH);

		JLabel lblNewLabel_9 = new JLabel(" } ");
		lblNewLabel_9.setBackground(new Color(189, 195, 199));
		lblNewLabel_9.setForeground(Color.BLACK);
		panel_19.add(lblNewLabel_9, BorderLayout.EAST);

		textField = new RoundJTextField(15);
		textField.setBackground(new Color(39, 128, 105));
		textField.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0, 0), 2));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setText("-");
		textField.setForeground(Color.BLACK);
		textField.setEditable(false);
		textField.setBorder(null);
		panel_19.add(textField, BorderLayout.CENTER);
		textField.setColumns(10);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(189, 195, 199));
		panel_19.add(panel_3, BorderLayout.WEST);
		panel_3.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel_8 = new JLabel("A \u2229 B");
		panel_3.add(lblNewLabel_8);
		lblNewLabel_8.setForeground(new Color(39, 128, 105));

		JLabel lblNewLabel_23 = new JLabel(" (");
		lblNewLabel_23.setForeground(Color.BLACK);
		panel_3.add(lblNewLabel_23, BorderLayout.WEST);

		JLabel lblNewLabel_24 = new JLabel(") = { ");
		lblNewLabel_24.setForeground(Color.BLACK);
		panel_3.add(lblNewLabel_24, BorderLayout.EAST);

		JPanel panel_49 = new JPanel();
		panel_49.setBackground(new Color(189, 195, 199));
		panel_19.add(panel_49, BorderLayout.SOUTH);
		panel_49.setLayout(new BorderLayout(0, 0));

		textField_1 = new RoundJTextField(15);
		textField_1.setBackground(new Color(39, 128, 105));
		textField_1.setText("-");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setForeground(Color.BLACK);
		textField_1.setBorder(null);
		textField_1.setEditable(false);
		panel_49.add(textField_1, BorderLayout.CENTER);
		textField_1.setColumns(10);

		JLabel lblNewLabel_27 = new JLabel(" } ");
		lblNewLabel_27.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_27.setForeground(Color.BLACK);
		panel_49.add(lblNewLabel_27, BorderLayout.EAST);

		JSeparator separator_5 = new JSeparator();
		panel_49.add(separator_5, BorderLayout.NORTH);

		JPanel panel_50 = new JPanel();
		panel_50.setBackground(new Color(189, 195, 199));
		panel_50.setForeground(Color.BLACK);
		panel_49.add(panel_50, BorderLayout.WEST);
		panel_50.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel_26 = new JLabel(" Time complexity (");
		panel_50.add(lblNewLabel_26, BorderLayout.WEST);
		lblNewLabel_26.setForeground(Color.BLACK);

		JLabel lblNewLabel_29 = new JLabel(") = { ");
		lblNewLabel_29.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_29.setForeground(Color.BLACK);
		panel_50.add(lblNewLabel_29, BorderLayout.EAST);

		JLabel lblNewLabel_30 = new JLabel("Nanoseconds");
		lblNewLabel_30.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_30.setForeground(new Color(150, 40, 27));
		panel_50.add(lblNewLabel_30, BorderLayout.CENTER);

		JLabel lblNewLabel_13 = new JLabel(k + "");

		ans();
		getSlider_2().addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				lblNewLabel_13.setText(getSlider_2().getValue() + "");

				ans2();
			}
		});

		getSlider_2().setMinimum(2);
		getSlider_2().setValue(k);

		JPanel panel_8 = new JPanel();
		panel_20.add(panel_8, BorderLayout.SOUTH);
		panel_8.setLayout(new BorderLayout(0, 0));

		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(189, 195, 199));
		panel_8.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel_2 = new JLabel(" Maximum value of elements:             ");
		lblNewLabel_2.setForeground(Color.BLACK);
		panel_7.add(lblNewLabel_2, BorderLayout.WEST);

		panel_7.add(getSlider_1(), BorderLayout.CENTER);

		JSeparator separator_2 = new JSeparator();
		panel_7.add(separator_2, BorderLayout.SOUTH);

		JPanel panel_38 = new JPanel();
		panel_38.setBackground(new Color(189, 195, 199));
		panel_7.add(panel_38, BorderLayout.EAST);
		panel_38.setLayout(new BorderLayout(0, 0));

		panel_38.add(lblNewLabel_7);
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_7.setForeground(new Color(150, 40, 27));
		lblNewLabel_7.setText(m + "");

		JLabel lblNewLabel_17 = new JLabel(" Value = ( ");
		lblNewLabel_17.setForeground(Color.BLACK);
		panel_38.add(lblNewLabel_17, BorderLayout.WEST);

		JLabel lblNewLabel_18 = new JLabel(" ) ");
		lblNewLabel_18.setForeground(Color.BLACK);
		lblNewLabel_18.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_38.add(lblNewLabel_18, BorderLayout.EAST);

		JSeparator separator_3 = new JSeparator();
		panel_7.add(separator_3, BorderLayout.NORTH);

		// setting first answer.
		JPanel panel_41 = new JPanel();
		panel_41.setBackground(new Color(189, 195, 199));
		panel_6.add(panel_41, BorderLayout.SOUTH);
		panel_41.setBackground(new Color(189, 195, 199));
		panel_41.setLayout(new BorderLayout(0, 0));
		panel_41.add(getSlider_2());

		JPanel panel_36 = new JPanel();
		panel_36.setBackground(new Color(189, 195, 199));
		panel_41.add(panel_36, BorderLayout.EAST);
		panel_36.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel_12 = new JLabel("  ( ");
		lblNewLabel_12.setForeground(Color.BLACK);
		panel_36.add(lblNewLabel_12, BorderLayout.WEST);

		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_13.setForeground(new Color(150, 40, 27));
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		panel_36.add(lblNewLabel_13, BorderLayout.CENTER);

		JLabel lblNewLabel_14 = new JLabel(" ) loops ");
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_14.setForeground(Color.BLACK);
		panel_36.add(lblNewLabel_14, BorderLayout.EAST);

		JPanel panel_40 = new JPanel();
		panel_40.setBackground(new Color(189, 195, 199));
		panel_41.add(panel_40, BorderLayout.WEST);
		panel_40.setLayout(new BorderLayout(0, 0));

		JPanel panel_42 = new JPanel();
		panel_40.add(panel_42);
		panel_42.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_1 = new JButton("Graph");
		btnNewButton_1.setVisible(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// System.out.println("didn't have time to ");
			}
		});
		btnNewButton_1.setBackground(new Color(128, 39, 63));
		btnNewButton_1.setForeground(Color.BLACK);
		panel_42.add(btnNewButton_1, BorderLayout.CENTER);
		btnNewButton_1.setIcon(new ImageIcon(Gui.class.getResource("/Resources/diagram (2).png")));
		// btnNewButton_1.setBorder(null);
		btnNewButton_1.setFocusPainted(false);

		JSeparator separator_8 = new JSeparator();
		separator_8.setOrientation(SwingConstants.VERTICAL);
		panel_42.add(separator_8, BorderLayout.EAST);

		JPanel panel_43 = new JPanel();
		panel_43.setBackground(new Color(189, 195, 199));
		panel_42.add(panel_43, BorderLayout.WEST);
		panel_43.setLayout(new BorderLayout(0, 0));

		JLabel lblTimeComplexityOutput = new JLabel(" Show time complexity as: ");
		lblTimeComplexityOutput.setForeground(Color.BLACK);
		panel_43.add(lblTimeComplexityOutput, BorderLayout.CENTER);

		JPanel panel_51 = new JPanel();
		panel_43.add(panel_51, BorderLayout.EAST);
		panel_51.setLayout(new BorderLayout(0, 0));
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				ans2();
			}
		});

		rdbtnNewRadioButton.setBackground(new Color(189, 195, 199));
		rdbtnNewRadioButton.setForeground(Color.BLACK);
		rdbtnNewRadioButton.setSelected(true);
		rdbtnNewRadioButton.setFocusPainted(false);
		panel_51.add(rdbtnNewRadioButton, BorderLayout.NORTH);

		ButtonGroup group2 = new ButtonGroup();
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Symbols");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				ans2();
			}
		});
		rdbtnNewRadioButton_1.setBackground(new Color(189, 195, 199));
		rdbtnNewRadioButton_1.setForeground(Color.BLACK);
		rdbtnNewRadioButton_1.setFocusPainted(false);
		panel_51.add(rdbtnNewRadioButton_1, BorderLayout.SOUTH);
		group2.add(rdbtnNewRadioButton);
		group2.add(rdbtnNewRadioButton_1);

		JLabel lblNewLabel_28 = new JLabel(" Time complexity test in: ");
		lblNewLabel_28.setForeground(Color.BLACK);
		panel_40.add(lblNewLabel_28, BorderLayout.EAST);

		JSeparator separator_12 = new JSeparator();
		panel_41.add(separator_12, BorderLayout.NORTH);

		JPanel panel_32 = new JPanel();
		panel_6.add(panel_32, BorderLayout.CENTER);
		panel_32.setLayout(new BorderLayout(0, 0));

		JPanel panel_28 = new JPanel();
		panel_32.add(panel_28, BorderLayout.NORTH);
		panel_28.setLayout(new BorderLayout(0, 0));

		JSeparator separator_14 = new JSeparator();
		panel_28.add(separator_14, BorderLayout.NORTH);

		JPanel panel_45 = new JPanel();
		panel_28.add(panel_45, BorderLayout.CENTER);
		panel_45.setLayout(new BorderLayout(0, 0));

		JPanel panel_46 = new JPanel();
		panel_45.add(panel_46, BorderLayout.WEST);
		panel_46.setLayout(new BorderLayout(0, 0));

		JPanel panel_44 = new JPanel();
		panel_44.setBackground(new Color(189, 195, 199));
		panel_46.add(panel_44, BorderLayout.SOUTH);
		panel_44.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel_10 = new JLabel(" (");
		panel_44.add(lblNewLabel_10, BorderLayout.WEST);
		lblNewLabel_10.setForeground(Color.BLACK);

		JLabel lblNewLabel_21 = new JLabel("A \u222A B");
		lblNewLabel_21.setForeground(new Color(150, 40, 27));
		panel_44.add(lblNewLabel_21, BorderLayout.CENTER);

		JLabel lblNewLabel_22 = new JLabel(") = { ");
		lblNewLabel_22.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_22.setForeground(Color.BLACK);
		panel_44.add(lblNewLabel_22, BorderLayout.EAST);

		JPanel panel_26 = new JPanel();
		panel_26.setBackground(new Color(189, 195, 199));
		panel_46.add(panel_26, BorderLayout.WEST);
		panel_26.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel_19 = new JLabel("A \u2229 B");
		lblNewLabel_19.setForeground(new Color(39, 128, 105));
		panel_26.add(lblNewLabel_19);

		JLabel lblNewLabel = new JLabel(" (");
		panel_26.add(lblNewLabel, BorderLayout.WEST);
		lblNewLabel.setForeground(Color.BLACK);

		JLabel lblNewLabel_20 = new JLabel(") = { ");
		lblNewLabel_20.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_20.setForeground(Color.BLACK);
		panel_26.add(lblNewLabel_20, BorderLayout.EAST);

		JPanel panel_47 = new JPanel();
		panel_47.setBackground(new Color(189, 195, 199));
		panel_45.add(panel_47, BorderLayout.CENTER);
		panel_47.setLayout(new BorderLayout(0, 0));

		textField_Intersection = new RoundJTextField(15);
		textField_Intersection.setBackground(new Color(39, 128, 105));
		panel_47.add(textField_Intersection, BorderLayout.NORTH);
		textField_Intersection.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0, 0), 2));
		textField_Intersection.setHorizontalAlignment(SwingConstants.LEFT);
		textField_Intersection.setForeground(Color.BLACK);
		textField_Intersection.setEditable(false);
		textField_Intersection.setColumns(10);

		textField_Union = new RoundJTextField(15);
		textField_Union.setBackground(new Color(39, 128, 105));
		panel_47.add(textField_Union, BorderLayout.SOUTH);
		textField_Union.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0, 0), 2));
		textField_Union.setHorizontalAlignment(SwingConstants.LEFT);
		textField_Union.setForeground(Color.BLACK);
		textField_Union.setEditable(false);
		textField_Union.setColumns(10);

		JPanel panel_48 = new JPanel();
		panel_48.setBackground(new Color(189, 195, 199));
		panel_45.add(panel_48, BorderLayout.EAST);
		panel_48.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel_11 = new JLabel(" } ");
		lblNewLabel_11.setForeground(Color.BLACK);
		panel_48.add(lblNewLabel_11, BorderLayout.NORTH);

		JLabel lblNewLabel_25 = new JLabel(" } ");
		lblNewLabel_25.setForeground(Color.BLACK);
		panel_48.add(lblNewLabel_25, BorderLayout.SOUTH);

		JPanel panel_33 = new JPanel();
		panel_33.setBackground(new Color(189, 195, 199));
		panel_32.add(panel_33, BorderLayout.CENTER);
		panel_33.setLayout(new BorderLayout(0, 0));

		JSeparator separator_10 = new JSeparator();
		panel_33.add(separator_10, BorderLayout.CENTER);
		JToggleButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (JToggleButton.isSelected()) {

					JToggleButton.setIcon(new ImageIcon(Gui.class.getResource("/Resources/combination.png")));
					UIManager.put("ToggleButton.select", new Color(128, 39, 63));
					SwingUtilities.updateComponentTreeUI(JToggleButton);
					lblNewLabel_23.setText(" (");
					lblNewLabel_8.setForeground(new Color(128, 39, 63));
					lblNewLabel_8.setText("A \u222A B");

					if (rdbtnRandom.isSelected()) {
						update();
					}

				} else {

					JToggleButton.setIcon(new ImageIcon(Gui.class.getResource("/Resources/intersection.png")));
					lblNewLabel_23.setText(" (");
					lblNewLabel_8.setForeground(new Color(39, 128, 105));
					lblNewLabel_8.setText("A \u2229 B");

					if (rdbtnRandom.isSelected()) {
						update();
					}
				}
			}
		});

	}
}
