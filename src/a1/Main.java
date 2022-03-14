package a1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// A1 : Finding a Character
		System.out.println("A1 : Finding a Character");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("step 1 : please input sentence : ");
		String sentence = scanner.nextLine();
		System.out.println("step 2 : please input alphabet : ");
		String alphabet = scanner.nextLine();
		
		if (alphabet.length() == 1) {
			int a = findIndex(sentence, alphabet);
			System.out.println(alphabet + " : " + a);
		} else {
			System.out.println("You have to input ONLY ONE character in step 2");
		}
			
	}
	
	public static int findIndex(String sentence, String alphabet) {
		String[] splittedSentence = sentence.split(""); // input each characters of the sentence into array

		int index = -1;
		for (int i = 0; i < splittedSentence.length; i++) { // finding the character's order
			if (splittedSentence[i].contains(alphabet)) {
				index = i;
				break;
			} else {
			}
		}
		index = index + 1; //because array starts from '0', I have adjusted the order by add 1 to index  
		return index;				
	}
}
