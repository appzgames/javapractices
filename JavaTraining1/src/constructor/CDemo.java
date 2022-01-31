package constructor;

public class CDemo {

	int age;
	String s;
	 
	public CDemo(int a, String s) { //user defined constructor which takes arguments
		this.age = a;
		this.s = s;
	}
	
	public static void main(String[] args) {
		
		CDemo cd1 = new CDemo(10,"ABC");
		CDemo cd2 = new CDemo(20, "XYZ");
		
		System.out.println(cd1.age+" "+cd1.s);
		System.out.println(cd2.age+" "+cd2 .s);
	}

}
