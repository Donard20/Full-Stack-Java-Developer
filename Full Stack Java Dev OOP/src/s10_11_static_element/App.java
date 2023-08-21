package s10_11_static_element;

public class App {

	public static void main(String[] args) {


		// object of testStatic
		
		System.out.println(TestStatic.getStaticVariable());
		TestStatic.setStaticVariable(1);	// customize the variable by setter method
		System.out.println(TestStatic.getStaticVariable());
		
		
		
		TestStatic.setStaticVariable(12);	// customize the variable by setter method
		System.out.println(TestStatic.getStaticVariable());
		
		
		

		// no static keyword in TestStatic Class
//		0
//		1
//		0
//		12
//		0
		
		// with static keyword in TestStatic Class
//		0
//		1
//		1
//		12
//		12
		/* static variable has an independent memory location or in other
		words, they have a single copy in memory.*/
	}

}
