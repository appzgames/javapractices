package constructor;

public class CDemo2 {
	//Three types of constructors => 1. default no argument constructor by compiler
								//	 2.no argument constructor by user
								//   3.parameterized constructor
	
	int i;
	String s;
	
	CDemo2(){ //no argument constructor by user
		System.out.println("No argument constructor");
	}
	
	public static void main(String[] args) {

		CDemo2 cdd = new CDemo2();
		System.out.println(cdd.i+" "+cdd.s); //output: 0 and null (default)

	}

}
