package polynomial;

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
	// activating the algorithm and the graph
	public static void Enter(int numberLoops, int min, int max) {
		String temp = "";
		// Algorithm 1
		for (int i = 0; i < numberLoops; i++) {
			temp += (","+random(min, max));
			method1(temp.replaceFirst(",", ""));
		}
		add("M1");

		temp = "";
		// Algorithm 2
		for (int i = 0; i < numberLoops; i++) {
			temp += (","+random(min, max));
			method1(temp.replaceFirst(",", ""));
		}
		add("M2");
	}

	// setting manual answer and time complexity
	public static void activate() {
		String str = Gui.textField1.getText();
		// answer
		Gui.textField2.setText("M1: (" + method1(str) + "), M2: (" + method2(str) + ")");
		// time complexity
		Gui.textField_3.setText("M1: (" + times.get(0) + "), M2: (" + times.get(1) + ")");
		times.clear();
	}

	// Algorithm 1.
	public static String method1(String str) {
		long start = System.nanoTime();
		String[] factor = str.split(",");
		int n = factor.length;
		String sum = "";
		String tmp = "";
		sum = String.valueOf(factor[0]);
		for (int i = 1; i < n; i++) {
			if (factor[i].equals("0"))
				continue;
			for (int j = 0; j < i; j++) {
				tmp += "X";
			}
			sum += "+" + String.valueOf(factor[i]) + tmp;
			tmp = "";
		}
		long end = System.nanoTime();
		times.add(end - start);
		return sum;
	}

	// Algorithm 2.
	public static String method2(String str) {
		long start = System.nanoTime();
		String[] factor = str.split(",");
		int n = factor.length;
		String sum = "";
		String term = "";
		sum = String.valueOf(factor[0]);
		for (int i = 1; i < n; i++) {
			term += "X";
			if (factor[i].equals("0"))
				continue;
			sum += "+" + String.valueOf(factor[i]) + term;

		}
		long end = System.nanoTime();
		times.add(end - start);
		return sum;
	}
}
