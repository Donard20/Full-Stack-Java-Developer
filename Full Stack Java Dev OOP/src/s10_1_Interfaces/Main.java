package s10_1_Interfaces;

public class Main {

	public static void main(String[] args) {

		//Polymorphism using Standardize name "Phone"
		Phone iphone = new Iphone8();
		Phone onePlus5 = new OnePlus5();
		
		System.out.println("Processor: " + iphone.processor());
		System.out.println("Processor: " + onePlus5.processor());
	}
	
	/*
	 * First of all, there is a restriction 
	 * applied in your classes and you must 
	 * implement all the unimplemented methods.
	 * So that's one thing you can standardize 
	 * these method names.First advantage.
	 * Second advantage is you can apply 
	 * concept of polymorphism.
	 * */

}
