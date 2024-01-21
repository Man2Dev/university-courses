package ir.ac.guilan.ce.ap97.Hendiani.Gui;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

import ir.ac.guilan.ce.ap97.Hendiani.Function.Function;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;

public class EnterActions extends Gui {
	JFrame frmSelectImage;

	/**
	 * Create the application.
	 */
	public EnterActions() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSelectImage = new JFrame();
		frmSelectImage.setTitle(title);
		// frmSelectImage.setAlwaysOnTop(true);
		frmSelectImage.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frmSelectImage.setBounds(100, 100, 1380, 732);
		frmSelectImage.setLocationRelativeTo(null);
		frmSelectImage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		numWin = 0;
		numLost = 0;
		point1 = 0;
		point2 = 0;
		point3 = 0;
		point4 = 0;
		point5 = 0;
		JPanel panel = new JPanel();
		panel.setBorder(UIManager.getBorder("DesktopIcon.border"));
		frmSelectImage.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));

		JFileChooser fileChooser = new JFileChooser();
		// making sure not all files are acceptable.
		fileChooser.setAcceptAllFileFilterUsed(false);
		// filtering all files except JPG files.
		FileNameExtensionFilter obj = new FileNameExtensionFilter("JPG File", "jpg");
		fileChooser.addChoosableFileFilter(obj);
		fileChooser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// so that the cancel button works and returns user to profile to change input.
				try {
					//setting the wins and losses data.
					Function.inputData();
					//setting the random letter for the first round.
					Function.ran(1);					
					// Enabling the first round text fields.
					Function.dis(1);
					// resetting the rounds.
					round = 1;
					// making the stop button enabled.
					btnStop.setEnabled(true);
					// making the file chooser invisible.
					frmSelectImage.setVisible(false);
					// making the main Gui visible.
					frmGameV.setVisible(true);
					// Changing Gui title.
					frmGameV.setTitle(title);
					// Enabling the game tab.
					tabbedPane.setEnabledAt(1, true);
					// Disabling the profile tab & the enter bottom.
					btnEnter.setEnabled(false);
					tabbedPane.setEnabledAt(0, false);
					// setting the image on game play tab.
					File file = fileChooser.getSelectedFile();
					Image image = ImageIO.read(file);
					lblPic.setIcon(new ImageIcon(image.getScaledInstance(60, 50, image.SCALE_DEFAULT)));
					// Stating the timer.
					gameStarted = true;
					// Resisting timer each new game.
					timer = 5;
					// setting the number of wins and losses.
					Function.inputData();
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								// the things that should be done when game starts.
								EnterActions2 window = new EnterActions2();
								window.frame.setVisible(true);
							} catch (Exception e) {
							}
						}
					});
				} catch (Exception e) {
					// making the file chooser invisible.
					frmSelectImage.setVisible(false);
					// making the main Gui visible.
					frmGameV.setVisible(true);
					// Disabling the game tab.
					tabbedPane.setEnabledAt(1, false);
					// Enabling the profile tab & the enter bottom.
					btnEnter.setEnabled(true);
					tabbedPane.setEnabledAt(0, true);
				}
			}
		});
		panel.add(fileChooser, BorderLayout.CENTER);
	}
}
