package practice;

import java.util.Scanner;

public class p2 {

	public static void main(String[] args) {
		// P2 : Banking System
		System.out.println("P2 : Banking System");
		
		int balance = 0;
		
		while (true) {
			//start menu
			Scanner scanner = new Scanner(System.in);
			System.out.println("1. deposit\n2. withdrawal");
			int choice = scanner.nextInt();
			
			if (choice == 1) { // deposit
				System.out.println("how much do you want to deposit? ");
				int deposit = scanner.nextInt();
				balance = balance + deposit;
			} else if (choice == 2) { // withdrawal
				System.out.println("how much do you want to withdraw? ");
				int withdrawal = scanner.nextInt();
				if (balance >= withdrawal) { //if balance >= withdrawal, then proceed 
					balance = balance - withdrawal;
				} else { // if balance < withdrawal, don't proceed
					System.out.println("You can't withdraw money over balance.");
				}
			} else { // error (wrong choice)
				System.out.println(choice + " is wrong choice. please choose again");
			}
			System.out.println("Balance : " + balance);
		}
	}
}
