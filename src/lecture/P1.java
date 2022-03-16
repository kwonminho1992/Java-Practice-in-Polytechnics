package lecture;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		// P1 : Split a String and Sort
		System.out.println("P1 : Split a String and Sort");
		
		ArrayList<String> sentenceByArrayList = new ArrayList<String>();	
		Scanner scanner = new Scanner(System.in);
		System.out.println("input sentence to reorder the words by ascending order");
		String sentence = scanner.nextLine();
		
		String[] sentenceByArray = sentence.split(" ");
		
		for (int i = 0; i < sentenceByArray.length; i++) {
			sentenceByArrayList.add(sentenceByArray[i]);
		}
		
		//ordering by ascending order
		Collections.sort(sentenceByArrayList);
		System.out.println("result (asc) : " + sentenceByArrayList);
		
		//ordering by descending order
		Collections.reverse(sentenceByArrayList);
		System.out.println("result (des) : " + sentenceByArrayList);
		
		
		

	}

}
