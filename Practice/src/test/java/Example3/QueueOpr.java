package Example3;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class QueueOpr {

	public static void main(String[] args) {
		Queue<Integer> q1 = new PriorityQueue<>();
		q1.add(1);
		q1.add(2);
		q1.add(3);
		q1.add(4);
		q1.add(5);
		
		System.out.println("After Addition: " + q1);
		System.out.println("Peek: " + q1.peek());
		System.out.println("Poll: " + q1.poll());
		System.out.println("Peek: " + q1.peek());
		System.out.println("Final Queue: " + q1);
		
		Queue<Integer> q2 = new LinkedList<>();
		q2.add(1);
		q2.add(2);
		q2.add(3);
		q2.add(4);
		q2.add(5);
		
		System.out.println("After Addition: " + q2);
		System.out.println("Peek: " + q2.peek());
		System.out.println("Poll: " + q2.poll());
		System.out.println("Peek: " + q2.peek());
		System.out.println("Final Queue: " + q2);
		
		Queue<Integer> q3 = new PriorityBlockingQueue<>();
		q3.add(1);
		q3.add(2);
		q3.add(3);
		q3.add(4);
		q3.add(5);
		
		System.out.println("After Addition: " + q3);
		System.out.println("Peek: " + q3.peek());
		System.out.println("Poll: " + q3.poll());
		System.out.println("Peek: " + q3.peek());
		System.out.println("Final Queue: " + q3);
	}

}
