package practice;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p1 {    
	public static void main(String[] args) {
		// P1 : Program to Calculate the Probabilities
		System.out.println("P1 : Program to Calculate the Probabilities");
		
	    //set dice, sum
		Scanner scanner = new Scanner(System.in);
		System.out.println("input how many dices you have : ");
		int dice = scanner.nextInt(); // number of dices user inputs
		System.out.println("input sum of the dices : ");
		int sumOfTotal = scanner.nextInt(); // sum of dices user inputs
	    int[] numberOfCases = new int[dice]; // make an array(* number of elements : number of dices)
	    int n = 0; // arr[0] ~ arr[n-1]
		//run the application
		if (sumOfTotal < dice || sumOfTotal > dice * 6 || dice < 2) { //detect error
			System.out.println("ERROR");
		} else { // No errors, proceed
			calculateNumberOfCases(n, dice, sumOfTotal, numberOfCases);
		}
		
	}
	
	// logic source : https://wikidocs.net/124671
	public static void calculateNumberOfCases (int n, int dice, int sumOfTotal, int[] numberOfCases) {
		if (n == dice) { // when n reaches number of dices, complete the function and print the result
			int sum = 0;
			for (int i = 0; i < numberOfCases.length; i++) { //calculate sum of each number of cases
				sum = sum + numberOfCases[i];
			}
			if (sum == sumOfTotal) { // if sum of each number of cases equals the sum user inputs, print it
				String arrayForPrint = Arrays.toString(numberOfCases);
				System.out.println(arrayForPrint); 
			} else {
			}
			
		} else { // keep finding number of cases...
			for (int i = 1; i <= 6; i++) {//1st recursion - arr[0] : 1~6, 2nd recursion - arr[1] : 1~6 .., nth recursion arr[n] : 1~6 
				numberOfCases[n] = i; // 1st time of for loop -  arr[0] = 1 .., 6th time of for loop - arr[0] = 6
				n = n + 1;
				calculateNumberOfCases(n, dice, sumOfTotal, numberOfCases); //go to the next loop
				n = n - 1; //go to the next time of for loop (so, restore the value of n)
			}	
		}
	}
}
