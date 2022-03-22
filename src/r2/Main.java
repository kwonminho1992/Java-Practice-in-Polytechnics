package r2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// R2 : Calculating ages in international age and in Korean age
		System.out.println("R2 : Calculating ages in international age and in Korean age");
		
		//get today
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
		String today = formatter.format(date);
		
		//get user's input
		Scanner scanner = new Scanner(System.in);
		System.out.println("input your birthday \n*ex : 20010304 (You should keep the form)");
		String birthday = scanner.nextLine();
		
		//result
		Calculation calculation = new Calculation(today, birthday);
		boolean bool = calculation.isRightFormOrNot();
		if (bool == true) { // if user keeps right form, print result
			calculation.isAge();
		} else { // if user doesn't keep right form, print error message
			System.out.println("ERROR : please keep right form! OR do not input your birthday over today");
		}
	}

}
