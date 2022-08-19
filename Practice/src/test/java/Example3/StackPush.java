package Example3;

import java.util.Stack;

public class StackPush {

	public static void main(String[] args) {
		Stack stack = new Stack();
		
		stack.push(4);
		stack.push(5);
		stack.push("Shobana");
		stack.push("Jishnu");
		
		System.out.println(stack);
		System.out.println(stack.peek());
		
		stack.pop();
		System.out.println(stack);
	}

}
