package p2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// P2 : Program to Print the Characters in the Middle
		System.out.println("P2 : Program to Print the Characters in the Middle");
		//condition 1 : string > 3
		//condition 2 : odd, even
		
		//get sentence from user's input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input word you want to find the middle characters");
		String word = scanner.nextLine();
		
		//run the application
		if (word.length() < 3) { // error
			System.out.println("you should write a word that has at least 3 characters");
		} else {
			if (word.length() % 2 == 0) { //case 1 : length of the word -> even
				String result1 = evenWord(word);
				System.out.println("result : " + result1);
			} else { //case 2 : length of the word -> odd
				String result2 = oddWord(word);
				System.out.println("result : " + result2);
			}
		} 
	}
	
	public static String oddWord (String word) { // length of the word -> odd
		String[] wordByArr = word.split("");
		int index = (wordByArr.length / 2) + 1; // ex. length 3 -> int (3/2) + 1 = 2
		String middleCharacter = wordByArr[index - 1]; 
		return middleCharacter;
	}
	
	public static String evenWord (String word) { // length of the word -> even 문제있음
		String[] wordByArr = word.split("");
		int index = (wordByArr.length / 2);	// ex. length 4 -> 4/2 = 2 & (4/2) + 1 = 3
		String middleCharacter = wordByArr[index -1] + wordByArr[index];
		return middleCharacter;
	}
}
