package pl.hamerhed.animals;

public class Meat implements Food {

	public Meat() {
		System.out.println("create meat");
	}
	
	public String name() {
		return "beef";
	}

}
