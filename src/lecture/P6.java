package lecture;

import java.util.Scanner;

public class P6 {

	public static void main(String[] args) {
		// P6 : Calculator

		Scanner scanner = new Scanner(System.in);
		String operator = scanner.nextLine();
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		
		if (operator == "+") {
			getOperator('+');
			addition(3, 5);
			
		}
		
		
	}
	
	public static char getOperator (char o) {
		char operator = o;
		return operator;
	}
	
	
	public static String addition (double a, double b) {
		String result = String.valueOf(a + b);
		result = String.valueOf(a) + " + " + String.valueOf(b) + " = " + result;
		return result;
	}
	public static String subtraction (double a, double b) {
		String result = String.valueOf(a - b);
		result = String.valueOf(a) + " - " + String.valueOf(b) + " = " + result;
		return result;
	}
	public static String multiplication (double a, double b) {
		String result = String.valueOf(a * b);
		result = String.valueOf(a) + " * " + String.valueOf(b) + " = " + result;
		return result;
	}
	public static String division (double a, double b) {
		if (b != 0) {
			String result = String.valueOf(a / b);
			result = String.valueOf(a) + " / " + String.valueOf(b) + " = " + result;
			return result;
		} else {
			String result = "ERROR : You can not divide by 0";
			return result;
		}
		
	}
}
