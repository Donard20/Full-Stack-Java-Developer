package s10_10_user_input;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		// String property in scanning utility
		System.out.println("Whats your name?");
		Scanner scan = new Scanner(System.in);	// object of scan
		String name = scan.nextLine();		// inputting the data input in variable
		
		System.out.println("Hey there, " + name + ". Have a Nice Day!");

		// integer type
		System.out.println("What's your age?");
		Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println("Your age is "+age);
        
		
	}

}
