package ir.ac.guilan.ce.ap97.Hendiani.Function;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Label;
import java.awt.LayoutManager;
import java.awt.List;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.Duration;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.TimeZone;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import ir.ac.guilan.ce.ap97.Hendiani.Gui.Lists.Lists;
import ir.ac.guilan.ce.ap97.Hendiani.Gui.Login.Login;
import ir.ac.guilan.ce.ap97.Hendiani.Gui.OfflineGame.OfflineGame;
import ir.ac.guilan.ce.ap97.Hendiani.Gui.Profile.Profile;
import ir.ac.guilan.ce.ap97.Hendiani.Gui.StartGame.StartOffline;

public class Function {

	public static boolean writingEnded = false;
	public static String off = "";
	public static String on = "";
	public static Double s;

	// name search.
	public static String setTheNames(Double score) {
		return (Login.names.get(Login.scores.indexOf(score))+"("+score+")");
	}

	// calculate score.
	public static void score(int won) {
		try {
			int w = 1;
			if (won == 0)
				w = 1;
			else
				w = 4;
			s = Math.abs((Math.pow((StartOffline.enemy-emptyPositions.size()), w))
					/ (OfflineGame.timer + (Math.log(OfflineGame.totalNumBomb) / Math.log(2))));

			// Reseting score lists.
			Lists.Scores.clear();
			Lists.Offlines.clear();
			Lists.Onlines.clear();
			// reading from data base in lists.
			// "lost in offline"_"won in offline"-"lost in online"_"won in online" =
			// (0_0-0_0).
			for (int i = 0; i < Login.scores.size(); i++) {
				off = "";
				on = "";
				String[] temp = Login.scores.get(i).split("-");
				temp[0] += ("_" + s);
				String[] t = temp[0].split("");
				String[] m = temp[1].split("");
				for (int j = 0; j < t.length; j++) {
					off += t[j];
				}
				for (int j = 0; j < m.length; j++) {
					on += m[j];
				}
				// setting data to text area.
				String[] offline = temp[0].split("_");
				String[] online = temp[1].split("_");
				for (int j = 0; j < offline.length; j++) {
					Lists.Offlines.add(Double.parseDouble(offline[j]));
					Lists.Scores.add(Double.parseDouble(offline[j]));
				}
				for (int j = 0; j < online.length; j++) {
					Lists.Onlines.add(Double.parseDouble(online[j]));
					Lists.Scores.add(Double.parseDouble(online[j]));
				}
				// setting to array list.
				Login.scores.set(Login.getPositionInList(), (off + "-" + on));
				clearDatabase();
			}
		} catch (NumberFormatException e) {
		}
	}

	// getting random.
	public static int ran(int min, int max) {
		return (int) (Math.random() * (max + 1) + min);
	}

	// entering user data.
	public static void writeDatabase(String data) {
		PrintWriter write = null;
		try {
			write = new PrintWriter(new FileOutputStream("Data.txt", true));
			write.println(data);
			write.flush();
		} catch (Exception e) {
		}
		write.close();
	}

	// setting users data to array list.
	public static void addList() {
		Login.usernames.clear();
		Login.passwords.clear();
		Login.names.clear();
		Login.emails.clear();
		Login.genders.clear();
		Login.pictures.clear();
		Login.scores.clear();
		Login.userData.clear();

		Scanner scan = null;
		try {
			scan = new Scanner(new File("Data.txt"));
		} catch (Exception e) {
		}

		try {
			// reading.
			while (scan.hasNext()) {
				String[] temp = scan.next().split(",");
				Login.usernames.add(temp[0]);
				Login.passwords.add(temp[1]);
				Login.names.add(temp[2]);
				Login.emails.add(temp[3]);
				Login.genders.add(temp[4]);
				Login.pictures.add(temp[5]);
				Login.scores.add(temp[6]);
				Login.userData.add(temp[0] + "," + temp[1] + "," + temp[2] + "," + temp[3] + "," + temp[4] + ","
						+ temp[5] + "," + temp[6]);
			}
			scan.close();
		} catch (Exception e) {
		}
	}

	// reseting database and setting the edited userdata.
	public static void clearDatabase() {
		PrintWriter write = null;
		try {
			write = new PrintWriter(new FileOutputStream("Data.txt", false));
			write.print("");
		} catch (Exception e) {
		}
		write.close();

		Login.userData.clear();
		for (int i = 0; i < Login.usernames.size(); i++) {
			Login.userData.add(Login.usernames.get(i) + "," + Login.passwords.get(i) + "," + Login.names.get(i) + ","
					+ Login.emails.get(i) + "," + Login.genders.get(i) + "," + Login.pictures.get(i) + ","
					+ Login.scores.get(i));
			writeDatabase(Login.userData.get(i));
		}
	}

	// adding one more to array list and add to data base.
	public static void addList(String user, String pass, String name, String email, String gen, String pic,
			String score, String data) {
		// this is for sign up.
		Login.usernames.add(user);
		Login.passwords.add(pass);
		Login.names.add(name);
		Login.emails.add(email);
		Login.genders.add(gen);
		Login.pictures.add(pic);
		Login.scores.add(score);
		Login.userData.add(data);
	}

	// set statistic to lists.
	public static void setStatistic() {
		// Reseting score lists.
		Lists.Scores.clear();
		Lists.Offlines.clear();
		Lists.Onlines.clear();
		// reading from data base in lists.
		// "lost in offline"_"won in offline"-"lost in online"_"won in online" =
		// (0_0-0_0).
		for (int i = 0; i < Login.scores.size(); i++) {
			String off = "";
			String on = "";
			try {
				String[] temp = Login.scores.get(i).split("-");
				// setting data to text area.
				String[] offline = temp[0].split("_");
				String[] online = temp[1].split("_");
				for (int j = 0; j < offline.length; j++) {
					Lists.Offlines.add(Double.parseDouble(offline[j]));
					Lists.Scores.add(Double.parseDouble(offline[j]));
				}
				for (int j = 0; j < online.length; j++) {
					Lists.Onlines.add(Double.parseDouble(online[j]));
					Lists.Scores.add(Double.parseDouble(online[j]));
				}
			} catch (Exception e) {
			}
		}
	}

