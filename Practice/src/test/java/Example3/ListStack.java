package Example3;

import java.util.*;

public class ListStack {

	public static void main(String[] args) {
		List<Integer> stack = new Stack<Integer>();
		
		int n = 5;
		for(int i = 0; i <= n; i++) {
			stack.add(i);
		}
		
		System.out.println(stack);
		
		stack.remove(3);
		
		System.out.println(stack);
		
		for(Integer i: stack) {
			System.out.print(i + " ");
		}
	}

}
