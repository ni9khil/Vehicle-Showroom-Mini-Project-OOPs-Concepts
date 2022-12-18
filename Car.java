package vehicle;

import java.util.Scanner;

class Car extends Vehicle {
	public static void Car_brand_choice() {
		System.out.println("In Cars, we have these brands");
		System.out.println();
		System.out.println("1. Tata");
		System.out.println("2. Mahindra");
		System.out.println("");
		System.out.println();
		Scanner sc = new Scanner(System.in);

		int user_brand_choice = sc.nextInt();
		switch (user_brand_choice) {
		case 1:
			System.out.println();
			System.out.println("You have selected Tata Brand");
			Car b1 = new Tata();
			Tata h = (Tata) b1;
			h.Tata_Main();
			break;

		case 2:
			System.out.println("You have selected Yamaha Brand");
			Car b2 = new Mahindra();
			Mahindra j = (Mahindra) b2;
			j.Mahindra_Main();
			break;
		default:
			System.out.println();
			System.out.println("Looks like you have entered wrong choice.");
			System.out.println("");
			System.out.println("Wait. Directing you back to previous menu.");
			Car_brand_choice();
			break;
		}
	}
}

///////////////////////////////////
class Tata extends Car {

	public static void Tata_Main() {
		System.out.println("In Tata brand we have this Cars please enter your choice");
		System.out.println("1. Harrier");
		System.out.println("2. Safari");
		// System.out.println("3. For Tata Passion Pro");
		Scanner sc = new Scanner(System.in);

		int Tata_choice = sc.nextInt();

		switch (Tata_choice) {

		case 1: {
			Tata m = new Harrier(); // Upcasting
			Harrier sp = (Harrier) m; // Downcasting
			System.out.println("You have chose Harrier");
			sp.choose_Harrier();
			break;
		}

		case 2: {
			Tata hspl = new Safari();
			Safari spl = (Safari) hspl;
			System.out.println("You have selected Harrier");
			spl.choose_Safari();
			break;
		}

		default:
			// throw new IllegalArgumentException("Unexpected value: " +choice);
			System.out.println();
			System.out.println("Wrong Choice");
			System.out.println("");
			Tata_Main();
		}
	}

}

class Harrier extends Tata {
	static String Carname = "Harrier";
	static String colorname;
	static double price;

	public void choose_Harrier() {
		System.out.println("Showing details of Harrier");
		details();
	}

	public static void details() {
		System.out.println("=============================");
		System.out.println();
		System.out.println();
		System.out.println("The Harrier is powered by a 1956 cc engine which produces of max power of 350 bhp.");
		System.out.println();
		System.out.println("Emission Type		:	BS6");
		System.out.println("Engine Displ		:	1956cc");
		System.out.println("Front Brake			:	DISC");
		System.out.println("Fuel Type 			:	Diesel and Petrol");
		System.out.println("Fuel Capacity		:	50 L");
		System.out.println("Max Power			:	Singel Channel");
		System.out.println();
		System.out.println("Press 1 to confirm or else press any key to go back to main menu");
		int user_input = 1;
		if (user_input == 1) {
			colors();
		} else {
			System.out.println();
			System.out.println("Input mismatch taking ypou back to previous menu");
			Tata.Tata_Main();
		}
	}

	public static void colors() {
		System.out.println("Available colors and their prices");
		System.out.println("   Color_Name         Price");
		System.out.println("    -----------|-----------");
		System.out.println("1. White       |     1400000 Rs");
		System.out.println("2. Black       |     1700000 Rs");
		System.out.println("3. Red         |     2200000 Rs");
		System.out.println();

		Scanner sc = new Scanner(System.in);

		int color_choice = sc.nextInt();
		switch (color_choice) {
		case 1:
			last("Harrier", "White", 1400000);
			break;
		case 2:
			last("Harrier", "Black", 1700000); // M C S
			break;
		case 3:
			last("Harrier", "Red", 2200000);
			break;
		default:
			System.out.println("Wrong Choice. Taking you back to previous steps");
			Tata_Main();

		}
	}

