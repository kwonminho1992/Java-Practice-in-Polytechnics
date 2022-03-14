package practice;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p1 {
	
	public static void main(String[] args) {
		// P1 : Program to Calculate the Probabilities (미완성)
		// 복잡할때는 그림을 그려 먼저 모델링을 한 다음에 코드로 옮길 것
		System.out.println("P1 : Program to Calculate the Probabilities");
		
	    //set dice, sum
		Scanner scanner = new Scanner(System.in);
		System.out.println("input how many dices you have : ");
		int dice = scanner.nextInt(); // number of dice user inputs
		System.out.println("input sum of the dices : ");
		int sumOfTotal = scanner.nextInt(); // sum of dices user inputs
		int eye = 1;
		ArrayList<Integer> dices = new ArrayList<Integer>(); 
	    ArrayList<Integer> eyes = new ArrayList<Integer>(); 
	    
	    for (int i = 1; i <= 6; i++) { // make array 1,2,3,4,5,6
	    	eyes.add(i);
	    }
	    
	    for (int i = 0; i < dice; i++) { // make array, and it has elements as much as dice numbers 
	    	dices.add(1);
	    }
	    
	    
		//run the application
		if (sumOfTotal < dice || sumOfTotal > dice * 6 || dice < 2) { //detect error
			System.out.println("ERROR");
		} else { // proceed
			printNumberOfCases(0, dice);
			
		}	
	}		
	
	
	public static void printNumberOfCases (int n, int dice) {
		ArrayList<Integer> dices = new ArrayList<Integer>(); 
	    for (int i = 0; i < dice; i++) { // make array, and it has elements as much as dice numbers 
	    	dices.add(1);
	    }
		
		if (n == dice) { // finish the function
			return;
		} else { // proceed
			for (int i = 1; i <= 6; i++) {
				dices.set(n, i);
				if (n == dice - 1) {
					System.out.println(dices);
				} else {
					printNumberOfCases(n + 1, dice);
				}
			}
		}		
	}

}
