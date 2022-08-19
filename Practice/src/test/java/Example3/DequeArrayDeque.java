package Example3;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DequeArrayDeque {

	public static void main(String[] args) {
		Deque<String> dq1 = new ArrayDeque<String>();
		
		dq1.add("Quintegra");
		dq1.push("Infosys");
		dq1.addLast("Tesco");
		dq1.add("Altech UEC");
		dq1.offer("Crayon Data");
		System.out.println("After additions: " + dq1);
		
		dq1.remove("Crayon Data");
		dq1.pop();
		dq1.poll();
		System.out.println("After Removal: " + dq1);
		
		for (Iterator itr = dq1.iterator(); itr.hasNext();) {
			System.out.println(itr.next());
		}
		
		for (Iterator itr = dq1.descendingIterator(); itr.hasNext();) {
			System.out.println(itr.next());
		}
		
		Deque<Integer> dq2 = new ArrayDeque<Integer>();
		
		dq2.add(1);
		dq2.push(2);
		dq2.addLast(3);
		dq2.add(4);
		dq2.offer(5);
		System.out.println("After additions: " + dq2);
		
		dq2.remove(5);
		dq2.pop();
		dq2.poll();
		System.out.println("After Removal: " + dq2);
		
		for (Iterator<Integer> itr1 = dq2.iterator(); itr1.hasNext();) {
			System.out.println(itr1.next());
		}
		
		for (Iterator<Integer> itr2 = dq2.descendingIterator(); itr2.hasNext();) {
			System.out.println(itr2.next());
		}

	}

}
