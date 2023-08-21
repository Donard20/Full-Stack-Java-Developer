package s9_9_Benefits_of_Polymorphism;

public class Reptile extends Animal {

	// properties
	protected String skin, egg;
	protected boolean backbone;

	// constructor
	public Reptile() {

		// overriding the constructor from parent
		this.height = 5;
		this.weight = 20;
		this.animalType = "Reptile";
		this.bloodType = "Cold";
		
		this.skin = "Dry skin";
		this.egg = "soft shelled";
		this.backbone = true;
	}

	
	public String showInfo() {
		return "Reptile [skin=" + skin + ", egg=" + egg + ", backbone=" + backbone + ", height=" + height + ", weight="
				+ weight + ", animalType=" + animalType + ", bloodType=" + bloodType + "]";
	}
	
	

}
