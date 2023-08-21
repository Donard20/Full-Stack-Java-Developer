package s8_9_inheritance_part_4;

public class Vehicle {
	
	// properties
	private String engine;
	private int wheels;
	private int seats;
	private int fueTank;
	private String lights;

	
	// value of properties using constructor default
	public Vehicle() {
		this.engine = "petrol";
		this.wheels = 4;
		this.seats = 4;
		this.fueTank = 35;
		this.lights = "LED";
	}

	//constructor for custom value
	public Vehicle(String engine, int wheels, int seats, int fueTank, String lights) {
		
		this.engine = engine;
		this.wheels = wheels;
		this.seats = seats;
		this.fueTank = fueTank;
		this.lights = lights;
	}

	// getters of the properties
	public String getEngine() {
		return engine;
	}

	public int getWheels() {
		return wheels;
	}

	public int getSeats() {
		return seats;
	}

	public int getFueTank() {
		return fueTank;
	}

	public String getLights() {
		return lights;
	}
	
	
	
	
 
}