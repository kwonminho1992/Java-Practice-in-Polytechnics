package homework;

import java.util.ArrayList;
import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		// A1: Fibonacci Numbers
		System.out.println("A1: Fibonacci Numbers");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("input numbers : ");
		int n = scanner.nextInt(); // get value from user's input
		
		System.out.println(n + " - " + fibonacciArray(n)); // print the result
		

	}
	
	public static ArrayList<Integer> fibonacciArray (int n) {
		ArrayList<Integer> fibonacci = new ArrayList<Integer>();
		if (n == 0) { //if n = 0, print f0 only
			fibonacci.add(0);
			return fibonacci;
		} else if (n == 1) { //if n = 1, print f0, f1
			fibonacci.add(0);
			fibonacci.add(1);	
			return fibonacci;
		} else if (n >= 2) { // if n >= 3  :  print f0 ~ fn
			fibonacci.add(0);
			fibonacci.add(1);		
			for (int i = 2; i <= n; i++) {
				fibonacci.add(fibonacci.get(i-2) + fibonacci.get(i-1));
			}
			return fibonacci;
		} else { // error (if user inputs negative numbers
			System.out.println("ERROR : You can not input negative numbers");
			return fibonacci;
		}	
	}
}
