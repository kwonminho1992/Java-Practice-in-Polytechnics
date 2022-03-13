package a2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// A2 : Reverse a Number
		System.out.println("A2 : Reverse a Number\nPlease input any number");
		
		Scanner scanner = new Scanner(System.in);
		Reverse reverse = new Reverse();
		
		int number = scanner.nextInt();
		int result = reverse.reverseNumber(number);
		System.out.println("result : " + result);
		
	}

}
