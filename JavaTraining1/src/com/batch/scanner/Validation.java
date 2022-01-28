package com.batch.scanner;

import java.util.Scanner;

public class Validation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value:: ");
		
		if(sc.hasNextInt()) {
			System.out.println("Entered value is an integer");
		}
		else {
			System.out.println("Entered value is not an integer");
		}
		
		sc.close();		
		
	}
}
