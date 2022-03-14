package a2;

import java.util.Scanner;

public class Main {
	public static int[] numbers = {123, 32, 356, 53, 2, 67, 31, 78, 41, 9, 29};
	public static void main(String[] args) {
		// A2 : Printing Numbers Matching the Condition
		System.out.println("A2 : Printing Numbers Matching the Condition");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input any number to find numbers which contains it");
		int index = scanner.nextInt();
		
		if (index >= 0 && index < 10) {
			findNumberContainIndex(index);
		} else {
			System.out.println("ERROR : the length of Index must be 1");
		}
	}
	
	public static void findNumberContainIndex (int index) {
		// convert numbers array(integer) into String array
		String[] numbersByString = new String[numbers.length];
		String indexByString = String.valueOf(index);
		for (int i = 0; i < numbers.length; i++) {
			numbersByString[i] = String.valueOf(numbers[i]);
		}
		// finding elements contain index
		System.out.print("the numbers contain " + indexByString + " : ");
		for (int i = 0; i < numbersByString.length; i++) {
			if (numbersByString[i].contains(indexByString)) {
				System.out.print(numbersByString[i] + ", ");
			} else {
			}
		}
	}
}
