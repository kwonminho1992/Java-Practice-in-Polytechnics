package lecture;

import java.util.Scanner;

public class P6 {

	public static void main(String[] args) {
		// P6 : Counting a Specified Character
		Scanner scanner = new Scanner(System.in);
		
		//input sentence
		System.out.println("plz input sentence");
		String sentenceString = scanner.nextLine();
		sentenceString = sentenceString.toLowerCase();
		String[] sentenceArr = sentenceString.split(" ");
		String[] sentenceArrByChar = sentenceString.split("");
		
		//input word
		System.out.println("plz input word");
		String word = scanner.nextLine();	
		word = word.toLowerCase();
		
		//calculation
		int n = 0;
		if (word.length() == 1) {
			for (int i = 0; i < sentenceArrByChar.length; i++) {
				if (sentenceArrByChar[i].contains(word)) {
					n++;
				} else {
				}
			}
		} else {
			for (int i = 0; i < sentenceArr.length; i++) {
				if (sentenceArr[i].contains(word)) {
					n++;
				} else {
				}
			}
		}	
		System.out.println(word + " : " + n);
	}
}

