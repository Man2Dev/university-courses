package ir.ac.guilan.ce.ap97.Hendiani.Function;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import ir.ac.guilan.ce.ap97.Hendiani.ListName.Contacts;

public class Output {
	public static ArrayList<Output> aObj = new ArrayList<>();
	private static int count;
	private int groupChouse;
	private static String address;
	private static String addressBook;
	private static String group;
	private static String name;
	private static String number;
	private static String date;
	private static String latitude;
	private static String langitude;
	private static String gender;
	private static String email;

	public Output(String address, String addressBook, String group, String name, String number, String date,
			String latitude, String langitude, String gender, String email) {
		this.address = address;
		this.addressBook = addressBook;
		this.group = group;
		this.name = name;
		this.number = number;
		this.date = date;
		this.latitude = latitude;
		this.langitude = langitude;
		this.gender = gender;
		this.email = email;
		Output.aObj.add(this);
	}

	public static String show() {
		return "" + "\n" + (addressBook != null ? "addressBook= " + addressBook + "" : "") + "\n"
				+ (group != null ? "group= " + group + "" : "") + "\n" + (name != null ? "name= " + name + "" : "")
				+ "\n" + (number != null ? "number= " + number + "" : "") + "\n"
				+ (date != null ? "date= " + date + "" : "") + "\n"
				+ (latitude != null ? "latitude= " + latitude + "" : "") + "\n"
				+ (langitude != null ? "langitude= " + langitude + "" : "") + "\n"
				+ (langitude != null ? "address= " + address + "" : "") + "\n"
				+ (gender != null ? "gender= " + gender + "" : "") + "\n" + (email != null ? "email= " + email : "")
				+ "\n" + "";
	}
}
