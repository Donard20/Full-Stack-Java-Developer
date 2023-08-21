package s10_11_static_element;

public class TestStatic {
	
	// property
	public static int staticVariable = 0;
	/* static variable has an independent memory location or in other
		words, they have a single copy in memory.*/
	
	// getting data and setting the data
	public static int getStaticVariable() {
		return staticVariable;
	}

	public static void setStaticVariable(int staticVariable) {
		TestStatic.staticVariable = staticVariable;
	}
	
	

}
