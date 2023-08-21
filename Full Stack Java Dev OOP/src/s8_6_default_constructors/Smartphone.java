package s8_6_default_constructors;

public class Smartphone {
	// properties
	private String brand = "Samsung";
		
//	public Smartphone(String brand) {
//		super();
//		this.brand = brand;
//	}
	
	/*
	 * if there is no constructor visible 
	 *the java will inject its default constructor 
	 **/
	
	public String getBrand() {
		return brand;
	}
	

}