	public static int rowNum = 17;
	public static int columnNum = 19;
	public static String[][] orgianlMap = new String[rowNum][columnNum];
	public static String[][] map = new String[rowNum][columnNum];
	public static ArrayList<String> rows = new ArrayList<>();
	public static ArrayList<String> blockPositions = new ArrayList<>();
	public static ArrayList<String> emptyPositions = new ArrayList<>();
	public static ArrayList<String> userPositions = new ArrayList<>();
	public static ArrayList<String> enemyPositions = new ArrayList<>();
	public static ArrayList<String> boxPositions = new ArrayList<>();
	public static ArrayList<String> hartPositions = new ArrayList<>();
	public static ArrayList<String> starPositions = new ArrayList<>();
	public static ArrayList<String> bombPositions = new ArrayList<>();
	public static ArrayList<String> explosionPositions = new ArrayList<>();

	// getting the default map.
	public static void getDefaltMap() {
		// clearing all lists.
		rows.clear();
		blockPositions.clear();
		emptyPositions.clear();
		userPositions.clear();
		enemyPositions.clear();
		boxPositions.clear();
		hartPositions.clear();
		starPositions.clear();
		bombPositions.clear();
		explosionPositions.clear();

		Scanner scan = null;
		try {
			scan = new Scanner(new File("Map.txt"));
		} catch (Exception e) {
		}

		try {
			// reading.
			while (scan.hasNext()) {
				rows.add(scan.next());
			}
			scan.close();
		} catch (Exception e) {
		}

		for (int i = 0; i < rows.size(); i++) {
			String[] column = rows.get(i).split("");
			for (int j = 0; j < column.length; j++) {

				map[i][j] = column[j];
				// orgianlMap[i][j] = column[j];

				if (column[j].equals("#")) {
					// block.
					blockPositions.add(i + "-" + j);
				} else if (column[j].equals("_")) {
					// empty.
					emptyPositions.add(i + "-" + j);
				} else if (column[j].equals("*")) {
					// user.
					userPositions.add(i + "-" + j);
				} else if (column[j].equals("^")) {
					// enemy.
					enemyPositions.add(i + "-" + j);
				} else if (column[j].equals("0")) {
					// box.
					boxPositions.add(i + "-" + j);
				} else if (column[j].equals("+")) {
					// hart
					hartPositions.add(i + "-" + j);
				} else if (column[j].equals("$")) {
					// star
					starPositions.add(i + "-" + j);
				} else if (column[j].equals("@")) {
					// bomb.
					bombPositions.add(i + "-" + j);
				} else if (column[j].equals("?")) {
					// explosion.
					explosionPositions.add(i + "-" + j);
				} else {
					System.out.println("unknown found!!!");
				}
			}
		}
	}

	// setting a random items.
	public static void setItems(int numberItem, int choose) {
		try {
			for (int i = 0; i < numberItem; i++) {
				int aRanPosition = ran(0, emptyPositions.size());
				String[] temp = emptyPositions.get(aRanPosition).split("-");
				// skip the first 3 rows.
				while (((temp[0] + "").equals("1")) || ((temp[0] + "").equals("2")) || ((temp[0] + "").equals("3"))) {
					aRanPosition = ran(0, emptyPositions.size());
					temp = emptyPositions.get(aRanPosition).split("-");
				}

				if (choose == 1) { // box.
					// setting data.
					map[Integer.parseInt(temp[0])][Integer.parseInt(temp[1])] = "0";
					// Correcting data.
					emptyPositions.remove(aRanPosition);
					enemyPositions.add(temp[0] + "-" + temp[1]);
				} else if (choose == 2) { // enemy.
					// setting data.
					map[Integer.parseInt(temp[0])][Integer.parseInt(temp[1])] = "^";
					// Correcting data.
					emptyPositions.remove(aRanPosition);
					enemyPositions.add(temp[0] + "-" + temp[1]);
				} else if (choose == 3) { // hart.
					// setting data.
					map[Integer.parseInt(temp[0])][Integer.parseInt(temp[1])] = "+";
					// Correcting data.
					emptyPositions.remove(aRanPosition);
					hartPositions.add(temp[0] + "-" + temp[1]);
				} else if (choose == 4) { // star.
					// setting data.
					map[Integer.parseInt(temp[0])][Integer.parseInt(temp[1])] = "$";
					// Correcting data.
					emptyPositions.remove(aRanPosition);
					starPositions.add(temp[0] + "-" + temp[1]);
				}
			}
			// Correcting data.
			rows.clear();
			String a = "";
			for (int i = 0; i < rowNum; i++) {
				for (int j = 0; j < columnNum; j++) {
					a += map[i][j];
				}
				rows.add(a);
				a = "";
			}
		} catch (Exception e) {
		}
	}

