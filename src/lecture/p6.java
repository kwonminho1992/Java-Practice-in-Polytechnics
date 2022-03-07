package lecture;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class p6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calendar calendar = Calendar.getInstance();
		int year = scanner.nextInt();
		int month = scanner.nextInt();		
		calendar.set(calendar.YEAR, year);
		calendar.set(calendar.MONTH, month-1);		
		calendar.set(calendar.DATE, 1);
		
		System.out.println(year + "\n"  + month);
		System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
		
	}
}
