package s6_3_switch_case_3;

public class Main {

	public static void main(String[] args) {

		String name = "Don";

		switch (name.toLowerCase()) {
		case "What":
			System.out.println("The value of x is a");
			break;
		case "don":
			System.out.println("The value of x is b");
			break;
		case "Yow":
			System.out.println("The value of x is c");
			break;
		default:
			System.out.println("The value of x is more");
			break;
		}

	}

}
