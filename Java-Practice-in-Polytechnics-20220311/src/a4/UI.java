package a4;

import java.util.Scanner;

public class UI {
	Scanner scanner = new Scanner(System.in);
	public String inputNumbers() {
		System.out.println("Step 1 : Please input numbers (*please keep form as below)");
		System.out.println("example : 2.6 3.5 -11 134 655 91");
		String numbersUserInput = scanner.nextLine();
		return numbersUserInput;
	}
	
	public void showErrorMessageOfStepOne() {
		System.out.println("ERROR in step 1 : please keep form\nwright example : 2.6 3.5 7.1 6 -10\n"
				+ "wrong example : 2.1, 55, 7,6,-12.2, ten, +85 ...");
	}
	
	public double chooseNumber() {
		System.out.println("Step 2 : Please choose one number between the numbers you inputted");
		double numberUserInput = scanner.nextDouble();
		return numberUserInput;
	}
	
	public void showErrorMessageOfStepTwo() {
		System.out.println("ERROR in step2 : Please choose one number betwwen the numbers you already inpputed");
	}
}
