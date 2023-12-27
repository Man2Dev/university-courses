
public class Out {

	public static void Put() {

		//System.out.println("----------------------------------------------------------");
		System.out.println("you state is: ");
		System.out.println(main.getState());

		System.out.println("Heater is: ");
		System.out.println(main.getHeater());

		System.out.println("Heater Sub state is: ");
		System.out.println(main.getSub_state_heater());

		System.out.println("Heater Deg is on: ");
		System.out.println(main.getHeater_deg());

		System.out.println("Cooler is: ");
		System.out.println(main.getCooler());

		System.out.println("Cooler Sub state is: ");
		System.out.println(main.getSub_state_cooler());

		System.out.println("CRS is: ");
		System.out.println(main.getCrs());

		System.out.println("err: ");
		System.out.println(main.getErr());
		System.out.println("----------------------------------------------------------");
	}
}
