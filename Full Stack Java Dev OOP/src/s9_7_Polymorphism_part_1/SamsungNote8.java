package s9_7_Polymorphism_part_1;

public class SamsungNote8 extends Phone {

	// subclass

	// constructor
	public SamsungNote8(String model) {
		super(model); // use super for extending data
	}

	// method/function overriding the method in parent class
	public void features() {
		System.out.println("Android Flagship");
	}

}
