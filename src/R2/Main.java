package R2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// R2 : Comparing the velocities in different units
		System.out.println("R2 : Comparing the velocities in different units");
		System.out.println("input values (only 3 units available - m/s, km/h, m/ms");
		System.out.println("**form : 12m/s 23.5km/h 11km/h 3m/ms**");
		
		//get user's input
		Scanner scanner = new Scanner(System.in);
		String values = scanner.nextLine();
		
		//find the fastest one
		try {
			Calculation cal = new Calculation(values); 
			String result = cal.OptFastestOne();
			System.out.println("The fastest one : " + result);
		} catch (Exception e) {
			System.out.println("You have inputted by wrong form!");
		}
	}

}
