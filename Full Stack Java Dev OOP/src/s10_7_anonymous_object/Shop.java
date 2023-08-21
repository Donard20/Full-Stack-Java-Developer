package s10_7_anonymous_object;

public class Shop {

	public static void main(String[] args) {

		// doing anonymous object/nameless object

//		Door door = new Door();

		if (new Door().isLocked(args[2])) { // directly inputting the object without naming it
			System.out.println("Shop has closed, visit later.");
		} else {
			System.out.println("Welcome we are open.");
		}
		System.out.println(args[1]);
		System.out.println(args[0]);

	}

}
