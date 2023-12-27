package ir.ac.guilan.ce.ap97.Hendiani.Function;

import java.awt.Color;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;

import javax.swing.JOptionPane;

import ir.ac.guilan.ce.ap97.Hendiani.Gui.Gui;

public class Function extends Gui {
	private static ServerSocket obj = null;
	private static Socket socket = null;
	private static BufferedReader input;
	private static PrintWriter output;
	private static Socket socket2 = null;
	private static BufferedReader in;
	private static PrintWriter out;
	private static ArrayList<String> names = new ArrayList<String>();
	private static ArrayList<String> surnames = new ArrayList<String>();
	private static ArrayList<String> countries = new ArrayList<String>();
	private static ArrayList<String> animals = new ArrayList<String>();
	private static ArrayList<String> fruits = new ArrayList<String>();

	public static void list() {
		Scanner scan1 = null;
		Scanner scan2 = null;
		Scanner scan3 = null;
		Scanner scan4 = null;
		Scanner scan5 = null;
		try {// location it is.
			scan1 = new Scanner(new File("firstNames.txt"));
			scan2 = new Scanner(new File("lastNames.txt"));
			scan3 = new Scanner(new File("countries.txt"));
			scan4 = new Scanner(new File("animals.txt"));
			scan5 = new Scanner(new File("fruits.txt"));
		} catch (Exception e) {
		}
		// reading.
		while (scan1.hasNext()) {
			names.add(scan1.next());
		}
		scan1.close();
		while (scan2.hasNext()) {
			surnames.add(scan2.next());
		}
		scan2.close();
		while (scan3.hasNext()) {
			countries.add(scan3.next());
		}
		scan3.close();
		while (scan4.hasNext()) {
			animals.add(scan4.next());
		}
		scan4.close();
		while (scan5.hasNext()) {
			fruits.add(scan5.next());
		}
		scan5.close();
	}

