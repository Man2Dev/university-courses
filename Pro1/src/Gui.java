import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import java.awt.GridLayout;
import java.awt.RenderingHints;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.lang.management.ThreadInfo;

import javax.swing.border.SoftBevelBorder;
import javax.swing.JSlider;
import javax.swing.BoxLayout;
import javax.swing.event.ChangeListener;

import javax.swing.event.ChangeEvent;
import javax.swing.JToggleButton;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Gui {

	private static JFrame frame;
	private static int spead = 100;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					Gui window = new Gui();
					Gui.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField_3;

	/**
	 * Create the application.
	 */
	public Gui() throws InterruptedException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * 
	 * @throws InterruptedException
	 */
	private void initialize() throws InterruptedException {
		// slider1
		int a = 50;
		int b = 1;
		int c = 100;
		// slider2
		int d = 50;
		int e = 1;
		int f = 100;
		// slider3
		int p = spead;
		int l = 100;
		int m = 1000;
		frame = new JFrame();
		frame.setResizable(false);
		// frame.addComponentListener(new ComponentAdapter() {
		// @Override
		// public void componentResized(ComponentEvent arg0) {
		// System.out.println(frame.getWidth() + " - " + frame.getHeight());
		// }
		// });
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Gui.class.getResource("/Resources/maintenance.png")));
		frame.setBounds(100, 100, 804, 151);// 479
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// frame.setPreferredSize(new Dimension(450, 300));
		// frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));

		JPanel panel = new JPanel();
		panel.setBackground(new Color(103, 128, 159));
		frame.getContentPane().add(panel);
		panel.setLayout(new BorderLayout(0, 0));

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(103, 128, 159));
		panel.add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new BorderLayout(0, 0));

		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(103, 128, 159));
		panel_1.add(panel_8, BorderLayout.NORTH);
		panel_8.setLayout(new BorderLayout(0, 0));

		JPanel panel_11 = new JPanel();
		panel_11.setBackground(new Color(103, 128, 159));
		panel_8.add(panel_11, BorderLayout.WEST);
		panel_11.setLayout(new BorderLayout(0, 0));

		JPanel panel_18 = new JPanel();
		panel_18.setBackground(new Color(103, 128, 159));
		panel_18.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), "Type",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_11.add(panel_18, BorderLayout.NORTH);
		panel_18.setLayout(new BorderLayout(0, 0));

		JPanel panel_13 = new JPanel();
		panel_13.setBackground(new Color(103, 128, 159));
		panel_18.add(panel_13, BorderLayout.WEST);

		ButtonGroup group = new ButtonGroup();
		panel_13.setLayout(new GridLayout(0, 1, 0, 0));

		JLabel lblA = new JLabel(" Infix");
		JLabel lblB = new JLabel(" Prefix");

		JRadioButton t1 = new JRadioButton("Infix -> Prefix");
		t1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				lblA.setText(" Infix");
				lblB.setText(" Prefix");

				textField1.requestFocus();
			}
		});
		t1.setBackground(new Color(103, 128, 159));
		t1.setSelected(true);
		t1.setForeground(Color.BLACK);
		t1.setFocusPainted(false);
		panel_13.add(t1);
		t1.setHorizontalAlignment(SwingConstants.CENTER);

		JRadioButton t2 = new JRadioButton("Prefix -> Infix");
		t2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lblA.setText(" Prefix");
				lblB.setText(" Infix");

				textField1.requestFocus();
			}
		});
		t2.setBackground(new Color(103, 128, 159));
		t2.setForeground(Color.BLACK);
		t2.setFocusPainted(false);
		panel_13.add(t2);
		t2.setHorizontalAlignment(SwingConstants.CENTER);

		JPanel panel_14 = new JPanel();
		panel_14.setBackground(new Color(103, 128, 159));
		panel_18.add(panel_14, BorderLayout.EAST);
		panel_14.setLayout(new GridLayout(0, 1, 0, 0));

		JRadioButton t3 = new JRadioButton("Prefix -> Postfix");
		t3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lblA.setText(" Prefix");
				lblB.setText(" Postfix");

				textField1.requestFocus();
			}
		});
		t3.setBackground(new Color(103, 128, 159));
		t3.setFocusPainted(false);
		t3.setForeground(Color.BLACK);
		panel_14.add(t3);

		JRadioButton t4 = new JRadioButton("Postfix -> Prefix");
		t4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lblA.setText(" Postfix");
				lblB.setText(" Prefix");

				textField1.requestFocus();
			}
		});
		t4.setBackground(new Color(103, 128, 159));
		t4.setFocusPainted(false);
		t4.setForeground(Color.BLACK);
		panel_14.add(t4);

		group.add(t1);
		group.add(t2);
		group.add(t3);
		group.add(t4);

		JPanel panel_19 = new JPanel();
		panel_19.setBackground(new Color(103, 128, 159));
		panel_19.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null),
				"Input method", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_11.add(panel_19, BorderLayout.SOUTH);

		ButtonGroup group1 = new ButtonGroup();
		JPanel panel_4 = new JPanel();
		panel_4.setForeground(new Color(112, 128, 144));
		JButton btnNewButton = new JButton("");
		panel_19.setLayout(new BorderLayout(0, 0));

		JToggleButton tgl = new JToggleButton("Manual");
		tgl.setEnabled(false);
		tgl.setForeground(new Color(228, 241, 254));
		tgl.setBackground(new Color(39, 128, 105));
		tgl.setFocusPainted(false);
		tgl.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (tgl.isSelected()) {

					// tgl.setIcon(new
					// ImageIcon(Gui.class.getResource("/Resources/intersection.png")));
					tgl.setText("Random");
					textField1.setEditable(false);
					panel_4.setBorder(null);
					btnNewButton.setVisible(false);
				} else {

					// tgl.setIcon(new
					// ImageIcon(Gui.class.getResource("/Resources/combination.png")));
					tgl.setText("Manual");
					UIManager.put("ToggleButton.select", new Color(128, 39, 63));
					SwingUtilities.updateComponentTreeUI(tgl);
					textField1.setForeground(new Color(228, 241, 254));
					textField1.setEditable(true);
					panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
					btnNewButton.setVisible(true);
				}
			}
		});
		panel_19.add(tgl, BorderLayout.NORTH);

		JPanel panel_12 = new JPanel();
		panel_12.setBackground(new Color(103, 128, 159));
		panel_8.add(panel_12, BorderLayout.CENTER);
		panel_12.setLayout(new BorderLayout(0, 0));

		JPanel panel_46 = new JPanel();
		panel_46.setBackground(new Color(103, 128, 159));
		panel_46.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null),
				"Input & Output", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_12.add(panel_46, BorderLayout.NORTH);
		panel_46.setLayout(new BorderLayout(0, 0));

		JPanel panel_47 = new JPanel();
		panel_46.add(panel_47, BorderLayout.NORTH);
		panel_47.setLayout(new BorderLayout(0, 0));

		JPanel panel_15 = new JPanel();
		panel_47.add(panel_15, BorderLayout.WEST);
		panel_15.setBackground(new Color(103, 128, 159));
		panel_15.setLayout(new GridLayout(0, 1, 0, 0));

		JPanel panel_20 = new JPanel();
		panel_20.setBackground(new Color(103, 128, 159));
		panel_15.add(panel_20);
		panel_20.setLayout(new BorderLayout(0, 0));

		lblA.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblA.setForeground(new Color(150, 40, 27));
		panel_20.add(lblA, BorderLayout.CENTER);

		JLabel lblNewLabel_2 = new JLabel(" = { ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setForeground(Color.BLACK);
		panel_20.add(lblNewLabel_2, BorderLayout.EAST);

		JPanel panel_34 = new JPanel();
		panel_15.add(panel_34);
		panel_34.setBackground(new Color(103, 128, 159));
		panel_34.setLayout(new BorderLayout(0, 0));
		panel_34.add(lblB, BorderLayout.CENTER);

		lblB.setForeground(new Color(150, 40, 27));
		lblB.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblB.setHorizontalAlignment(SwingConstants.LEFT);

		JLabel lblNewLabel_3 = new JLabel(" = { ");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(Color.BLACK);
		panel_34.add(lblNewLabel_3, BorderLayout.EAST);

		JPanel panel_16 = new JPanel();
		panel_47.add(panel_16, BorderLayout.CENTER);
		panel_16.setBackground(new Color(103, 128, 159));
		panel_16.setLayout(new GridLayout(0, 1, 0, 0));

		textField1 = new JTextField(10) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			protected void paintComponent(Graphics g) {
				if (textField1.isEditable()) {
					int w = getWidth() - 1;
					int h = getHeight() - 1;
					Graphics2D g2 = (Graphics2D) g.create();
					g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
					g2.setPaint(new Color(108, 122, 137));
					g2.fillRoundRect(0, 0, w, h, h, h);
					g2.setPaint(panel_16.getBackground());
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

		textField1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if ((e.getKeyChar() + "").equals("\n")) {
					if (t1.isSelected()) {
						// Infix -> Prefix
						// textField1.setText("(A-B/C)*(A/K-L)");
						long start = System.nanoTime();
						textField2.setText(InToPre.inToPre(textField1.getText()));
						long end = System.nanoTime();
						textField_3.setText((end-start)+"");
					} else if (t2.isSelected()) {
						// Prefix -> Infix
						// textField1.setText("*/AB+B-/AM");long start = System.nanoTime();
						long start = System.nanoTime();
						textField2.setText(PreToIn.preToIn(textField1.getText()));
						long end = System.nanoTime();
						textField_3.setText((end-start)+"");
					} else if (t3.isSelected()) {
						// Prefix -> Postfix
						// textField1.setText("*/AB+B-/AM");
						long start = System.nanoTime();
						textField2.setText(PreToPost.preToPost(textField1.getText()));
						long end = System.nanoTime();
						textField_3.setText((end-start)+"");
					} else if (t4.isSelected()) {
						// Postfix -> Prefix
						// textField1.setText("ABC*-AK/L-/");
						long start = System.nanoTime();
						textField2.setText(PostToPre.postfixToPrefix(textField1.getText()));
						long end = System.nanoTime();
						textField_3.setText((end-start)+"");
					}
				}
			}
		});

		textField1.setForeground(new Color(228, 241, 254));
		panel_16.add(textField1);

		textField2 = new JTextField(10) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			protected void paintComponent(Graphics g) {
				if (!textField2.isEditable()) {
					int w = getWidth() - 1;
					int h = getHeight() - 1;
					Graphics2D g2 = (Graphics2D) g.create();
					g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
					g2.setPaint(new Color(39, 128, 105));
					g2.fillRoundRect(0, 0, w, h, h, h);
					g2.setPaint(panel_16.getBackground());
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
		textField2.setEditable(false);
		panel_16.add(textField2);
		textField2.setForeground(new Color(228, 241, 254));

		JPanel panel_17 = new JPanel();
		panel_47.add(panel_17, BorderLayout.EAST);
		panel_17.setBackground(new Color(103, 128, 159));
		panel_17.setLayout(new GridLayout(0, 1, 0, 0));

		JLabel lblNewLabel_6 = new JLabel(" } ");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6.setForeground(Color.BLACK);
		panel_17.add(lblNewLabel_6);

		JLabel lblNewLabel_16 = new JLabel(" } ");
		panel_17.add(lblNewLabel_16);
		lblNewLabel_16.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_16.setForeground(Color.BLACK);

		JPanel panel_5 = new JPanel();
		panel_12.add(panel_5, BorderLayout.SOUTH);
		panel_5.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null),
				"Time complexity", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_5.setBackground(new Color(103, 128, 159));
		panel_5.setLayout(new BorderLayout(0, 0));

		JPanel panel_21 = new JPanel();
		panel_21.setBackground(new Color(103, 128, 159));
		panel_5.add(panel_21, BorderLayout.CENTER);
		panel_21.setLayout(new BorderLayout(0, 0));

		JPanel panel_35 = new JPanel();
		panel_21.add(panel_35, BorderLayout.WEST);
		panel_35.setBackground(new Color(103, 128, 159));
		panel_35.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel_13 = new JLabel(" Time complexity");
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_13.setForeground(new Color(150, 40, 27));
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_35.add(lblNewLabel_13, BorderLayout.CENTER);

		JLabel lblNewLabel_14 = new JLabel(" = { ");
		lblNewLabel_14.setForeground(Color.BLACK);
		panel_35.add(lblNewLabel_14, BorderLayout.EAST);

		JPanel panel_10 = new JPanel();
		panel_21.add(panel_10, BorderLayout.CENTER);
		panel_10.setBackground(new Color(103, 128, 159));
		panel_10.setLayout(new BorderLayout(0, 0));

		textField_3 = new JTextField(10) {
			@Override
			protected void paintComponent(Graphics g) {
				if (!textField_3.isEditable()) {
					int w = getWidth() - 1;
					int h = getHeight() - 1;
					Graphics2D g2 = (Graphics2D) g.create();
					g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
					g2.setPaint(new Color(39, 128, 105));
					g2.fillRoundRect(0, 0, w, h, h, h);
					g2.setPaint(panel_10.getBackground());
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
		panel_10.add(textField_3);
		textField_3.setEditable(false);
		textField_3.setForeground(new Color(228, 241, 254));

		JPanel panel_32 = new JPanel();
		panel_21.add(panel_32, BorderLayout.EAST);
		panel_32.setBackground(new Color(103, 128, 159));
		panel_32.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel = new JLabel(" } ");
		lblNewLabel.setForeground(Color.BLACK);
		panel_32.add(lblNewLabel);

		panel_8.add(panel_4, BorderLayout.EAST);

		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				btnNewButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/growth (3).png")));
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				btnNewButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/eye (3).png")));
				textField1.requestFocus();

				if (t1.isSelected()) {
					// Infix -> Prefix
					// textField1.setText("(A-B/C)*(A/K-L)");
					long start = System.nanoTime();
					textField2.setText(InToPre.inToPre(textField1.getText()));
					long end = System.nanoTime();
					textField_3.setText((end-start)+"");
				} else if (t2.isSelected()) {
					// Prefix -> Infix
					// textField1.setText("*/AB+B-/AM");long start = System.nanoTime();
					long start = System.nanoTime();
					textField2.setText(PreToIn.preToIn(textField1.getText()));
					long end = System.nanoTime();
					textField_3.setText((end-start)+"");
				} else if (t3.isSelected()) {
					// Prefix -> Postfix
					// textField1.setText("*/AB+B-/AM");
					long start = System.nanoTime();
					textField2.setText(PreToPost.preToPost(textField1.getText()));
					long end = System.nanoTime();
					textField_3.setText((end-start)+"");
				} else if (t4.isSelected()) {
					// Postfix -> Prefix
					// textField1.setText("ABC*-AK/L-/");
					long start = System.nanoTime();
					textField2.setText(PostToPre.postfixToPrefix(textField1.getText()));
					long end = System.nanoTime();
					textField_3.setText((end-start)+"");
				}
			}
		});
		panel_4.setBackground(new Color(103, 128, 159));
		panel_4.setBackground(new Color(103, 128, 159));
		panel_4.setLayout(new BorderLayout(0, 0));

		btnNewButton.setBackground(new Color(39, 128, 105));
		btnNewButton.setFocusPainted(false);

		btnNewButton.setIcon(new ImageIcon(Gui.class.getResource("/Resources/eye (3).png")));
		btnNewButton.setForeground(Color.BLACK);
		panel_4.add(btnNewButton, BorderLayout.WEST);

		textField1.requestFocus();
	}
}
