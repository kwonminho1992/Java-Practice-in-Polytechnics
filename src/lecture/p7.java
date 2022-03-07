package lecture;

import java.util.Calendar;
import java.util.Scanner;

public class p7 {

	public static void main(String[] args) {
		// Calendar Application II
		Scanner scanner = new Scanner(System.in);
		Calendar calendar1 = Calendar.getInstance();
		Calendar calendar2 = Calendar.getInstance();
		System.out.println("Plz input 2 days (eg. 20220307 / 20220319) : ");
		String first = scanner.nextLine();
		String second = scanner.nextLine();
		String fy = first.substring(0, 4);	
		String fm = first.substring(4, 6);	
		String fd = first.substring(6, 8);	
		String sy = second.substring(0, 4);	
		String sm = second.substring(4, 6);	
		String sd = second.substring(6, 8);	
		calendar1.set(calendar1.YEAR, Integer.parseInt(fy));
		calendar1.set(calendar1.MONTH, Integer.parseInt(fm)+1);		
		calendar1.set(calendar1.DATE, Integer.parseInt(fd));
		calendar2.set(calendar2.YEAR, Integer.parseInt(sy));
		calendar2.set(calendar2.MONTH, Integer.parseInt(sm)+1);		
		calendar2.set(calendar2.DATE, Integer.parseInt(sd));
		long diffSec = (calendar2.getTimeInMillis() - calendar1.getTimeInMillis()) / 1000;
		long diffDays = diffSec / (24*60*60); //일자수 차이
		
		System.out.println(diffDays);
	}

}
