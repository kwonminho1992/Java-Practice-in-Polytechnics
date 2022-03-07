package lecture;

import java.util.Scanner;

public class p15 {

	public static void main(String[] args) {
		// Calculator
		System.out.println("Plz input formula (ex. 2*4, 3/5)");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		float result = 0;
		
		if (input.contains("+")) {
			float num1 = Float.parseFloat(input.substring(0, input.indexOf("+")));
			float num2 = Float.parseFloat(input.substring(input.indexOf("+")+1, input.length()));
			result = num1 + num2;
		} else if (input.contains("-")) {
			float num1 = Float.parseFloat(input.substring(0, input.indexOf("-")));
			float num2 = Float.parseFloat(input.substring(input.indexOf("-")+1, input.length()));
			result = num1 - num2;
		} else if (input.contains("*")) {
			float num1 = Float.parseFloat(input.substring(0, input.indexOf("*")));
			float num2 = Float.parseFloat(input.substring(input.indexOf("*")+1, input.length()));
			result = num1 * num2;
		} else if (input.contains("/")) {
			float num1 = Float.parseFloat(input.substring(0, input.indexOf("/")));
			float num2 = Float.parseFloat(input.substring(input.indexOf("/")+1, input.length()));
			result = num1 / num2;
		} else {
			System.out.println("ERROR");
		}
		System.out.println("result : " + result);
	}

}