	public static void dis(int n) {
		if (n == 0) {
			namefil1.setEnabled(false);
			lastfil1.setEnabled(false);
			counfil1.setEnabled(false);
			anifil1.setEnabled(false);
			fruifil1.setEnabled(false);
			namefil2.setEnabled(false);
			lastfil2.setEnabled(false);
			counfil2.setEnabled(false);
			anifil2.setEnabled(false);
			fruifil2.setEnabled(false);
			namefil3.setEnabled(false);
			lastfil3.setEnabled(false);
			counfil3.setEnabled(false);
			anifil3.setEnabled(false);
			fruifil3.setEnabled(false);
			namefil4.setEnabled(false);
			lastfil4.setEnabled(false);
			counfil4.setEnabled(false);
			anifil4.setEnabled(false);
			fruifil4.setEnabled(false);
			namefil5.setEnabled(false);
			lastfil5.setEnabled(false);
			counfil5.setEnabled(false);
			anifil5.setEnabled(false);
			fruifil5.setEnabled(false);
		} else if (n == 1) {
			namefil1.setEnabled(true);
			lastfil1.setEnabled(true);
			counfil1.setEnabled(true);
			anifil1.setEnabled(true);
			fruifil1.setEnabled(true);
			namefil2.setEnabled(false);
			lastfil2.setEnabled(false);
			counfil2.setEnabled(false);
			anifil2.setEnabled(false);
			fruifil2.setEnabled(false);
			namefil3.setEnabled(false);
			lastfil3.setEnabled(false);
			counfil3.setEnabled(false);
			anifil3.setEnabled(false);
			fruifil3.setEnabled(false);
			namefil4.setEnabled(false);
			lastfil4.setEnabled(false);
			counfil4.setEnabled(false);
			anifil4.setEnabled(false);
			fruifil4.setEnabled(false);
			namefil5.setEnabled(false);
			lastfil5.setEnabled(false);
			counfil5.setEnabled(false);
			anifil5.setEnabled(false);
			fruifil5.setEnabled(false);
		} else if (n == 2) {
			namefil1.setEnabled(false);
			lastfil1.setEnabled(false);
			counfil1.setEnabled(false);
			anifil1.setEnabled(false);
			fruifil1.setEnabled(false);
			namefil2.setEnabled(true);
			lastfil2.setEnabled(true);
			counfil2.setEnabled(true);
			anifil2.setEnabled(true);
			fruifil2.setEnabled(true);
			namefil3.setEnabled(false);
			lastfil3.setEnabled(false);
			counfil3.setEnabled(false);
			anifil3.setEnabled(false);
			fruifil3.setEnabled(false);
			namefil4.setEnabled(false);
			lastfil4.setEnabled(false);
			counfil4.setEnabled(false);
			anifil4.setEnabled(false);
			fruifil4.setEnabled(false);
			namefil5.setEnabled(false);
			lastfil5.setEnabled(false);
			counfil5.setEnabled(false);
			anifil5.setEnabled(false);
			fruifil5.setEnabled(false);
		} else if (n == 3) {
			namefil1.setEnabled(false);
			lastfil1.setEnabled(false);
			counfil1.setEnabled(false);
			anifil1.setEnabled(false);
			fruifil1.setEnabled(false);
			namefil2.setEnabled(false);
			lastfil2.setEnabled(false);
			counfil2.setEnabled(false);
			anifil2.setEnabled(false);
			fruifil2.setEnabled(false);
			namefil3.setEnabled(true);
			lastfil3.setEnabled(true);
			counfil3.setEnabled(true);
			anifil3.setEnabled(true);
			fruifil3.setEnabled(true);
			namefil4.setEnabled(false);
			lastfil4.setEnabled(false);
			counfil4.setEnabled(false);
			anifil4.setEnabled(false);
			fruifil4.setEnabled(false);
			namefil5.setEnabled(false);
			lastfil5.setEnabled(false);
			counfil5.setEnabled(false);
			anifil5.setEnabled(false);
			fruifil5.setEnabled(false);
		} else if (n == 4) {
			namefil1.setEnabled(false);
			lastfil1.setEnabled(false);
			counfil1.setEnabled(false);
			anifil1.setEnabled(false);
			fruifil1.setEnabled(false);
			namefil2.setEnabled(false);
			lastfil2.setEnabled(false);
			counfil2.setEnabled(false);
			anifil2.setEnabled(false);
			fruifil2.setEnabled(false);
			namefil3.setEnabled(false);
			lastfil3.setEnabled(false);
			counfil3.setEnabled(false);
			anifil3.setEnabled(false);
			fruifil3.setEnabled(false);
			namefil4.setEnabled(true);
			lastfil4.setEnabled(true);
			counfil4.setEnabled(true);
			anifil4.setEnabled(true);
			fruifil4.setEnabled(true);
			namefil5.setEnabled(false);
			lastfil5.setEnabled(false);
			counfil5.setEnabled(false);
			anifil5.setEnabled(false);
			fruifil5.setEnabled(false);
		} else if (n == 5) {
			namefil1.setEnabled(false);
			lastfil1.setEnabled(false);
			counfil1.setEnabled(false);
			anifil1.setEnabled(false);
			fruifil1.setEnabled(false);
			namefil2.setEnabled(false);
			lastfil2.setEnabled(false);
			counfil2.setEnabled(false);
			anifil2.setEnabled(false);
			fruifil2.setEnabled(false);
			namefil3.setEnabled(false);
			lastfil3.setEnabled(false);
			counfil3.setEnabled(false);
			anifil3.setEnabled(false);
			fruifil3.setEnabled(false);
			namefil4.setEnabled(false);
			lastfil4.setEnabled(false);
			counfil4.setEnabled(false);
			anifil4.setEnabled(false);
			fruifil4.setEnabled(false);
			namefil5.setEnabled(true);
			lastfil5.setEnabled(true);
			counfil5.setEnabled(true);
			anifil5.setEnabled(true);
			fruifil5.setEnabled(true);
		}
	}

	// reading file and processing image and inputting it to text area.
	public static void inputData() {
		Scanner scan = null;
		String temp = "";
		try {
			scan = new Scanner(new File("Data.txt"));
		} catch (Exception e) {
		}

		// reading.
		while (scan.hasNext()) {
			temp += scan.next();
		}

		String[] newTemp = temp.split(",");
		for (int j = 1; j < newTemp.length; j++) {
			// if it finds the name.
			if (newTemp[j].equals(name.replaceAll(" ", "_"))) {
				numWin = Integer.parseInt(newTemp[j + 1].toString());
				numLost = Integer.parseInt(newTemp[j + 2].toString());
			}
			data.setText("(" + numWin + " & " + numLost + ")");
		}
		// closing scanner.
		scan.close();
	}

