package lecture;

public class P9 {

	public static void main(String[] args) {
		// P9 : split()
		
		String sentence = "I love you, do you love me?";
		String[] words = sentence.split(" ");
		
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}

	}

}
