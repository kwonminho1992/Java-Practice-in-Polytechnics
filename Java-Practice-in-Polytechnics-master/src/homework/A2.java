package homework;

import java.util.Scanner;

public class A2 {

	public static void main(String[] args) {
		// A2 : Running Race Game
		System.out.println("A2 : Running Race Game");
		Scanner scanner = new Scanner(System.in);
		System.out.println("how about the number of runners?");
		int n = scanner.nextInt();
		
		//create runners(threads)
		for (int i = 0; i < n; i++) {
			Multithread object = new Multithread();
			object.start();
		}
	}

}

class Multithread extends Thread {
	public Multithread() {
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Runner" + Thread.currentThread().getId() + " is running");
		
		//set running distance by second (applying random)
		double distance = Math.random() * 10; 
		distance = Math.round(distance * 100) / 100.0;
		
		double totalDistance = 0.0;
		double goal = 50.0;
		int second = 0;
		while (totalDistance <= goal) { // runners run!
			try {
				second++;
				Thread.sleep(1000);
				totalDistance = totalDistance + distance;
				System.out.println("Runner" + Thread.currentThread().getId() + " - " 
				+ second + "s / " + totalDistance + "m / ");
			} catch (InterruptedException e) {
				//TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//arrived!
		System.out.println("Runner " + Thread.currentThread().getId() + " has arrived! (" + second + "s)");
	}		
}	
