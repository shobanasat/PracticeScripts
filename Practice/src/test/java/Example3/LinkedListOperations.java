package Example3;

import java.util.LinkedList;

public class LinkedListOperations {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		
		ll.add(1);
		ll.add(2);
		ll.add("Shobana");
		ll.add("Jishnu");
		
		System.out.println(ll);
		
		ll.set(2, "Shobana Sathyanathan");
		
		System.out.println(ll);
		
		ll.remove(1);
		ll.remove("Shobana Sathyanathan");
		
		System.out.println();
		
		for(int i = 0;i<ll.size();i++) {
			System.out.print(ll.get(i) + " ");
		}
		
		System.out.println();
		
		LinkedList<String> ll2 = new LinkedList<String>();
		ll2.add("Shobana");
		ll2.add("Jishnu");
		ll2.add("Isha");
		ll2.add("Riyan");
		ll2.addFirst("Sathyanathan");
		ll2.addLast("Savitha");
		
		ll2.removeFirst();
		
		for(String str: ll2) {
			System.out.print(str + " ");
		}
	}

}
