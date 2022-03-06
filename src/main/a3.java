package main;
import java.util.Scanner;
public class a3 {
	public static void main(String[] args) {
		//A3 : Draw a Right Triangle
		System.out.println("A3 : Draw a Right Triangle\nPlz input number you want (at least 2) : ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int i = 0;
		int j = 0;
		if (n >= 2) {
			for (i = 1; i <= n; i++) {
				for (j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println("");
			}
		} else {
			System.out.println("ERROR");
		}
	}
}
