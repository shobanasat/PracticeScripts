package Example3;

import java.util.*;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		
		System.out.println("After addition: " + queue);
		
		queue.remove(2);
		
		System.out.println("After removal: " + queue);
		
		System.out.println("1st element of the queue: " + queue.peek());
		
		System.out.println("Size of the queue: " + queue.size());

	}

}
