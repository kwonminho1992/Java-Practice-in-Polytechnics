package main;
import java.util.Scanner;
public class a8 {
	//A8 : Find the GCD(Greatest Common Divisor)
	public static void main(String[] args) {
		System.out.println("A8 : Find the GCD(Greatest Common Divisor) "
				+ "\ninput 2 natural numbers : ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		System.out.println("Your numbers are : " + n + " / " + m);	
		if (n >= 1 && m >= 1) {
			if (n == 0) {
				System.out.println("GCD : " + m);				
			} else if (m == 0) {
				System.out.println("GCD : " + n);				
			}
			while (n != 0 || m != 0) {
					n = n % m;
					if (n == 0 || m == 0) {
						break;
					}
					m = m % n;
					if (n == 0 || m == 0) {
						break;
					}
				}
			if (n == 0) {
				System.out.println("GCD : " + m);				
			} else {
				System.out.println("GCD : " + n);				
			} 
		} else {
			System.out.println("ERROR");				
		}
	}
}