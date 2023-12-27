package ir.ac.guilan.ce.ap97.Hendiani.ListName;

import java.awt.Container;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JComboBox;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

import ir.ac.guilan.ce.ap97.Hendiani.Gui;
import ir.ac.guilan.ce.ap97.Hendiani.ListGroups.Groups;

public class Contacts {
	//public static ArrayList<String> names = new ArrayList<String>();
	public static ArrayList<Contacts> obj = new ArrayList<>();
	// the group of contacts.
	public static ArrayList<String> gobj = new ArrayList<>();
	private static Object NAMES;
	public static ArrayList<String> getGobj() {
		return gobj;
	}
	public static ArrayList<Contacts> getObj() {
		return obj;
	}
	public static void setGobj(ArrayList<String> gobj) {
		Contacts.gobj = gobj;
	}
	public static void setNAMES(Object nAMES) {
		NAMES = nAMES;
	}
	public static void setObj(ArrayList<Contacts> obj) {
		Contacts.obj = obj;
	}
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
	public Contacts(Object nAMES, int count, int groupChouse, String addressBook, String group, String name,
			String number, String date, String latitude, String langitude, String gender, String email) {
		NAMES = nAMES;
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
		Contacts.obj.add(this);
		//gobj.add();
		gobj.add(""+ "\n" + (addressBook != null ? "addressBook= " + addressBook + "" : "") + "\n"
				+ (group != null ? "group= " + group + "" : "") + "\n" + (name != null ? "name= " + name + "" : "") + "\n"
				+ (number != null ? "number= " + number + "" : "") + "\n" + (date != null ? "date= " + date + "" : "") + "\n"
				+ (latitude != null ? "latitude= " + latitude + "" : "") + "\n"
				+ (langitude != null ? "langitude= " + langitude + "" : "") + "\n"
				+ (gender != null ? "gender= " + gender + "" : "") + "\n" + (email != null ? "email= " + email : "") + "\n" + "");
	}
	
	public String getAddressBook() {
		return addressBook;
	}
	public int getCount() {
		return count;
	}
	public String getDate() {
		return date;
	}
	public String getEmail() {
		return email;
	}
	public String getGender() {
		return gender;
	}
	public String getGroup() {
		return group;
	}
	public int getGroupChouse() {
		return groupChouse;
	}
	public String getLangitude() {
		return langitude;
	}
	public String getLatitude() {
		return latitude;
	}
	public String getName() {
		return name;
	}
	public Object getNAMES() {
		return NAMES;
	}
	public String getNumber() {
		return number;
	}
	
	public void setAddressBook(String addressBook) {
		this.addressBook = addressBook;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public void setGroupChouse(int groupChouse) {
		this.groupChouse = groupChouse;
	}
	public void setLangitude(String langitude) {
		this.langitude = langitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setNumber(String number) {
		this.number = number;
	}
}
