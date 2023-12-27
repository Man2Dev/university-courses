import java.lang.Thread.State;
import java.util.Scanner;

import javax.swing.undo.StateEdit;

public class main {

	public static String state = new String();
	public static String heater = new String();
	public static String sub_state_heater = new String();
	public static String heater_deg = new String();
	public static String cooler = new String();
	public static String sub_state_cooler = new String();
	public static String crs = new String();
	public static String temp = new String();
	public static String err = new String();
	public static String n = new String();

	public static String getTemp() {
		return temp;
	}

	public static String getState() {
		return state;
	}

	public static String getHeater() {
		return heater;
	}

	public static String getSub_state_heater() {
		return sub_state_heater;
	}

	public static String getHeater_deg() {
		return heater_deg;
	}

	public static String getCooler() {
		return cooler;
	}

	public static String getSub_state_cooler() {
		return sub_state_cooler;
	}

	public static String getCrs() {
		return crs;
	}

	public static String getErr() {
		return err;
	}

	public static void in() {
		System.out.println("===========================================");
		System.out.println("The temperature is: ");
		int num;
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		setTemp(num + "");
	}

	public static void main(String[] args) {

		while (true) {
			in();
			StateHandler.StateSwitch();
			Out.Put();
		}
	}

	public static void setTemp(String temp) {
		main.temp = temp;
	}

	public static void setState(String out) {
		main.state = out;
	}

	public static void setHeater(String heater) {
		main.heater = heater;
	}

	public static void setSub_state_heater(String sub_state) {
		main.sub_state_heater = sub_state;
	}

	public static void setHeater_deg(String heater_deg) {
		main.heater_deg = heater_deg;
	}

	public static void setCooler(String cooler) {
		main.cooler = cooler;
	}

	public static void setSub_state_cooler(String sub_state_cooler) {
		main.sub_state_cooler = sub_state_cooler;
	}

	public static void setCrs(String crs) {
		main.crs = crs;
	}

	public static void setErr(String err) {
		main.err = err;
	}

}
