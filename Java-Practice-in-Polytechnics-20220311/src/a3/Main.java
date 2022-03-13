package a3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// A3 : Reverse a String
		System.out.println("A3 : Reverse a String\nPlease input string");
		
		Scanner scanner = new Scanner(System.in);
		Reverse reverse = new Reverse();
		
		String text = scanner.nextLine();
		String result = reverse.reverseString(text);
		System.out.println("result : " + result);
		
	}

}

