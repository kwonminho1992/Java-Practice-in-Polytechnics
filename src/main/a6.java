package main;
import java.util.Scanner;
public class a6 {
	//A6 : Find the Factors of N
	public static void main(String[] args) {
		System.out.println("A6 :Find the Factors of N\nPlz input number you want (at least 2) : ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int i = 0;
		System.out.println("Your number is : " + n);
		if (n >= 2) {
			for (i = 1; i < n; i++) {
				if (n % i == 0) {
					System.out.print(i +" / ");				
				} else {
					System.out.print("");	
				}
			}
		} else {
			System.out.println("ERROR");
		}
	}
}

