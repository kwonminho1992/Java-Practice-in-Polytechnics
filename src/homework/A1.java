package homework;

import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		// A1 : Permutation (using recursive function)
		System.out.println("A1 : Permutation (using recursive function)");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int result = permutation(a, b);
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
}