	// remove a hart.
	public static void removeAhart() {
		if (hartPositions.size() > 0) {
			String row = "";

			for (int i = 0; i < rowNum; i++) {
				for (int j = 0; j < columnNum; j++) {
					if (map[i][j].equals("+")) {
						map[i][j] = "_";
					}
				}
			}

			// clearing all lists.
			rows.clear();
			blockPositions.clear();
			emptyPositions.clear();
			userPositions.clear();
			enemyPositions.clear();
			boxPositions.clear();
			hartPositions.clear();
			starPositions.clear();
			bombPositions.clear();
			explosionPositions.clear();

			// resetting data.
			for (int i = 0; i < rowNum; i++) {
				for (int j = 0; j < columnNum; j++) {

					row += map[i][j];

					if (map[i][j].equals("#")) {
						// block.
						blockPositions.add(i + "-" + j);
					} else if (map[i][j].equals("_")) {
						// empty.
						emptyPositions.add(i + "-" + j);
					} else if (map[i][j].equals("*")) {
						// user.
						userPositions.add(i + "-" + j);
					} else if (map[i][j].equals("^")) {
						// enemy.
						enemyPositions.add(i + "-" + j);
					} else if (map[i][j].equals("0")) {
						// box.
						boxPositions.add(i + "-" + j);
					} else if (map[i][j].equals("+")) {
						// hart
						hartPositions.add(i + "-" + j);
					} else if (map[i][j].equals("$")) {
						// star
						starPositions.add(i + "-" + j);
					} else if (map[i][j].equals("@")) {
						// bomb.
						bombPositions.add(i + "-" + j);
					} else if (map[i][j].equals("?")) {
						// explosion.
						explosionPositions.add(i + "-" + j);
					} else {
						System.out.println("unknown found!!!");
					}
				}
				rows.add(row);
				row = "";
			}
		} else {
			System.out.println("you dont have a hart to remove!!!");
		}
	}

	// remove a star.
	public static void removeAstar() {
		int count = 0;
		if (starPositions.size() > 0) {
			String row = "";
			for (int i = 0; i < 1; i++) {
				for (int i1 = 0; i1 < rowNum; i1++) {
					for (int j = 0; j < columnNum; j++) {
						if ((i1 + "-" + j).equals(starPositions.get(i))) {
							count++;
							if (count == 1) {
								map[i1][j] = "_";
								break;
							}
						}
					}
				}
			}

			// clearing all lists.
			rows.clear();
			blockPositions.clear();
			emptyPositions.clear();
			userPositions.clear();
			enemyPositions.clear();
			boxPositions.clear();
			hartPositions.clear();
			starPositions.clear();
			bombPositions.clear();
			explosionPositions.clear();

			// resetting data.
			for (int i11 = 0; i11 < rowNum; i11++) {
				for (int j1 = 0; j1 < columnNum; j1++) {

					row += map[i11][j1];

					if (map[i11][j1].equals("#")) {
						// block.
						blockPositions.add(i11 + "-" + j1);
					} else if (map[i11][j1].equals("_")) {
						// empty.
						emptyPositions.add(i11 + "-" + j1);
					} else if (map[i11][j1].equals("*")) {
						// user.
						userPositions.add(i11 + "-" + j1);
					} else if (map[i11][j1].equals("^")) {
						// enemy.
						enemyPositions.add(i11 + "-" + j1);
					} else if (map[i11][j1].equals("0")) {
						// box.
						boxPositions.add(i11 + "-" + j1);
					} else if (map[i11][j1].equals("+")) {
						// hart
						hartPositions.add(i11 + "-" + j1);
					} else if (map[i11][j1].equals("$")) {
						// star
						starPositions.add(i11 + "-" + j1);
					} else if (map[i11][j1].equals("@")) {
						// bomb.
						bombPositions.add(i11 + "-" + j1);
					} else if (map[i11][j1].equals("?")) {
						// explosion.
						explosionPositions.add(i11 + "-" + j1);
					} else {
						System.out.println("unknown found!!!");
					}
				}
				rows.add(row);
				row = "";
			}
		} else {
			System.out.println("you dont have a stars to remove!!!");
		}
	}

	// setting bomb.
	public static void settingItem(int x, int y, String item) {
		String row = "";
		// clearing all lists.
		rows.clear();
		blockPositions.clear();
		emptyPositions.clear();
		userPositions.clear();
		enemyPositions.clear();
		boxPositions.clear();
		hartPositions.clear();
		starPositions.clear();
		bombPositions.clear();
		explosionPositions.clear();

		// resetting data.
		for (int i = 0; i < rowNum; i++) {
			for (int j = 0; j < columnNum; j++) {

				if ((i == x) && (j == y)) {
					map[i][j] = item;
				}

				row += map[i][j];

				if (map[i][j].equals("#")) {
					// block.
					blockPositions.add(i + "-" + j);
				} else if (map[i][j].equals("_")) {
					// empty.
					emptyPositions.add(i + "-" + j);
				} else if (map[i][j].equals("*")) {
					// user.
					userPositions.add(i + "-" + j);
				} else if (map[i][j].equals("^")) {
					// enemy.
					enemyPositions.add(i + "-" + j);
				} else if (map[i][j].equals("0")) {
					// box.
					boxPositions.add(i + "-" + j);
				} else if (map[i][j].equals("+")) {
					// hart
					hartPositions.add(i + "-" + j);
				} else if (map[i][j].equals("$")) {
					// star
					starPositions.add(i + "-" + j);
				} else if (map[i][j].equals("@")) {
					// bomb.
					bombPositions.add(i + "-" + j);
				} else if (map[i][j].equals("?")) {
					// explosion.
					explosionPositions.add(i + "-" + j);
				} else {
					System.out.println("unknown found!!!");
				}
			}
			rows.add(row);
			row = "";
		}
	}

