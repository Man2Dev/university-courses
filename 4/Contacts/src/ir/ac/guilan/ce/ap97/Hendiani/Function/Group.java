package ir.ac.guilan.ce.ap97.Hendiani.Function;

import java.util.*;

import javax.swing.JOptionPane;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import ir.ac.guilan.ce.ap97.Hendiani.Gui;
import ir.ac.guilan.ce.ap97.Hendiani.ListGroups.Groups;
import ir.ac.guilan.ce.ap97.Hendiani.ListName.Contacts;

public class Group extends Gui {
	private static int count;
	private static String group;

	public Group() {
		this.count = count;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public static void deleteGroup(String GroupSearched) {
		// if group even exists.
		if (groups.contains(GroupSearched)) {
			for (int i = 0; i < Contacts.obj.size(); i++) {
				// finding position of group.
				if (groups.indexOf(GroupSearched) == i) {
					Contacts.gobj.remove(i);
					groups.remove(i);
				}
			}
		} else {
			count++;
			JOptionPane.showMessageDialog(null, "group dosn't exist.");
		}
	}

	public static void groupEdit(Object Old, Object New) {
		System.out.println(Contacts.obj.get(count));
		String temp;
		for (int i = 0; i < Contacts.gobj.size(); i++) {
			// finding position of group.
			if (groups.indexOf(Old.toString()) == i) {
				if (Contacts.gobj.get(i).contains(Old.toString())) {
				}
				//Contacts.gobj.remove(i);
				//groups.remove(i);
			}
		}
	}
}
