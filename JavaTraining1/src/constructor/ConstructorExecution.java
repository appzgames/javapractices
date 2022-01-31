package constructor;

public class ConstructorExecution {

	ConstructorExecution() { 
		System.out.println("Constructor executes for each object created");
	}
	
	public static void main(String[] args) {
		
		ConstructorExecution c1 = new ConstructorExecution();
		ConstructorExecution c2 = new ConstructorExecution();
		ConstructorExecution c3 = new ConstructorExecution();
		ConstructorExecution c4 = new ConstructorExecution();
	}

}
