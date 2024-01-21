package ir.ac.guilan.ce.ap97.Hendiani.ListGroups;

import java.util.ArrayList;

import ir.ac.guilan.ce.ap97.Hendiani.ListName.Contacts;

public class Groups {
	public static ArrayList<Contacts> obj = new ArrayList<>();
	
	private int count;
	private int groupChouse;
	private String addressBook;
	private String group;
	private String name;
	private String number;
	private String date;
	private String latitude;
	private String langitude;
	
	private String gender;

	private String email;

	public Groups() {
		this.count = count;
		this.groupChouse = groupChouse;
		this.addressBook = addressBook;
		this.group = group;
		this.name = name;
		this.number = number;
		this.date = date;
		this.latitude = latitude;
		this.langitude = langitude;
		this.gender = gender;
		this.email = email;
	}

	public int getCount() {
		return count;
	}

	public String getGroup() {
		return group;
	}
	
	public int getGroupChouse() {
		return groupChouse;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	public void setGroup(String group) {
		this.group = group;
	}
	
	public void setGroupChouse(int groupChouse) {
		this.groupChouse = groupChouse;
	}
}
