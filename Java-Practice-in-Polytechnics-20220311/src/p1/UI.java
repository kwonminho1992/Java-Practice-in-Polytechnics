package p1;

import java.util.Scanner;

public class UI {
	
	public void showMenu() { // print menu
		System.out.println("Menu");
		System.out.println("1. Apple");
		System.out.println("2. Strawberry");
		System.out.println("3. Grape");
		System.out.println("4. Watermelon");
	}
	
	public int userSelectMenu() { // user chooses menu
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}
}
