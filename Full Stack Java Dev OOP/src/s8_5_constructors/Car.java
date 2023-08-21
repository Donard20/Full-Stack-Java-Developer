package s8_5_constructors;

public class Car {

	private String doors;
	private String engine;
	private String driver;
	private int speed;

	// constructor
	public Car() {
		doors = "opened";
		engine = "off";
		driver = "absent";
		speed = 0;
	}

	// constructor
	public Car(String doors, String engine, String driver, int speed) {
		super();
		this.doors = doors;
		this.engine = engine;
		this.driver = driver;
		this.speed = speed;
	}

	// method setter
	public void setSpeed(int speed) {
		this.speed = speed;
	}


	// add functionality getting the private variables
	public String run() {
		if (doors.equals("closed") && engine.equals("on") && driver.equals("seated") && speed > 0) {
			return "running";
		} else {
			return "not running";
		}
	}
	
}
