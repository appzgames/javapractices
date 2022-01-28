package com.batch.scanner;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //scanner object created
		
		System.out.println("Enter double value:: ");
		
		double value = sc.nextDouble();
		
		System.out.println("Double value = "+value);
		
		sc.close();
		

	}

}
