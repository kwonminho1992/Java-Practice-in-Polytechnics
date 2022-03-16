package lecture;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class P2 {
	
	public static void main(String[] args) {
		// P2, 3 : Numbering
		System.out.println("P2 : Numbering");
		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		
		System.out.println("please input numbers"
				+ "\nform : 2 13 36 67");
		String numbers = scanner.nextLine();
		System.out.println("choose one number from the numbers");
		String n = scanner.nextLine(); 
		
		String[] arr = numbers.split(" ");
		
		
		Queue<String> queue = new LinkedList<String>();
		Stack<String> stack = new Stack<String>();
		
		// input numbers into queue & stack
		for (int i = 0; i < arr.length; i++) {
			queue.offer(arr[i]);
			stack.push(arr[i]);
		}
		
		// queue
		int count = 0;
		while (true) {
			if (queue.element().equals(n)) {
				System.out.println(Arrays.toString(arr) + "\nqueue : " + queue.poll() + " - " + (count + 1));
				break;
			} else {
				queue.poll();
				count++;
			}
		}

		// stack
		count = 0;
		while (true) {
			if (stack.peek().equals(n)) {
				System.out.println("stack : " + stack.pop() + " - " + (count + 1));
				break;
			} else {
				stack.pop();
				count++;
			}
		}
		
	}
}
