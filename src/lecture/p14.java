package lecture;

import java.util.Scanner;

public class p14 {

	public static void main(String[] args) {
		// Article before Consonant and Vowel
		System.out.println("Article before Consonant and Vowel\n Plz input a sentence");
		Scanner scanner = new Scanner(System.in);
		String sentence = scanner.nextLine();
		
		if (sentence.contains(" a ")) {
			String a[] = sentence.split(" a ");
			String sentencePrint = a[0];
			for (int i = 1; i < a.length; i++) {
				if (a[i].charAt(0) == 'a' || a[i].charAt(0) == 'e' || a[i].charAt(0) == 'i' || a[i].charAt(0) == 'o'
						|| a[i].charAt(0) == 'u') {
					a[i] = " an " + a[i];
					sentence = sentencePrint + a[i];
				} else {
				}
			}
			System.out.println("revised sentence: " + sentence);
		} else {
			System.out.println("This sentence doesn't contain article 'a'");
		}
		

	}

}
