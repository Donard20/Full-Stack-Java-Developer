package s7_3_method_overloading;

public class Main {

	public static void main(String[] args) {
		
		
		System.out.println("Area of rectangle: "+area(14.25d, 10.65d));
		System.out.println("Area of square: "+area(5));
	}
	
	// method of area of rectangle
	public static double area(double length, double width) {
		return length*width;
	}
	
	//OVERLOADING the METHOD
	//method overloading of area of square
	public static double area(double side) {
		return side*side;
	}
	
	//method overloading of area without decimal 'void' to 'int'
	public static int area(int side) {
		return side*side;
	}

}
