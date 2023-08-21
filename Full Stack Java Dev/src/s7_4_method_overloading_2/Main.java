package s7_4_method_overloading_2;

public class Main {

	public static void main(String[] args) {
		
	
		System.out.println("1 + 2 = " + sum(1, 2));
		System.out.println("1 + 2.5 = " + sum(1, 2.5F));	//add 'F' to recognize the parameter as float
		System.out.println("1.3 + 2.3 = " + sum(1.3, 2.3));
	}
	
	//method of sum
	public static int sum(int x, int y) {
		System.out.println("Adding 2 int entities");
		return x+y;
	}
	
	//overloading method sum
	public static float sum(int x, float y) {
		System.out.println("Adding 1 int and 1 float entity");
		return x+y;
	}
	
	//overloading method sum 2
	public static double sum(double x, double y) {
		System.out.println("Adding 2 double entities");
		return x+y;
	}
}
