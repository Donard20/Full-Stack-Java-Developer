package s9_8_Polymorphism_part_2;

public class Samsung extends Phone {

	// subclass

	// constructor
	public Samsung(String model) {
		super(model); // use super for extending data
	}

	// method/function overriding the method in parent class
	public void features() {
		System.out.println("Android Flagship");
	}

}
