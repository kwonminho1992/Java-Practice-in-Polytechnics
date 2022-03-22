package r1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// R1 : Drawing a line vertically or horitontally
		// The whole size is 4 x 3 (input only 0 or 1)
		// Show ¡°Pass¡± if 0s are connected vertically or horitontally

		Calculation calculation = new Calculation();
		System.out.println("R1 : Drawing a line vertically or horitontally");
		
		ArrayList<String> arr = calculation.makeArrayList(); // get user's input and make an arraylist
		boolean bool = calculation.checkRightFormOrNot(arr); // if user's satisfy the right form, return true
		
		//print result
		if (bool == true) {
			calculation.PassOrFail(arr);
		} else {
			System.out.println("ERROR : You haven't keep rigth form!");
		}
	}

}
