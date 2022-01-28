package overiding;

public class Main {

	public static void main(String[] args) {

		Vehicle v = new Vehicle();
		Bus b = new Bus();
		Car c = new Car();
		Car bmw = new Bmw();
		
		v.start();
		
		b.start();
		b.engine();
		
		c.start();
		c.engine();
		
		bmw.start();
		bmw.engine();

	}

}
