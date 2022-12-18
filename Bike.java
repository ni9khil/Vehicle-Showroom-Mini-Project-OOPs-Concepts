package vehicle;

import java.util.Scanner;

class Bike extends Vehicle {
	public static void bike_brand_choice() {
		System.out.println("In Bikes, we have these brands");
		System.out.println();
		System.out.println("1. Hero");
		System.out.println("2. Jawa");
		System.out.println("");
		System.out.println();
		try {
			Scanner sc = new Scanner(System.in);
			int user_brand_choice = sc.nextInt();
			switch (user_brand_choice) {
			case 1:
				System.out.println();
				System.out.println("You have selected Hero Brand");
				Bike b1 = new Hero();
				Hero h = (Hero) b1;
				h.Hero_Main();
				break;

			case 2:
				System.out.println("You have selected Yamaha Brand");
				Bike b2 = new Jawa();
				Jawa j = (Jawa) b2;
				j.Jawa_Main();
				break;
			default:
				System.out.println();
				System.out.println("Looks like you have entered wrong choice.");
				System.out.println("");
				System.out.println("Wait. Directing you back to previous menu.");
				bike_brand_choice();
				break;
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println();
			System.out.println("Looks like you have entered wrong choice.");
			System.out.println("");
			System.out.println("Wait. Directing you back to previous menu.");
			bike_brand_choice();
		}

	}

}

////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////

class Hero extends Bike {

