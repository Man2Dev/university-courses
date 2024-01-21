package ir.ac.guilan.ce.ap97.Hendiani.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import javax.swing.JTextPane;
import javax.swing.DropMode;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import javax.swing.UIManager;
import javax.swing.SwingConstants;

public class seach {

	protected static final char[] FileSystemNotFoundException = null;
	JFrame frmWordSearch;
	private JTextField txtEnterWord;
	protected String line;

	/**
	 * Create the application.
	 */
	public seach() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWordSearch = new JFrame();
		frmWordSearch.setTitle("Word search");
		frmWordSearch.setBounds(100, 100, 805, 322);
		frmWordSearch.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBorder(UIManager.getBorder("DesktopIcon.border"));
		frmWordSearch.getContentPane().add(panel, BorderLayout.SOUTH);

		txtEnterWord = new JTextField();
		txtEnterWord.setToolTipText("");
		txtEnterWord.setForeground(Color.BLACK);
		txtEnterWord.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterWord.setDropMode(DropMode.INSERT);
		txtEnterWord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		JButton btnSearch = new JButton("Search");
		btnSearch.setBackground(Color.DARK_GRAY);
		btnSearch.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent arg0) {

			}

			public void ancestorMoved(AncestorEvent arg0) {
			}

			public void ancestorRemoved(AncestorEvent arg0) {
			}
		});
		/*
		 * btnSearch.addActionListener(new ActionListener() { public void
		 * actionPerformed(ActionEvent arg0) {
		 * 
		 * 
		 * } });
		 */
		panel.add(btnSearch);
		txtEnterWord.setBackground(Color.WHITE);
		panel.add(txtEnterWord);
		txtEnterWord.setColumns(10);

		JPanel panel_1 = new JPanel();
		frmWordSearch.getContentPane().add(panel_1, BorderLayout.NORTH);

		JTextPane textPane = new JTextPane();
		frmWordSearch.getContentPane().add(textPane, BorderLayout.CENTER);
		textPane.setBackground(Color.GRAY);
		textPane.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent arg0) {
				String ans = "";
				String readLine = null;
				Scanner scan = null;

				int i = 0;
				int j = 0;
				try {
					scan = new Scanner(new File("word.txt"));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Random ran = new Random();
				// counting the number of strings available.
				while (scan.hasNext()) {
					i++;
				}
				System.out.println(i);
				while (scan.hasNext()) {
					String temp = (scan.next());
					j++;// Storing a random string.
					if (j == ran.nextInt(((i - 1) + 1) + 1)) {
						readLine = temp;
					}
				}
				System.out.println(j);

				String[] lineArr = readLine.split("");
				for (int i1 = 0; i1 < lineArr.length; i1++) {

					ans += (lineArr[i1] + "\t");
					if ((i1 + 1) % 10 == 0) {
						ans += System.getProperty("line.separator");
					}
				}
				textPane.setText(ans);
				// closing scanner.
				scan.close();
			}

			public void ancestorMoved(AncestorEvent arg0) {
			}

			public void ancestorRemoved(AncestorEvent arg0) {
			}
		});
		textPane.setEditable(false);
		textPane.setDropMode(DropMode.INSERT);
	}

}
