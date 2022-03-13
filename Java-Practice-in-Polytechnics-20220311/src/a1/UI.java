package a1;

import java.util.Scanner;

public class UI {
	//lectures
	String lec1 = "1. Introduction to Data Science\n";
	String lec2 = "2. Deep Learning\n";
	String lec3 = "3. IBM Data Engineering\n";
	String lec4 = "4. Key Technologies for Business\n";
	String lec5 = "5. Google IT Automation with Python\n";
	String lec6 = "6. Python for Everybody\n";
	String lec7 = "7. Meta Social Media Marketing\n";
	
	Scanner scanner = new Scanner(System.in);
	
	
	public int showMenu() { //show basic menu
		System.out.println("Menu");
		System.out.println("1. Course List");
		System.out.println("2. My Course");
		return scanner.nextInt();
	}
	

	public int showCourse() { // show course list
		System.out.println("Course List (*source : Coursera)");
		System.out.print(lec1);
		System.out.print(lec2);
		System.out.print(lec3);
		System.out.print(lec4);
		System.out.print(lec5);
		System.out.print(lec6);
		System.out.print(lec7);
		System.out.println("0. Back to the menu");
		return scanner.nextInt();
	}
}
