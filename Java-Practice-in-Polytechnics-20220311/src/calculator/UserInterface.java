package calculator;

import java.util.Scanner;

public class UserInterface {
	public int showMenu() {
		System.out.println("Menu");
		System.out.println("1. +, 2. -, 3. *, 4. /");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}
}
