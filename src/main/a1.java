package main;
import java.util.Scanner;
public class a1 {
	public static void main(String[] args) {
		//A1 : multiplication table 3
		System.out.println("A1 : Multiflication table 3\nYou'd better set range between 2~9 (ex. 5 : 2~5, 8 : 2~8) : ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int i = 0;
		int j = 0;
		if (num<=9 && num>=2) {
			for (i = 2; i <= num; i++) {
				for (j = 1; j <= 9; j++) {
					System.out.print(i +" * "+ j +" = " + (i*j) + " / ");
				}
				System.out.println("");
			}
		} else {
			System.out.println("Error");
		}		
	}
}
