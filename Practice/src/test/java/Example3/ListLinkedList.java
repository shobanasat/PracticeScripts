package Example3;

import java.util.*;

public class ListLinkedList {

	public static void main(String[] args) {
		List<Integer> ll = new LinkedList<>();
		
		int n = 5;
		for(int i = 0; i <= n; i++) {
			ll.add(i);
		}
		
		System.out.println(ll);
		
		ll.remove(2);
		
		System.out.println(ll);
		
		for(Integer i: ll) {
			System.out.print(i + " ");
		}

	}

}
