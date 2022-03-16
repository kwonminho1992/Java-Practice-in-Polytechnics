package homework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class A2 {

	public static void main(String[] args) {
		// A2 : Comparing Strings
		System.out.println("A2 : Comparing Strings");
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> result = new ArrayList<String>(); // arr of same characters of the 2 words
		
		//get user's input
		System.out.println("input first word");
		String word1 = scanner.nextLine();
		System.out.println("input second word");		
		String word2 = scanner.nextLine();	
		
		//length of words
		int lengthOfWord1 = lengthOfWord(word1);
		int lengthOfWord2 = lengthOfWord(word2);	
		
		//declare queue, arrayList of words
		if (lengthOfWord1 >= lengthOfWord2) { //len of word 1 >= word 2 : word1 - queue, word2 - arrayList
			findCharacters(word1, word2, result);
		} else {//len of word 1 < word 2 : word1 - arrayList, word2 - queue
			findCharacters(word2, word1, result);
		}
		
		//print the result
		System.out.println("word 1 :" + lengthOfWord1);
		System.out.println("word 2 :" + lengthOfWord2);
		System.out.println("result : " + result.size() + " - " + result);		
	}
	
	public static int lengthOfWord (String word) { //return length of the word
		return word.length();
	}
	
	public static Queue<String> wordToQueue (String word) { // return queue of the word
		Queue<String> queue = new LinkedList<String>();
		
		for(int i = 0; i < word.length(); i++) {
			queue.add(String.valueOf(word.charAt(i)));
		}
		return queue;
	}
	
	public static ArrayList<String> wordToArrList (String word) { // return arrayList of the word
		ArrayList<String> arrayList = new ArrayList<String>();
		
		for(int i = 0; i < word.length(); i++) {
			arrayList.add(String.valueOf(word.charAt(i)));
		}
		return arrayList;
	}
	
	//find same characters
	public static ArrayList<String> findCharacters (String word1, String word2, ArrayList<String> result) {
		Queue<String> word1ByQueue = wordToQueue(word1);
		ArrayList<String> word2ByArrayList = wordToArrList(word2);
		//run the app
		while (word1ByQueue.size() != 0) {
			// update the word's characters
			String word2Revised = "";
			for (int i = 0; i < word2ByArrayList.size(); i++) {
				word2Revised =  word2Revised + word2ByArrayList.get(i);
			}
			
			for (int i = 0; i < word2ByArrayList.size(); i++) {
				if (word2ByArrayList.get(i).equals(word1ByQueue.element())) {
					word1ByQueue.poll(); // remove first element of queue
					result.add(word2ByArrayList.get(i)); //then, input to result arr
					word2ByArrayList.remove(i); // finally, remove the element in word2 arr
					break;
				} else {
					if (!word2Revised.contains(word1ByQueue.element())) {
						word1ByQueue.poll(); // remove first element of queue
						break;
					} else {							
					}
				}
			}
		}
		return result;
	}
	


}
