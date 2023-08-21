package s9_4_adding_functionality;

//subclass
public class GraphicsCard {

	// properties
	private String brand;
	private int series;
	private String memory;

	// default constructor
	public GraphicsCard() {
		this.brand = "NVIDIA";
		this.series = 940;
		this.memory = "2 GB";
	}

	// customize constructor by parameters
	public GraphicsCard(String brand, int series, String memory) {
		
		this.brand = brand;
		this.series = series;
		this.memory = memory;
	}

	@Override
	public String toString() {
		return "GraphicsCard [brand=" + brand + ", series=" + series + ", memory=" + memory + "]";
	}
	
	

}
