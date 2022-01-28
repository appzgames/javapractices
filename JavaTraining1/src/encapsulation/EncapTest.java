package encapsulation;

public class EncapTest {
	
	public static void main(String[] args) {
        Student obj = new Student();
        
        System.out.println(obj.studentname);
        
            String store = obj.getInstitutename();
            System.out.println(store);
	}

}