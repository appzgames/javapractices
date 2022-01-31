package thisSuper;

class P {
	void me() { 
		System.out.println("parent method ");
	}
	
}

class C extends P {
	void me() {
		System.out.println("child method ");
	}
	
	void call() {
		this.me();
		super.me();
	}
}

public class ThisSuperMethod {

	public static void main(String[] args) {

		C c = new C();
		c.call();

	}

}
