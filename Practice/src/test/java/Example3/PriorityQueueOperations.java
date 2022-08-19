package Example3;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueOperations {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		pq.add(1);
		pq.add(2);
		pq.add(3);
		pq.add(4);
		pq.add(5);
		
		System.out.println("After addition: " + pq);
		System.out.println("Peek: " + pq.peek());
		
		pq.remove(3);
		System.out.println("After removal: " + pq);
		
		pq.poll();
		System.out.println("After poll: " + pq);

		Iterator itr = pq.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		PriorityQueue<String> pq1 = new PriorityQueue<>();
		
		pq1.add("Diamond");
		pq1.add("Gold");
		pq1.add("Silver");
		pq1.add("Ruby");
		pq1.add("Emerald");
		
		System.out.println("After addition: " + pq1);
		System.out.println("Peek: " + pq1.peek());
		
		pq1.remove("Ruby");
		System.out.println("After removal: " + pq1);
		
		pq1.poll();
		System.out.println("After poll: " + pq1);

		Iterator itr1 = pq1.iterator();
		
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
	}

}
