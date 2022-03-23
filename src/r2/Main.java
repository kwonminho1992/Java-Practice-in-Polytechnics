package r2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// R2 : Vedic Mathematics II (using String type)
		System.out.println("R1 : Vedic Mathematics II");
		
		//get user's input
		Scanner scanner = new Scanner(System.in);
		System.out.println("input first number : ");
		String n1 = scanner.nextLine();
		System.out.println("input second number : ");
		String n2 = scanner.nextLine();		
		
		//result
		Calculation calculation = new Calculation(n1, n2);
		
		String a1 = calculation.frontDigit();
		String a2 = calculation.backDigit();
		String a11 = calculation.arithmeticOperation(a1);
		String a22 = calculation.arithmeticOperation(a2);
		System.out.println(a1 + "\n" + a11 + "\n" + a2 + "\n" + a22);
			
		boolean bool = calculation.isRightFormOrNot();
		
		if (bool == true) { // show answer
			calculation.isResult();
		} else { // if n1 or n2 is 0, print 0
			System.out.println("answer : 0");
		}
	}

}
