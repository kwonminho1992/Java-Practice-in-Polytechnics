package lecture;

import java.util.Scanner;

public class P6SolutionByProffesor {

	public static void main(String[] args) {
		// P6 : Counting a Specified Character
		// *This is solution of Mr. Kim
		
		Scanner scanner = new Scanner(System.in);
		String line1 = scanner.nextLine();
		char[] c1 = new char[line1.length()];
		for (int i = 0; i < line1.length(); i++) {
			c1[i] = line1.charAt(i);
		}
		
		String line2 = scanner.nextLine();
		char[] c2 = new char[line2.length()];
		for (int i = 0; i < line2.length(); i++) {
			c2[i] = line2.charAt(i);
		}
		
		int cnt = 0;
		
		if (c1.length >= c2.length) {
			for (int i = 0; i < c1.length - c2.length + 1; i++) {
				int sameCnt = 0;
				for (int j = 0; j < c2.length; j++) {
					if (c1[i + j] == c2[j]) {
						sameCnt++;
					}
				}
				if (sameCnt == c2.length) {
					cnt++;
				}
			}
		} else {
			System.out.println("ERROR");
		}
		System.out.println(cnt);
	}

}
