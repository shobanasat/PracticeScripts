package Example3;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeStack {

	public static void main(String[] args) {
		Deque<Character> stack = new ArrayDeque<Character>();
		
		stack.push('S');
		stack.push('h');
		stack.push('o');
		
		System.out.println(stack);
		System.out.println("Stack Peek: " + stack.peek());
		System.out.println("Stack Pop: " + stack.pop());
		System.out.println("Stack Peek: " + stack.peek());

	}

}
