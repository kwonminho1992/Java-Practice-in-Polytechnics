package a3;

public class Reverse {

	public String reverseString (String text) {
		String[] arr = text.split("");
		String textReverse = "";
		for (int i = arr.length - 1; i >= 0; i--) {
			textReverse = textReverse + arr[i];
		}
		return textReverse;
	}
}

