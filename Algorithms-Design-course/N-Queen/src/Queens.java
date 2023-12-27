import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Hashtable;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;

import org.jfree.chart.block.CenterArrangement;

public class Queens {
	// Helper Function to check if queen can be placed.
	private static boolean canPlace(int[] x, int n) {
		for (int i = 0; i < n; i++) {
			if (x[i] == x[n] || (Math.abs(x[i] - x[n]) == Math.abs(n - i))
					|| (Math.abs(x[n] - x[i]) == Math.abs(n - i)))
				return false;
		}
		return true;
	}

	private static int count = 0;

	// setting data.
	private static void print(int[] x, Boolean show, Boolean write) {
		int n = x.length;
		String[][] ans = new String[n][n];
		String end = "*";
		++count;

		if (write)
			writeLine((count + " th permutation."), n, true);
		if (show)
			System.out.println((count + " th permutation."));

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (x[i] == j) {
					if (j == 0) {
						ans[i][j] = "|Q|";
					} else {
						ans[i][j] = "Q|";
					}

					if (show)
						System.out.print(ans[i][j]);
				} else {
					if (i % 2 == 0) {
						if (j % 2 == 0) {
							if (j == 0) {
								ans[i][j] = "|-|";
							} else {
								ans[i][j] = "-|";
							}
						} else {
							if (j == 0) {
								ans[i][j] = "|#|";
							} else {
								ans[i][j] = "#|";
							}
						}
					} else {
						if (j % 2 == 1) {
							if (j == 0) {
								ans[i][j] = "|-|";
							} else {
								ans[i][j] = "-|";
							}
						} else {
							if (j == 0) {
								ans[i][j] = "|#|";
							} else {
								ans[i][j] = "#|";
							}
						}
					}

					if (show)
						System.out.print(ans[i][j]);
				}
			}
			if (show)
				System.out.println();
			end += "=*";
		}
		if (write) {
			write(ans, true);
			writeLine((end + "\n"), n, true);
		}

		if (show)
			System.out.println(end + "\n");
	}

	// Trying all permutations with backtracking.
	private static void start(int[] q, int k, Boolean show, Boolean write) {
		int n = q.length;
		if (k == n)
			print(q, show, write);
		else {
			for (int i = 0; i < n; i++) {
				q[k] = i;
				if (canPlace(q, k))
					start(q, k + 1, show, write);
			}
		}
	}

	// checking is the file exists.
	private static Boolean exists(File f) {
		if (f.exists() && !f.isDirectory()) {
			return true;
		}
		return false;
	}

	// saving the Board to text file.
	private static void write(String[][] data, Boolean append) {
		try {
			int n = data.length;
			BufferedWriter writer = new BufferedWriter(
					new FileWriter("src/Output/" + n + "-Queen/Answers.txt", append));
			String fileContent = "";

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					fileContent += data[i][j];
				}
				fileContent += "\n";
			}
			// fileContent += "\n";
			writer.write(fileContent);
			writer.close();
		} catch (IOException e) {
		}
	}

	// adding a line to the text file.
	private static void writeLine(String data, int n, Boolean append) {
		try {
			BufferedWriter writer = new BufferedWriter(
					new FileWriter("src/Output/" + n + "-Queen/Answers.txt", append));
			String fileContent = "";
			fileContent += (data + "\n");
			writer.write(fileContent);
			writer.close();
		} catch (IOException e) {
		}
	}

	static void entery(int n, Boolean show, Boolean write) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		long startT = System.nanoTime();

		String temp1 = (dtf.format(now) + "\t(" + n + "-Queen Started)\n");
		if (show)
			System.out.println(temp1);
		if (write) {
			new File("src/Output/" + n + "-Queen").mkdirs();
			writeLine(temp1, n, !exists(new File("src/Output/" + n + "-Queen/Answers.txt")));
		}
		count = 0;
		start(new int[n], 0, show, write);

		long endT = System.nanoTime();
		String temp2 = ("Time Complexity: " + (endT - startT) + "\t(" + n + "-Queen Ended)\n");
		if (show)
			System.out.println(temp2);
		if (write)
			writeLine(temp2, n, true);
	}

	// n <= 25
	// public static void main(String[] args) {
	// int n = 4;
	// entery(n, true, true);
	// }

}
