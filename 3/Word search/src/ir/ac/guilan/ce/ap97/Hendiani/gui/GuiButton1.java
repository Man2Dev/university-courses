package ir.ac.guilan.ce.ap97.Hendiani.gui;

import ir.ac.guilan.ce.ap97.Hendiani.function.*;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class GuiButton1 extends JFrame {
	JPanel panle = new JPanel();
	// a 10 by 10 aspect ratio text area which means it has 10 rows and 10 columns.
	JTextArea txt = new JTextArea(10, 10);
	// JLabel is used to output text images to screen.
	JLabel label = new JLabel();
	public static int number = 0;
	public static String[] wordArr = null;

	public GuiButton1() {

		// so that if the user cancel or exits.
		try {
			// Putting text on the JOptionPane and receive a string and changing it to
			// integer.
			String howMany = JOptionPane.showInputDialog("How many words do you want to input?");
			number = Integer.parseInt(howMany);
			wordArr = new String[number];

			// checking if number(number of entries) is between 0<n<6 and if not it calls
			// the class until its between 0<n<6.
			if (1 <= number && number <= 5) {
				for (int i = 0; i < number; i++) {
					String word = JOptionPane.showInputDialog("enter " + Integer.toString(i + 1) + "th word");
					// if the length of the word is between 1<n<6 it will add the word to the array.
					if (2 <= word.length() && word.length() <= 5) {
						wordArr[i] = word;
					} else {
						// removing an i each time the word isn't the length of 1<n<6 so that the user
						// has to repeat the word.
						--i;
						// the pop up notification of mistake.
						JOptionPane.showMessageDialog(null, "The length of the words should be between 2 to 5.");
					}
				}
			} else {
				// the pop up notification of mistake.
				JOptionPane.showMessageDialog(null, "The number of entries should be between 1 to 5.");
				// the recursive function.
				GuiButton1 theObj = new GuiButton1();
			}
		} catch (Exception e) {
			System.exit(getDefaultCloseOperation());
		}
		// Inputing the word to the text.
		Function.fileWritB1(number, wordArr);

		// **Outputting the answer.
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					outputText window = new outputText();
					window.getFrmWordSearchV().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}