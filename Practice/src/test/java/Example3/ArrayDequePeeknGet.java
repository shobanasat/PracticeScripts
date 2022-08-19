package Example3;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequePeeknGet {

	public static void main(String[] args) {
		Deque<Integer> dq1 = new ArrayDeque<Integer>();
		
		dq1.add(1);
		dq1.push(2);
		dq1.addFirst(3);
		dq1.addLast(4);
		dq1.offer(5);
		dq1.offerLast(6);
		
		System.out.println("After additions: " + dq1);
		
		System.out.println(dq1.peek());
		System.out.println(dq1.peekFirst());
		System.out.println(dq1.peekLast());
		
		System.out.println(dq1.getFirst());
		System.out.println(dq1.getLast());
		
		

	}

}
