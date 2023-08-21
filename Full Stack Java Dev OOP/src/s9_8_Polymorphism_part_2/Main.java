package s9_8_Polymorphism_part_2;

public class Main {

	public static void main(String[] args) {

		// create object
//		Phone phone = new Phone("Nokia 3310");
//		System.out.println(phone.getModel());
//		phone.features();
//		
//		SamsungNote8 note8 = new SamsungNote8("Note 8");
//		System.out.println(note8.getModel());
//		note8.features();

		// polymorphism
//		Phone note8 = new Samsung("Note 8");
//		System.out.println(note8.getModel());
//		note8.features();
//
//		Phone nokia3310 = new Nokia("Nokia 3310");
//		System.out.println(nokia3310.getModel());
//		nokia3310.features();

		Phone nokia3310 = new Main().phone(1);
		System.out.println(nokia3310.getModel());
		nokia3310.features();

	}

	
	// Another method generating an object based on a method
	 public static Phone phone(int dailyDriver) {
		switch (dailyDriver) {
		case 1:
			return new Nokia("3310");
		case 2:
			return new Samsung("Note 5");
		}
		return null;
	}

}
