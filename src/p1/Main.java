package p1;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		//P1 : Program to Duplicate Numbers
		System.out.println("P1 : Program to Duplicate Numbers");
		
		UI ui = new UI();
		Calculation calcultation = new Calculation();
		
		String numbers1 = ui.inputNumbers(); // user inputs first numbers (ex. 22.1 45 -80 ...)
		ArrayList<Double> arr1 = calcultation.makeArrayList(numbers1); 
		if (arr1.size() != 0) { // if user inputs right form in first numbers, proceed
			String numbers2 = ui.inputNumbers(); // user inputs second numbers (ex. 22.1 45 -80 ...)
			ArrayList<Double> arr2 = calcultation.makeArrayList(numbers2);
			if (arr2.size() != 0) { // if user inputs right form in second numbers, proceed
				ArrayList<Double> result = calcultation.findDuplicateNumbers(arr1, arr2); // find duplicate numbers
				System.out.println("result : " + result);
			} else {
			}
		} else {
		}
	}
}
