package R1;

import java.util.ArrayList;

public class Comparing {
	
	public boolean comparingMatchedOrNot (String string1, String string2) {
		if (string1.equals(string2)) {
			return true;
		} else {
			return false; 
		}
	}
	
	public String orderString (String string) {
		//make an arraylist for each characters
		ArrayList<Character> characters = new ArrayList<Character>();
		String reorderedString = "";
		for (int i = 0; i < string.length(); i++) {
			characters.add(string.charAt(i));		
		}
		// ordering characters
		char character = ' '; // variable to support ordering
		while (characters.size() > 0) {
			for (int i = 0; i < characters.size(); i++) {
				if ((int) characters.get(i) >= (int) character) {
					character = characters.get(i);
				} else {
				}
			}
			reorderedString = reorderedString + character;
			for (int i = 0; i < characters.size(); i++) {
				if (characters.get(i) == character) {
					characters.remove(i);
					break;
				} else {
				}				
			}
			character = ' '; //reset character
		}
		return reorderedString;
	}	
}
	