package lecture;

import java.util.Scanner;

public class p12 {

	public static void main(String[] args) {
		// Temperature Converter
		System.out.println("Temperature Converter\n1. ��C -> ��F\n2. ��F -> ��C");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();

		
		if (input == 1) {
			float c = scanner.nextFloat();	
			float f =  c * 9 / 5 + 32;
			System.out.println((float) Math.round(f*1000)/1000 + " ��F");
		} else if (input ==2 ) {
			float f = scanner.nextFloat();	
			float c =  (f - 32) * 5 / 9;
			System.out.println((float) Math.round(c*1000)/1000 + " ��C");
		} else {
			System.out.println("ERROR");
		}
	}

}
