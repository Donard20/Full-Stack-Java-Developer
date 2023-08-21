package s10_6_Local_Inner_Class;

public class Shop {

	public static void main(String[] args) {

		// 1st method
		Door door = new Door();
//		Boolean lock = door.isLocked("qwerty");
//		System.out.println(lock);

		// using argument key in run configurations
		if (door.isLocked(args[2])) {
			System.out.println("Shop has closed, visit later.");
		} else {
			System.out.println("Welcome we are open.");
		}
		System.out.println(args[1]);
		System.out.println(args[0]);

	}

}
