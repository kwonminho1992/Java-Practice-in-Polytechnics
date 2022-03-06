package main;
import java.util.Scanner;
public class a4 {
	//A4 : Draw an Equilateral Triangle
	public static void main(String[] args) {
		System.out.println("A4 : Draw an Equilateral Triangle\nPlz input number you want (at least 2) : ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int nSpare = n;
		int i = 0;
		int j = 0;
		if (n >= 2) {
			for (i = 1; i <= n; i++) {
				for (j = 1; j <= nSpare-1; j++) {
					System.out.print(" ");
				}
				nSpare--;
				for (j = 1; j <= (i*2)-1; j++) {
					System.out.print("*");
				}
				System.out.println("");
			}
		} else {
			System.out.println("ERROR");
		}
	}
}
