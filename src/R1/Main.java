package R1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// R1 : Comparing the two strings
		// ordering 2 strings, and then check they are same or not
		
		//get user's input
		Comparing comparing = new Comparing();
		System.out.println("R1 : Comparing the two strings");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input 2 strings to compare");
		String string1 = scanner.nextLine();
		String string2 = scanner.nextLine();
		
		//ordering the 2 strings
		String orderedString1 = comparing.orderString(string1);
		String orderedString2 = comparing.orderString(string2);
		System.out.println(orderedString1 + "\n" + orderedString2);
		
		// result
		boolean bool = comparing.comparingMatchedOrNot(orderedString1, orderedString2);
		
		if (bool == true) {
			System.out.println("Matched");
		} else {
			System.out.println("Not Matched");
		}
	}

}
