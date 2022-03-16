package lecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {
		// P4 : Grade Card
		System.out.println("P4 : Grade Card");
		ArrayList<Integer> scores = new ArrayList<Integer>();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("input names and scores");
		String[] names = scanner.nextLine().split(" ");
		String[] scoresArr = scanner.nextLine().split(" ");
		
		for (int i = 0; i < scoresArr.length; i++) {
			scores.add(Integer.parseInt(scoresArr[i]));
		}
		
		Arrays.sort(names);
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i]);
		}
		
		Collections.sort(scores);
		System.out.println(scores);
		
		Arrays.sort(names, Collections.reverseOrder());
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i]);
		}
		
		Collections.reverse(scores);
		System.out.println(scores);
	}

}
