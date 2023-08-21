package s6_7_loops_revisited;

public class Main {

	public static void main(String[] args) {

		/*FOR LOOP
		 * for (int i = 1, j = 1; i < 10 || j < 10; i++, j++) { j++;
		 * System.out.println("i=" + i + " , j=" + j); }
		 */
		
		/* WHILE LOOP
		int i = 1, j = 1;
		while (i < 10 || j < 10) {

			i++;
			j++;
			System.out.println("i=" + i + " , j=" + j);
		} */
		
		/* DO-WHILE LOOP
		int i =1, j=1;
		do {
			i++;
			j++;
			System.out.println("i=" + i + " , j=" + j);
		} while (i < 10 || j < 10);
		*/
	}

}
