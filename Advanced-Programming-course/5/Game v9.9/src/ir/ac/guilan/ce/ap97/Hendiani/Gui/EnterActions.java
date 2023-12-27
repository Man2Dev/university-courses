package ir.ac.guilan.ce.ap97.Hendiani.Gui;

import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.ActionEvent;

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
		timer = 0;
		frmSelectImage = new JFrame();
		frmSelectImage.setTitle("Select image");
		frmSelectImage.setAlwaysOnTop(true);
		frmSelectImage.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frmSelectImage.setBounds(100, 100, 1380, 732);
		frmSelectImage.setLocationRelativeTo(null);
		frmSelectImage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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
					// Disabling the winners button.
					btnWinners.setEnabled(false);
					// space between the list.
					space = System.lineSeparator();
					// making the file chooser invisible.
					frmSelectImage.setVisible(false);
					// making the main Gui visible.
					frmGameV.setVisible(true);
					// Enabling the game tab.
					tabbedPane.setEnabledAt(1, true);
					// Disabling the profile tab & the enter bottom.
					btnEnter.setEnabled(false);
					tabbedPane.setEnabledAt(0, false);
					// setting the total number of blocks.
					totalNumBlock = xNow * yNow;
					// Stating timer up from 0 again.
					timer=0;
					// setting the image on game play tab.
					File file = fileChooser.getSelectedFile();
					Image image = ImageIO.read(file);
					lblPic.setIcon(new ImageIcon(image.getScaledInstance(50, 40, image.SCALE_DEFAULT)));
				} catch (Exception e) {
					// making the file chooser invisible.
					frmSelectImage.setVisible(false);
					// making the main Gui visible.
					frmGameV.setVisible(true);
					// Disabling the NEW GAME! in game tab button.
					btnNewGame.setEnabled(false);
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
