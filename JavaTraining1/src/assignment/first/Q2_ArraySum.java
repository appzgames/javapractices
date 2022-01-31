package assignment.first;
import java.util.Scanner;

public class Q2_ArraySum {

	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array length:: ");
		int len = sc.nextInt();
		int [] arr = new int [len];
		
		System.out.println("Enter the array elements one by one::");
		
		for(int i = 0;i<len;i++) {    //loop for taking array input
			arr[i] = sc.nextInt();
		}	
		
		for(int i=0;i<len;i++) {      //loop for finding array sum
			sum = sum + arr[i];
		}
		
		System.out.println("\nSum of your array = "+sum);
		sc.close();
	}
}
