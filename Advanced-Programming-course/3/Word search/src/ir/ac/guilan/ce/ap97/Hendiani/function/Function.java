package ir.ac.guilan.ce.ap97.Hendiani.function;

import ir.ac.guilan.ce.ap97.Hendiani.gui.GuiButton1;
import ir.ac.guilan.ce.ap97.Hendiani.function.*;
import java.util.*;
import java.awt.GraphicsEnvironment;
import java.io.*;

public class Function {
	public static String savePos = "";
	public static Boolean truOrfal = false;
	public static String currentPosTemp = "";
	public static String[] storing = new String[100];

	public static int ran1to100() {
		Random ran = new Random();
		// this is the formula=>(.nextInt((max - min) + 1) + min);
		return ran.nextInt(((9 - 0) + 1) + 0);
	}

	public static int ran(int min, int max) {
		Random ran = new Random();
		// this is the formula=>(.nextInt((max - min) + 1) + min);
		return ran.nextInt(((max - min) + 1) + min);
	}

	public static void fileWritB1(int countWord, String[] words) {
		Random ran = new Random();
		storing = new String[100];
		truOrfal = false;
		currentPosTemp = "";
		savePos = "";
		// firstly i fill all of the table with random numbers then i replace the places
		// that words should be inserted.
		for (int i = 0; i < 100; i++) {
			// generates random numbers.
			// random ASCII numbers from [a-z] then turning it to character.
			// this is the formula=>(.nextInt((max - min) + 1) + min);
			storing[i] = Character.toString((char) (new Random().nextInt((122 - 97) + 1) + 97));
		}
		// which of the 8 Direction can it be inputed.

		for (int i = 0; i < countWord; i++) {
			int ran1 = ran1to100();
			int ran2 = ran1to100();
			String ans = "";
			int numOfAns = 0;
			int rCount = 0;
			int lCount = 0;
			int uCount = 0;
			int dCount = 0;
			int urCount = 0;
			int ulCount = 0;
			int drCount = 0;
			int dlCount = 0;
			for (int j = 0; j < words[i].length(); j++) {
				if (ran2 + j <= 9) { // right.
					++rCount;
					if (rCount == words[i].length()) {
						++numOfAns;
						ans += (" ");
						for (int g = 0; g < words[i].length(); g++) {
							ans += ("," + ran1 + "" + (ran2 + g));
						}
					}
				}
				if (ran2 - j >= 0) { // left.
					++lCount;
					if (lCount == words[i].length()) {
						++numOfAns;
						ans += (" ");
						for (int g = 0; g < words[i].length(); g++) {
							ans += ("," + ran1 + "" + (ran2 - g));
						}
					}
				}
				if (ran1 - j >= 0) { // up.
					++uCount;
					if (uCount == words[i].length()) {
						++numOfAns;
						ans += (" ");
						for (int g = 0; g < words[i].length(); g++) {
							ans += ("," + (ran1 - g) + "" + ran2);
						}
					}
				}
				if (ran1 + j <= 9) { // down.
					++dCount;
					if (dCount == words[i].length()) {
						++numOfAns;
						ans += (" ");
						for (int g = 0; g < words[i].length(); g++) {
							ans += ("," + (ran1 + g) + "" + ran2);
						}
					}
				}
				if (ran1 - j >= 0 && ran2 + j <= 9) { // up/right.
					++urCount;
					if (urCount == words[i].length()) {
						++numOfAns;
						ans += (" ");
						for (int g = 0; g < words[i].length(); g++) {
							ans += ("," + (ran1 - g) + "" + (ran2 + g));
						}
					}
				}
				if (ran1 - j >= 0 && ran2 - j >= 0) { // up/left.
					++ulCount;
					if (ulCount == words[i].length()) {
						++numOfAns;
						ans += (" ");
						for (int g = 0; g < words[i].length(); g++) {
							ans += ("," + (ran1 - g) + "" + (ran2 - g));
						}
					}
				}
				if (ran1 + j <= 9 && ran2 + j <= 9) { // down/right.
					++drCount;
					if (drCount == words[i].length()) {
						++numOfAns;
						ans += (" ");
						for (int g = 0; g < words[i].length(); g++) {
							ans += ("," + (ran1 + g) + "" + (ran2 + g));
						}
					}
				}
				if (ran2 - j >= 0 && ran1 + j <= 9) { // down/left.
					++dlCount;
					if (dlCount == words[i].length()) {
						++numOfAns;
						ans += (" ");
						for (int g = 0; g < words[i].length(); g++) {
							ans += ("," + (ran1 + g) + "" + (ran2 - g));
						}
					}
				}

			}
			// Putting the correct positions of the tables in an array.
			String[] currentPos = ans.replaceFirst(" ", "").split(" ");
			// Randomly choosing one of the correct path.
			// Random ran = new Random();
			int temp = (ran.nextInt(numOfAns));

			// Saving the direction choice and
			// the direction of the chosen word except the last one.
			if (i == 0) {
				savePos += currentPos[temp];
			} else if (i == 1) {
				savePos += currentPos[temp];
			} else if (i == 2) {
				savePos += currentPos[temp];
			} else if (i == 3) {
				savePos += currentPos[temp];
			} else if (i == 4) {
				savePos += currentPos[temp];
			}

			// Choosing a direction at random and choosing the final position and direction.
			String[] finalpos = currentPos[temp].replaceFirst(",", "").split(",");
			currentPosTemp = currentPos[temp].replaceFirst(",", "");
			String[] thAns = savePos.replaceAll(",,", ",").replaceFirst(",", "").split(",");
			for (int k = 0; k < finalpos.length; k++) {
				for (int j = 0; j < (thAns.length - finalpos.length); j++) {
					if (finalpos[k].equals(thAns[j])) {

						// resetting if it finds equals.
						if (savePos.indexOf(currentPos[temp]) != -1) {
							storing = new String[100];
							truOrfal = false;
							currentPosTemp = "";
							savePos = "";
							fileWritB1(countWord, words);

						} else if (savePos.indexOf(currentPos[temp]) != -1) {
							break;
						}

					}
				}
			}

			for (int k = 0; k < finalpos.length; k++) {
				for (int j = 0; j < (thAns.length - finalpos.length); j++) {
					if (finalpos[k].equals(thAns[j])) {

						// resetting if it finds equals.
						if (savePos.indexOf(currentPos[temp]) != -1) {
							storing = new String[100];
							truOrfal = false;
							currentPosTemp = "";
							savePos = "";
							fileWritB1(countWord, words);
							break;

						} else if (savePos.indexOf(currentPos[temp]) != -1) {
							break;
						}
					}
				}
			}

			// Reversing or not reversing a word by random.
			for (int j = 0; j < countWord; j++) {
				if ((ran(0, 1) != 0)) {
					// reversing.
					words[j] = new StringBuilder(words[j]).reverse().toString();
				}
			}
			// inputing correct words.
			String wordArr[] = words[i].split("");
			String posArr[] = currentPos[temp].replaceFirst(",", "").split(",");
			for (int o = 0; o < posArr.length; o++) {
				storing[Integer.parseInt(posArr[o])] = wordArr[o].toUpperCase();
			}
		}
		PrintWriter write = null;
		try {
			write = new PrintWriter(new FileOutputStream("word.txt", true));
			for (int p = 0; p < storing.length; p++) {
				write.print(storing[p]);
			}
			write.print(System.getProperty("line.separator"));
		} catch (Exception e) {
		}
		write.close();
	}

	public static void fileWritB2(String line, String words) {

	}

}