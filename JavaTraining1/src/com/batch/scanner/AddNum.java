package com.batch.scanner;

import java.util.Scanner;

public class AddNum {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //scanner object created
		
		System.out.println("Enter first number:: ");
		int num1 = sc.nextInt(); //reads first number
		
		System.out.println("Enter first number:: ");
		int num2 = sc.nextInt(); //reads second number
		
		System.out.println("Sum of both numbers = "+(num1+num2)); //prints sum
		sc.close();

	}
}
