package ir.ac.guilan.ce.ap97.Hendiani.Gui;

import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;

import ir.ac.guilan.ce.ap97.Hendiani.Function.Function2;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EnterActions2 extends Gui2 {
	JFrame frame;

	/**
	 * Create the application.
	 */
	public EnterActions2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("join");
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setBounds(100, 100, 1380, 732);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JFileChooser fileChooser = new JFileChooser();
		// making sure not all files are acceptable.
		fileChooser.setAcceptAllFileFilterUsed(false);
		// filtering all files except JPG files.
		FileNameExtensionFilter obj = new FileNameExtensionFilter("JPG File", "jpg");
		fileChooser.addChoosableFileFilter(obj);
		fileChooser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					// resetting the rounds.
					round = 1;
					// getting ran word.
					new Thread() {
						public void run() {
							try {
								Function2.getWord1();
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					}.start();
					// Enabling the first round text fields.
					Function2.dis(1);
					// making the stop button enabled.
					btnStop.setEnabled(true);
					// making the file chooser invisible.
					frame.setVisible(false);
					// making the main Gui visible.
					frmGameV.setVisible(true);
					// Changing Gui title.
					frmGameV.setTitle(title2);
					// so that the cancel button works and returns user to profile to change input.
					java.io.File file2 = fileChooser.getSelectedFile();
					// System.out.println(file2);
					// Image image2 = null;
					Image image2 = ImageIO.read(file2);
					lblPic.setIcon(new ImageIcon(image2.getScaledInstance(60, 50, image2.SCALE_DEFAULT)));
					// Stating the timer.
					gameStarted = true;
					// Resisting timer each new game.
					timer = 180;
					// setting the number of wins and losses.
				} catch (Exception e) {
					// making the file chooser invisible.
					frame.setVisible(false);
					// making the main Gui visible.
					frmGameV.setVisible(true);
					// Disabling the game tab.
					// tabbedPane.setEnabledAt(1, false);
				}
			}
		});
		frame.getContentPane().add(fileChooser, BorderLayout.CENTER);
	}

}
