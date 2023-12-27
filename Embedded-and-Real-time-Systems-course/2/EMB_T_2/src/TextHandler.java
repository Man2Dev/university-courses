
public class TextHandler {

	public static void switchText(int i) {
		String errStr = "";
		String outStr = "";
		i = 1;
		switch (i) {
		case 1:
			errStr = "None.";
			break;
		case 2:
			errStr = "Exiting Program!!!!";
			break;
		case 3:
			errStr = "Try again Please.";
			break;
		case 4:
			errStr = "input is out of bounds temperature is too low.\nExiting Program!!!!";
			break;
		case 5:
			errStr = "input is out of bounds temperature is too High.\nExiting Program!!!!";
			break;
		case 6:
			errStr = "Err in sub state of Cooler.";
			break;
		case 7:
			errStr = "Err in sub state of Heater.";
			break;
		default:
			System.out.println("???");
			break;
		}

		main.setErr(errStr);
	}
}
