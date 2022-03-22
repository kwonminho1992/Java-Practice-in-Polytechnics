package r1;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculation {
	
	public ArrayList<String> makeArrayList() { //get user's input and put into arraylist
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<String>();
		System.out.println("input 0 or 1 to make square (size : 4 * 3)\nExample\n1000\n0001\n1111");
		for (int i = 0; i < 3; i++) {
			System.out.println("line " + i + " : ");
			String line = scanner.nextLine();
			arr.add(line);
		}
		return arr;
	}
	
	public boolean checkRightFormOrNot (ArrayList<String> arr) { // if user filled with wrong form, return false
		boolean bool = true;
		for (int i = 0; i < arr.size(); i++) { //find wrong characters
			for (int j = 0; j < arr.get(i).length(); j++) {
				if ((int) arr.get(i).charAt(j) <= 47 || (int) arr.get(i).charAt(j) >= 50 || arr.size() != 3 || arr.get(i).length() != 4) {
					bool = false;
					break;
				} else {
				}
			}
			if (bool == false) {
				break;
			} else {
			}
		}		
		if (bool == true) {
			return true;
		} else {
			return false;
		}
	}
	
	public void PassOrFail (ArrayList<String> arr) {
		boolean bool = false;
		// if satisfy the condition, var 'bool' becomes true
		if ((int) arr.get(0).charAt(0) == 48 && (int) arr.get(1).charAt(0) == 48 && (int) arr.get(2).charAt(0) == 48) {
			bool = true;
		} else if ((int) arr.get(0).charAt(1) == 48 && (int) arr.get(1).charAt(1) == 48 && (int) arr.get(2).charAt(1) == 48) {
			bool = true;
		} else if ((int) arr.get(0).charAt(2) == 48 && (int) arr.get(1).charAt(2) == 48 && (int) arr.get(2).charAt(2) == 48) {
			bool = true;
		} else if ((int) arr.get(0).charAt(3) == 48 && (int) arr.get(1).charAt(3) == 48 && (int) arr.get(2).charAt(3) == 48) {
			bool = true;
		} else {
		}
		
		if (bool == true) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
	}
}
