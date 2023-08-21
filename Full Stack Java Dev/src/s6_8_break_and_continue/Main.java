package s6_8_break_and_continue;

public class Main {

	public static void main(String[] args) {
		
		for (int i=0; i <=10; i++) {
			System.out.println(i); // no change
			if(i==5) {
//				break;	// will break the cycle in 5
				continue;
			}
			System.out.println(i); 	// skip the 5
		}

	}

}
