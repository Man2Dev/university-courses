package ir.ac.guilan.ce.ap97.Hendiani.Gui.StartGame;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import ir.ac.guilan.ce.ap97.Hendiani.Gui.Profile.Profile;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JToggleButton;
import javax.swing.SpringLayout;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.GridLayout;
import java.awt.SystemColor;
import javax.swing.JSeparator;
import javax.swing.JButton;

public class StartOnline {

	public JFrame frame;
	private JTextField txtIp;
	private JTextField txtPort;
	private JSpinner hourSpin;
	private JSpinner minSpin;
	private JSpinner secSpin;
	private JSpinner xSpin;
	private JSpinner ySpin;
	private JButton chooseBtn;
	private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

	/**
	 * Create the application.
	 */
	public StartOnline() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Ready");
		frame.setIconImage(Toolkit.getDefaultToolkit()
				.getImage(StartOnline.class.getResource("/ir/ac/guilan/ce/ap97/Hendiani/Gui/Icon/sword.png")));
		frame.setBounds(100, 100, 485, 231);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		panel.setBackground(new Color(103, 128, 159));
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel = new JLabel(" screen aspect ratio ");
		lblNewLabel.setBackground(new Color(52, 73, 94));
		lblNewLabel.setFont(new Font("Algerian", Font.PLAIN, 13));
		lblNewLabel.setForeground(Color.BLACK);
		panel.add(lblNewLabel, BorderLayout.WEST);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(103, 128, 159));
		panel.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new GridLayout(1, 0, 0, 0));

		xSpin = new JSpinner();
		xSpin.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				frame.setBounds(100, 100, Integer.parseInt(xSpin.getValue().toString()),
						Integer.parseInt(ySpin.getValue().toString()));
				frame.setLocationRelativeTo(null);
			}
		});
		int temp1 = (int) screenSize.getWidth();
		xSpin.setModel(new SpinnerNumberModel(600, 600, temp1, 1));
		xSpin.setForeground(Color.BLACK);
		panel_2.add(xSpin);

		ySpin = new JSpinner();
		ySpin.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				frame.setBounds(100, 100, Integer.parseInt(xSpin.getValue().toString()),
						Integer.parseInt(ySpin.getValue().toString()));
				frame.setLocationRelativeTo(null);
			}
		});
		int temp2 = (int) screenSize.getHeight();
		ySpin.setModel(new SpinnerNumberModel(600, 600, temp2, 1));
		ySpin.setForeground(Color.BLACK);
		panel_2.add(ySpin);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(103, 128, 159));
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));

		JPanel panel_4 = new JPanel();
		panel_4.setForeground(new Color(0, 0, 0));
		panel_4.setBackground(new Color(103, 128, 159));
		panel_1.add(panel_4, BorderLayout.NORTH);
		panel_4.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel_1 = new JLabel(" Number of players ");
		lblNewLabel_1.setBackground(new Color(52, 73, 94));
		panel_4.add(lblNewLabel_1, BorderLayout.WEST);
		lblNewLabel_1.setFont(new Font("Algerian", Font.PLAIN, 13));
		lblNewLabel_1.setForeground(Color.BLACK);

		JSpinner numPlayerSpin = new JSpinner();
		numPlayerSpin.setEnabled(true);
		numPlayerSpin.setForeground(Color.BLACK);
		numPlayerSpin.setModel(new SpinnerNumberModel(2, 2, 4, 1));
		panel_4.add(numPlayerSpin, BorderLayout.CENTER);

		JToggleButton tglbtnNewToggleButton = new JToggleButton("HOST");
		tglbtnNewToggleButton.setBackground(new Color(38, 166, 91));
		tglbtnNewToggleButton.setForeground(Color.BLACK);
		tglbtnNewToggleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (tglbtnNewToggleButton.isSelected()) {
					tglbtnNewToggleButton.setText("CLIENT");
					UIManager.put("ToggleButton.select", new Color(150, 40, 27));
					SwingUtilities.updateComponentTreeUI(tglbtnNewToggleButton);
					numPlayerSpin.setEnabled(false);
					hourSpin.setEnabled(false);
					minSpin.setEnabled(false);
					secSpin.setEnabled(false);
					chooseBtn.setText("Choose Host");
				} else {
					tglbtnNewToggleButton.setText("HOST");
					UIManager.put("ToggleButton.select", new Color(38, 166, 91));
					SwingUtilities.updateComponentTreeUI(tglbtnNewToggleButton);
					numPlayerSpin.setEnabled(true);
					hourSpin.setEnabled(true);
					minSpin.setEnabled(true);
					secSpin.setEnabled(true);
					chooseBtn.setText("Choose Clinet");
				}
			}
		});
		panel_4.add(tglbtnNewToggleButton, BorderLayout.SOUTH);

		JPanel panel_5 = new JPanel();
		panel_5.setForeground(Color.BLACK);
		panel_5.setBackground(new Color(103, 128, 159));
		panel_4.add(panel_5, BorderLayout.NORTH);
		panel_5.setLayout(new BorderLayout(0, 0));

		JPanel panel_6 = new JPanel();
		panel_6.setForeground(Color.BLACK);
		panel_6.setBackground(new Color(103, 128, 159));
		panel_5.add(panel_6, BorderLayout.SOUTH);
		panel_6.setLayout(new BorderLayout(0, 0));

		JLabel lblTimerhms = new JLabel(" Timer (H/M/S)             ");
		lblTimerhms.setForeground(Color.BLACK);
		lblTimerhms.setFont(new Font("Algerian", Font.PLAIN, 13));
		lblTimerhms.setBackground(Color.WHITE);
		panel_6.add(lblTimerhms, BorderLayout.WEST);

		JPanel panel_7 = new JPanel();
		panel_6.add(panel_7, BorderLayout.CENTER);
		panel_7.setLayout(new GridLayout(1, 0, 0, 0));

		hourSpin = new JSpinner();
		hourSpin.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		hourSpin.setForeground(Color.BLACK);
		panel_7.add(hourSpin);

		minSpin = new JSpinner();
		minSpin.setModel(new SpinnerNumberModel(new Integer(3), new Integer(1), null, new Integer(1)));
		minSpin.setForeground(Color.BLACK);
		panel_7.add(minSpin);

		secSpin = new JSpinner();
		secSpin.setForeground(Color.BLACK);
		secSpin.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		panel_7.add(secSpin);

		JLabel lblBack = new JLabel("");
		lblBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				Profile.frmProfile.setVisible(true);
			}
		});
		lblBack.setIcon(
				new ImageIcon(StartOnline.class.getResource("/ir/ac/guilan/ce/ap97/Hendiani/Gui/Icon/exit (2).png")));
		lblBack.setVerticalAlignment(SwingConstants.BOTTOM);
		lblBack.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1.add(lblBack, BorderLayout.WEST);

		JLabel lblStart = new JLabel("");
		lblStart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (txtIp.getText().equals("") || txtPort.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "You must enter the IP & Port", "Error",
							JOptionPane.ERROR_MESSAGE, null);
				} else {
					// TODO SART THE OFLINE VERSION OF GAME. and set the size of the online game and
					// the number of players and set timer.
					frame.setBounds(100, 100, Integer.parseInt(xSpin.getValue().toString()),
							Integer.parseInt(ySpin.getValue().toString()));
					frame.setLocationRelativeTo(null);
				}
			}
		});
		lblStart.setHorizontalAlignment(SwingConstants.RIGHT);
		lblStart.setVerticalAlignment(SwingConstants.BOTTOM);
		lblStart.setIcon(new ImageIcon(
				StartOnline.class.getResource("/ir/ac/guilan/ce/ap97/Hendiani/Gui/Icon/power-button.png")));
		panel_1.add(lblStart, BorderLayout.EAST);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(58, 83, 155));
		panel_3.setForeground(Color.BLACK);
		panel_1.add(panel_3, BorderLayout.CENTER);

		txtIp = new JTextField();
		txtIp.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtIp.setHorizontalAlignment(SwingConstants.CENTER);
		txtIp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txtIp.setText("");
			}
		});
		txtIp.setText("127.0.0.1");
		txtIp.setForeground(Color.BLACK);
		txtIp.setColumns(10);
		txtIp.setBackground(new Color(119, 136, 153));

		txtPort = new JTextField();
		txtPort.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtPort.setHorizontalAlignment(SwingConstants.CENTER);
		txtPort.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtPort.setText("");
			}
		});
		txtPort.setText("1998");
		txtPort.setForeground(Color.BLACK);
		txtPort.setColumns(10);
		txtPort.setBackground(new Color(119, 136, 153));

		JSeparator separator = new JSeparator();

		chooseBtn = new JButton("Choose Clients");
		chooseBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// TODO MAKE A PANEL TO CHOOSE MEMBERS IF chooseBtn is HOST OR CHOOSE HOST IF
				// chooseBtn is MEMBER

			}
		});
		chooseBtn.setBackground(new Color(211, 84, 0));
		chooseBtn.setForeground(Color.BLACK);
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING).addGroup(gl_panel_3
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addComponent(separator, GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
						.addComponent(txtPort, GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
						.addComponent(txtIp, GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
						.addComponent(chooseBtn, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE))
				.addContainerGap()));
		gl_panel_3.setVerticalGroup(gl_panel_3.createParallelGroup(Alignment.LEADING).addGroup(gl_panel_3
				.createSequentialGroup().addContainerGap()
				.addComponent(txtIp, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(txtPort, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addGap(7)
				.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
						GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED).addComponent(chooseBtn)
				.addContainerGap(260, Short.MAX_VALUE)));
		panel_3.setLayout(gl_panel_3);
	}
}
