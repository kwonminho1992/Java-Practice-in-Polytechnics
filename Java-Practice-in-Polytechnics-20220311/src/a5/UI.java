package a5;

import java.util.Scanner;

public class UI {
	Scanner scanner = new Scanner(System.in);
	
	public void showUnits() {
		System.out.println("There are units you can choose");
		System.out.println("1. km");
		System.out.println("2. m");
		System.out.println("3. cm");
		System.out.println("4. mm");
		System.out.println("5. mile");
	}
	
	public int chooseFirstUnit() {
		System.out.println("Step 1 : please choose the unit you want to change");
		return scanner.nextInt();
	}
	
	public int chooseSecondUnit() {
		System.out.println("Step 2 : please choose the changed unit you want to see the result");
		return scanner.nextInt();
	}	
	
	public double inputValueInFirstUnit() {
		System.out.println("Step 3 : how much is it that you want to change??");
		return scanner.nextDouble();
	}		

}
