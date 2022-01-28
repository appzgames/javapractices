package strings;

public class StringLength {

	public static void main(String[] args) {
		String s1 = "    eclipse IDE    ";
		String s2 = "abcdef";
		
		System.out.println(s1.length());
		System.out.println(s2.length());
		
		System.out.println(s1); //original
		
		System.out.println(s1.trim()); //trimmed
		
	}
}