	// setting explosion and reseting ground.
	public static void explosion(int x, int y) {
		int radious = OfflineGame.bombradios;
		for (int i = 0; i < rowNum; i++) {
			for (int j = 0; j < columnNum; j++) {

				if ((i == x) && (j == y)) {
					try {
						// Checking open position for setting explosion.
						for (int j2 = 0; j2 < radious; j2++) {
							if (!map[i - j2][j].equals("#") && !map[i - j2][j].equals("*")) { // up.
								if (radious == 2) {
									map[i - j2][j] = "?";
									explosionPositions.add((i - j2) + "-" + j);
								} else if (!map[i - (j2 - 1)][j].equals("#") && !map[i - (j2 - 1)][j].equals("*"))
									// if radius is bigger not to go through wall.
									map[i - j2][j] = "?";
								else if (map[i - (j2 - 1)][j].equals("*")) {
									// map[i - j2][j] = "?";
									if (OfflineGame.currentLife == 0.5)
										OfflineGame.currentLife = 0;
									else if (OfflineGame.currentLife == 1)
										OfflineGame.currentLife = (float) 0.5;
									tempExpX = (i - (j2 - 1));
									tempExpY = (j);
									movedInExp = true;
								}
							} else if (map[i - j2][j].equals("*")) {
								if (OfflineGame.currentLife == 0.5)
									OfflineGame.currentLife = 0;
								else if (OfflineGame.currentLife == 1)
									OfflineGame.currentLife = (float) 0.5;
								tempExpX = (i - j2);
								tempExpY = (j);
								movedInExp = true;
							}

							if (!map[i + j2][j].equals("#") && !map[i + j2][j].equals("*")) { // down.
								if (radious == 2) {
									map[i + j2][j] = "?";
									explosionPositions.add((i + j2) + "-" + j);
								} else if (!map[i + (j2 - 1)][j].equals("#") && !map[i + (j2 - 1)][j].equals("*"))
									// if radius is bigger not to go through wall.
									map[i + j2][j] = "?";
								else if (map[i + (j2 - 1)][j].equals("*")) {
									// map[i + j2][j] = "?";
									if (OfflineGame.currentLife == 0.5)
										OfflineGame.currentLife = 0;
									else if (OfflineGame.currentLife == 1)
										OfflineGame.currentLife = (float) 0.5;
									tempExpX = (i + (j2 - 1));
									tempExpY = (j);
									movedInExp = true;
								}
							} else if (map[i + j2][j].equals("*")) {
								if (OfflineGame.currentLife == 0.5)
									OfflineGame.currentLife = 0;
								else if (OfflineGame.currentLife == 1)
									OfflineGame.currentLife = (float) 0.5;
								tempExpX = (i + j2);
								tempExpY = (j);
								movedInExp = true;
							}

							if (!map[i][j + j2].equals("#") && !map[i][j + j2].equals("*")) { // right.
								if (radious == 2) {
									map[i][j + j2] = "?";
									explosionPositions.add(i + "-" + (j + j2));
								} else if (!map[i][j + (j2 - 1)].equals("#") && !map[i][j + (j2 - 1)].equals("*"))
									// if radius is bigger not to go through wall.
									map[i][j + j2] = "?";
								else if (map[i][j + (j2 - 1)].equals("*")) {
									// map[i][j + j2] = "?";
									if (OfflineGame.currentLife == 0.5)
										OfflineGame.currentLife = 0;
									else if (OfflineGame.currentLife == 1)
										OfflineGame.currentLife = (float) 0.5;
									tempExpX = (i);
									tempExpY = (j + (j2 - 1));
									movedInExp = true;
								}
							} else if (map[i][j + j2].equals("*")) {
								if (OfflineGame.currentLife == 0.5)
									OfflineGame.currentLife = 0;
								else if (OfflineGame.currentLife == 1)
									OfflineGame.currentLife = (float) 0.5;
								tempExpX = (i);
								tempExpY = (j + j2);
								movedInExp = true;
							}

							if (!map[i][j - j2].equals("#") && !map[i][j - j2].equals("*")) { // left.
								if (radious == 2) {
									map[i][j - j2] = "?";
									explosionPositions.add(i + "-" + (j - j2));
								} else if (!map[i][j - (j2 - 1)].equals("#") && !map[i][j - (j2 - 1)].equals("*"))
									// if radius is bigger not to go through wall.
									map[i][j - j2] = "?";
								else if (map[i][j - (j2 - 1)].equals("*")) {
									// map[i][j - j2] = "?";
									if (OfflineGame.currentLife == 0.5)
										OfflineGame.currentLife = 0;
									else if (OfflineGame.currentLife == 1)
										OfflineGame.currentLife = (float) 0.5;
									tempExpX = (i);
									tempExpY = (j - (j2 - 1));
									movedInExp = true;
								}
							} else if (map[i][j - j2].equals("*")) {
								if (OfflineGame.currentLife == 0.5)
									OfflineGame.currentLife = 0;
								else if (OfflineGame.currentLife == 1)
									OfflineGame.currentLife = (float) 0.5;
								tempExpX = (i);
								tempExpY = (j - j2);
								movedInExp = true;
							}
						}
					} catch (Exception e) {
					}
				}
			}
		}
	}

	public static Boolean explosionIsRemoved = false;

	// Removing explosion and reseting ground.
	public static void removeExplosions() {
		explosionIsRemoved = true;
		String row = "";

		for (int i = 0; i < Function.rowNum; i++) {
			for (int j = 0; j < Function.columnNum; j++) {
				if (Function.map[i][j].equals("@")) {
					Function.map[i][j] = "_";
				}
			}
		}

		// resetting data the returning items.
		for (int i = 0; i < rowNum; i++) {
			for (int j = 0; j < columnNum; j++) {
				if (starPositions.contains(i + "-" + j) && map[i][j] == "?") {
					map[i][j] = "$";
				}
				if (hartPositions.contains(i + "-" + j) && map[i][j] == "?") {
					map[i][j] = "+";
				} else if (map[i][j] == "?" && !hartPositions.contains(i + "-" + j)
						&& !starPositions.contains(i + "-" + j)) {
					map[i][j] = "_";
				} else if (map[i][j] == "?" && explosionPositions.contains(i + "-" + j)) {
					map[i][j] = "_";
				}
			}
		}

		// clearing all lists.
		rows.clear();
		blockPositions.clear();
		emptyPositions.clear();
		userPositions.clear();
		enemyPositions.clear();
		boxPositions.clear();
		hartPositions.clear();
		starPositions.clear();
		bombPositions.clear();
		explosionPositions.clear();

		// resetting data.
		for (int i = 0; i < rowNum; i++) {
			for (int j = 0; j < columnNum; j++) {

				row += map[i][j];

				if (map[i][j].equals("#")) {
					// block.
					blockPositions.add(i + "-" + j);
				} else if (map[i][j].equals("_")) {
					// empty.
					emptyPositions.add(i + "-" + j);
				} else if (map[i][j].equals("*")) {
					// user.
					userPositions.add(i + "-" + j);
				} else if (map[i][j].equals("^")) {
					// enemy.
					enemyPositions.add(i + "-" + j);
				} else if (map[i][j].equals("0")) {
					// box.
					boxPositions.add(i + "-" + j);
				} else if (map[i][j].equals("+")) {
					// hart
					hartPositions.add(i + "-" + j);
				} else if (map[i][j].equals("$")) {
					// star
					starPositions.add(i + "-" + j);
				} else if (map[i][j].equals("@")) {
					// bomb.
					bombPositions.add(i + "-" + j);
				} else if (map[i][j].equals("?")) {
					// explosion.
					explosionPositions.add(i + "-" + j);
				} else {
					System.out.println("unknown found!!!");
				}
			}
			rows.add(row);
			row = "";
		}
	}

