package lecture;

import java.util.Calendar;
import java.util.Scanner;

public class p8 {

	public static void main(String[] args) {
		// Calendar Application III
		Scanner scanner = new Scanner(System.in);
		Calendar calendar = Calendar.getInstance();
		System.out.println("Plz input day (eg. 20220307) : ");
		String first = scanner.nextLine();
		int date = scanner.nextInt();
		String fy = first.substring(0, 4);	
		String fm = first.substring(4, 6);	
		String fd = first.substring(6, 8);
		calendar.set(calendar.YEAR, Integer.parseInt(fy));
		calendar.set(calendar.MONTH, Integer.parseInt(fm)+1);		
		calendar.set(calendar.DATE, Integer.parseInt(fd)+date);
		System.out.println(calendar.get(Calendar.YEAR));	
		System.out.println(calendar.get(Calendar.MONTH));
		System.out.println(calendar.get(Calendar.DATE+date));

	}

}