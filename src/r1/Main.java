package r1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// R1 : Vedic Mathematics I (using integer type)
		System.out.println("R1 : Vedic Mathematics I");
		
		//get user's input
		Scanner scanner = new Scanner(System.in);
		System.out.println("input first number : ");
		int n1 = scanner.nextInt();
		System.out.println("input second number : ");
		int n2 = scanner.nextInt();		
		
		//result
		Calculation calculation = new Calculation(n1, n2);
		boolean bool = calculation.isRightFormOrNot();
		
		if (bool == true) { // show answer
			calculation.isResult();
		} else { // if n1 or n2 is 0, print 0
			System.out.println("answer : 0");
		}
	}

}