	private static int numberBocmbAtonce = 0;
	private static int r = 1;
	private static int t = 1;
	private static int bocmbX = 1;
	private static int bocmbY = 1;

	// Changing user position.
	public static void userPos(int x, int y) {
		String row = "";

		for (int i = 0; i < rowNum; i++) {
			for (int j = 0; j < columnNum; j++) {
				if (map[i][j].equals("*")) {
					map[i][j] = "_";
				}
			}
		}
		map[x][y] = "*";
		// clearing all lists.
		rows.clear();
		blockPositions.clear();
		emptyPositions.clear();
		userPositions.clear();
		enemyPositions.clear();
		boxPositions.clear();
		hartPositions.clear();
		starPositions.clear();
		bombPositions.clear();
		explosionPositions.clear();

		// resetting data.
		for (int i = 0; i < rowNum; i++) {
			for (int j = 0; j < columnNum; j++) {

				row += map[i][j];

				if (map[i][j].equals("#")) {
					// block.
					blockPositions.add(i + "-" + j);
				} else if (map[i][j].equals("_")) {
					// empty.
					emptyPositions.add(i + "-" + j);
				} else if (map[i][j].equals("*")) {
					// user.
					userPositions.add(i + "-" + j);
				} else if (map[i][j].equals("^")) {
					// enemy.
					enemyPositions.add(i + "-" + j);
				} else if (map[i][j].equals("0")) {
					// box.
					boxPositions.add(i + "-" + j);
				} else if (map[i][j].equals("+")) {
					// hart
					hartPositions.add(i + "-" + j);
				} else if (map[i][j].equals("$")) {
					// star
					starPositions.add(i + "-" + j);
				} else if (map[i][j].equals("@")) {
					// bomb.
					bombPositions.add(i + "-" + j);
				} else if (map[i][j].equals("?")) {
					// explosion.
					explosionPositions.add(i + "-" + j);
				} else {
					System.out.println("unknown found!!!");
				}
			}
			rows.add(row);
			row = "";
		}
	}

	public static int x = 1;
	public static int y = 1;
	public static int bombX = 1;
	public static int bombY = 1;
	private static int tempExpX = 1;
	private static int tempExpY = 1;
	private static boolean spacePressed = false;
	private static boolean movedInExp = false;
	public static int direction;

