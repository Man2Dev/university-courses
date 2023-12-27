package polynomial;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.security.Principal;
import java.util.Collections;
import java.util.Enumeration;

import javax.swing.border.SoftBevelBorder;
import javax.swing.JSlider;
import javax.swing.BoxLayout;
import javax.swing.event.ChangeListener;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.labels.StandardCategoryToolTipGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.DatasetRenderingOrder;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;

import javax.swing.event.ChangeEvent;
import javax.swing.JToggleButton;
import java.awt.FlowLayout;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JMenuBar;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JMenuItem;
import javax.swing.JCheckBoxMenuItem;
import java.awt.Label;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class Gui {

	private static JFrame frame;

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

	// the graph
	public static JPanel DualAxisDemo() {
		// create the chart...
		final JFreeChart chart = ChartFactory.createBarChart("Runtime Data", // chart title
				"Time Complexity", // domain axis label
				"Value", // range axis label
				Function.dataset, // data
				PlotOrientation.VERTICAL, true, // include legend
				true, // tooltips?
				false // URL generator? Not required...
		);

		// NOW DO SOME OPTIONAL CUSTOMISATION OF THE CHART...
		chart.setBackgroundPaint(new Color(103, 128, 159));

		// get a reference to the plot for further customisation...
		final CategoryPlot plot = chart.getCategoryPlot();
		plot.setBackgroundPaint(new Color(60, 99, 130));
		plot.setDomainAxisLocation(AxisLocation.BOTTOM_OR_RIGHT);

		plot.setDataset(1, Function.dataset0);
		plot.mapDatasetToRangeAxis(1, 1);

		final CategoryAxis domainAxis = plot.getDomainAxis();
		domainAxis.setCategoryLabelPositions(CategoryLabelPositions.DOWN_45);
		final ValueAxis axis2 = new NumberAxis("Time Complexity");
		plot.setRangeAxis(1, axis2);

		final LineAndShapeRenderer renderer2 = new LineAndShapeRenderer();
		renderer2.setToolTipGenerator(new StandardCategoryToolTipGenerator());
		plot.setRenderer(1, renderer2);
		plot.setDatasetRenderingOrder(DatasetRenderingOrder.REVERSE);

		// add the chart to a panel...
		final ChartPanel chartPanel = new ChartPanel(chart);

		return chartPanel;
	}

	static JTextField textField1;
	static JTextField textField2;
	static JTextField textField_3;

	public static String setNum(int maxAmount, String num) {
		int cLength = num.length();
		int mLength = (maxAmount + "").length();
		for (int i = 0; i < (mLength - cLength); i++) {
			num = ("0" + num);
		}
		return num;
	}

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
		// space between sliders
		int dif = 10;
		// slider1 number of loops
		int b = 3;
		int c = 100;
		int a = Function.random(b, 30);
		// slider2 min
		int e = 1;
		int f = 100;
		int d = Function.random(e, (f - 1));
		// slider3 max
		int l = 1;
		int m = 100;
		int p = Function.random((d + dif), m);

		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Gui.class.getResource("/Resources/maintenance.png")));
		frame.setBounds(100, 100, 750, 540);
		frame.setMinimumSize(new Dimension(527, 488));
		frame.setPreferredSize(new Dimension(750, 540));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.pack();

		JPanel panel = new JPanel();
		panel.setBackground(new Color(103, 128, 159));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));

		JPanel panel_46 = new JPanel();
		panel.add(panel_46, BorderLayout.NORTH);
		panel_46.setBackground(new Color(38, 50, 56));
		panel_46.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), "Manual use",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(228, 241, 254)));
		panel_46.setLayout(new BorderLayout(0, 0));

		JPanel panel_47 = new JPanel();
		panel_46.add(panel_47, BorderLayout.SOUTH);
		panel_47.setBackground(new Color(38, 50, 56));
		panel_47.setLayout(new BorderLayout(0, 0));

		JPanel panel_15 = new JPanel();
		panel_47.add(panel_15, BorderLayout.WEST);
		panel_15.setBackground(new Color(38, 50, 56));
		panel_15.setLayout(new GridLayout(0, 1, 0, 0));

		JLabel lblA = new JLabel(" Inputs  ");
		panel_15.add(lblA);

		lblA.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblA.setForeground(new Color(150, 40, 27));
		JLabel lblB = new JLabel(" Output status");
		panel_15.add(lblB);

		lblB.setForeground(new Color(150, 40, 27));
		lblB.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblB.setHorizontalAlignment(SwingConstants.LEFT);

		JLabel lblNewLabel_13 = new JLabel(" Time complexity  ");
		panel_15.add(lblNewLabel_13);
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_13.setForeground(new Color(150, 40, 27));
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 13));

		JPanel panel_16 = new JPanel();
		panel_47.add(panel_16, BorderLayout.CENTER);
		panel_16.setBackground(new Color(38, 50, 56));
		panel_16.setLayout(new GridLayout(0, 1, 0, 0));

		JButton btnNewButton = new JButton("");

		textField1 = new JTextField(10) {
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
		textField1.setText("2,23");
		textField1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				textField1.requestFocus();
				textField1.selectAll();
			}
		});
		textField1.setHorizontalAlignment(SwingConstants.CENTER);
		textField1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField1.setForeground(new Color(228, 241, 254));
		textField1.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent arg0) {
				if ((arg0.getKeyChar() + "").equals("\n")) {
					textField2.setText("Wait!!!");
					textField_3.setText("Almost Done");
					;
					btnNewButton.setIcon(new ImageIcon(Gui.class.getResource("/Resources/checked (0).png")));
					textField1.requestFocus();
					textField1.selectAll();
					// setting answer and time complexity
					Function.activate();
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
				if ((e.getKeyChar() + "").equals("\n")) {
					btnNewButton.setIcon(new ImageIcon(Gui.class.getResource("/Resources/locked (1).png")));
				}
			}
		});
		panel_16.add(textField1);

		textField2 = new JTextField(10) {
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
		textField2.setHorizontalAlignment(SwingConstants.CENTER);
		textField2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel_16.add(textField2);
		textField2.setEditable(false);
		textField2.setForeground(new Color(228, 241, 254));

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
		panel_16.add(textField_3);
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setText(" ");
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_3.setEditable(false);
		textField_3.setForeground(new Color(228, 241, 254));

		JPanel panel_17 = new JPanel();
		panel_17.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				btnNewButton.setIcon(new ImageIcon(Gui.class.getResource("/Resources/checked (0).png")));
				textField2.setText("Wait!!!");
				textField_3.setText("Almost Done");
				;
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				btnNewButton.setIcon(new ImageIcon(Gui.class.getResource("/Resources/locked (1).png")));
				textField1.requestFocus();
				textField1.selectAll();
				// setting answer and time complexity
				Function.activate();
			}
		});
		panel_47.add(panel_17, BorderLayout.EAST);
		panel_17.setBackground(new Color(38, 50, 56));
		panel_17.setLayout(new GridLayout(0, 1, 0, 0));

		JPanel panel_13 = new JPanel();
		panel_13.setBackground(new Color(38, 50, 56));
		panel_17.add(panel_13);

		JPanel panel_4 = new JPanel();
		panel_17.add(panel_4);
		panel_4.setOpaque(false);
		panel_4.setBackground(new Color(103, 128, 159));
		panel_4.setLayout(new BorderLayout(0, 0));
		panel_4.setBorder(null);

		JPanel panel_11 = new JPanel();
		panel_11.setBackground(new Color(38, 50, 56));
		panel_4.add(panel_11, BorderLayout.WEST);
		panel_11.setLayout(new BorderLayout(0, 0));

		JLabel label_2 = new JLabel("  ");
		panel_11.add(label_2, BorderLayout.CENTER);

		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(38, 50, 56));
		panel_4.add(panel_6, BorderLayout.CENTER);
		panel_6.setLayout(new BorderLayout(0, 0));

		panel_6.add(btnNewButton);
		btnNewButton.setBorder(null);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setFocusPainted(false);

		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				btnNewButton.setIcon(new ImageIcon(Gui.class.getResource("/Resources/checked (0).png")));
				textField2.setText("Wait!!!");
				textField_3.setText("Almost Done");
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				btnNewButton.setIcon(new ImageIcon(Gui.class.getResource("/Resources/locked (1).png")));
				textField1.requestFocus();
				textField1.selectAll();
				// setting answer and time complexity
				Function.activate();
			}
		});

		btnNewButton.setBackground(new Color(38, 50, 56));
		btnNewButton.setFocusPainted(false);
		btnNewButton.setVisible(true);

		btnNewButton.setIcon(new ImageIcon(Gui.class.getResource("/Resources/locked (1).png")));
		btnNewButton.setForeground(Color.BLACK);

		JPanel panel_7 = new JPanel();
		panel_4.add(panel_7, BorderLayout.EAST);
		panel_7.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel_1 = new JLabel("  ");
		panel_7.add(lblNewLabel_1);
		panel_7.setBackground(new Color(38, 50, 56));

		JPanel panel_32 = new JPanel();
		panel_17.add(panel_32);
		panel_32.setBackground(new Color(38, 50, 56));
		panel_32.setLayout(new BorderLayout(0, 0));

		textField1.requestFocus();

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(103, 128, 159));
		panel.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));

		JPanel panel_22 = new JPanel();

		panel_22.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null),
				"Randomizer setting", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_22.setBackground(new Color(103, 128, 159));
		panel_1.add(panel_22, BorderLayout.NORTH);
		panel_22.setLayout(new BorderLayout(0, 0));

		JPanel panel_30 = new JPanel();
		panel_22.add(panel_30, BorderLayout.CENTER);
		panel_30.setLayout(new BorderLayout(0, 0));

		JPanel panel_23 = new JPanel();
		panel_30.add(panel_23, BorderLayout.WEST);
		panel_23.setBackground(new Color(103, 128, 159));
		panel_23.setLayout(new BorderLayout(0, 0));

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(103, 128, 159));
		panel_23.add(panel_3, BorderLayout.WEST);
		panel_3.setLayout(new BorderLayout(0, 0));

		JLabel l1 = new JLabel(" Number of loops:  ");
		panel_3.add(l1, BorderLayout.NORTH);
		l1.setForeground(Color.BLACK);

		JLabel l2 = new JLabel(" Minimum value:");
		panel_3.add(l2, BorderLayout.CENTER);
		l2.setForeground(Color.BLACK);

		JLabel lblMinimumValueOf = new JLabel(" Maximum value: ");
		panel_3.add(lblMinimumValueOf, BorderLayout.SOUTH);
		lblMinimumValueOf.setForeground(Color.BLACK);

		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(103, 128, 159));
		panel_23.add(panel_5, BorderLayout.CENTER);
		panel_5.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel_9 = new JLabel(setNum(c, a + ""));
		panel_5.add(lblNewLabel_9, BorderLayout.NORTH);

		lblNewLabel_9.setForeground(Color.RED);
		JLabel lblNewLabel_11 = new JLabel(setNum(f, d + ""));
		panel_5.add(lblNewLabel_11, BorderLayout.CENTER);

		lblNewLabel_11.setForeground(Color.RED);

		lblNewLabel_11.setForeground(Color.RED);
		JLabel label = new JLabel(setNum(m, p + ""));
		panel_5.add(label, BorderLayout.SOUTH);

		label.setForeground(Color.RED);

		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(103, 128, 159));
		panel_23.add(panel_8, BorderLayout.EAST);
		panel_8.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel = new JLabel(" ");
		panel_8.add(lblNewLabel);

		JPanel panel_24 = new JPanel();
		panel_30.add(panel_24, BorderLayout.CENTER);
		panel_24.setBackground(new Color(103, 128, 159));

		JPanel panel_2 = new JPanel();

		JSlider loops = new JSlider();
		JSlider min = new JSlider();
		JSlider max = new JSlider();

		loops.setValue(a);
		loops.setMinimum(b);
		loops.setMaximum(c);
		loops.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent arg0) {
				lblNewLabel_9.setText(setNum(c, loops.getValue() + ""));
				// setting the graph
				Function.Enter(loops.getValue(), min.getValue(), max.getValue());
				// setting the graph to the panel
				panel_2.add(DualAxisDemo());
				textField1.requestFocus();
				textField1.selectAll();
			}
		});
		panel_24.setLayout(new BorderLayout(0, 0));
		loops.setForeground(new Color(228, 241, 254));
		loops.setBackground(new Color(103, 128, 159));
		panel_24.add(loops, BorderLayout.NORTH);

		min.setValue(d);
		min.setMinimum(e);
		min.setMaximum(f);
		min.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent arg0) {
				if ((min.getValue() + dif) >= m) {
					label.setText(setNum(m, max.getValue() + ""));
					lblNewLabel_11.setText(setNum(f, min.getValue() + ""));
					max.setValue(m);
					min.setValue(m - dif);
				} else {
					if (min.getValue() >= (max.getValue() - dif)) {
						max.setValue(min.getValue() + dif);
						min.setValue(max.getValue() - dif);
					}
					label.setText(setNum(m, max.getValue() + ""));
					lblNewLabel_11.setText(setNum(f, min.getValue() + ""));
					// setting the graph
					Function.Enter(loops.getValue(), min.getValue(), max.getValue());
					// setting the graph to the panel
					panel_2.add(DualAxisDemo());
				}
				textField1.requestFocus();
				textField1.selectAll();
			}
		});
		min.setForeground(new Color(228, 241, 254));
		min.setBackground(new Color(103, 128, 159));
		panel_24.add(min, BorderLayout.CENTER);

		max.setForeground(new Color(228, 241, 254));
		max.setBackground(new Color(103, 128, 159));
		panel_24.add(max, BorderLayout.SOUTH);

		max.setValue(p);
		max.setMinimum(l);
		max.setMaximum(m);
		max.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				if (max.getValue() <= (e + dif)) {
					lblNewLabel_11.setText(setNum(f, min.getValue() + ""));
					label.setText(setNum(m, max.getValue() + ""));
					min.setValue(e);
					max.setValue(e + dif);
				} else {
					// min>max
					if (min.getValue() > (max.getValue() - dif)) {
						min.setValue(max.getValue() - dif);
						max.setValue(min.getValue() + dif);
					}
					lblNewLabel_11.setText(setNum(f, min.getValue() + ""));
					label.setText(setNum(m, max.getValue() + ""));
					// setting the graph
					Function.Enter(loops.getValue(), min.getValue(), max.getValue());
					// setting the graph to the panel
					panel_2.add(DualAxisDemo());
				}
				textField1.requestFocus();
				textField1.selectAll();
			}
		});

		panel_1.add(panel_2, BorderLayout.CENTER);
		panel_2.setDoubleBuffered(true);

		panel_2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));

		panel_2.setBackground(new Color(103, 128, 159));
		panel_2.setLayout(new BorderLayout(0, 0));
		// setting the graph to the panel
		panel_2.add(DualAxisDemo());

		// re setting the graph in case of resize
		panel_2.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent arg0) {
				panel_2.removeAll();
				panel_2.add(DualAxisDemo());
				panel_2.repaint();
				panel_2.updateUI();

				frame.repaint();
			}
		});
		// setting the graph
		Function.Enter(loops.getValue(), min.getValue(), max.getValue());
		Color color = new Color(127, 143, 166);
	}
}
