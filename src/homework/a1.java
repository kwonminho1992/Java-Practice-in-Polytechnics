package homework;

import java.util.ArrayList;
import java.util.Arrays;  
import java.util.Scanner;

public class a1 {

	public static void main(String[] args) {
		// a1 : Descriptive Statistics Calculation
		Integer arr[] = {};  
		ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(arr));  
		boolean bool = true;
		int len = 0;
		float mean = 0;
		int min = 0;
		int max = 0;
		Scanner scanner = new Scanner(System.in);
		
		while (bool = true) {
			System.out.println("a1 : Descriptive Statistics Calculation\ninput number : ");
			int n = scanner.nextInt();
			arrayList.add(n);
			arr = arrayList.toArray(arr);
			min = n;
			for (int i = 0; i < arr.length; i++) { 
				if (arr[i] > max) {
					max = arr[i];
				} else if (arr[i] < min) {
					min = arr[i];
				} else {
				}
			}
			mean = mean + arr[len];
			len++;
			System.out.println("result : " + len + " - mean : " + (mean/len) + ", max : " + max + ", min : " + min);	
		}
	}
	
}