	// places user can move.
	public static void userMove(int move) {
		direction = move;
		if (explosionIsRemoved)
			removeExplosions();

		for (int i = 0; i < Function.rowNum; i++) {
			for (int j = 0; j < Function.columnNum; j++) {
				if (Function.map[i][j].equals("@")) {
					OfflineGame.bombActive = true;
				}
			}
		}

		if (move == 0) {
			// up.
			if ((!map[x - 1][y].equals("#")) && (!map[x - 1][y].equals("0"))) {
				if (!map[x - 1][y].equals("^")) {
					x -= 1;

					// System.out.println(x + "," + y);
					if (spacePressed && explosionIsRemoved) {
						settingItem(bombX, bombY, "@");
						spacePressed = false;
					}

					if (movedInExp && !explosionIsRemoved) {
						settingItem(tempExpX, tempExpY, "?");
						movedInExp = false;
					}

					// if user got item.
					if (map[x][y].equals("+") && OfflineGame.currentLife == 0.5) {
						OfflineGame.currentLife = 1;
					}
					if (map[x][y].equals("$")) {
						if (OfflineGame.starCount < 3) {
							OfflineGame.starCount += 1;
						}
					} // user hit explosion.
					if (map[x][y].equals("?")) {
						if (OfflineGame.currentLife == 0.5)
							OfflineGame.currentLife = 0;
						else if (OfflineGame.currentLife == 1)
							OfflineGame.currentLife = (float) 0.5;
						tempExpX = x;
						tempExpY = y;
						movedInExp = true;
					}
					if (map[x][y].equals("@") && explosionIsRemoved) {
						spacePressed = true;
						bombX = x;
						bombY = y;
					}
					userPos(x, y);
				} else {
					if (OfflineGame.currentLife == 0.5)
						OfflineGame.currentLife = 0;
					else if (OfflineGame.currentLife == 1)
						OfflineGame.currentLife = (float) 0.5;
				}
			}
		} else if (move == 1) {
			// down.
			if ((!map[x + 1][y].equals("#")) && (!map[x + 1][y].equals("0"))) {
				if (!map[x + 1][y].equals("^")) {
					x += 1;

					// System.out.println(x + "," + y);
					if (spacePressed) {
						settingItem(bombX, bombY, "@");
						spacePressed = false;
					}

					if (movedInExp && !explosionIsRemoved) {
						settingItem(tempExpX, tempExpY, "?");
						movedInExp = false;
					}

					// if user got item.
					if (map[x][y].equals("+") && OfflineGame.currentLife == 0.5) {
						OfflineGame.currentLife = 1;
					}
					if (map[x][y].equals("$")) {
						if (OfflineGame.starCount < 3) {
							OfflineGame.starCount += 1;
						}
					} // user hit explosion.
					if (map[x][y].equals("?")) {
						if (OfflineGame.currentLife == 0.5)
							OfflineGame.currentLife = 0;
						else if (OfflineGame.currentLife == 1)
							OfflineGame.currentLife = (float) 0.5;
						tempExpX = x;
						tempExpY = y;
						movedInExp = true;
					}
					if (map[x][y].equals("@")) {
						spacePressed = true;
						bombX = x;
						bombY = y;
					}
					userPos(x, y);
				} else {
					if (OfflineGame.currentLife == 0.5)
						OfflineGame.currentLife = 0;
					else if (OfflineGame.currentLife == 1)
						OfflineGame.currentLife = (float) 0.5;
				}
			}
		} else if (move == 2) {
			// left.
			if ((!map[x][y - 1].equals("#")) && (!map[x][y - 1].equals("0"))) {
				if (!map[x][y - 1].equals("^") && move == 2) {
					y -= 1;

					// System.out.println(x + "," + y);
					if (spacePressed) {
						settingItem(bombX, bombY, "@");
						spacePressed = false;
					}

					if (movedInExp && !explosionIsRemoved) {
						settingItem(tempExpX, tempExpY, "?");
						movedInExp = false;
					}

					// if user got item.
					if (map[x][y].equals("+") && OfflineGame.currentLife == 0.5) {
						OfflineGame.currentLife = 1;
					}
					if (map[x][y].equals("$")) {
						if (OfflineGame.starCount < 3) {
							OfflineGame.starCount += 1;
						}
					} // user hit explosion.
					if (map[x][y].equals("?")) {
						if (OfflineGame.currentLife == 0.5)
							OfflineGame.currentLife = 0;
						else if (OfflineGame.currentLife == 1)
							OfflineGame.currentLife = (float) 0.5;
						tempExpX = x;
						tempExpY = y;
						movedInExp = true;
					}
					if (map[x][y].equals("@")) {
						spacePressed = true;
						bombX = x;
						bombY = y;
					}
					userPos(x, y);
				} else {
					if (OfflineGame.currentLife == 0.5)
						OfflineGame.currentLife = 0;
					else if (OfflineGame.currentLife == 1)
						OfflineGame.currentLife = (float) 0.5;
				}
			}
		} else if (move == 3) {
			// right.
			if ((!map[x][y + 1].equals("#")) && (!map[x][y + 1].equals("0"))) {
				if (!map[x][y + 1].equals("^")) {
					y += 1;

					// System.out.println(x + "," + y);
					if (spacePressed) {
						settingItem(bombX, bombY, "@");
						spacePressed = false;
					}

					if (movedInExp && !explosionIsRemoved) {
						settingItem(tempExpX, tempExpY, "?");
						movedInExp = false;
					}

					// if user got item.
					if (map[x][y].equals("+") && OfflineGame.currentLife == 0.5) {
						OfflineGame.currentLife = 1;
					}
					if (map[x][y].equals("$")) {
						if (OfflineGame.starCount < 3) {
							OfflineGame.starCount += 1;
						}
					} // user hit explosion.
					if (map[x][y].equals("?")) {
						if (OfflineGame.currentLife == 0.5)
							OfflineGame.currentLife = 0;
						else if (OfflineGame.currentLife == 1)
							OfflineGame.currentLife = (float) 0.5;
						tempExpX = x;
						tempExpY = y;
						movedInExp = true;
					}
					if (map[x][y].equals("@")) {
						spacePressed = true;
						bombX = x;
						bombY = y;
					}
					userPos(x, y);
				} else {
					if (OfflineGame.currentLife == 0.5)
						OfflineGame.currentLife = 0;
					else if (OfflineGame.currentLife == 1)
						OfflineGame.currentLife = (float) 0.5;
				}
			}
		} else {
			// bomb.
			OfflineGame.currentNumBomb += 1;
			spacePressed = true;
			explosionIsRemoved = false;
			bombX = x;
			bombY = y;

		}
	}

