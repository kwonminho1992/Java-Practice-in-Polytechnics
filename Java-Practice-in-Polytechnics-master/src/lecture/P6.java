package lecture;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class P6{
	public static void main(String[] args) {
		// P6 : Timer
		ThreadStopwatch thread = new ThreadStopwatch();
		thread.start(); //start thread	
	}
}
class ThreadStopwatch extends Thread {
	public void Thread() {
	}
	
	@Override
	public void run() {
		Scanner scanner = new Scanner(System.in);

		// get user's input
		System.out.println("input time (by second) to set timer");
		int second = scanner.nextInt();
		
		//set timer
		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
		Date time = new Date();
		String DateAndTime = format.format(time);
		System.out.println("current time : " + DateAndTime); // show current time
		
		// TODO Auto-generated method stub	
		try {
			Thread.sleep(1000 * second);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//end timer and print the result
		time = new Date();
		DateAndTime = format.format(time);
		System.out.println("Time is over. (" + DateAndTime + ") - " + second + " second elapsed");
	}
		
}

