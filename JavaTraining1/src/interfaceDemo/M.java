package interfaceDemo;

interface Continent {
	void continentname();
}

interface Country {
	void countryname();
}

interface City {
	void cityname();
}

public class M implements Continent, Country, City {

	@Override
	public void cityname() {
		System.out.println("Banglore");
		
	}

	@Override
	public void countryname() {
		System.out.println("India");
		
	}

	@Override
	public void continentname() {
		System.out.println("Asia");
		
	}
	
	public static void main(String[] args) {
		
		M m = new M();
		
		m.cityname();
		m.countryname();
		m.continentname();
	}
	
}

