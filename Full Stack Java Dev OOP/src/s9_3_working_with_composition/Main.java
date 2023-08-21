package s9_3_working_with_composition;

public class Main {

	public static void main(String[] args) {
		
		// instantiate the object
		Laptop laptop = new Laptop();
		
		// accessing object inside the object
		System.out.println(laptop.getProcessor().getMaxfrequency()); 

	}

}
