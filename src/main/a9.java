package main;
import java.util.Scanner;
public class a9 {
	//A9 : Find the Prime Numbers
	public static void main(String[] args) {
		System.out.println("A9 : Find the Prime Numbers\n"
				+ "Plz input number you want (at least 2) : ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int nSpare = 0;
		int i = 0;
		boolean bool = true;
		System.out.println("Your number is : " + n);
		for (nSpare = 2; nSpare <= n; nSpare++) {
			for (i = 2; i < nSpare; i++) {
				if (nSpare % i != 0) {
					System.out.print("");
				} else {
					bool = false;
				}
			}
			if (bool == true) {
				System.out.print(nSpare + " / ");
			}else {
				System.out.print("");
			}
			bool = true;
		}
	}
}