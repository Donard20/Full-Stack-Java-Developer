package s8_9_inheritance_part_4;

public class Truck extends Vehicle{
	
	// properties of Truck
	private String steering;
	private String musicSystem;
	private String airConditioner;
	private String container;
	
	// default constructor values
	public Truck() {
		super();
		this.steering = "No Power Steering";
		this.musicSystem = "Radio";
		this.airConditioner = "None";
		this.container = "Big";
	}

	// constructor to call out the truck class
	public Truck(String steering, String musicSystem, String airConditioner, String container) {
		super();
		this.steering = steering;
		this.musicSystem = musicSystem;
		this.airConditioner = airConditioner;
		this.container = container;
	}

	// getters in case individual call out of the properties of Car
	public String getSteering() {
		return steering;
	}

	public String getMusicSystem() {
		return musicSystem;
	}

	public String getAirConditioner() {
		return airConditioner;
	}

	public String getContainer() {
		return container;
	}

	@Override
	public String toString() {
		return "Truck [getSteering()=" + getSteering() + ", getMusicSystem()=" + getMusicSystem()
				+ ", getAirConditioner()=" + getAirConditioner() + ", getContainer()=" + getContainer()
				+ ", getEngine()=" + getEngine() + ", getWheels()=" + getWheels() + ", getSeats()=" + getSeats()
				+ ", getFueTank()=" + getFueTank() + ", getLights()=" + getLights() + "]";
	}
	
	
	
	
	
	
	
	
	
	

}
