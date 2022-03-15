package p1;

import java.util.ArrayList;

public class Calculation {
	UI ui = new UI();
	
	public ArrayList<Double> makeArrayList(String numbers) {
		ArrayList<Double> arrByDouble = new ArrayList<Double>();
		 
		//input numbers to array		
		if (checkRigthFormOrNot(numbers) == true) { //if user keeps form, proceed
			String[] arrByString = numbers.split(" ");
			for (int i = 0; i < arrByString.length; i++) {
				double a = Double.parseDouble(arrByString[i]);
				arrByDouble.add(a);
			}
			return arrByDouble;
		} else { //if user doesn't keep form, show error message
			if (checkRigthFormOrNot(numbers) == false) {
				showError();
			} else {
			}
			return arrByDouble;
		}	
	}
	
	public ArrayList<Double> findDuplicateNumbers(ArrayList<Double>arr1, ArrayList<Double>arr2) {
		ArrayList<Double> arrDuplicateNumbers = new ArrayList<Double>();
		//find duplicate numbers from 2 arrays	
		for (int i = 0; i < arr1.size(); i++) {
			for (int j = 0; j < arr2.size(); j++) {
				if (arr1.get(i) - arr2.get(j) == 0) {
					arrDuplicateNumbers.add(arr1.get(i));
				} else {
				}
			}	
		}
		return arrDuplicateNumbers;
	}	
	
	public boolean checkRigthFormOrNot (String numbers) { 
		//check user keeps form or not
		boolean passOrNot = true;
		for (int i = 0; i < numbers.length(); i++) {
			if ((int) numbers.charAt(i) <= 31 || (int) numbers.charAt(i) >= 33 && (int) numbers.charAt(i) <= 44
					|| (int) numbers.charAt(i) == 47 || (int) numbers.charAt(i) >= 58) {
				passOrNot = false;
			} else {
			}
		}
		if (passOrNot == false) {
			return false;
		} else {
			return true;
		}
	}
	
	public void showError () {
		ui.showErrorMessage();
	}	
}
