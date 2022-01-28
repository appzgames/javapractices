package com.batch.scanner;

import java.util.Scanner;

public class StudentData {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter student name : ");
		String name = sc.next(); //reads a word from user
		
		System.out.println("Enter roll number : ");
		int rollno = sc.nextInt(); //reads a number from user
		
		System.out.println("Enter school name : ");
		String school = sc.next(); //reads a word from user
		
		System.out.println(name+"'s roll number is "+rollno+". He/She is studying in "+school+" school.");
		sc.close();
		
		
	}
	
}