	public static void last(String Carname, String colorname, double price) {

		System.out.println("So you have selected " + Carname + " and this color " + colorname);
		System.out.println("This Car will cost you " + price + " Rupees");
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
		System.out.println("Car name: " + Carname);
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

//////////////////////////////////////////////////////////////////////////////

class Safari extends Tata {
	static String Carname = "Safari";
	static String colorname;
	static double price;

	public void choose_Safari() {
		System.out.println("Showing details of Safari");
		details();
	}

	public static void details() {
		System.out.println("=============================");
		System.out.println();
		System.out.println();
		System.out.println("The Safari is powered by a 1956 cc engine which produces of max power of 350 bhp.");
		System.out.println();
		System.out.println("Emission Type		:	BS6");
		System.out.println("Engine Displ		:	1956cc");
		System.out.println("Front Brake			:	DISC");
		System.out.println("Fuel Type 			:	Diesel and Petrol");
		System.out.println("Fuel Capacity		:	50 L");
		System.out.println("Max Power			:	Singel Channel");
		System.out.println();
		System.out.println("Press 1 to confirm or else press any key to go back to main menu");
		int user_input = 1;
		if (user_input == 1) {
			colors();
		} else {
			System.out.println();
			System.out.println("Input mismatch taking ypou back to previous menu");
			Tata.Tata_Main();
		}
	}

	public static void colors() {
		System.out.println("Available colors and their prices");
		System.out.println("   Color_Name         Price");
		System.out.println("    -----------|-----------");
		System.out.println("1. White       |     1400000 Rs");
		System.out.println("2. Black       |     1700000 Rs");
		System.out.println("3. Red         |     2200000 Rs");
		System.out.println();

		Scanner sc = new Scanner(System.in);

		int color_choice = sc.nextInt();
		switch (color_choice) {
		case 1:
			last("Safari", "White", 1400000);
			break;
		case 2:
			last("Safari", "Black", 1700000); // M C S
			break;
		case 3:
			last("Safari", "Red", 2200000);
			break;
		default:
			System.out.println("Wrong Choice. Taking you back to previous steps");
			Tata_Main();

		}
	}

	public static void last(String Carname, String colorname, double price) {

		System.out.println("So you have selected " + Carname + " and this color " + colorname);
		System.out.println("This Car will cost you " + price + " Rupees");
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
		System.out.println("Car name: " + Carname);
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

///////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////

class Mahindra extends Car {

	public static void Mahindra_Main() {
		System.out.println("In Mahindra brand we have this Cars please enter your choice");
		System.out.println("1. Thar");
		System.out.println("2. Scorpio");
		// System.out.println("3. For Mahindra Passion Pro");
		Scanner sc = new Scanner(System.in);

		int Mahindra_choice = sc.nextInt();

		switch (Mahindra_choice) {

		case 1: {
			Mahindra m = new Thar(); // Upcasting
			Thar sp = (Thar) m; // Downcasting
			System.out.println("You have chose Thar");
			sp.choose_Thar();
			break;
		}

		case 2: {
			Mahindra hspl = new Scorpio();
			Scorpio spl = (Scorpio) hspl;
			System.out.println("You have selected Thar");
			spl.choose_Scorpio();
			break;
		}

		default:
			// throw new IllegalArgumentException("Unexpected value: " +choice);
			System.out.println();
			System.out.println("Wrong Choice");
			System.out.println("");
			Mahindra_Main();
		}
	}

}

class Thar extends Mahindra {
	static String Carname = "Thar";
	static String colorname;
	static double price;

	public void choose_Thar() {
		System.out.println("Showing details of Thar");
		details();
	}

	public static void details() {
		System.out.println("=============================");
		System.out.println();
		System.out.println();
		System.out.println("The Thar is powered by a 1956 cc engine which produces of max power of 350 bhp.");
		System.out.println();
		System.out.println("Emission Type		:	BS6");
		System.out.println("Engine Displ		:	1956cc");
		System.out.println("Front Brake			:	DISC");
		System.out.println("Fuel Type 			:	Diesel and Petrol");
		System.out.println("Fuel Capacity		:	50 L");
		System.out.println("Max Power			:	Singel Channel");
		System.out.println();
		System.out.println("Press 1 to confirm or else press any key to go back to main menu");
		int user_input = 1;
		if (user_input == 1) {
			colors();
		} else {
			System.out.println();
			System.out.println("Input mismatch taking ypou back to previous menu");
			Mahindra.Mahindra_Main();
		}
	}

	public static void colors() {
		System.out.println("Available colors and their prices");
		System.out.println("   Color_Name         Price");
		System.out.println("    -----------|-----------");
		System.out.println("1. White       |     1400000 Rs");
		System.out.println("2. Black       |     1700000 Rs");
		System.out.println("3. Red         |     2200000 Rs");
		System.out.println();

		Scanner sc = new Scanner(System.in);

		int color_choice = sc.nextInt();
		switch (color_choice) {
		case 1:
			last("Thar", "White", 1400000);
			break;
		case 2:
			last("Thar", "Black", 1700000); // M C S
			break;
		case 3:
			last("Thar", "Red", 2200000);
			break;
		default:
			System.out.println("Wrong Choice. Taking you back to previous steps");
			Mahindra_Main();

		}
	}

	public static void last(String Carname, String colorname, double price) {

		System.out.println("So you have selected " + Carname + " and this color " + colorname);
		System.out.println("This Car will cost you " + price + " Rupees");
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
		System.out.println("Car name: " + Carname);
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

//////////////////////////////////////////////////////////////////////////////

class Scorpio extends Mahindra {
	static String Carname = "Scorpio";
	static String colorname;
	static double price;

	public void choose_Scorpio() {
		System.out.println("Showing details of Scorpio");
		details();
	}

	public static void details() {
		System.out.println("=============================");
		System.out.println();
		System.out.println();
		System.out.println("The Scorpio is powered by a 1956 cc engine which produces of max power of 350 bhp.");
		System.out.println();
		System.out.println("Emission Type		:	BS6");
		System.out.println("Engine Displ		:	1956cc");
		System.out.println("Front Brake			:	DISC");
		System.out.println("Fuel Type 			:	Diesel and Petrol");
		System.out.println("Fuel Capacity		:	50 L");
		System.out.println("Max Power			:	Singel Channel");
		System.out.println();
		System.out.println("Press 1 to confirm or else press any key to go back to main menu");
		int user_input = 1;
		if (user_input == 1) {
			colors();
		} else {
			System.out.println();
			System.out.println("Input mismatch taking ypou back to previous menu");
			Mahindra.Mahindra_Main();
		}
	}

	public static void colors() {
		System.out.println("Available colors and their prices");
		System.out.println("   Color_Name         Price");
		System.out.println("    -----------|-----------");
		System.out.println("1. White       |     1400000 Rs");
		System.out.println("2. Black       |     1700000 Rs");
		System.out.println("3. Red         |     2200000 Rs");
		System.out.println();

		Scanner sc = new Scanner(System.in);

		int color_choice = sc.nextInt();
		switch (color_choice) {
		case 1:
			last("Scorpio", "White", 1400000);
			break;
		case 2:
			last("Scorpio", "Black", 1700000); // M C S
			break;
		case 3:
			last("Scorpio", "Red", 2200000);
			break;
		default:
			System.out.println("Wrong Choice. Taking you back to previous steps");
			Mahindra_Main();

		}
	}

	public static void last(String Carname, String colorname, double price) {

		System.out.println("So you have selected " + Carname + " and this color " + colorname);
		System.out.println("This Car will cost you " + price + " Rupees");
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
		System.out.println("Car name: " + Carname);
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
