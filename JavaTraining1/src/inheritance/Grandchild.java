package inheritance;

final class Grandchild extends Child{

	public static void main(String[] args) {
		Grandchild gobj = new Grandchild();
		gobj.parentmethod();
		gobj.childmethod();
 }
}
