package homework;

import java.util.Scanner;

public class A3 {

	public static void main(String[] args) {
		// A3 : Multiplication Table (using recursive function)
		System.out.println("A3 : Multiplication Table (using recursive function)");
		System.out.println("Please input number between 1~9");		
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		System.out.println(times(a, 1));

	}
	
	public static int times (int n, int m) {
		if (n > 0 && n < 10) {
			if (m < 10) {
				System.out.println(n + " * " + m + " = " + n * m);
				return n * times(n, m + 1);
			} else {
				System.out.print("complete");
				return 0;
			} 
		} else {
			System.out.print("ERROR");
			return 0;
		}
	}

}
