package main;
import java.util.Scanner;
public class a7 {
	//A7 : Find the LCM(Least Common Multiple)
	public static void main(String[] args) {
		System.out.println("A7 : Find the LCM(Least Common Multiple) "
				+ "\ninput 2 natural numbers : ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int nSpare = n;
		int mSpare = m;
		int gcd = 0;
		int lcm = 0;
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
				gcd = m;				
			} else {
				gcd = n;			
			} 
			lcm = (nSpare * mSpare) / gcd;
			System.out.println("LCM : " + lcm);
		} else {
			System.out.println("ERROR");				
		}
	}
}