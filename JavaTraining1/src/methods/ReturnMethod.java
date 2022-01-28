package methods;
public class ReturnMethod {
	public void PrintSum(int a, int b) {		
		System.out.println("PrintSum method:: " + a +"+"+ b + "= "+ (a+b));
	}
	public int AddSum(int a, int b) {
		int sum = a + b;
		return sum;
	}	
	public static void main(String[] args) {
		ReturnMethod obj = new ReturnMethod();
		int a=10, b=50;
		obj.PrintSum(a,b);
		int c=7, d=3;
		int sum = obj.AddSum(c, d);
		System.out.println("AddSum method:: "+c+"+"+d+"= "+sum);
	}
}
