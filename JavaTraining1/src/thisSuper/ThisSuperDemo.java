package thisSuper;

class Parent{ //parent class
	String color = "White"; //parent instance var
}

class Child extends Parent{
	
	String color = "Black"; //child instance var
	
	void printColor() {
		String color = "Red"; //local var
		
		System.out.println(color); // local color variable
		System.out.println(this.color); // current class color variable
		System.out.println(super.color); // parent class color variable
		
	}
}

public class ThisSuperDemo {

	public static void main(String[] args) {
		
		Child c = new Child();
		c.printColor();
	
	}

}
