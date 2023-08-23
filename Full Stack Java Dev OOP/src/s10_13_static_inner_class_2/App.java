package s10_13_static_inner_class_2;

public class App {

	public static void main(String[] args) {


		outer.Inner.testingInnermethod();	// accessing the method inside the inner class of outer

		System.out.println(outer.Inner.x);
		
		new outer().testOuterMethod();	// one way to access the inner class inside outer class
		outer.testOuterMethod(); // or this one is better
	}
	
}
