package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class p3 {

	public static void main(String[] args) {
		// P3 : Program to Calculate the Sum of Multiples of N
		System.out.println("Program to Calculate the Sum of Multiples of N");
		
	    //set number, multiple
		Scanner scanner = new Scanner(System.in);
		System.out.println("set number : ");
		int number = scanner.nextInt();
		System.out.println("set multiple : ");
		int multiple = scanner.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>(); // multiples
		int sum = 0;
		
		//run the application
		if (number > multiple && number > 0 && multiple > 0) { // if number > multiple, then proceed
			for (int i = 1; i <= number; i++) {
				if (i % multiple == 0) { // input multiples into array 
					arr.add(i);
				} else {
				}
			}
		} else { // if number < multiple, then print ERROR message
			System.out.println("ERROR");
		}
		for (int i = 0; i < arr.size(); i++) { // sum of multiples
			sum = sum + arr.get(i);
		}
		System.out.println("Sum of multiples = " + sum + " " + arr);
	}

}
