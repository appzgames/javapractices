package overiding;

public class Car extends Vehicle{

	public void start() {
		System.out.println("Started the Car");
	}

	public void engine() {
		System.out.println("Car engine is on..");
	}
}
