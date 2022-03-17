package lecture;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadExample {

	public static void main(String[] args) {
		// Thread
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date time = new Date();
		String DateAndTime = format.format(time);
		
		System.out.println(DateAndTime);
		System.out.println("start");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		time = new Date();
		DateAndTime = format.format(time);
		System.out.println(DateAndTime);
		System.out.println("end");
			
		// Thread2
		SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date time2 = new Date();
		String DateAndTime2 = format2.format(time2);
		
		System.out.println(DateAndTime2);
		
		while(true) {
			System.out.print("#");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				//TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