	public static void Hero_Main() {
		System.out.println("In Hero brand we have this bikes please enter your choice");
		System.out.println("1. Pep");
		System.out.println("2. For Splendor");
		System.out.println("3. For Hero Passion Pro");
		try {
			Scanner sc = new Scanner(System.in);

			int hero_choice = sc.nextInt();

			switch (hero_choice) {

			case 1: {
				Hero m = new Scooty_Pep(); // Upcasting
				Scooty_Pep sp = (Scooty_Pep) m; // Downcasting
				System.out.println("You have chose Scooty Pep");

				sp.choose_scooty_Pep();
				break;
			}

			case 2: {
				Hero hspl = new Splendor_plus();
				Splendor_plus spl = (Splendor_plus) hspl;
				System.out.println("You have selected Scooty Pept");
				spl.choose_Splendor_plus();
				break;
			}

			case 3: {
				Hero hpp = new Passion_pro();
				Passion_pro prp = (Passion_pro) hpp;
				prp.choose_Passion_pro();
				break;
			}

			default:
				// throw new IllegalArgumentException("Unexpected value: " +choice);
				System.out.println();
				System.out.println("Wrong Choice");
				System.out.println("");
				Hero_Main();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}

class Scooty_Pep extends Hero {
	static String Bikename = "Scooty_Pep";
	static String colorname;
	static double price;

	public void choose_scooty_Pep() {
		System.out.println("Showing details of Scooty Pep");
		details();
	}

	public static void details() {
		System.out.println("=============================");
		System.out.println();
		System.out.println();
		System.out.println("The Scooty Pep is powered by a 87 cc engine which produces of max power of 5 bhp.");
		System.out.println();
		System.out.println("Emission Type		:	BS6");
		System.out.println("Engine Displ		:	87.8cc");
		System.out.println("Front Brake			:	DRUM");
		System.out.println("Starting 			:	Kick and Self Start");
		System.out.println("Fuel Capacity		:	10 L");
		System.out.println("Max Power			:	Singel Channel");
		System.out.println();
		System.out.println("Press 1 to confirm or else press any key to go back to main menu");
		int user_input = 1;
		if (user_input == 1) {
			colors();
		} else {
			System.out.println();
			System.out.println("Input mismatch taking ypou back to previous menu");
			Hero.Hero_Main();
		}
	}

	public static void colors() {
		System.out.println("Available colors and their prices");
		System.out.println("   Color_Name         Price");
		System.out.println("    -----------|-----------");
		System.out.println("1. Pink        |     60120 Rs");
		System.out.println("2. Black       |     59500 Rs");
		System.out.println("3. Red         |     63200 Rs");
		System.out.println();
		try {
			Scanner sc = new Scanner(System.in);

			int color_choice = sc.nextInt();
			switch (color_choice) {
			case 1:
				last("Scooty Pep", "Pink", 60120);
				break;
			case 2:
				last("Scooty Pep", "Black", 59500); // M C S
				break;
			case 3:
				last("Scooty Pep", "Red", 63200);
				break;
			default:
				System.out.println("Wrong Choice. Taking you back to previous steps");
				Hero_Main();

			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Wrong Choice. Taking you back to previous steps");
			Hero_Main();
		}
	}

	public static void last(String Bikename, String colorname, double price) {

		System.out.println("So you have selected " + Bikename + " and this color " + colorname);
		System.out.println("This bike will cost you " + price + " Rupees");
		System.out.println("Press 1 to continue booking");
		System.out.println("Or Press any key to go back to previous menu");
		try {
			Scanner sc = new Scanner(System.in);

			int user_last_choice = sc.nextInt();

			switch (user_last_choice) {
			case 1:
				final_bill();
				break;

			default:
				System.out.println("Wrong Choice");
				colors();
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Wrong Choice");
			colors();
		}
		disp_cust_details();
		System.out.println("Bike name: " + Bikename);
		System.out.println("Color : " + colorname);
		System.out.println("");
		System.out.println("Total Bill after disocunt is");
		System.out.println("");
		final_price(price);
		Instruction.to_Instruction();

	}

	public static void final_bill() {
		cust_details();
	}

}

////////////////////////////////////////////////////////////////
class Splendor_plus extends Hero {
	static String Bikename = "Splendor_plus";
	static String colorname;
	static double price;

	public void choose_Splendor_plus() {
		System.out.println("Showing details of Splendor plus");
		details();
	}

	public static void details() {
		System.out.println("=============================");
		System.out.println();
		System.out.println();
		System.out.println("The Splendor plus is powered by a 92 cc engine which produces of max power of 8 bhp.");
		System.out.println();
		System.out.println("Emission Type		:	BS6");
		System.out.println("Engine Displ		:	92.2 cc");
		System.out.println("Front Brake			:	DISC");
		System.out.println("Starting 			:	Kick and Self Start");
		System.out.println("Fuel Capacity		:	12 L");
		System.out.println("Max Power			:	8000 rpm");
		System.out.println();
		System.out.println("Press 1 to confirm or else press any key to go back to main menu");
		int user_input = 1;
		if (user_input == 1) {
			colors();
		} else {
			System.out.println();
			System.out.println("Input mismatch taking ypou back to previous menu");
			Hero.Hero_Main();
		}
	}

	public static void colors() {
		System.out.println("Available colors and their prices");
		System.out.println("   Color_Name         Price");
		System.out.println("    -----------|-----------");
		System.out.println("1. Silver      |     72120 Rs");
		System.out.println("2. Black       |     73500 Rs");
		System.out.println("3. Red-Black   |     71200 Rs");
		System.out.println();

		Scanner sc = new Scanner(System.in);

		int color_choice = sc.nextInt();
		switch (color_choice) {
		case 1:
			last("Splendor plus", "Silver", 72120);
			break;
		case 2:
			last("Splendor plus", "Black", 73500); // M C S
			break;
		case 3:
			last("Splendor plus", "Red-Black", 71200);
			break;
		default:
			System.out.println("Wrong Choice. Taking you back to previous steps");
			Hero_Main();

		}
	}

	public static void last(String Bikename, String colorname, double price) {

		System.out.println("So you have selected " + Bikename + " and this color " + colorname);
		System.out.println("This bike will cost you " + price + " Rupees");
		System.out.println("Press 1 to continue booking");
		System.out.println("Or Press any key to go back to previous menu");

		Scanner sc = new Scanner(System.in);

		int user_last_choice = sc.nextInt();

		switch (user_last_choice) {
		case 1:
			final_bill();
			break;

		default:
			System.out.println("Wrong Choice");
			colors();
		}
		disp_cust_details();
		System.out.println("Bike name: " + Bikename);
		System.out.println("Color : " + colorname);
		System.out.println("");
		System.out.println("Total Bill after disocunt is");
		System.out.println("");
		final_price(price);
		Instruction.to_Instruction();
	}

	public static void final_bill() {
		cust_details();
	}
}

/////////////////////////////////////////////////////////////////////////	
class Passion_pro extends Hero {
	static String Bikename = "Passion_pro";
	static String colorname;
	static double price;

	public void choose_Passion_pro() {
		System.out.println("Showing details of Passion pro");
		details();
	}

	public static void details() {
		System.out.println("=============================");
		System.out.println();
		System.out.println();
		System.out.println("The Passion pro is powered by a 92 cc engine which produces of max power of 8 bhp.");
		System.out.println();
		System.out.println("Emission Type		:	BS6");
		System.out.println("Engine Displ		:	92.2 cc");
		System.out.println("Front Brake			:	DISC");
		System.out.println("Starting 			:	Kick and Self Start");
		System.out.println("Fuel Capacity		:	12 L");
		System.out.println("Max Power			:	8000 rpm");
		System.out.println();
		System.out.println("Press 1 to confirm or else press any key to go back to main menu");
		int user_input = 1;
		if (user_input == 1) {
			colors();
		} else {
			System.out.println();
			System.out.println("Input mismatch taking ypou back to previous menu");
			Hero.Hero_Main();
		}
	}

	public static void colors() {
		System.out.println("Available colors and their prices");
		System.out.println("   Color_Name         Price");
		System.out.println("    -----------|-----------");
		System.out.println("1. Yellow      |     72160 Rs");
		System.out.println("2. Silver      |     75200 Rs");
		System.out.println("3. Black       |     74400 Rs");
		System.out.println();

		Scanner sc = new Scanner(System.in);

		int color_choice = sc.nextInt();
		switch (color_choice) {
		case 1:
			last("Passion pro", "Yellow", 72160);
			break;
		case 2:
			last("Passion pro", "Silver", 75200); // M C S
			break;
		case 3:
			last("Passion pro", "Black", 74440);
			break;
		default:
			System.out.println("Wrong Choice. Taking you back to previous steps");
			Hero_Main();

		}
	}

	public static void last(String Bikename, String colorname, double price) {

		System.out.println("So you have selected " + Bikename + " and this color " + colorname);
		System.out.println("This bike will cost you " + price + " Rupees");
		System.out.println("Press 1 to continue booking");
		System.out.println("Or Press any key to go back to previous menu");

		Scanner sc = new Scanner(System.in);

		int user_last_choice = sc.nextInt();

		switch (user_last_choice) {
		case 1:
			final_bill();
			break;

		default:
			System.out.println("Wrong Choice");
			colors();
		}
		disp_cust_details();
		System.out.println("Bike name: " + Bikename);
		System.out.println("Color : " + colorname);
		System.out.println("");
		System.out.println("Total Bill after disocunt is");
		System.out.println("");
		final_price(price);
		Instruction.to_Instruction();

	}

	public static void final_bill() {
		cust_details();
	}
}

///////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////
class Jawa extends Bike {

	public static void Jawa_Main() {
		System.out.println("In Jawa brand we have this bikes please enter your choice");
		System.out.println("1. Standard");
		System.out.println("2. Forty Two");
		System.out.println("");
		Scanner sc = new Scanner(System.in);

		int Jawa_choice = sc.nextInt();

		switch (Jawa_choice) {

		case 1: {
			Jawa m = new Standard(); // Upcasting
			Standard sp = (Standard) m; // Downcasting
			System.out.println("You have chose Standard");

			sp.choose_Standard();
			break;
		}

		case 2: {
			Jawa hspl = new Forty_two();
			Forty_two spl = (Forty_two) hspl;
			System.out.println("You have selected Standardt");
			spl.choose_Forty_two();
			break;
		}

		default:
			// throw new IllegalArgumentException("Unexpected value: " +choice);
			System.out.println();
			System.out.println("Wrong Choice");
			System.out.println("");
			Jawa.Jawa_Main();
		}
	}

}

//////////////////////////////////////
class Standard extends Jawa {
	static String Bikename = "Standard";
	static String colorname;
	static double price;

	public void choose_Standard() {
		System.out.println("Showing details of Standard");
		details();
	}

	public static void details() {
		System.out.println("=============================");
		System.out.println();
		System.out.println();
		System.out.println("The Standard is poweWhite by a 293 cc engine which produces of max power of 23 bhp.");
		System.out.println();
		System.out.println("Emission Type		:	BS6");
		System.out.println("Engine Displ		:	293 cc");
		System.out.println("Front Brake			:	DISC");
		System.out.println("Starting 			:	Kick and Self Start");
		System.out.println("Fuel Capacity		:	16 L");
		System.out.println("Max Power			:	Singel Channel");
		System.out.println();
		System.out.println("Press 1 to confirm or else press any key to go back to main menu");
		int user_input = 1;
		if (user_input == 1) {
			colors();
		} else {
			System.out.println();
			System.out.println("Input mismatch taking ypou back to previous menu");
			Jawa.Jawa_Main();
		}
	}

	public static void colors() {
		System.out.println("Available colors and their prices");
		System.out.println("   Color_Name         Price");
		System.out.println("    -----------|-----------");
		System.out.println("1. Brown       |     182000 Rs");
		System.out.println("2. Black       |     189000 Rs");
		System.out.println("3. White       |     192000 Rs");
		System.out.println();

		Scanner sc = new Scanner(System.in);

		int color_choice = sc.nextInt();
		switch (color_choice) {
		case 1:
			last("Standard", "Brown", 182000);
			break;
		case 2:
			last("Standard", "Black", 189000); // M C S
			break;
		case 3:
			last("Standard", "White", 192000);
			break;
		default:
			System.out.println("Wrong Choice. Taking you back to previous steps");
			Jawa_Main();

		}
	}

	public static void last(String Bikename, String colorname, double price) {

		System.out.println("So you have selected " + Bikename + " and this color " + colorname);
		System.out.println("This bike will cost you " + price + " Rupees");
		System.out.println("Press 1 to continue booking");
		System.out.println("Or Press any key to go back to previous menu");

		Scanner sc = new Scanner(System.in);

		int user_last_choice = sc.nextInt();

		switch (user_last_choice) {
		case 1:
			final_bill();
			break;

		default:
			System.out.println("Wrong Choice");
			colors();
		}
		disp_cust_details();
		System.out.println("Bike name: " + Bikename);
		System.out.println("Color : " + colorname);
		System.out.println("");
		System.out.println("Total Bill after disocunt is");
		System.out.println("");
		final_price(price);
		Instruction.to_Instruction();

	}

	public static void final_bill() {
		cust_details();
	}

}

///////////////////////////////////////////////////
class Forty_two extends Jawa {
	static String Bikename = "Forty two";
	static String colorname;
	static double price;

	public void choose_Forty_two() {
		System.out.println("Showing details of Forty_two");
		details();
	}

	public static void details() {
		System.out.println("=============================");
		System.out.println();
		System.out.println();
		System.out.println("The Forty two is poweWhite by a 87 cc engine which produces of max power of 5 bhp.");
		System.out.println();
		System.out.println("Emission Type		:	BS6");
		System.out.println("Engine Displ		:	293 cc");
		System.out.println("Front Brake			:	DISC");
		System.out.println("Starting 			:	Kick and Self Start");
		System.out.println("Fuel Capacity		:	16 L");
		System.out.println("Max Power			:	Singel Channel");
		System.out.println();
		System.out.println("Press 1 to confirm or else press any key to go back to main menu");
		int user_input = 1;
		if (user_input == 1) {
			colors();
		} else {
			System.out.println();
			System.out.println("Input mismatch taking ypou back to previous menu");
			Jawa.Jawa_Main();
		}
	}

	public static void colors() {
		System.out.println("Available colors and their prices");
		System.out.println("   Color_Name         Price");
		System.out.println("    -----------|-----------");
		System.out.println("1. Brown       |     182000 Rs");
		System.out.println("2. Black       |     189000 Rs");
		System.out.println("3. White       |     192000 Rs");
		System.out.println();

		Scanner sc = new Scanner(System.in);

		int color_choice = sc.nextInt();
		switch (color_choice) {
		case 1:
			last("Forty two", "Brown", 182000);
			break;
		case 2:
			last("Forty two", "Black", 189000); // M C S
			break;
		case 3:
			last("Forty two", "White", 192000);
			break;
		default:
			System.out.println("Wrong Choice. Taking you back to previous steps");
			Jawa_Main();

		}
	}

	public static void last(String Bikename, String colorname, double price) {

		System.out.println("So you have selected " + Bikename + " and this color " + colorname);
		System.out.println("This bike will cost you " + price + " Rupees");
		System.out.println("Press 1 to continue booking");
		System.out.println("Or Press any key to go back to previous menu");

		Scanner sc = new Scanner(System.in);

		int user_last_choice = sc.nextInt();

		switch (user_last_choice) {
		case 1:
			final_bill();
			break;

		default:
			System.out.println("Wrong Choice");
			colors();
		}
		disp_cust_details();
		System.out.println("Bike name: " + Bikename);
		System.out.println("Color : " + colorname);
		System.out.println("");
		System.out.println("Total Bill after disocunt is");
		System.out.println("");
		final_price(price);
		Instruction.to_Instruction();

	}

	public static void final_bill() {
		cust_details();
	}

}
///////////////////////////////////////////////////
