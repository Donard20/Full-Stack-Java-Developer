package s6_8_nested_loops;

public class Main {

	public static void main(String[] args) {
		
		for (int i=1; i<=10; i++) {
			for(int j=1; j<=10; j++) {
				System.out.println("Value of i: " + i+" | Value of j: " +j);
			}
			System.out.println("*************");
		}
	}

}
