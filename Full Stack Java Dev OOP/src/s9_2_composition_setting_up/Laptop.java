package s9_2_composition_setting_up;

// superclass
public class Laptop {

	// properties
	private float screen;
	private Processor processor; // class
	private String ram;
	private String hardDrive;
	private GraphicsCard GraphicsCard; // class
	private String opticalDrive;
	private String keyboard;

	// default constructor
	public Laptop() {
		this.screen = 15.6f;
		this.processor = new Processor(); // anonymous object will pass through from Processor Class 
		this.ram = "DDR4";
		this.hardDrive = "2TB";
		this.GraphicsCard = new GraphicsCard(); // anonymous object will pass through from GraphicsCard Class 
		this.opticalDrive = "MLT Player";
		this.keyboard = "Mechanical keyboard";
	}

	// customize constructor by parameters
	public Laptop(float screen, Processor processor, String ram, String hardDrive, GraphicsCard GraphicsCard,
			String opticalDrive, String keyboard) {
		super();
		this.screen = screen;
		this.processor = processor;
		this.ram = ram;
		this.hardDrive = hardDrive;
		this.GraphicsCard = GraphicsCard;
		this.opticalDrive = opticalDrive;
		this.keyboard = keyboard;
	}

	@Override // by doing this I can call out the info by variable define in access modifier
	public String toString() {
		return "Laptop [screen=" + screen + ", processor=" + processor + ", ram=" + ram + ", hardDrive=" + hardDrive
				+ ", GraphicsCard=" + GraphicsCard + ", opticalDrive=" + opticalDrive + ", keyboard=" + keyboard + "]";
	}
	
	// show info
	

}
