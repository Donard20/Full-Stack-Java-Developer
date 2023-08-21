package s7_2_methods_parameters_and_return;

public class Main {

	public static void main(String[] args) {
		
		/*to received the information in the method
		 * and be able to include in the print we must 
		 * use the return type and change the'void' in the method*/
		
		System.out.println("The Area of Rectangle with length = 5.4" +
							" and width = 3.2 : " + areaRectangle(5.4, 3.2));
		//double area = areaRectangle(5.4, 3.2);
		//System.out.println(area);

	}
	
	// method 
	public static double areaRectangle(double length, double width) {
		return length * width;
	}
	
	
	
	

}
