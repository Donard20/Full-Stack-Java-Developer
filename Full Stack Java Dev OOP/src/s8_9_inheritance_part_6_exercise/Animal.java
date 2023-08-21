package s8_9_inheritance_part_6_exercise;

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
