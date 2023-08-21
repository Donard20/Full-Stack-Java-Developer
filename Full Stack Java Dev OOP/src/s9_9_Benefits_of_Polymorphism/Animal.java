package s9_9_Benefits_of_Polymorphism;

public class Animal {

	// properties
	protected float height;
	protected float weight;
	protected String animalType;
	protected String bloodType;

	// constructor
	public Animal() {

		this.height = 0;
		this.weight = 0;
		this.animalType = "unknown";
		this.bloodType = "unknown";
	}

	// show information
	public String showInfo() {
		return "Animal [height=" + height + ", weight=" + weight + ", animalType=" + animalType + ", bloodType="
				+ bloodType + "]";
	}

}
