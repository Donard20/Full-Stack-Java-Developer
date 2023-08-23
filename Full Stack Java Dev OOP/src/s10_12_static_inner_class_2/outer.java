package s10_12_static_inner_class_2;

public class outer {
	
	// property
//	private static int testVar = 5;	// add static keyword to have access in inner class
									// since it is inner static 
	
	// method
	public static void testOuterMethod() {
		System.out.println("from outer method");
		System.out.println("Value of inner class variable: " + Inner.x); // accessing the inner class inside this class
		Inner.testingInnermethod();	// accessing the inner method in inner class of this class
	}
	
	// class of inner
	public static class Inner {
		
		// property inside Inner Class
		public static int x = 0;
		
		// method for testing in inner class
		public static void testingInnermethod() {
			System.out.println("Test");
//			System.out.println("Test Variable value: " + testVar);
//			testOuterMethod(); // calling the method outside inner class
		}
	}

}
