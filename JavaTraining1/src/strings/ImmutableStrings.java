package strings;

public class ImmutableStrings {

	public static void main(String[] args) {
		
		String a = "Eclipse";
		
		a.concat(" IDE");
		
		System.out.println(a); //string is immutable
		
		String b = a.concat(" IDE"); //stored in new string
		
		System.out.println(b);
	}
	
}
