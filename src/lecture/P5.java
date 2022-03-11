package lecture;

import java.util.Scanner;

public class P5 {

	public static void main(String[] args) {
		// P5 : Multiplication Table
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		multiplicationTable1(n);
		multiplicationTable2(n);
	}
	
	public static void multiplicationTable1 (int x) {
		if (x > 0 || x < 10) {
			for (int i = 1; i < 10; i++) {
				System.out.println(x + " * " + i  + " = " + (x * i));
			}
		} else {
			System.out.println("range : 1 ~ 9");
		}
	}
	
	public static void multiplicationTable2 (int x) {
		for (int j = 2; j <= x; j++) {
			for (int i = 1; i < 10; i++) {
				System.out.println(j + " * " + i  + " = " + (j * i));
			}
		}
	}

}
