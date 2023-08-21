package s9_6_Encapsulation_part_2;

public class Person {

	// properties/ default values
	private String name; // change from public to private
	private int age;
	private String gender;

	// delete the default constructor for best practice and customization and new object
	
	// default constructor
//	public Person() {
//
//		this.name = "John Doe";
//		this.age = 25;
//		this.gender = "Male";
//
//	}

	// customize constructor
	public Person(String name, int age, String gender) {

		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	// show the information
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

	// retrieve set and get specific property
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public boolean setAge(int age) {
		if (age >= 0 && age <= 100) {
			this.age = age;
			return true;
		}
		return false;

	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	/*
	 * Encapsulation says that encapsulate data, don't give
	 * 
	 * direct access to the outside world.
	 * 
	 * Data needs to be encapsulated inside the object itself.
	 * 
	 * Rather give getters and setters if there is a requirement and in order to
	 * 
	 * initialize the object, make use of constructors.
	 */

}
