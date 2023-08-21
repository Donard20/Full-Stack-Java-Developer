package s9_9_Benefits_of_Polymorphism;

public class Crocodile extends Reptile{

	public Crocodile() {
		super();	// to retain the values in the parent Reptile Class
		egg = "hard shelled";
		
	}

	
	public String showInfo() {
		return "Crocodile [skin=" + skin + ", egg=" + egg + ", backbone=" + backbone + ", height=" + height
				+ ", weight=" + weight + ", animalType=" + animalType + ", bloodType=" + bloodType + "]";
	}
	
	
	

}
