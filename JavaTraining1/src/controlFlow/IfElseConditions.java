package controlFlow;

public class IfElseConditions {

	public static void main(String[] args) {
	

		int age = 39; 
		String state ="kerala";
		
		if (age < 18) { 
			System.out.println(" This guy is not eligible to vote ");
		}
		
		else  if ( age>18 && state == "kerala"){  
			
			System.out.println(" Eligible to vote  ");
		}
		
		else  {
			System.out.println(" Guy is not belongs to kerala and also age is less than 18");
		}

	}

}