package interfaceDemo;

public class ImplementationClass implements Interface1 {

	@Override
	public void method1() {
		System.out.println("inherited from interface");
		
	}

	@Override
	public void method2() {
		System.out.println("inherited from interface");
		
	}
	
	void mymethod() {
		System.out.println("This is my class method");
		
	}
	
	public static void main(String[] args) {
		ImplementationClass obj = new ImplementationClass();
		obj.method1();
		obj.method2();
		obj.mymethod();
	}
}
