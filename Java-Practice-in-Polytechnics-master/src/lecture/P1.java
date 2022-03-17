package lecture;

import java.text.SimpleDateFormat;
import java.util.Date;

public class P1 {

	public static void main(String[] args) {
		// P1 : Timer
		System.out.println("P1 : Timer");
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date time = new Date();
		String DateAndTime = format.format(time);
		
		System.out.println(DateAndTime);
		
		int n = 0;
		while(true) {
			n++;
			System.out.print(n);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				//TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
