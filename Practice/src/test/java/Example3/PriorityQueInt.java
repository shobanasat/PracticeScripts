package Example3;

import java.util.PriorityQueue;

public class PriorityQueInt {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(10);
		pq.add(20);
		pq.add(30);
		pq.add(40);
		pq.add(50);
		
		System.out.println(pq.peek());
		
		pq.poll();
		
		System.out.println(pq.peek());

	}

}
