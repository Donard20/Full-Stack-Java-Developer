package s9_7_Polymorphism_part_1;

// parent class
public class Phone {

	// properties
	private String model;

	// custom constructor that will be use by subclass
	public Phone(String model) {

		this.model = model;
	}

	// method
	public void features() {
		System.out.println("Feature phone");
	}

	public String getModel() {
		return model;
	}

}
