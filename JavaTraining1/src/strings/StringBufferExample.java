package strings;


public class StringBufferExample {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Hello ");
		
		sb.append("World");
		
		System.out.println(sb);
		
		sb.insert(6, "Awesome ");
		
		System.out.println(sb);
		
		
		
	}
	
}
