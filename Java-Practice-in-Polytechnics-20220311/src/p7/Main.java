package p7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// P7 : Descriptive Statistics
		Scanner scanner = new Scanner(System.in);
		System.out.println("input name");
		String name = scanner.nextLine();
		System.out.println("input Korean score");
		int Korean = scanner.nextInt();
		System.out.println("input English score");
		int English = scanner.nextInt();
		System.out.println("input Math score");
		int Math = scanner.nextInt();
		
		
		Students s1 = new Students(name, Korean, English, Math);
		s1.printAll();
		

	}

}
