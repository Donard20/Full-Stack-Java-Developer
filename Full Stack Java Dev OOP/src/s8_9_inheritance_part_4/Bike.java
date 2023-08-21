package s8_9_inheritance_part_4;

public class Bike extends Vehicle{
	
	//properties
	private String handle;

	//default constructor with value
	public Bike() {
		super();
		this.handle = "short";
	}

	// constructor parameter
	public Bike(String handle, String engine, int wheels, int seats, int fueTank, String lights) {
		//super("diesel", 4,4,40,"LED"); // 1st option adding value in default
		super(engine, wheels,seats, fueTank, lights); // 2nd option adding value in default
		this.handle = handle;
	}

	// add getters to access the private properties into the Main
	public String getHandle() {
		return handle;
	}

	// return the string representation of object
	public String toString() {
		return "Bike [getHandle()=" + getHandle() + ", getEngine()=" + getEngine() + ", getWheels()=" + getWheels()
				+ ", getSeats()=" + getSeats() + ", getFueTank()=" + getFueTank() + ", getLights()=" + getLights()
				+ "]";
	}
	
	
	
	
	
	

}
