package ir.ac.guilan.ce.ap97.Hendiani.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.Box;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.Window.Type;
import javax.swing.JSeparator;
import javax.swing.UIManager;
import java.awt.Component;
import javax.swing.border.TitledBorder;

public class theGui {

	public JFrame frmWordSearchV;

	/**
	 * Create the application.
	 */
	public theGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWordSearchV = new JFrame();
		frmWordSearchV.setTitle("Word search v0.7");
		frmWordSearchV.setIconImage(Toolkit.getDefaultToolkit().getImage(
				"D:\\reza\\java\\Word search\\bin\\ir\\ac\\guilan\\ce\\ap97\\Hendiani\\gui\\word-search-og-share.png"));
		frmWordSearchV.setBounds(100, 100, 450, 300);
		frmWordSearchV.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWordSearchV.getContentPane().setLayout(new BorderLayout(0, 0));

		Box verticalBox = Box.createVerticalBox();
		verticalBox.setBackground(new Color(0, 102, 153));
		frmWordSearchV.getContentPane().add(verticalBox, BorderLayout.CENTER);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(UIManager.getBorder("MenuBar.border"));
		panel_2.setBackground(Color.GRAY);
		verticalBox.add(panel_2);

		JLabel lblChooseFunction = new JLabel("choose function");
		panel_2.add(lblChooseFunction);
		lblChooseFunction.setHorizontalAlignment(SwingConstants.CENTER);
		lblChooseFunction.setFont(new Font("Times New Roman", Font.ITALIC, 23));
		lblChooseFunction.setBackground(UIManager.getColor("Button.disabledForeground"));

		JSeparator separator_2 = new JSeparator();
		verticalBox.add(separator_2);

		JPanel panel = new JPanel();
		panel.setBorder(UIManager.getBorder("DesktopIcon.border"));
		panel.setBackground(new Color(51, 153, 51));
		verticalBox.add(panel);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(204, 255, 153));
		panel_3.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEFT,
				TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.add(panel_3);

		JLabel label = new JLabel("Input words");
		panel_3.add(label);
		label.setFont(new Font("Bell MT", Font.BOLD, 16));

		JButton btnInput = new JButton("Input");
		btnInput.setBackground(Color.LIGHT_GRAY);
		panel.add(btnInput);

		btnInput.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				frmWordSearchV.setVisible(false);
				GuiButton1 theObj = new GuiButton1();
			}
		});

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(UIManager.getBorder("DesktopIcon.border"));
		panel_1.setBackground(new Color(0, 102, 153));
		verticalBox.add(panel_1);

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(204, 255, 153));
		panel_4.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.BELOW_TOP, null,
				new Color(204, 255, 153)));
		panel_1.add(panel_4);

		JLabel lblSearchForWords = new JLabel("Search for words");
		panel_4.add(lblSearchForWords);
		lblSearchForWords.setFont(new Font("Bell MT", Font.BOLD, 16));

		JButton btnSearch = new JButton("Search");
		btnSearch.setBackground(Color.LIGHT_GRAY);
		panel_1.add(btnSearch);

		btnSearch.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Scanner scan = null;
				try {
					scan = new Scanner(new File("word.txt"));
				} catch (FileNotFoundException e) {
					// if file doesn't exist.
					JOptionPane.showMessageDialog(null, e.getMessage());
					System.exit(0);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				// if not it goes in search.
				frmWordSearchV.setVisible(false);
				/**
				 * Launch the application.
				 */

				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							seach window = new seach();
							window.frmWordSearch.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
	}

}
