package lecture;

import java.util.Arrays;
import java.util.Collections;

public class Sort {

	public static void main(String[] args) {
		// Sort
		String[] temp = {"a", "b", "c", "d", "e"};
		Arrays.sort(temp);
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i]);
		}
		System.out.println("");
		Arrays.sort(temp, Collections.reverseOrder());
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i]);
		}
	}

}
