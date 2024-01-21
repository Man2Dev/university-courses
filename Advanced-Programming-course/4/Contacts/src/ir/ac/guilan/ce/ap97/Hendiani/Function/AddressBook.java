package ir.ac.guilan.ce.ap97.Hendiani.Function;

import java.util.*;

import javax.swing.JOptionPane;

import ir.ac.guilan.ce.ap97.Hendiani.Gui;
import ir.ac.guilan.ce.ap97.Hendiani.ListName.Contacts;

public class AddressBook extends Gui {
	private static int count;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public static void deleteName(String nameSearched) {
		// if name even exists.
		if (names.contains(nameSearched)) {
			for (int i = 0; i < Contacts.obj.size(); i++) {
				// finding position of name.
				if (names.indexOf(nameSearched) == i) {
					Contacts.gobj.remove(i);
					names.remove(i);
				}
			}
		} else {
			count++;
			JOptionPane.showMessageDialog(null, "name dosn't exist.");
		}
	}

	public static void deleteNumber(String numSearched) {
		// if number even exists.
		if (numbers.contains(numSearched)) {
			for (int i = 0; i < Contacts.obj.size(); i++) {
				// finding position of number.
				if (numbers.indexOf(numSearched) == i) {
					Contacts.gobj.remove(i);
					numbers.remove(i);
				}
			}
		} else {
			count++;
			JOptionPane.showMessageDialog(null, "number dosn't exist.");
		}
	}

	// find clone if it does it wont let the user enter it.
	public static Boolean findClone(String name, String num) {
		// user has not bean found.
		if (names.contains(name) || numbers.contains(num)) {
			return false;
		} else {// the user was entered.
			return true;
		}

	}
}
