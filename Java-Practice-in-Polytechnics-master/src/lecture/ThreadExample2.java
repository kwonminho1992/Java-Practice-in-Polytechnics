package lecture;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadExample2 extends Thread {

	public static void main(String[] args) throws InterruptedException {
		// Thread
		// Allows the program to operate multiple things at the same time
		
		ThreadExample2 thread = new ThreadExample2();
		thread.start();
		System.out.println("Check 1 : " + getCurrentTime() + "-" + thread.isAlive());
		Thread.sleep(3000);
		System.out.println("Check 2 : " + getCurrentTime() + "-" + thread.isAlive());
		Thread.sleep(30000);
		System.out.println("Check 3 : " + getCurrentTime() + "-" + thread.isAlive());

	}

	
	public static String getCurrentTime() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date time = new Date();
		String dateAndTime = format.format(time);
		return dateAndTime;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int cnt = 0;
		while (true) {
			if (cnt == 25) {
				break;
			}
			try {
				System.out.println(getCurrentTime() + "-" + cnt);
				Thread.sleep(1000);
				cnt++;
			} catch (InterruptedException e) {
				//TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
