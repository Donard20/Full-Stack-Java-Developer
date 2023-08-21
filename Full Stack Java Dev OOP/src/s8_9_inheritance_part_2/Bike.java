package s8_9_inheritance_part_2;

public class Bike extends Vehicle{
	
	//properties
	private String handle;

	//default constructor with value
	public Bike() {
		super();
		this.handle = "short";
	}

	// constructor parametize
	public Bike(String handle) {
		super();
		this.handle = handle;
	}

	// add getters to access the private properties into the Main
	public String getHandle() {
		return handle;
	}
	
	
	
	
	

}
