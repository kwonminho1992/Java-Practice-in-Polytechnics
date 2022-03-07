package main;
import java.util.Scanner;
public class a2 {
	public static void main(String[] args) {
		//A2 : multiplication table 4
		System.out.println("A2 : Multiflication table 4\n");
		int num = 9;
		int i = 2;
		int j = 1;
		switch (num) {
			case 9:
				while (i <= 9) {
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
