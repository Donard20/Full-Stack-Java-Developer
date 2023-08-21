package s7_1_methods;

public class Main {

	public static void main(String[] args) {

		loop(1,10);
		System.out.println("**********");
		loop(20,40);
		System.out.println("**********");
		loop(1,10);
		System.out.println("**********");
	}

	// method 1
	public static void loop(int step, int finalValue) {
		

		while (step <= finalValue) {
			System.out.println(step);
			step++;
		}

	}

	// method 2
//	public static void loop2() {
//		
//		int j = 20;
//		
//		while (j <= 40) {
//			System.out.println(j);
//			j++;
//		}
//	}

}
