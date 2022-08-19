package Example3;

import java.util.ArrayDeque;

public class ArrayDeqInt {

	public static void main(String[] args) {
		ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
		ad.add(10);
		ad.add(20);
		ad.add(30);
		ad.add(40);
		
		System.out.println(ad);
		
		ad.clear();
		
		System.out.println(ad);
		
		ad.addFirst(100);
		ad.addFirst(200);
		ad.addLast(400);
		
		System.out.println(ad);
	}

}
