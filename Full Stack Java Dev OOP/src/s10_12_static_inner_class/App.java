package s10_12_static_inner_class;

public class App {

	public static void main(String[] args) {


		outer.Inner.testingInnermethod();	// accessing the method inside the inner class of outer

		System.out.println(outer.Inner.x);
		
	}
	
}
