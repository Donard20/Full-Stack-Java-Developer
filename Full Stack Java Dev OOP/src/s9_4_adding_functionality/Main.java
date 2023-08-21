package s9_4_adding_functionality;

public class Main {

	public static void main(String[] args) {
		
		// instantiate the object
//		Laptop laptop = new Laptop();
//		System.out.println(laptop.getProcessor().getMaxfrequency()); // accessing object inside the object

		// Custom object declaration OPTION 1
		Processor processor = new Processor("Intel", "7200U", 7, 4, 4, "6MB", "2.5Ghz", "2.5Ghz", "3.1Ghz");
		GraphicsCard graphicsCard = new GraphicsCard("NVIDIA", 1050, "4GB");
		
		Laptop gamingLaptop = new Laptop(17f, processor, "DDR4", "2TB", graphicsCard, null, "backlit");
		
		// Custom object declaration OPTION 2 inserting directly in the parameters
		Laptop gamingLaptop1 = new Laptop(17f, new Processor("Intel", "7200U", 7, 4, 4, "6MB", "2.5Ghz", "2.5Ghz", "3.1Ghz"), 
							  "DDR4", "2TB", new GraphicsCard("NVIDIA", 1050, "4GB"), null, "backlit");
		
//		System.out.println(gamingLaptop);
//		System.out.println(gamingLaptop1);
		
		System.out.println(gamingLaptop.gamingMode());
		System.out.println("Gaming Mode On");
		System.out.println("Current frequency is " + gamingLaptop.getProcessor().getFrequency());
	
	}
}
