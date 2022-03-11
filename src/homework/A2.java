package homework;

import java.util.Scanner;

public class A2 {

	public static void main(String[] args) {
		// A2 : Combination (using recursive function)
		System.out.println("A2 : Combination (using recursive function)");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int result = combination(a, b);
		System.out.println("result : " + result);		
	}
	
	public static int permutation (int x, int y) {
		if (x > y) {
			if (y <= 1) {
				return x; 
			} else {
				return x * permutation(x - 1, y - 1);
			}
		} else {
			System.out.println("error");
			return 0;
		}
	}
	
	public static int factorial (int y) {
		if (y <= 1) {
			return y;
		} else {
			return y * factorial(y - 1);
		}
	}
	
	public static int combination (int x, int y) {
		return permutation(x, y) / factorial(y);
	}
}
