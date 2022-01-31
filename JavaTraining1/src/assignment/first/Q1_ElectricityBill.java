package assignment.first;

import java.util.Scanner;

public class Q1_ElectricityBill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Customer name : ");
		String cname = sc.next();
		
		System.out.println("Customer id : ");
		int cid = sc.nextInt();
		
		System.out.println("Units consumed : ");
		int units = sc.nextInt();
		
		int cost;
		boolean warn = false;
		
		if ( (units>=0) && (units<100) ){
			cost = 0;
		}
		else if ( (units>=100) && (units<200) ) {
			cost = units * 5;
		}
		else if ( (units>=200) && (units<300) ) {
			cost = units * 20;
		}
		else if ( (units>=300) && (units<1000) ) {
			cost = units * 100;
		}
		else {
			cost = units * 100;
			warn = true;
		}
		
		System.out.println("\n*************************************"
						 + "\n*********ELECTRICITY-BILL************"
						 + "\n*************************************"
						 + "\nCustomer Name : "+cname
						 + "\nCustomer ID   : "+cid
						 + "\nUnits         : "+units
						 + "\nCost          : "+"Rs "+cost+"/-");
		
		if(warn) {
		System.out.println("\n#######-USAGE LIMIT EXCEEDED-########"
						 + "\n####-WARNING FOR DISCONNECTION-######");
		}
		
		System.out.println("\n*************************************");
		
		sc.close();
		

	}

}
