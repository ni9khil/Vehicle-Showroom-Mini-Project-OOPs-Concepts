package vehicle;

import java.util.Scanner;

class Instruction {

	public static void to_Instruction() { // methods for details
		System.out.println("===========================================================================");
		System.out.println();
		System.out.println("***** INSTRUCTIONS  FOR BOOKING *****");
		System.out.println();
		System.out.println("*/ TO Proceed for booking!!! you need to follow these steps /*");
		System.out.println();
		System.out.println(" Choose Payment Option.");
		System.out.println(" ");
		System.out.println(" And Confirm Booking ");
		System.out.println();
		System.out.println("Press 1 to continue");
		Instruction.IE();

	}

	public static void IE() {
		Scanner sc = new Scanner(System.in);
		int choose = sc.nextInt();

		switch (choose) {
		case 1:
			Payment_md(); // Transfer control or calling statement for payment method
			break;
//				 System.out.println();
//				 System.out.println();
//				 System.out.println("***PLEASE ENTER YOUR DETAILS ***");
//				 System.out.println();
//				 System.out.println("enter your name  ");
//				 Scanner scan=new Scanner(System.in);                             
//				 String name=scan.nextLine();
//				 System.out.println("enter your phone ");
//				 Scanner scan1=new Scanner(System.in);                             
//				 String phone=scan1.nextLine();
//				 System.out.println("enter your email [enter only username] ");
//				 String email=scan.next();
//				 System.out.println("enter your Address ");                             
//				 String address=scan.next();
//				 

//				Coustmer_Details cd=new Coustmer_Details(name,phone,email,address);
//				System.out.println("Name  : "+cd.getName());		
//				System.out.println("Email : "  + cd.getEmail() + "@gmail.com");
//				System.out.println("Phone : " + cd.getPhone());
//				System.out.println("Address : " + cd.getAddress());

		default:

			System.out.println(" Oops! It looks like you have entered wrong input.");
			System.out.println(" Let me take you to previous menu.");// rollback

			Instruction.to_Instruction();

		}

	}

	public static void Payment_md() {
		System.out.println();
		System.out.println("*** Please choose payment method ***");
		System.out.println();
		System.out.println("1.UPI");
		System.out.println("2.CREDIT/DEBIT CARD");
		System.out.println("3.Net banking");
		System.out.println();
		System.out.println("Please Select any one method");
		paymentsss p = new payment(); // @Override
		p.pay();

	}

}

/////////////////////////////////////// PAYMENTS///////////////////////////////////////////////////////////////////////
interface paymentsss {
	void pay();
}

class payment implements paymentsss {

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();

		switch (i) {
		case 1:
			Paid("UPI");

			break;

		case 2:
			Paid("CREDIT/DEBIT");

			break;

		case 3:
			Paid("NET-BANKING");

			break;

		default:
			break;
		}

	}

	public void Paid(String M_N) {
		System.out.println();
		System.out.println("You have selected " + M_N + " for payment");
		System.out.println();
		System.out.println("Payment done using " + M_N);
		System.out.println("THANKYOU for BOOKING ");
		System.out.println();
		System.out.print("Your order will be processed and your vehicle will be delivered within a week.");
		System.out.println("");
		System.out.println("Thank you.");
		// payment pay=new payment();
		// pay.Bill();

	}
//	public void Bill() {
//		System.out.println(" =============  Bill  =============");      
//		                                                //control transfer to Instuction-class last reumse their only
//	}

}

/////////////////////////////////////////////// Coustmer_Details /////////////////////////////////////////////////////////

//class Coustmer_Details{
//  private	     String name;
//  private		 String phone;
//  private		 String email;
//  private        String address;
//
//
//  
//public String getAddress() {
//	return address;
//}
//public void setAddress(String address) {
//	 this.address=address;
//	 
//}
//
//  
//public String getName() {
//	return name;
//}
//public void setName(String name) {
//	this.name = name;
//}
//
//
//public String getPhone() {
//	return phone;
//}
//public void setPhone(String phone) {
//	this.phone = phone;
//}
//
//
//public String getEmail() {
//	return email;
//}
//public void setEmail(String email) {
//	this.email = email;
//}
//	
//		
//public Coustmer_Details(String name,String phone,String email,String address) {
//	// TODO Auto-generated constructor stub
//	    this.name=name;
//		this.phone=phone;
//		this.email=email;
//		this.address=address;
//		
//}
//}
