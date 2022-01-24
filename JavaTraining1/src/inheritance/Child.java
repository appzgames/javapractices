package inheritance;

public class Child extends Parent{
	
	public void childmethod() {
		System.out.print("Child logic");
	}
	
	public static void main(String[] args) {
		Parent pobj = new Parent(); //parent object
		pobj.parentmethod();
		
		Child cobj = new Child(); //Child object 
		cobj.parentmethod(); //parent method through child object
		cobj.childmethod();
	}

	
}
