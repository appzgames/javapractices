package methods;

public class StaticMethod {
	static void show() {
		System.out.println("This is a static method");
	}
	void method1() {
		System.out.println("This is a non-static method");
	}
	public static void main(String[] args) {
	show();
	StaticMethod obj = new StaticMethod();
	obj.method1();		
	}
}
