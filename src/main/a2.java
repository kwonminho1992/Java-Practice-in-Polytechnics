package main;
import java.util.Scanner;
public class a2 {
	public static void main(String[] args) {
		//A2 : multiplication table 4
		System.out.println("A2 : Multiflication table 4\nYou'd better set range between 2~9 (ex. 5 : 2~5, 8 : 2~8) : ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int i = 2;
		int j = 1;
		switch (num) {
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
				while (i <= num) {
					while (j <= 9) {
						System.out.print(i +" * "+ j +" = " + (i*j) + " / ");
						j++;
					}
					i++;
					j = 1;
					System.out.println("");
				}
				break;
			default:
				System.out.println("Error");
		}	
	}
}
