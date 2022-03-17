package lecture;

public class ThreadExample4 extends Thread {

	public static void main(String[] args) {
		// Multi thread
		Thread thread1 = new MultiThreadTest(1);
		thread1.start();
		thread1.setPriority(Thread.MIN_PRIORITY);
		Thread thread2 = new MultiThreadTest(2);
		thread2.start();
		thread2.setPriority(Thread.MAX_PRIORITY);
	}

}
