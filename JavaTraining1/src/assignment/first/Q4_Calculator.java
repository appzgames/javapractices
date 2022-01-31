package assignment.first;
import java.util.Scanner;

public class Q4_Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:: ");
		int a = sc.nextInt();
		
		System.out.println("Choose an operation ( + or - or * or / or % ) :: ");
		String o = sc.next();
		
		System.out.println("Enter second number:: ");
		int b = sc.nextInt();
		
		switch(o) {
		case("+"):
			System.out.println("\n"+a+o+b+" = "+(a+b));
			break;
		case("-"):
			System.out.println("\n"+a+o+b+" = "+(a-b));
			break;
		case("*"):
			System.out.println("\n"+a+o+b+" = "+(a*b));
			break;
		case("/"):
			System.out.println("\n"+a+o+b+" = "+(a/b));
			break;
		case("%"):
			System.out.println("\n"+a+o+b+" = "+(a%b));
			break;
		default:
			System.out.println("\nINVALID OPERATION");
			break;
		}
		
		sc.close();
		
	}
}
