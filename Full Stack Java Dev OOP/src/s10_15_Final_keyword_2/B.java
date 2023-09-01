package s10_15_Final_keyword_2;

//subclass

public class B{

	// property
	private final int x = 1;	// add keyword final
	
	// default constructor
//	public B() {
//		super();
//	}


	// constructor parameter
//	public B(int x) {
//		super();
//		this.x = x;
//	}


	// get the data and set the data
	public int getX() {
		return x;
	}


	public void india() {
		
		System.out.println("Hello PH");
	}


	public void USA() {
		System.out.println("Hello USA");
		
	}
	
	

	// remove the setter because of "final"
//	public void setX(int x) {
//		this.x = x;
//	}
//	
	
	/* the final keyword in Java is used to signify
	 *  immutability or unchangeability. It can be 
	 *  applied to variables, methods, and classes, 
	 *  providing various levels of protection against
	 *   modification, overriding, or inheritance, 
	 *   depending on where it is used. */
	
	
	
	
}
