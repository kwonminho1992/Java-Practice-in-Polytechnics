package lecture;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class HashsetArraylistQueueStack {

	public static void main(String[] args) {
		// datatype : HashSet
		System.out.println("HashSet");
		HashSet<String> name = new HashSet<String>();
		name.add("kim");
		System.out.println(name);
		
		name.add("lee");
		System.out.println(name);
		
		name.add("kim");
		System.out.println(name);
		
		name.add("kwon");
		System.out.println(name);

		//datatype : ArrayList
		System.out.println("\nArrayList");
		ArrayList<String> name2 = new ArrayList<String>();		
		name2.add("kim");
		name2.add("lee");
		name2.add("lee");
		
		System.out.println(name2);
		System.out.println(name2.size());
		System.out.println(name2.get(2));
		
		name2.remove(1);
		System.out.println(name2);
		
		name2.set(1, "park");
		System.out.println(name2);
		System.out.println(name2.size());
		
		Collections.sort(name2);
		System.out.println("asc : " + name2);
		Collections.reverse(name2);
		System.out.println("des : " + name2);
		
		//new loop style : iterator
		System.out.println("\nIterator");
		Iterator<String> iterator = name2.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("---------------");
		for (String names : name2) { // for - each loop
			System.out.println(names);
		}
		System.out.println("---------------");
		for (int i = 0; i < name2.size(); i++) {
			System.out.println(name2.get(i));
		}
		
		//datatype Queue
		System.out.println("\nQueue");
		Queue<String> name3 = new LinkedList<String>();
		name3.offer("kim");
		System.out.println(name3);
		name3.offer("lee");
		System.out.println(name3);
		System.out.println(name3.poll());
		System.out.println(name3.poll());
		System.out.println(name3);
		
		//datatype Stack
		System.out.println("\nStack");
		Stack<String> stack = new Stack<String>();
		stack.add("kim");
		System.out.println(stack);
		stack.add("lee");
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack);
		stack.add("lee");
		stack.add("park");
		stack.add("kwon");
		System.out.println(stack.peek());
	 }

}
