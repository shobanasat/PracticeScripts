package Example3;

import java.util.*;

public class ListArrayList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		int n = 5;
		
		for (int i = 1; i <= n; i++) {
			list.add(i);
		}
		
		System.out.println(list);
		
		list.remove(2);
		
		System.out.println(list);
		
		for(int i = 0; i <= list.size() - 1; i++) {
			System.out.print(list.get(i) + " ");
		}
	}

}
