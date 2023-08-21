package s9_5_Encapsulation;

public class Main {

	public static void main(String[] args) {

		Person john = new Person();
		System.out.println(john);
//		john.age = -10;				// unrestricted properties in Person Class
		Person don = new Person("Don", 31, "Male");
		System.out.println(don);
		don.setAge(32); // update the age by setter
		System.out.println(don);
		don.setAge(-32);
		System.out.println(don);

	}

}
