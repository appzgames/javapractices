package basics;

class LogcalOperators {

	public static void main(String[] args) {

		System.out.println((10>5) && (30>20));
		
		System.out.println((10>5) && (30>70));
		
		System.out.println((10>50) || (30>70)); 
		
		System.out.println((300>500) || (300> 200)); 
		
		System.out.println((10>5) && (10>20));  
		
		System.out.println(((20>15) && (10>5)) && ((10>50) || (30>20)));

		
	}

}