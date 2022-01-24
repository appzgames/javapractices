package controlFlow;

public class SwitchCase {
	
	public static void main(String[] args) {
		
        int day = 7;
        
        
        switch (day)
        {
        case 1:
        	System.out.println("Today is Monday");
        	break;
        case 2: 
        	System.out.println( " Today is Tuesday");
        	break;
        case 3:
        	System.out.println("Today is Wednesday");
        	break;
        case 4: 
        	System.out.println( " Today is Thursday");
        	break;
        default:
        	System.out.println( " Not valid ");
        	break;
    
        }
	}

}