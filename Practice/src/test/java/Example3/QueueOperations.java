package Example3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueOperations {

	public static void main(String[] args) {
		Queue<String> q = new LinkedList<>();
		q.add("Diamond");
		q.add("Gold");
		q.add("Silver");
		q.add("Bronze");
		
		System.out.println("After addition: " + q);
		
		System.out.println("Removing ....:  " + q.remove("Isha"));
		
		System.out.println("Polling...: " + q.poll());
		
		System.out.println("After removal and polling: " + q);
		
		Iterator itr = q.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
