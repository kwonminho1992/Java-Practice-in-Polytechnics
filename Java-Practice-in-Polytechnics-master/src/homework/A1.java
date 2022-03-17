package homework;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		// A1 : Timer II
		System.out.println("A1 : Timer II");
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
		ArrayList<String> dateAndTimes = new ArrayList<String>();
		ArrayList<Integer> seconds = new ArrayList<Integer>();
		
		while (true) {
			// get user's input
			System.out.println("\ninput time (by second) to set timer");
			int second = scanner.nextInt();
			//set timer
			SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
			Date time = new Date();
			String dateAndTime = format.format(time);
			System.out.println("Current time : " + dateAndTime); // show current time
			
			// TODO Auto-generated method stub	
			try {
				Thread.sleep(1000 * second);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//end timer and print the result
			time = new Date();
			dateAndTime = format.format(time);
			dateAndTimes.add(dateAndTime);
			seconds.add(second);
			
			//print the result
			if (dateAndTimes.size() == 1) { // first try
				System.out.println("Time is over. (" + dateAndTime + ") - " + second + " seconds elapsed");	
			} else { // 2nd¡è try
				for (int i = 0; i < dateAndTimes.size() - 1; i++) {
					System.out.println("(" + dateAndTimes.get(i) + ") - " + seconds.get(i) + 
							" seconds elapsed already");
				}			
				System.out.println("Time is over. (" + dateAndTime + ") - " + second + " seconds elapsed");
			}
		}
	}
}
