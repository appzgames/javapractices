package thisSuper;

class Par {
	Par() { //constructor
		System.out.println("parent constructor ");
	}
	
}

class Chi extends Par {
	Chi() {
		System.out.println("child constructor ");
	}
}

public class ThisSuperConstructor {

	public static void main(String[] args) {
		
		Chi obj = new Chi();

	}

}
