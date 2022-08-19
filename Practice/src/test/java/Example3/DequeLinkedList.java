package Example3;

import java.util.Deque;
import java.util.LinkedList;

public class DequeLinkedList {

	public static void main(String[] args) {
		Deque<String> dq1 = new LinkedList<String>();
		
		dq1.add("Diamond");
		dq1.addFirst("Gold");
		dq1.addAll(dq1);
		dq1.offer("Blue Saphire");
		dq1.offerLast("Emerald");
		dq1.offerFirst("Yellow Saphire");
		dq1.addLast("Ruby");
		System.out.println("After all additions: " + dq1);
		
		dq1.push("Silver");
		System.out.println("After Push: " + dq1);
		
		dq1.remove("Ruby");
		dq1.removeFirst();
		dq1.removeLast();
		System.out.println("After removal: " + dq1);
		
		dq1.poll();
		dq1.pollFirst();
		dq1.pollLast();
		System.out.println("After Poll: " + dq1);
		

	}

}
