package homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class a2 {

	public static void main(String[] args) {
		// a2 : Counting by Time of Number
		Integer arr[] = {};  
		ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(arr));  
		boolean bool = true;
		int pog = 0;
		int neg = 0;
		int o = 0;
		int e = 0;
		int i = 0;
		
		Scanner scanner = new Scanner(System.in);
		while (bool = true) {
			System.out.println("a2 : Counting by Time of Number\ninput number : ");
			int n = scanner.nextInt();
			arrayList.add(n);
			arr = arrayList.toArray(arr);
			if (arr[i] > 0 && arr[i] % 2 == 1) {
				pog++;
				o++;
			} else if (arr[i] < 0 && arr[i] % 2 == 1) {
				neg++;
				o++;
			} else if (arr[i] > 0 && arr[i] % 2 == 0) {
				pog++;
				e++;
			} else if (arr[i] < 0 && arr[i] % 2 == 0) {
				neg++;
				e++;
			} else {
			}
			i++;
			System.out.println("positive : " + pog + ", negative : " + neg + ", odd : " + o + ", even : " + e);
		}

	}

}
