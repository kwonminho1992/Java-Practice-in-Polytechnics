package a4;

import java.util.ArrayList;

public class Calculation {
	UI ui = new UI();
	
	public double calculateNearestNumber(String numbers, double number) {
		ArrayList<Double> arrByDouble = new ArrayList<Double>();
		ArrayList<Double> arrDifference = new ArrayList<Double>();
		 
		//handling numbers (input to array)		
		if (checkStepOneRigthFormOrNot(numbers, number) == true && 
				checkStepTwoRigthFormOrNot(numbers, number) == true) { //if user keeps form in step 1&2, proceed
			String[] arrByString = numbers.split(" ");
			for (int i = 0; i < arrByString.length; i++) {
				// refine the number user chose in step 2, and do not add in the array
				if (Double.parseDouble(arrByString[i]) != number) {  
					double n = Double.parseDouble(arrByString[i]);
					arrByDouble.add(n);
					n = Math.abs(number - n);
					arrDifference.add(n);
				} else {
				}
			}
			 //find the nearest number
		    double nearestDifference = arrDifference.get(0);
		    double nearestNumber = arrByDouble.get(0);
			for (int j = 1; j < arrDifference.size(); j++) {
				if (arrDifference.get(j) < nearestDifference) {
					nearestDifference = arrDifference.get(j);
					nearestNumber = arrByDouble.get(j);
				} else {
				}
			}		
			return nearestNumber; // return the target value (the nearest number)
		} else { //if user doesn't keep form in step 1, show error message
			if (checkStepOneRigthFormOrNot(numbers, number) == false) {
				showErrorInStepOne();
			} else if (checkStepTwoRigthFormOrNot(numbers, number) == false) {
				showErrorInStepTwo();
			} else {
			}
			return 0;
		}	
	}
	
	public boolean checkStepOneRigthFormOrNot (String numbers, double number) { 
		//check user keeps form or not in step 1
		boolean passStepOneOrNot = true;
		for (int i = 0; i < numbers.length(); i++) {
			if ((int) numbers.charAt(i) <= 31 || (int) numbers.charAt(i) >= 33 && (int) numbers.charAt(i) <= 44
					|| (int) numbers.charAt(i) == 47 || (int) numbers.charAt(i) >= 58) {
				passStepOneOrNot = false;
			} else {
			}
		}
		if (passStepOneOrNot == false) {
			return false;
		} else {
			return true;
		}
	}
	
	public boolean checkStepTwoRigthFormOrNot (String numbers, double number) { 
		//check user inputs right number or not in step 2
		boolean passStepTwoOrNot = false;
		ArrayList<Double> arr = new ArrayList<Double>();
		 
		//input to array
		String[] arrByString = numbers.split(" ");
		for (int i = 0; i < arrByString.length; i++) {
				double n = Double.parseDouble(arrByString[i]);
				arr.add(n);
		}
		//check
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) == number) {
				passStepTwoOrNot = true;
			} else {
			}
		}
		if (passStepTwoOrNot == true) {
			return true;
		} else {
			return false;
		}		
	}
	
	public void showErrorInStepOne () {
		ui.showErrorMessageOfStepOne();
	}
	
	public void showErrorInStepTwo () {
		ui.showErrorMessageOfStepTwo();
	}
	
}
