package homework;

import java.util.Scanner;

public class A4 {

	public static void main(String[] args) {
		// A4 : Fibonacci Sequence
		System.out.println("A4 : Fibonacci Sequence. input number");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();		
		fibonacciPrint(a);
	}
	
	public static int fibonacci (int n) {//calculate F(n)
		int zero = 0;
		int first = 1;
		int second = 1;
		if (n < 1) {
			return 0; // error
		} else if (n == 1 || n == 2) {
			return 1; // f1 = 1, f2 = 1
		} else {	
			return fibonacci(n - 2) + fibonacci(n - 1);
		}
	}

	public static void fibonacciPrint (int n) { //print all elements of F(n)
		for (int i = 0; i <= n; i++) {
			System.out.print("F" + i + " = " + fibonacci(i)+ ", ");
		}
	}
}
