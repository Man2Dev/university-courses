package ir.ac.guilan.ce.ap97.Hendiani.Gui.Function;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

import ir.ac.guilan.ce.ap97.Hendiani.Gui.Gui;

public class Function extends Gui {
	private static long saveTime = 0;
	private static String temp = null;

	// Calculating rank.
	private static double rank() {
		return ((totalNumBlock * disabledCount) / (moveCount * (Math.cbrt(saveTime))));
	}

	// reading file and processing image and inputting it to text area.
	public static void inputTextarea() {
		Scanner scan = null;
		
		try {
			scan = new Scanner(new File("Data.txt"));
		} catch (Exception e) {
		}

		// reading.
		while (scan.hasNext()) {
			temp += scan.next();
		}

		String[] newTemp = temp.split(",");
		String temp="";
		for (int j = 1; j < newTemp.length; j++) {
			temp += newTemp[j];
			temp += System.lineSeparator();
		}
		// setting the data in the file to text area.
		textArea.setText(temp);
		// closing scanner.
		scan.close();

	}

	public static void endOfGame(long time) {
		saveTime = time;
		// writing user data in text.
		PrintWriter write = null;
		try {
			write = new PrintWriter(new FileOutputStream("Data.txt", true));
			// writing users path to picture, "name surname" and users "rank" in a text
			// file.
			write.println("," + space + "," + txtNarutoUxumaki.getText().replaceAll(" ", "_") + " = (" + rank() + ")");
		} catch (Exception e) {
		}
		write.close();
		// inputting text file to text area.
		inputTextarea();
		// Disabling the game tab.
		tabbedPane.setEnabledAt(1, false);
		// Disabling the NEW GAME! in game tab button.
		btnNewGame.setEnabled(false);
		// showing record and informing of end of game.
		JOptionPane.showMessageDialog(null, "GAME OVER!\nYOUR RECORD IS: (" + rank() + ")", "THAKS FOR PLAYING.",
				JOptionPane.INFORMATION_MESSAGE, null);
		// making the winner tab visible.
		tabbedPane.setEnabledAt(2, true);
		// Enabling the profile tab & the enter bottom.
		btnEnter.setEnabled(true);
		tabbedPane.setEnabledAt(0, true);
	}

}