	public static void show() {
		// TODO X
		for (int i = 0; i < rowNum; i++) {
			for (int j = 0; j < columnNum; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}

	public static void ranMove() {
		int j2 = 1;
		for (int i = 0; i < rowNum; i++) {
			for (int j = 0; j < columnNum; j++) {
				if (map[i][j].equals("^")) {
					if (ran(0, 3) == 0) {
						if (map[i - j2][j].equals("_") && !map[i - j2][j].equals("*") && !map[i - j2][j].equals("#")
								&& !map[i - j2][j].equals("0")) { // up.
							settingItem((i - j2), j, "^");
							settingItem(i, j, "_");
						} else if (map[i - j2][j].equals("*")) {
							OfflineGame.currentLife -= 0.5;
						}
					} else if (ran(0, 3) == 1) {
						if (map[i + j2][j].equals("_") && !map[i + j2][j].equals("*") && !map[i + j2][j].equals("#")
								&& !map[i + j2][j].equals("0")) { // down.
							settingItem((i + j2), j, "^");
							settingItem(i, j, "_");
						} else if (map[i + j2][j].equals("*")) {
							OfflineGame.currentLife -= 0.5;
						}
					} else if (ran(0, 3) == 2) {
						if (map[i][j - j2].equals("_") && !map[i][j - j2].equals("*") && !map[i][j - j2].equals("#")
								&& !map[i][j - j2].equals("0")) { // left.
							settingItem(i, (j - j2), "^");
							settingItem(i, j, "_");
						} else if (map[i][j - j2].equals("*")) {
							OfflineGame.currentLife -= 0.5;
						}
					} else if (ran(0, 3) == 3) {
						if (map[i][j + j2].equals("_") && !map[i][j + j2].equals("*") && !map[i][j + j2].equals("#")
								&& !map[i][j + j2].equals("0")) { // right.
							settingItem(i, (j + j2), "^");
							settingItem(i, j, "_");
						} else if (map[i][j + j2].equals("*")) {
							OfflineGame.currentLife -= 0.5;
						}
					}
				}
			}
		}

	}

	// Resizing images.
	public static Image resizeImage(Image img, int w, int h) {
		w -= 8;
		h -= 7;
		BufferedImage resizeed = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
		Graphics2D obj = resizeed.createGraphics();

		obj.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
		obj.drawImage(img, 0, 0, w, h, null);
		obj.dispose();

		return resizeed;
	}

	public static JLabel[][] LblG = new JLabel[rowNum][columnNum];

	// setting images.
	public static void setGui() {
		try {
			// OfflineGame.theGame.removeAll();
			OfflineGame.theGame = new JPanel();
			OfflineGame.theGame.repaint();
			// OfflineGame.frmBomberman.pack();
			OfflineGame.frmBomberman.getContentPane().add(OfflineGame.theGame, BorderLayout.CENTER);
			OfflineGame.theGame.setBackground(new Color(49, 154, 7));
			OfflineGame.theGame.setLayout(new GridLayout(rowNum, 1));
			int p = 0;
			for (int i = rowNum - 1; i >= 0; i--) {
				for (int j = columnNum - 1; j >= 0; j--) {
					LblG[i][j] = new JLabel();
					LblG[i][j].setOpaque(true);
					LblG[i][j].revalidate();
					LblG[i][j].repaint();
					LblG[i][j].setDoubleBuffered(true);
					LblG[i][j].setBackground(new Color(49, 154, 7));
					LblG[i][j].setPreferredSize(new Dimension(OfflineGame.frmBomberman.getWidth() / rowNum,
							OfflineGame.frmBomberman.getHeight() / columnNum));

					if (map[i][j].equals("#")) {
						// block.
						LblG[i][j].setIcon(new ImageIcon(resizeImage(
								Toolkit.getDefaultToolkit()
										.getImage(OfflineGame.class.getResource(
												"/ir/ac/guilan/ce/ap97/Hendiani/image/Tiles/stoneWall.png")),
								OfflineGame.frmBomberman.getWidth() / rowNum,
								OfflineGame.frmBomberman.getHeight() / columnNum)));
					} else if (map[i][j].equals("_")) {
						// empty.
						LblG[i][j]
								.setIcon(new ImageIcon(resizeImage(
										Toolkit.getDefaultToolkit()
												.getImage(OfflineGame.class.getResource(
														"/ir/ac/guilan/ce/ap97/Hendiani/image/background.png")),
										OfflineGame.frmBomberman.getWidth() / rowNum,
										OfflineGame.frmBomberman.getHeight() / columnNum)));
					} else if (map[i][j].equals("*")) {
						// user.
						LblG[i][j]
								.setIcon(
										new ImageIcon(resizeImage(
												Toolkit.getDefaultToolkit()
														.getImage(OfflineGame.class.getResource(
																"/ir/ac/guilan/ce/ap97/Hendiani/image/up.gif")),
												OfflineGame.frmBomberman.getWidth() / rowNum,
												OfflineGame.frmBomberman.getHeight() / columnNum)));
						// down.
						LblG[i][j]
								.setIcon(
										new ImageIcon(resizeImage(
												Toolkit.getDefaultToolkit()
														.getImage(OfflineGame.class.getResource(
																"/ir/ac/guilan/ce/ap97/Hendiani/image/down.gif")),
												OfflineGame.frmBomberman.getWidth() / rowNum,
												OfflineGame.frmBomberman.getHeight() / columnNum)));
						// left.
						LblG[i][j]
								.setIcon(
										new ImageIcon(resizeImage(
												Toolkit.getDefaultToolkit()
														.getImage(OfflineGame.class.getResource(
																"/ir/ac/guilan/ce/ap97/Hendiani/image/left.gif")),
												OfflineGame.frmBomberman.getWidth() / rowNum,
												OfflineGame.frmBomberman.getHeight() / columnNum)));
						// right.
						LblG[i][j]
								.setIcon(
										new ImageIcon(resizeImage(
												Toolkit.getDefaultToolkit()
														.getImage(OfflineGame.class.getResource(
																"/ir/ac/guilan/ce/ap97/Hendiani/image/right.gif")),
												OfflineGame.frmBomberman.getWidth() / rowNum,
												OfflineGame.frmBomberman.getHeight() / columnNum)));
						if (direction == 0) {
							// up.
							LblG[i][j]
									.setIcon(new ImageIcon(resizeImage(
											Toolkit.getDefaultToolkit()
													.getImage(OfflineGame.class.getResource(
															"/ir/ac/guilan/ce/ap97/Hendiani/image/up.gif")),
											OfflineGame.frmBomberman.getWidth() / rowNum,
											OfflineGame.frmBomberman.getHeight() / columnNum)));
						} else if (direction == 1) {
							// down.
							LblG[i][j]
									.setIcon(new ImageIcon(resizeImage(
											Toolkit.getDefaultToolkit()
													.getImage(OfflineGame.class.getResource(
															"/ir/ac/guilan/ce/ap97/Hendiani/image/down.gif")),
											OfflineGame.frmBomberman.getWidth() / rowNum,
											OfflineGame.frmBomberman.getHeight() / columnNum)));
						} else if (direction == 2) {
							// left.
							LblG[i][j]
									.setIcon(new ImageIcon(resizeImage(
											Toolkit.getDefaultToolkit()
													.getImage(OfflineGame.class.getResource(
															"/ir/ac/guilan/ce/ap97/Hendiani/image/left.gif")),
											OfflineGame.frmBomberman.getWidth() / rowNum,
											OfflineGame.frmBomberman.getHeight() / columnNum)));
						} else if (direction == 3) {
							// right.
							LblG[i][j]
									.setIcon(new ImageIcon(resizeImage(
											Toolkit.getDefaultToolkit()
													.getImage(OfflineGame.class.getResource(
															"/ir/ac/guilan/ce/ap97/Hendiani/image/right.gif")),
											OfflineGame.frmBomberman.getWidth() / rowNum,
											OfflineGame.frmBomberman.getHeight() / columnNum)));
						}
					} else if (map[i][j].equals("^")) {
						// enemy.
						LblG[i][j]
								.setIcon(
										new ImageIcon(resizeImage(
												Toolkit.getDefaultToolkit()
														.getImage(OfflineGame.class.getResource(
																"/ir/ac/guilan/ce/ap97/Hendiani/image/bee2.gif")),
												OfflineGame.frmBomberman.getWidth() / rowNum,
												OfflineGame.frmBomberman.getHeight() / columnNum)));
					} else if (map[i][j].equals("0")) {
						// box.
						LblG[i][j]
								.setIcon(new ImageIcon(resizeImage(
										Toolkit.getDefaultToolkit()
												.getImage(OfflineGame.class.getResource(
														"/ir/ac/guilan/ce/ap97/Hendiani/image/Tiles/boxAlt.png")),
										OfflineGame.frmBomberman.getWidth() / rowNum,
										OfflineGame.frmBomberman.getHeight() / columnNum)));
					} else if (map[i][j].equals("+")) {
						// hart.
						LblG[i][j]
								.setIcon(
										new ImageIcon(resizeImage(
												Toolkit.getDefaultToolkit()
														.getImage(OfflineGame.class.getResource(
																"/ir/ac/guilan/ce/ap97/Hendiani/image/heart.gif")),
												OfflineGame.frmBomberman.getWidth() / rowNum,
												OfflineGame.frmBomberman.getHeight() / columnNum)));
					} else if (map[i][j].equals("$")) {
						// star
						LblG[i][j]
								.setIcon(
										new ImageIcon(resizeImage(
												Toolkit.getDefaultToolkit()
														.getImage(OfflineGame.class.getResource(
																"/ir/ac/guilan/ce/ap97/Hendiani/image/star.gif")),
												OfflineGame.frmBomberman.getWidth() / rowNum,
												OfflineGame.frmBomberman.getHeight() / columnNum)));
					} else if (map[i][j].equals("@")) {
						// bomb.
						LblG[i][j]
								.setIcon(
										new ImageIcon(resizeImage(
												Toolkit.getDefaultToolkit()
														.getImage(OfflineGame.class.getResource(
																"/ir/ac/guilan/ce/ap97/Hendiani/image/bomb.png")),
												OfflineGame.frmBomberman.getWidth() / rowNum,
												OfflineGame.frmBomberman.getHeight() / columnNum)));
					} else if (map[i][j].equals("?")) {
						// explosion.
						LblG[i][j]
								.setIcon(new ImageIcon(resizeImage(
										Toolkit.getDefaultToolkit()
												.getImage(OfflineGame.class.getResource(
														"/ir/ac/guilan/ce/ap97/Hendiani/image/explosion.png")),
										OfflineGame.frmBomberman.getWidth() / rowNum,
										OfflineGame.frmBomberman.getHeight() / columnNum)));
					} else {
						System.out.println("unknown found!!!");
					}

					OfflineGame.theGame.add(LblG[i][j], p);
				}
			}
		} catch (Exception e) {
		}
	}

	public static void GameMode(String mode) {
		if (mode.equals("boost")) {
			Function.getDefaltMap();
			// enemy
			Function.setItems(StartOffline.enemy, 2);
			// Function.setItems(23, 2);
			// Function.setItems(Integer.parseInt(StartOffline.numEnemy.getValue().toString()),
			// 2);
			// boxes
			int temp = (200 - StartOffline.enemy);
			int max = temp / 3;
			int min = temp / 4;
			if (max >= 1)
				Function.setItems(Function.ran(min, max), 1);
			// Function.setItems(23, 1);
			// hart
			// Function.setItems(50, 3);
			// star
			// Function.setItems(20, 4);
			OfflineGame.maxNumbStarOnScrean = 7;
			OfflineGame.currentLife = 1;
			OfflineGame.starCount = 0;
			OfflineGame.bombActive = false;
			OfflineGame.totalNumBomb = 0;
			StartOffline.millisec1 = 200;
			StartOffline.millisec2 = 200;
			StartOffline.theBombTime = 30;
			StartOffline.explodTime = 40;
		} else {
			Function.getDefaltMap();
			// enemy
			Function.setItems(StartOffline.enemy, 2);
			// Function.setItems(23, 2);
			// Function.setItems(Integer.parseInt(StartOffline.numEnemy.getValue().toString()),
			// 2);
			// boxes
			int temp = (284 - StartOffline.enemy);
			int max = temp / 2;
			int min = temp / 3;
			if (max >= 1)
				Function.setItems(Function.ran(min, max), 1);
			// Function.setItems(23, 1);
			// hart
			// Function.setItems(50, 3);
			// star
			// Function.setItems(20, 4);
			OfflineGame.maxNumbStarOnScrean = 4;
			OfflineGame.currentLife = 1;
			OfflineGame.starCount = 0;
			OfflineGame.bombActive = false;
			OfflineGame.totalNumBomb = 0;
			StartOffline.millisec1 = 1000;
			StartOffline.millisec2 = 500;
			StartOffline.theBombTime = 3;
			StartOffline.explodTime = 4;
		}
	}
}
