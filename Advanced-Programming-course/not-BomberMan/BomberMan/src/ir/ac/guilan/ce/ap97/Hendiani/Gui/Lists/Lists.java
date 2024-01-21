package ir.ac.guilan.ce.ap97.Hendiani.Gui.Lists;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import ir.ac.guilan.ce.ap97.Hendiani.Gui.Login.Login;
import ir.ac.guilan.ce.ap97.Hendiani.Gui.Profile.Profile;

import java.awt.Font;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JTextArea;
import java.awt.TextArea;
import java.awt.Panel;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Lists extends Profile {

	public JFrame frmScores;
	public TextArea allScores;
	public TextArea allOfflines;
	public TextArea allOnlines;
	public static ArrayList<Double> Scores = new ArrayList<>();
	public static ArrayList<Double> Offlines = new ArrayList<>();
	public static ArrayList<Double> Onlines = new ArrayList<>();

	/**
	 * Create the application.
	 */
	public Lists() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmScores = new JFrame();
		frmScores.getContentPane().setBackground(new Color(108, 122, 137));
		frmScores.setBackground(new Color(108, 122, 137));
		frmScores.setTitle("Scores");
		frmScores.setIconImage(Toolkit.getDefaultToolkit()
				.getImage(Lists.class.getResource("/ir/ac/guilan/ce/ap97/Hendiani/Gui/Icon/podium.png")));
		frmScores.setBounds(100, 100, 590, 447);
		frmScores.setLocationRelativeTo(null);
		frmScores.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmScores.getContentPane().setLayout(new CardLayout(0, 0));

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setForeground(Color.BLACK);
		tabbedPane.setBackground(new Color(108, 122, 137));
		tabbedPane.setFont(new Font("Algerian", Font.PLAIN, 13));
		frmScores.getContentPane().add(tabbedPane, "name_330125217375686");

		JPanel Scoret = new JPanel();
		Scoret.setForeground(Color.BLACK);
		tabbedPane.addTab("Top scores", null, Scoret, null);
		Scoret.setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		panel.setBackground(new Color(92, 151, 191));
		Scoret.add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel = new JLabel("  All the scores (Offline/Online).");
		lblNewLabel.setFont(new Font("Algerian", Font.PLAIN, 15));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel, BorderLayout.WEST);

		JButton btnHighestToLowest = new JButton("Highest to lowest");
		btnHighestToLowest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// TODO clear text area and sort the Scores arraylist. and then sort them and
				// set them to text area.
				allScores.setText("");
				Collections.sort(Scores);
				for (int i = 0; i < Scores.size(); i++) {
					allScores.append(Scores.get(i).toString());
					allScores.append(System.lineSeparator());
				}
			}
		});
		btnHighestToLowest.setForeground(Color.BLACK);
		btnHighestToLowest.setBackground(new Color(4, 147, 114));
		btnHighestToLowest.setFont(new Font("Algerian", Font.PLAIN, 13));
		panel.add(btnHighestToLowest, BorderLayout.EAST);

		JLabel lblNewLabel_1 = new JLabel("Sort by  ");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("Algerian", Font.PLAIN, 15));
		lblNewLabel_1.setForeground(Color.BLACK);
		panel.add(lblNewLabel_1, BorderLayout.CENTER);

		// TODO get all online and offline lists from server and set them all to the
		// Scores arraylist.
		allScores = new TextArea();
		allScores.setFont(new Font("Dialog", Font.PLAIN, 15));
		allScores.setForeground(Color.BLACK);
		allScores.setBackground(new Color(218, 223, 225));
		allScores.setEditable(false);
		// resetting text area and setting the unsorted scores.
		allScores.setText("");
		for (int i = 0; i < Scores.size(); i++) {
			allScores.append(Scores.get(i).toString());
			allScores.append(System.lineSeparator());
		}
		Scoret.add(allScores, BorderLayout.CENTER);

		JPanel panel_1 = new JPanel();
		Scoret.add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new BorderLayout(0, 0));

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Lists.class.getResource("/ir/ac/guilan/ce/ap97/Hendiani/Gui/Icon/back.png")));
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frmScores.setVisible(false);
				frmProfile.setVisible(true);
			}
		});
		panel_1.add(label, BorderLayout.SOUTH);

		JPanel Offlinet = new JPanel();
		tabbedPane.addTab("Offline", null, Offlinet, null);
		Offlinet.setLayout(new BorderLayout(0, 0));

		// TODO get all offline lists from server and set them all to the Offlines
		// arraylist.
		allOfflines = new TextArea();
		allOfflines.setFont(new Font("Dialog", Font.PLAIN, 15));
		allOfflines.setForeground(Color.BLACK);
		allOfflines.setBackground(new Color(218, 223, 225));
		allOfflines.setEditable(false);
		// resetting text area and setting the unsorted scores.
		allOfflines.setText("");
		Collections.sort(Offlines);
		for (int i = 0; i < Offlines.size(); i++) {
			allOfflines.append(Offlines.get(i).toString());
			allOfflines.append(System.lineSeparator());
		}
		Offlinet.add(allOfflines, BorderLayout.CENTER);

		Panel Onlinet = new Panel();
		tabbedPane.addTab("Online", null, Onlinet, null);
		Onlinet.setLayout(new BorderLayout(0, 0));

		// TODO get all online lists from server and set them all to the Onlines
		// arraylist.
		allOnlines = new TextArea();
		allOnlines.setFont(new Font("Dialog", Font.PLAIN, 15));
		allOnlines.setForeground(Color.BLACK);
		allOnlines.setBackground(new Color(218, 223, 225));
		allOnlines.setEditable(false);
		// resetting text area and setting the unsorted scores.
		allOnlines.setText("");
		Collections.sort(Onlines);
		for (int i = 0; i < Onlines.size(); i++) {
			allOnlines.append(Onlines.get(i).toString());
			allOnlines.append(System.lineSeparator());
		}
		Onlinet.add(allOnlines, BorderLayout.CENTER);
	}
}
