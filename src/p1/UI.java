package p1;

import java.util.Scanner;

public class UI {
	Scanner scanner = new Scanner(System.in);
	public String inputNumbers() {
		System.out.println("Please input numbers (*please keep form as below)");
		System.out.println("example : 2.6 3.5 -11 134 655 91");
		String numbersUserInput = scanner.nextLine();
		return numbersUserInput;
	}
	
	public void showErrorMessage() {
		System.out.println("ERROR : please keep form\nwright example : 2.6 3.5 7.1 6 -10\n"
				+ "wrong example : 2.1, 55, 7,6,-12.2, ten, +85 ...");
	}

}
