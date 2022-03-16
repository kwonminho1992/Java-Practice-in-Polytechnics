package homework;

import java.util.ArrayList;
import java.util.Scanner;

public class A3 {
	public static int count = 0;
	public static void main(String[] args) {
		// A3 : Descriptive Statistics Calculation
		System.out.println("A3 : Descriptive Statistics Calculation");
		ArrayList<Double> numbers = new ArrayList<Double>();
		int count = 0;
		while (true) {
			calculate(numbers);
		}
		
	}
	
	public static void calculate (ArrayList<Double> numbers) {
		Scanner scanner = new Scanner(System.in);
		
		//get value from user's input
		System.out.println("input a number");
		double n = scanner.nextDouble();
		numbers.add(n);
		
		double mean = 0;
		double max = n;
		double min = n;
		for (int i = 0;  i < numbers.size(); i++) {
			mean = mean + numbers.get(i); // average
			if (numbers.get(i) > max) { // max
				max = numbers.get(i);
			} else {
			}
			if (numbers.get(i) < min) { // min
				min = numbers.get(i);
			} else {
			} 
		}
		mean = mean / numbers.size();
		count++;
		System.out.println("RESULT - " + count + ", Mean : " + mean + ", max : " + max + ", min : " + min);
	}

}
