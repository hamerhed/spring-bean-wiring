package pl.hamerhed.animals;

public class Orange implements Food {

	protected Orange() {
		System.out.println("create orange");
	}
	
	public String name() {
		return "orange";
	}

}
