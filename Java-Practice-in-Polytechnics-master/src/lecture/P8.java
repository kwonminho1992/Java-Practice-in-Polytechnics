package lecture;

import java.util.Scanner;

public class P8 {

	public static void main(String[] args) {
		// P8 : Exception Handling
		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("input number (length of array)");
		int n = scanner.nextInt();
		System.out.println("make array (form : 21 23 44 12)");
		String numbers = scanner2.nextLine();
		
		try {
			String[] numbersArr = numbers.split(" ");
			for (int i = 0; i < n; i++) {
				System.out.print(numbersArr[i] + ", ");
			}
		} catch (Exception e) {
			System.out.println("error");
		}
	}
}
