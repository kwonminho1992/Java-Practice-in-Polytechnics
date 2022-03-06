package main;
import java.util.Scanner;
public class a5 {
	//A5 : Draw an Inverted Equilateral Triangle
	public static void main(String[] args) {
		System.out.println("A5 : Draw an Inverted Equilateral Triangle\nPlz input number you want (at least 2) : ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int nSpare = n;
		int nSpace = 1;
		int i = 0;
		int j = 0;
		if (n >= 2) {
			for (i = 1; i <= n; i++) {
				for (j = 1; j < nSpace; j++) {
					System.out.print(" ");
				}
				nSpace++;
				for (j = 1; j <= (nSpare*2)-1; j++) {
					System.out.print("*");
				}
				nSpare--;
				System.out.println("");
			}
		} else {
			System.out.println("ERROR");
		}

	}
}


