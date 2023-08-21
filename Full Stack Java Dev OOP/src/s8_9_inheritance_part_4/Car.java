package s8_9_inheritance_part_4;

public class Car extends Vehicle{

	// properties of Car
	private String steering;
	private String musicSystem;
	private String airConditioner;
	private String fridge;
	private String entertainmentSystem;
	
	// default values for Car
	public Car() {
		super();
		this.steering = "Power Steering";
		this.musicSystem = "Analog";
		this.airConditioner = "Cold";
		this.fridge = "Small Type";
		this.entertainmentSystem = "Radio";	
	}
	
	// constructor
	public Car( String steering, String musicSystem, String airConditioner, String fridge, String entertainmentSystem, String engine, int wheels, int seats, int fueTank, String lights) {
		super(engine, wheels,seats, fueTank, lights);
		this.steering = steering;
		this.musicSystem = musicSystem;
		this.airConditioner = airConditioner;
		this.fridge = fridge;
		this.entertainmentSystem = entertainmentSystem;
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

	public String getFridge() {
		return fridge;
	}

	public String getEntertainmentSystem() {
		return entertainmentSystem;
	}

	// get the info in one variable
	public String toString() {
		return "Car [getSteering()=" + getSteering() + ", getMusicSystem()=" + getMusicSystem()
				+ ", getAirConditioner()=" + getAirConditioner() + ", getFridge()=" + getFridge()
				+ ", getEntertainmentSystem()=" + getEntertainmentSystem() + ", getEngine()=" + getEngine()
				+ ", getWheels()=" + getWheels() + ", getSeats()=" + getSeats() + ", getFueTank()=" + getFueTank()
				+ ", getLights()=" + getLights() + "]";
	}
	
	
	
	
	
}
