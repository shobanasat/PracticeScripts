package Example3;

import java.util.*;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		int n = 5;
		for(int i = 0; i <= 5; i++ ) {
			list.add(i);
		}
		
		System.out.println(list);
		
		list.remove(2);
		
		for(Integer i: list) {
			System.out.print(i + " ");
		}
	}

}
