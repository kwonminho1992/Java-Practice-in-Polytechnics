package lecture;

import java.util.Scanner;

public class P7P8 {
	public static char[] original = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'};
	public static char[] encrypted = {'B', 'C', '!', '@', '^', '(', ')', '-', '_'};
	
	public static void main(String[] args) {
		// P7,8 : Encryption & Decryption
		
		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("1. Encryption / 2. Decryption");
		int choice = scanner.nextInt();

		
		if (choice == 1) {//encryption
			System.out.println("please input string");
			String line = scanner2.nextLine();			
			for (int i = 0; i < line.length(); i++) {
				char c = line.charAt(i);
				System.out.print(encryption(c));
			}
		} else if (choice == 2) {//decryption
			System.out.println("please input string");
			String line = scanner2.nextLine();			
			for (int i = 0; i < line.length(); i++) {
				char c = line.charAt(i);
				System.out.print(decryption(c));
			}
		} else {
			System.out.println("WRONG CHOICE!");
		}
	}
	
	public static char encryption(char x) {
		int index = -1;
		for (int i = 0; i < original.length; i++) {
			if (x == original[i]) {
				index = i;
				break;
			}
		}
		return encrypted[index];		
	}
	
	public static char decryption(char x) {
		int index = -1;
		for (int i = 0; i < encrypted.length; i++) {
			if (x == encrypted[i]) {
				index = i;
				break;
			}
		}
		return original[index];		
	}

}
