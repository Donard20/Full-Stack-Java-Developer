package s8_1_getter_and_setter;

public class Car {
	
	private String doors;
	private String engine;
	private String driver;
	private int speed;
	
	//method setter
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	// method getter
	public int getSpeed() {
		return speed;
	}

	public String getDoors() {
		return doors;
	}

	public void setDoors(String doors) {
		this.doors = doors;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}
	
	// add functionality getting the private variables
	public String run() {
		if (doors.equals("closed") && engine.equals("on")
				&& driver.equals("seated") && speed > 0 ) {
			return "running";
		} else {
			return "not running";
		}
	}
	
	
	
	
	
}
