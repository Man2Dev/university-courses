
public class StateHandler {

	public static void StateSwitch() {
		String s2_ps = "s1";
		String s2_ns = "";
		String s3_ps = "s1";
		String s3_ns = "";
		boolean err = false;
		int st = 1;
		int ns = 0;
		int ps = st;
		int temp = Integer.parseInt(main.getTemp());

		while (true) {

			switch (ps) {
			case 1:
//				st = 1;
				main.setState("st1");
				main.setHeater("OFF");
				main.setSub_state_heater("-");
				main.setHeater_deg("OFF");
				main.setCooler("OFF");
				main.setSub_state_cooler("-");
				main.setCrs("0");
				TextHandler.switchText(1);

				if (temp < 15) {
					ns = 3;
				} else if (temp > 35) {
					ns = 2;
				}

				break;
			case 2:
//				st = 2;
				main.setState("st2");
				main.setHeater("OFF");
				main.setSub_state_heater("-");
				main.setHeater_deg("OFF");
				main.setCooler("ON");
				TextHandler.switchText(1);

				while (s2_ps != "OUT") {
					switch (s2_ps) {
					case "s1":
						main.setSub_state_cooler("s1");
						main.setCrs("4");

						if (temp < 25) {
							s2_ns = "OUT";
						} else if (temp > 40) {
							s2_ns = "s2";
						}

						break;
					case "s2":
						main.setSub_state_cooler("s2");
						main.setCrs("6");

						if (temp < 35) {
							s2_ns = "s1";
						} else if (temp > 45) {
							s2_ns = "s3";
						}

						break;
					case "s3":
						main.setSub_state_cooler("s3");
						main.setCrs("8");

						if (temp < 40) {
							s2_ns = "s2";
						} else if (temp > 60) {
							System.out.println("input is out of bounds temperature is too High.\nExiting Program!!!!");
						}

						break;
					default:
						err = true;
						TextHandler.switchText(6);
						break;
					}
					s2_ps = s2_ns;
					Out.Put();
				}

				if (temp < 25) {
					ns = 1;
				}

				break;
			case 3:
//				st = 3;
				main.setState("st3");
				main.setHeater("ON");
				main.setCooler("OFF");
				main.setSub_state_cooler("-");
				main.setCrs("0");
				TextHandler.switchText(1);

				while (s3_ps != "OUT") {
					switch (s3_ps) {
					case "s1":
						main.setSub_state_heater("s1");
						main.setHeater_deg("LOW");

						if (temp > 30) {
							s3_ns = "OUT";
						} else if (temp < 10) {
							s3_ns = "s2";
						}

						break;
					case "s2":
						main.setSub_state_heater("s2");
						main.setHeater_deg("HIGH");

						if (temp > 15) {
							s3_ns = "s1";
						}

						break;
					default:
						err = true;
						TextHandler.switchText(7);
						break;
					}
					s3_ps = s3_ns;
					Out.Put();
				}

				if (temp > 30) {
					ns = 1;
				}

				break;
			default:
				err = true;
				TextHandler.switchText(2);
				break;
			}
			ps = ns;
			Out.Put();
		}
	}

}
