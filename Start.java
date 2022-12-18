package vehicle;

import java.util.Scanner;

class Customer_details {

	private static String Cust_name;
	private static String phone;
	private static String address;

	public void transfer_cntrl() {

		Customer_details cst = new Vehicle();
		Vehicle vc = (Vehicle) cst;
		vc.vehicle_choice();
	}

	public static void cust_details() {

		System.out.println("***PLEASE ENTER YOUR DETAILS ***");
		System.out.println("Enter Name: ");
		Scanner sc = new Scanner(System.in);
		Cust_name = sc.nextLine();

		System.out.println("Enter Phone: ");
		Scanner sc2 = new Scanner(System.in);
		phone = sc2.next();

		System.out.println("Enter Address:");
		Scanner sc3 = new Scanner(System.in);
		address = sc3.nextLine();
		System.out.println();
		System.out.println("Thank you for entering the your details");
		System.out.println();
	}

	public static void disp_cust_details() {
		System.out.println("======================Bill========================");
		System.out.println("");
		Customer_details cd = new Customer_details();
		System.out.println("Name : " + Cust_name);
		System.out.println("phone : " + phone);
		System.out.println("address : " + address);
	}

	public static void final_price(double price) {

		System.out.println("Total bill: " + price + " Rupees");
	}
}

class Vehicle extends Customer_details {
	public static void vehicle_choice() {
		System.out.println("      Hii!    ");
		System.out.println("");
		System.out.println("Welcome to Star Automobiles.");
		System.out.println();
		System.out.println("Please enter your choice:");
		System.out.println("Press 1 for Bikes");
		System.out.println("Press 2 for Cars");

		try {
			Scanner sc = new Scanner(System.in);

			int vehicle_choice = sc.nextInt();

			switch (vehicle_choice) {
			case 1: {
				System.out.println("You have selected Bike.");
				System.out.println();
				Vehicle vc = new Bike();
				Bike b1 = (Bike) vc;
				b1.bike_brand_choice();
				break;
			}
			case 2: {
				System.out.println();
				System.out.println("You have selected Car");
				System.out.println();
				Vehicle vcar = new Car();
				Car c1 = (Car) vcar;
				c1.Car_brand_choice();
				break;
			}
			default:
				System.out.println("");
				System.out.println("Looks like you entered wrong choice. Directing you back to previous menu.");
				vehicle_choice();
			}
		} catch (Exception e) {
			System.out.println("");
			System.out.println("Looks like you entered wrong choice. Directing you back to previous menu.");
			vehicle_choice();
		}
	}
}

public class Start {
	public static void main(String[] args) {
		Customer_details cust = new Customer_details();
		cust.transfer_cntrl();
	}
}
