package lecture;

public class ThreadExample3 extends Thread {

	public static void main(String[] args) {
		// Multi thread
		Thread thread1 = new MultiThreadTest(1);
		thread1.start();
		Thread thread2 = new MultiThreadTest(2);
		thread2.start();
	}

}

class MultiThreadTest extends Thread {
	public MultiThreadTest(int i) {
		this.setName("thread" + i);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		int cnt = 0;
		while (true) {
			System.out.println("Thread : " + this.getName() + " " + cnt++);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				//TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
	}	
}