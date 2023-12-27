package ir.ac.guilan.ce.ap97.Hendiani.Function;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

import ir.ac.guilan.ce.ap97.Hendiani.Gui;

public class Location extends Gui {
	// for the number of location count.
	public static Boolean locationC(String x, String y) {
		if (!x.equals("") && !y.equals("")) {
			return true;
		} else {
			return false;
		}
	}
	
	/*public static void neighbour() {
		try { // setting the radius.
			for (int i = 1; i <= getLocationCount(); i++) {
				radius.add(Math.sqrt(((x.get(i - 1) * x.get(i - 1)) - (2 * (x.get(i - 1) * x.get(i)))
						+ ((y.get(i) * y.get(i))))
						+ ((y.get(i - 1) * y.get(i - 1)) - (2 * (y.get(i - 1) * y.get(i))) + ((y.get(i) * y.get(i))))));
			}
		} catch (Exception e) {
		}
		// Sorting it out.
		Collections.sort(radius);
	}*/
	
	public static void neighbour() {
		int j=0;
		try { // setting the radius.
			for (int i = 0; i < getLocationCount()-1; i++) {
				j++;
				radius.add(Math.sqrt(((x.get(i) * x.get(i)) - (2 * (x.get(i) * x.get(j)))
						+ ((y.get(j) * y.get(j))))
						+ ((y.get(i) * y.get(i)) - (2 * (y.get(i) * y.get(j))) + ((y.get(j) * y.get(j))))));
				
			}
		} catch (Exception e) {
		}
		// Sorting it out.
		Collections.sort(radius);
	}
}
