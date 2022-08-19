package Example3;

import java.util.*;

public class ListVector {

	public static void main(String[] args) {
		List<Integer> list = new Vector<Integer>();
		
		int n = 5;
		for (int i = 0; i <= n; i++) {
			list.add(i);
		}
		
		System.out.println(list);
		
		list.remove(2);
		
		System.out.println(list);
		
		for (Integer i: list) {
			System.out.print(i + " ");
		}

	}

}
