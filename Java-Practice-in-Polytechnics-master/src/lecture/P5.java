package lecture;

import java.text.SimpleDateFormat;
import java.util.Date;

public class P5 {

	public static void main(String[] args) throws InterruptedException {
		//P5 : Print a number from 1 to 100 every second
		// (* By Interface)
		ThreadExample5 main = new ThreadExample5();
		ThreadTimer thread = new ThreadTimer();
		
		thread.run();
	}
}

class ThreadTimer implements Runnable {
	public void threadTimer() {
		this.run();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("P5 : Print a number from 1 to 100 every second by Interface");
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