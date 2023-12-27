import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.jfree.data.category.DefaultCategoryDataset;

public class Function {

	/**
	 * Starting the program with custom features. (if you don't want any loops enter
	 * Start again)
	 * 
	 * @param start
	 *            Start of the loop. (Should not be less than 4)
	 * 
	 * @param end
	 *            End of the loop. (Should not be more than 29)
	 *
	 * @param gif
	 *            Print images of all the permutations and a gif of all the
	 *            permutations. (More than 10-Queen is not recommended due to long
	 *            run time)
	 * 
	 * @param text
	 *            Print permutations on text file. (More than 13-Queen is not
	 *            recommended due strange bug that opens text file with UTF-16)
	 * 
	 * @param console
	 *            Print permutations on console. (after 9-Queen all permutations
	 *            can't fit in console)
	 */
	public static void start(int start, int end, Boolean gif, Boolean text, Boolean console) {
		try {
			// Start and End of loop.
			// Start Minimum = 4.
			for (int i = start; i <= end; i++) {
				if (gif) {
					// #1) i-Queen = N-Queen.
					// #2) 0 = starting.
					// #3) true = Make images of all the permutations and
					// a gif of all the permutations.
					Queens0.entery(i, false);
				}
				if (console || text) {
					// #1) i-Queen = N-Queen.
					// #2) true = Print permutations on console.
					// #3) true = Write permutations on text file.
					Queens.entery(i, console, text);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// public static void main(String[] args) {
	// int n = 4;
	// // Start/End/gif/text/console.
	// start(n, n, false, false, true);
	// }

	// all the time complexity for algorithms
	public static ArrayList<Long> times = new ArrayList<Long>();
	// the sum amount of all time complexity for a given algorithm
	public static Long total = (long) 0;
	// Data set for graph
	final static DefaultCategoryDataset dataset = new DefaultCategoryDataset();
	final static DefaultCategoryDataset dataset0 = new DefaultCategoryDataset();

	// random number between min and max
	public static int random(int min, int max) {
		return (int) (min + (Math.random() * ((max + 1) - min)));
		// return ThreadLocalRandom.current().nextInt(min, max);
	}

	// adding data the the graphs data set
	public static void add(String name) {
		// summing the time complexity for the given algorithm
		for (int i = 0; i < times.size(); i++) {
			total += times.get(i);
		}

		long avg = (total / times.size());
		dataset.addValue(Collections.min(times), "Min", name);
		dataset.addValue(avg, "Avg", name);
		dataset.addValue(Collections.max(times), "Max", name);
		dataset0.addValue(avg, "Overall avg", name);

		times.clear();
		total = (long) 0;
	}

	public static void print(int numberLoops, int min, int max) {
		for (int j = 1; j <= numberLoops; j++) {
			System.out
					.println("Algorithm " + j + ") Min: " + Collections.min(times) + ", Avg: " + (total / times.size())
							+ ", Max: " + Collections.max(times) + "\n------------------------------------------");
			times.clear();
			total = (long) 0;
		}
	}

	// activating the algorithm and the graph
	public static void Enter(int numberLoops, int min, int max) {
		// Algorithm 1
		for (int i = 0; i < numberLoops; i++) {
			int n = random(min, max);
			method(n, n, false, false, false);
		}
		add("");
	}

	// setting manual answer and time complexity
	public static void activate() {
		int n = Integer.parseInt(Gui.textField1.getText());
		Boolean a = Gui.chckbxmntmNewCheckItem.isSelected();
		Boolean b = Gui.chckbxmntmNewCheckItem_1.isSelected();
		Boolean c = Gui.chckbxmntmNewCheckItem_2.isSelected();
		method(n, n, a, b, c);
		Gui.textField2.setText("Wait!!!");
		// answer
		Gui.textField2.setText("Done!!!");
		// time complexity
		Gui.textField_3.setText(times.get(0)+"");
		times.clear();

	}

	//Algorithm.
	public static void method(int Start, int End, Boolean gif, Boolean text, Boolean console) {
		long start = System.nanoTime();
		// Start/End/gif/text/console.
		start(Start, End, gif, text, console);
		long end = System.nanoTime();
		times.add(end - start);
	}
}