	// returns random letter.
	public static void ran(int n) {
		String[] letter = new String[26];
		letter[0] = "a";
		letter[1] = "b";
		letter[2] = "c";
		letter[3] = "d";
		letter[4] = "e";
		letter[5] = "f";
		letter[6] = "g";
		letter[7] = "h";
		letter[8] = "i";
		letter[9] = "j";
		letter[10] = "k";
		letter[11] = "l";
		letter[12] = "m";
		letter[13] = "n";
		letter[14] = "o";
		letter[15] = "p";
		letter[16] = "q";
		letter[17] = "r";
		letter[18] = "s";
		letter[19] = "t";
		letter[20] = "u";
		letter[21] = "v";
		letter[22] = "w";
		letter[23] = "x";
		letter[24] = "y";
		letter[25] = "z";
		Random ran = new Random();
		// setting the random letter for the rounds.
		if (n == 1) {
			lettfil1.setText(letter[ran.nextInt(((25 - 0) + 1) + 0)]);
			// sending ran word.
			Thread og = new Thread() {
				public void run() {
					try {
						Function.send(lettfil1.getText().toString(), 1231);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			};
			og.start();
		} else if (n == 2) {
			lettfil2.setText(letter[ran.nextInt(((25 - 0) + 1) + 0)]);
			// sending ran word.
			Thread og = new Thread() {

				public void run() {
					try {
						Function.send(lettfil2.getText().toString(), 1232);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			};
			og.start();
		} else if (n == 3) {
			lettfil3.setText(letter[ran.nextInt(((25 - 0) + 1) + 0)]);

			// sending ran word.
			Thread og = new Thread() {
				public void run() {
					try {
						Function.send(lettfil3.getText().toString(), 1233);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			};
			og.start();
		} else if (n == 4) {
			lettfil4.setText(letter[ran.nextInt(((25 - 0) + 1) + 0)]);
			// sending ran word.
			Thread og = new Thread() {
				public void run() {
					try {
						Function.send(lettfil4.getText().toString(), 1234);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			};
			og.start();
		} else if (n == 5) {
			lettfil5.setText(letter[ran.nextInt(((25 - 0) + 1) + 0)]);
			// sending ran word.
			Thread og = new Thread() {
				public void run() {
					try {
						Function.send(lettfil5.getText().toString(), 1235);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			};
			og.start();
		}
	}

	// setting the colors for the fields.
	private static void color() {
		String name = "";
		String last = "";
		String con = "";
		String ani = "";
		String fru = "";
		String cliName = "";
		String cliLast = "";
		String cliCon = "";
		String cliAni = "";
		String cliFru = "";
		if (round == 1) {
			name = namefil1.getText().toString().replaceAll(" ", "_");
			last = lastfil1.getText().toString().replaceAll(" ", "_");
			con = counfil1.getText().toString().replaceAll(" ", "_");
			ani = anifil1.getText().toString().replaceAll(" ", "_");
			fru = fruifil1.getText().toString().replaceAll(" ", "_");
			String letter = lettfil1.getText().toString();
			String[] nameArr = namefil1.getText().toString().split("");
			String[] lastArr = lastfil1.getText().toString().split("");
			String[] conArr = counfil1.getText().toString().split("");
			String[] aniArr = anifil1.getText().toString().split("");
			String[] fruArr = fruifil1.getText().toString().split("");
			// Names.
			if (names.contains(name) && letter.equals(nameArr[0].toLowerCase())) {
				if (name.equals(cliName)) {
					namefil1.setBackground(Color.YELLOW);
				} else
					namefil1.setBackground(Color.GREEN);
			} else {
				namefil1.setBackground(Color.RED);
			}
			// Surnames.
			if (surnames.contains(last) && letter.equals(lastArr[0].toLowerCase())) {
				if (last.equals(cliLast)) {
					lastfil1.setBackground(Color.YELLOW);
				} else
					lastfil1.setBackground(Color.GREEN);
			} else {
				lastfil1.setBackground(Color.RED);
			}
			// countries.
			if (countries.contains(con) && letter.equals(conArr[0].toLowerCase())) {
				if (con.equals(cliCon)) {
					counfil1.setBackground(Color.YELLOW);
				} else
					counfil1.setBackground(Color.GREEN);
			} else {
				counfil1.setBackground(Color.RED);
			}
			// animals.
			if (animals.contains(ani) && letter.equals(aniArr[0].toLowerCase())) {
				if (ani.equals(cliAni)) {
					anifil1.setBackground(Color.YELLOW);
				} else
					anifil1.setBackground(Color.GREEN);
			} else {
				anifil1.setBackground(Color.RED);
			}
			// fruits.
			if (fruits.contains(fru) && letter.equals(fruArr[0].toLowerCase())) {
				if (fru.equals(cliFru)) {
					fruifil1.setBackground(Color.YELLOW);
				} else
					fruifil1.setBackground(Color.GREEN);
			} else {
				fruifil1.setBackground(Color.RED);
			}
		} else if (round == 2) {
			name = namefil2.getText().toString().replaceAll(" ", "_");
			last = lastfil2.getText().toString().replaceAll(" ", "_");
			con = counfil2.getText().toString().replaceAll(" ", "_");
			ani = anifil2.getText().toString().replaceAll(" ", "_");
			fru = fruifil2.getText().toString().replaceAll(" ", "_");
			String letter = lettfil2.getText().toString();
			String[] nameArr = namefil2.getText().toString().split("");
			String[] lastArr = lastfil2.getText().toString().split("");
			String[] conArr = counfil2.getText().toString().split("");
			String[] aniArr = anifil2.getText().toString().split("");
			String[] fruArr = fruifil2.getText().toString().split("");
			// Names.
			if (names.contains(name) && letter.equals(nameArr[0].toLowerCase())) {
				if (name.equals(cliName)) {
					namefil2.setBackground(Color.YELLOW);
				} else
					namefil2.setBackground(Color.GREEN);
			} else {
				namefil2.setBackground(Color.RED);
			}
			// Surnames.
			if (surnames.contains(last) && letter.equals(lastArr[0].toLowerCase())) {
				if (last.equals(cliLast)) {
					lastfil2.setBackground(Color.YELLOW);
				} else
					lastfil2.setBackground(Color.GREEN);
			} else {
				lastfil2.setBackground(Color.RED);
			}
			// countries.
			if (countries.contains(con) && letter.equals(conArr[0].toLowerCase())) {
				if (con.equals(cliCon)) {
					counfil2.setBackground(Color.YELLOW);
				} else
					counfil2.setBackground(Color.GREEN);
			} else {
				counfil2.setBackground(Color.RED);
			}
			// animals.
			if (animals.contains(ani) && letter.equals(aniArr[0].toLowerCase())) {
				if (ani.equals(cliAni)) {
					anifil2.setBackground(Color.YELLOW);
				} else
					anifil2.setBackground(Color.GREEN);
			} else {
				anifil2.setBackground(Color.RED);
			}
			// fruits.
			if (fruits.contains(fru) && letter.equals(fruArr[0].toLowerCase())) {
				if (fru.equals(cliFru)) {
					fruifil2.setBackground(Color.YELLOW);
				} else
					fruifil2.setBackground(Color.GREEN);
			} else {
				fruifil2.setBackground(Color.RED);
			}
		} else if (round == 3) {
			name = namefil3.getText().toString().replaceAll(" ", "_");
			last = lastfil3.getText().toString().replaceAll(" ", "_");
			con = counfil3.getText().toString().replaceAll(" ", "_");
			ani = anifil3.getText().toString().replaceAll(" ", "_");
			fru = fruifil3.getText().toString().replaceAll(" ", "_");
			String letter = lettfil3.getText().toString();
			String[] nameArr = namefil3.getText().toString().split("");
			String[] lastArr = lastfil3.getText().toString().split("");
			String[] conArr = counfil3.getText().toString().split("");
			String[] aniArr = anifil3.getText().toString().split("");
			String[] fruArr = fruifil3.getText().toString().split("");
			// Names.
			if (names.contains(name) && letter.equals(nameArr[0].toLowerCase())) {
				if (name.equals(cliName)) {
					namefil3.setBackground(Color.YELLOW);
				} else
					namefil3.setBackground(Color.GREEN);
			} else {
				namefil3.setBackground(Color.RED);
			}
			// Surnames.
			if (surnames.contains(last) && letter.equals(lastArr[0].toLowerCase())) {
				if (last.equals(cliLast)) {
					lastfil3.setBackground(Color.YELLOW);
				} else
					lastfil3.setBackground(Color.GREEN);
			} else {
				lastfil3.setBackground(Color.RED);
			}
			// countries.
			if (countries.contains(con) && letter.equals(conArr[0].toLowerCase())) {
				if (con.equals(cliCon)) {
					counfil3.setBackground(Color.YELLOW);
				} else
					counfil3.setBackground(Color.GREEN);
			} else {
				counfil3.setBackground(Color.RED);
			}
			// animals.
			if (animals.contains(ani) && letter.equals(aniArr[0].toLowerCase())) {
				if (ani.equals(cliAni)) {
					anifil3.setBackground(Color.YELLOW);
				} else
					anifil3.setBackground(Color.GREEN);
			} else {
				anifil3.setBackground(Color.RED);
			}
			// fruits.
			if (fruits.contains(fru) && letter.equals(fruArr[0].toLowerCase())) {
				if (fru.equals(cliFru)) {
					fruifil3.setBackground(Color.YELLOW);
				} else
					fruifil3.setBackground(Color.GREEN);
			} else {
				fruifil3.setBackground(Color.RED);
			}
		} else if (round == 4) {
			name = namefil4.getText().toString().replaceAll(" ", "_");
			last = lastfil4.getText().toString().replaceAll(" ", "_");
			con = counfil4.getText().toString().replaceAll(" ", "_");
			ani = anifil4.getText().toString().replaceAll(" ", "_");
			fru = fruifil4.getText().toString().replaceAll(" ", "_");
			String letter = lettfil4.getText().toString();
			String[] nameArr = namefil4.getText().toString().split("");
			String[] lastArr = lastfil4.getText().toString().split("");
			String[] conArr = counfil4.getText().toString().split("");
			String[] aniArr = anifil4.getText().toString().split("");
			String[] fruArr = fruifil4.getText().toString().split("");
			// Names.
			if (names.contains(name) && letter.equals(nameArr[0].toLowerCase())) {
				if (name.equals(cliName)) {
					namefil4.setBackground(Color.YELLOW);
				} else
					namefil4.setBackground(Color.GREEN);
			} else {
				namefil4.setBackground(Color.RED);
			}
			// Surnames.
			if (surnames.contains(last) && letter.equals(lastArr[0].toLowerCase())) {
				if (last.equals(cliLast)) {
					lastfil4.setBackground(Color.YELLOW);
				} else
					lastfil4.setBackground(Color.GREEN);
			} else {
				lastfil4.setBackground(Color.RED);
			}
			// countries.
			if (countries.contains(con) && letter.equals(conArr[0].toLowerCase())) {
				if (con.equals(cliCon)) {
					counfil4.setBackground(Color.YELLOW);
				} else
					counfil4.setBackground(Color.GREEN);
			} else {
				counfil4.setBackground(Color.RED);
			}
			// animals.
			if (animals.contains(ani) && letter.equals(aniArr[0].toLowerCase())) {
				if (ani.equals(cliAni)) {
					anifil4.setBackground(Color.YELLOW);
				} else
					anifil4.setBackground(Color.GREEN);
			} else {
				anifil4.setBackground(Color.RED);
			}
			// fruits.
			if (fruits.contains(fru) && letter.equals(fruArr[0].toLowerCase())) {
				if (fru.equals(cliFru)) {
					fruifil4.setBackground(Color.YELLOW);
				} else
					fruifil4.setBackground(Color.GREEN);
			} else {
				fruifil4.setBackground(Color.RED);
			}
		} else if (round == 5) {
			name = namefil5.getText().toString().replaceAll(" ", "_");
			last = lastfil5.getText().toString().replaceAll(" ", "_");
			con = counfil5.getText().toString().replaceAll(" ", "_");
			ani = anifil5.getText().toString().replaceAll(" ", "_");
			fru = fruifil5.getText().toString().replaceAll(" ", "_");
			String letter = lettfil5.getText().toString();
			String[] nameArr = namefil5.getText().toString().split("");
			String[] lastArr = lastfil5.getText().toString().split("");
			String[] conArr = counfil5.getText().toString().split("");
			String[] aniArr = anifil5.getText().toString().split("");
			String[] fruArr = fruifil5.getText().toString().split("");
			// Names.
			if (names.contains(name) && letter.equals(nameArr[0].toLowerCase())) {
				if (name.equals(cliName)) {
					namefil5.setBackground(Color.YELLOW);
				} else
					namefil5.setBackground(Color.GREEN);
			} else {
				namefil5.setBackground(Color.RED);
			}
			// Surnames.
			if (surnames.contains(last) && letter.equals(lastArr[0].toLowerCase())) {
				if (last.equals(cliLast)) {
					lastfil5.setBackground(Color.YELLOW);
				} else
					lastfil5.setBackground(Color.GREEN);
			} else {
				lastfil5.setBackground(Color.RED);
			}
			// countries.
			if (countries.contains(con) && letter.equals(conArr[0].toLowerCase())) {
				if (con.equals(cliCon)) {
					counfil5.setBackground(Color.YELLOW);
				} else
					counfil5.setBackground(Color.GREEN);
			} else {
				counfil5.setBackground(Color.RED);
			}
			// animals.
			if (animals.contains(ani) && letter.equals(aniArr[0].toLowerCase())) {
				if (ani.equals(cliAni)) {
					anifil5.setBackground(Color.YELLOW);
				} else
					anifil5.setBackground(Color.GREEN);
			} else {
				anifil5.setBackground(Color.RED);
			}
			// fruits.
			if (fruits.contains(fru) && letter.equals(fruArr[0].toLowerCase())) {
				if (fru.equals(cliFru)) {
					fruifil5.setBackground(Color.YELLOW);
				} else
					fruifil5.setBackground(Color.GREEN);
			} else {
				fruifil5.setBackground(Color.RED);
			}
		}
	}

	// if user can stop game in every round.
	// ands inputs points.
	public static boolean stopCheck(int n) {
		String name = "";
		String last = "";
		String con = "";
		String ani = "";
		String fru = "";
		if (round == 1) {
			name = namefil1.getBackground().getRed() + "" + namefil1.getBackground().getGreen() + ""
					+ namefil1.getBackground().getBlue();
			last = lastfil1.getBackground().getRed() + "" + lastfil1.getBackground().getGreen() + ""
					+ lastfil1.getBackground().getBlue();
			con = counfil1.getBackground().getRed() + "" + counfil1.getBackground().getGreen() + ""
					+ counfil1.getBackground().getBlue();
			ani = anifil1.getBackground().getRed() + "" + anifil1.getBackground().getGreen() + ""
					+ anifil1.getBackground().getBlue();
			fru = fruifil1.getBackground().getRed() + "" + fruifil1.getBackground().getGreen() + ""
					+ fruifil1.getBackground().getBlue();
			// if it finds green.
			if (name.equals("02550")) {
				point1 += 10;
			}
			if (last.equals("02550")) {
				point1 += 10;
			}
			if (con.equals("02550")) {
				point1 += 10;
			}
			if (ani.equals("02550")) {
				point1 += 10;
			}
			if (fru.equals("02550")) {
				point1 += 10;
			}
			// if it finds yellow.
			if (name.equals("2552550")) {
				point1 += 5;
			}
			if (last.equals("2552550")) {
				point1 += 5;
			}
			if (con.equals("2552550")) {
				point1 += 5;
			}
			if (ani.equals("2552550")) {
				point1 += 5;
			}
			if (fru.equals("2552550")) {
				point1 += 5;
			}
			// if users time has ended.
			if (n == 0) {
				pointfil1.setText(point1 + "");
			}
		}
		if (round == 2) {
			name = namefil2.getBackground().getRed() + "" + namefil2.getBackground().getGreen() + ""
					+ namefil2.getBackground().getBlue();
			last = lastfil2.getBackground().getRed() + "" + lastfil2.getBackground().getGreen() + ""
					+ lastfil2.getBackground().getBlue();
			con = counfil2.getBackground().getRed() + "" + counfil2.getBackground().getGreen() + ""
					+ counfil2.getBackground().getBlue();
			ani = anifil2.getBackground().getRed() + "" + anifil2.getBackground().getGreen() + ""
					+ anifil2.getBackground().getBlue();
			fru = fruifil2.getBackground().getRed() + "" + fruifil2.getBackground().getGreen() + ""
					+ fruifil2.getBackground().getBlue();
			// if it finds green.
			if (name.equals("02550")) {
				point2 += 10;
			}
			if (last.equals("02550")) {
				point2 += 10;
			}
			if (con.equals("02550")) {
				point2 += 10;
			}
			if (ani.equals("02550")) {
				point2 += 10;
			}
			if (fru.equals("02550")) {
				point2 += 10;
			}
			// if it finds yellow.
			if (name.equals("2552550")) {
				point2 += 5;
			}
			if (last.equals("2552550")) {
				point2 += 5;
			}
			if (con.equals("2552550")) {
				point2 += 5;
			}
			if (ani.equals("2552550")) {
				point2 += 5;
			}
			if (fru.equals("2552550")) {
				point2 += 5;
			}
			// if users time has ended.
			if (n == 0) {
				pointfil2.setText(point2 + "");
			}
		}
		if (round == 3) {
			name = namefil3.getBackground().getRed() + "" + namefil3.getBackground().getGreen() + ""
					+ namefil3.getBackground().getBlue();
			last = lastfil3.getBackground().getRed() + "" + lastfil3.getBackground().getGreen() + ""
					+ lastfil3.getBackground().getBlue();
			con = counfil3.getBackground().getRed() + "" + counfil3.getBackground().getGreen() + ""
					+ counfil3.getBackground().getBlue();
			ani = anifil3.getBackground().getRed() + "" + anifil3.getBackground().getGreen() + ""
					+ anifil3.getBackground().getBlue();
			fru = fruifil3.getBackground().getRed() + "" + fruifil3.getBackground().getGreen() + ""
					+ fruifil3.getBackground().getBlue();
			// if it finds green.
			if (name.equals("02550")) {
				point3 += 10;
			}
			if (last.equals("02550")) {
				point3 += 10;
			}
			if (con.equals("02550")) {
				point3 += 10;
			}
			if (ani.equals("02550")) {
				point3 += 10;
			}
			if (fru.equals("02550")) {
				point3 += 10;
			}
			// if it finds yellow.
			if (name.equals("2552550")) {
				point3 += 5;
			}
			if (last.equals("2552550")) {
				point3 += 5;
			}
			if (con.equals("2552550")) {
				point3 += 5;
			}
			if (ani.equals("2552550")) {
				point3 += 5;
			}
			if (fru.equals("2552550")) {
				point3 += 5;
			}
			// if users time has ended.
			if (n == 0) {
				pointfil3.setText(point3 + "");
			}
		}
		if (round == 4) {
			name = namefil4.getBackground().getRed() + "" + namefil4.getBackground().getGreen() + ""
					+ namefil4.getBackground().getBlue();
			last = lastfil4.getBackground().getRed() + "" + lastfil4.getBackground().getGreen() + ""
					+ lastfil4.getBackground().getBlue();
			con = counfil4.getBackground().getRed() + "" + counfil4.getBackground().getGreen() + ""
					+ counfil4.getBackground().getBlue();
			ani = anifil4.getBackground().getRed() + "" + anifil4.getBackground().getGreen() + ""
					+ anifil4.getBackground().getBlue();
			fru = fruifil4.getBackground().getRed() + "" + fruifil4.getBackground().getGreen() + ""
					+ fruifil4.getBackground().getBlue();
			// if it finds green.
			if (name.equals("02550")) {
				point4 += 10;
			}
			if (last.equals("02550")) {
				point4 += 10;
			}
			if (con.equals("02550")) {
				point4 += 10;
			}
			if (ani.equals("02550")) {
				point4 += 10;
			}
			if (fru.equals("02550")) {
				point4 += 10;
			}
			// if it finds yellow.
			if (name.equals("2552550")) {
				point4 += 5;
			}
			if (last.equals("2552550")) {
				point4 += 5;
			}
			if (con.equals("2552550")) {
				point4 += 5;
			}
			if (ani.equals("2552550")) {
				point4 += 5;
			}
			if (fru.equals("2552550")) {
				point4 += 5;
			}
			// if users time has ended.
			if (n == 0) {
				pointfil4.setText(point4 + "");
			}
		}
		if (round == 5) {
			name = namefil5.getBackground().getRed() + "" + namefil5.getBackground().getGreen() + ""
					+ namefil5.getBackground().getBlue();
			last = lastfil5.getBackground().getRed() + "" + lastfil5.getBackground().getGreen() + ""
					+ lastfil5.getBackground().getBlue();
			con = counfil5.getBackground().getRed() + "" + counfil5.getBackground().getGreen() + ""
					+ counfil5.getBackground().getBlue();
			ani = anifil5.getBackground().getRed() + "" + anifil5.getBackground().getGreen() + ""
					+ anifil5.getBackground().getBlue();
			fru = fruifil5.getBackground().getRed() + "" + fruifil5.getBackground().getGreen() + ""
					+ fruifil5.getBackground().getBlue();
			// if it finds green.
			if (name.equals("02550")) {
				point5 += 10;
			}
			if (last.equals("02550")) {
				point5 += 10;
			}
			if (con.equals("02550")) {
				point5 += 10;
			}
			if (ani.equals("02550")) {
				point5 += 10;
			}
			if (fru.equals("02550")) {
				point5 += 10;
			}
			// if it finds yellow.
			if (name.equals("2552550")) {
				point5 += 5;
			}
			if (last.equals("2552550")) {
				point5 += 5;
			}
			if (con.equals("2552550")) {
				point5 += 5;
			}
			if (ani.equals("2552550")) {
				point5 += 5;
			}
			if (fru.equals("2552550")) {
				point5 += 5;
			}
			// if users time has ended.
			if (n == 0) {
				pointfil5.setText(point5 + "");
			}
		}
		// if its not red and light gray its correct and user can stop the game.
		if (!name.equals("25500") && !last.equals("25500") && !con.equals("25500") && !ani.equals("25500")
				&& !fru.equals("25500") && !name.equals("192192192") && !last.equals("192192192")
				&& !con.equals("192192192") && !ani.equals("192192192") && !fru.equals("192192192")) {
			return true;
		}
		return false;
	}

	public static void send(String txt, int soc) throws Exception {
		(new Thread() {
			@Override
			public void run() {
				try {
					obj = new ServerSocket(soc);
					socket = obj.accept();
				} catch (IOException e1) {
				}

				try {
					input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
					output = new PrintWriter(socket.getOutputStream(), true);
					output.println(txt);
					output.flush();
					output.close();
					input.close();
				} catch (IOException e) {
				} finally {
					try {
						obj.close();
						socket.close();
					} catch (IOException e) {
					}
				}
			}
		}).start();
	}

	public static void get(int port) {
		try {
			socket2 = new Socket("127.0.0.1", port);
			in = new BufferedReader(new InputStreamReader(socket2.getInputStream()));
			out = new PrintWriter(socket2.getOutputStream(), true);
			String ans;
			while (true) {
				ans = in.readLine();
				System.out.println(ans);
				in.close();
				out.close();
				break;
			}
		} catch (IOException e) {

		} finally {
			try {
				socket2.close();
			} catch (IOException e) {
			}
		}
	}

	public static void endOfGame(int E) throws Exception {
		// setting the colors.
		color();
		// inputting points.
		stopCheck(1);
		// time runs out.
		if (E == 0) {
			if (round < 5) {
				// showing record and informing of end of round.
				JOptionPane.showMessageDialog(null, "ROUND (" + round + ") OVER!\n", "THAKS FOR PLAYING.",
						JOptionPane.INFORMATION_MESSAGE, null);
			}
			// setting the points.
			stopCheck(0);
			round++;
			// Setting the random letter.
			ran(round);
			if (round == 2) {
				// Function.send(lettfil2.getText().toString(), 1232);
			}
			// disabling the round played.
			dis(round);
			// Resisting timer each new game.
			timer = 180;
			if (round < 6) {
				// setting text on stop button.
				btnStop.setText("STOP ROUND (" + round + ")");
			}

			// end of all rounds.
			if (round == 6) {
				// ending the timer.
				gameStarted = false;
				// writing user data in text.
				PrintWriter write = null;
				try {
					write = new PrintWriter(new FileOutputStream("Data.txt", true));
					// writing users path to picture, "name surname" and users "rank" in a text
					// file.
					write.println("," + name.replaceAll(" ", "_") + "," + numWin + "," + numLost + "");
				} catch (Exception e) {
				}
				write.close();
				// inputting text file to text area.
				inputData();
				// Disabling the game tab.
				tabbedPane.setEnabledAt(1, false);
				// Disabling the stop in game tab button.
				btnStop.setEnabled(false);
				// showing record and informing of end of game.
				JOptionPane.showMessageDialog(null,
						"GAME OVER!\nYOUR WINS & LOSSES ARE: (" + numWin + " & " + numLost + ")", "THAKS FOR PLAYING.",
						JOptionPane.INFORMATION_MESSAGE, null);
				// disabling all text fields.
				dis(0);
				// Enabling the profile tab & the enter bottom.
				btnEnter.setEnabled(true);
				tabbedPane.setEnabledAt(0, true);
			}
		}

		// if stop button is used.
		if (E == 1) {
			if (stopCheck(1)) {
				if (round < 5) {
					// showing record and informing of end of round.
					JOptionPane.showMessageDialog(null, "ROUND (" + round + ") OVER!\n", "THAKS FOR PLAYING.",
							JOptionPane.INFORMATION_MESSAGE, null);
				}
				// inputting points.
				stopCheck(0);
				round++;
				// Setting the random letter.
				ran(round);
				// disabling the round played.
				dis(round);
				// Resisting timer each new game.
				timer = 180;
				if (round < 6) {
					// setting text on stop button.
					btnStop.setText("STOP ROUND (" + round + ")");
				}

				// end of all rounds.
				if (round == 6) {
					// ending the timer.
					gameStarted = false;
					// writing user data in text.
					PrintWriter write = null;
					try {
						write = new PrintWriter(new FileOutputStream("Data.txt", true));
						// writing users path to picture, "name surname" and users "rank" in a text
						// file.
						write.println("," + name.replaceAll(" ", "_") + "," + numWin + "," + numLost + "");
					} catch (Exception e) {
					}
					write.close();
					// inputting text file.
					inputData();
					// Disabling the game tab.
					tabbedPane.setEnabledAt(1, false);
					// Disabling the stop in game tab button.
					btnStop.setEnabled(false);
					// showing record and informing of end of game.
					JOptionPane.showMessageDialog(null,
							"GAME OVER!\nYOUR WINS & LOSSES ARE: (" + numWin + " & " + numLost + ")",
							"THAKS FOR PLAYING.", JOptionPane.INFORMATION_MESSAGE, null);
					// disabling all text fields.
					dis(0);
					// Enabling the profile tab & the enter bottom.
					btnEnter.setEnabled(true);
					tabbedPane.setEnabledAt(0, true);
				}
			} else {
				if (round == 1) {
					JOptionPane.showMessageDialog(null, "You must fill all the fields correctly.", "Error",
							JOptionPane.ERROR_MESSAGE, null);
					namefil1.setBackground(Color.LIGHT_GRAY);
					lastfil1.setBackground(Color.LIGHT_GRAY);
					counfil1.setBackground(Color.LIGHT_GRAY);
					anifil1.setBackground(Color.LIGHT_GRAY);
					fruifil1.setBackground(Color.LIGHT_GRAY);
				} else if (round == 2) {
					namefil2.setBackground(Color.LIGHT_GRAY);
					lastfil2.setBackground(Color.LIGHT_GRAY);
					counfil2.setBackground(Color.LIGHT_GRAY);
					anifil2.setBackground(Color.LIGHT_GRAY);
					fruifil2.setBackground(Color.LIGHT_GRAY);
				} else if (round == 3) {
					namefil3.setBackground(Color.LIGHT_GRAY);
					lastfil3.setBackground(Color.LIGHT_GRAY);
					counfil3.setBackground(Color.LIGHT_GRAY);
					anifil3.setBackground(Color.LIGHT_GRAY);
					fruifil3.setBackground(Color.LIGHT_GRAY);
				} else if (round == 4) {
					namefil4.setBackground(Color.LIGHT_GRAY);
					lastfil4.setBackground(Color.LIGHT_GRAY);
					counfil4.setBackground(Color.LIGHT_GRAY);
					anifil4.setBackground(Color.LIGHT_GRAY);
					fruifil4.setBackground(Color.LIGHT_GRAY);
				} else if (round == 5) {
					namefil5.setBackground(Color.LIGHT_GRAY);
					lastfil5.setBackground(Color.LIGHT_GRAY);
					counfil5.setBackground(Color.LIGHT_GRAY);
					anifil5.setBackground(Color.LIGHT_GRAY);
					fruifil5.setBackground(Color.LIGHT_GRAY);
				}
				// TODO REPLACE LOCTION
			}
		}
	}
}
