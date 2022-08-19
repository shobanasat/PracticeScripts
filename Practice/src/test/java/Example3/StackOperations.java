package Example3;

import java.util.Stack;

public class StackOperations {
	
	static void stack_push(Stack<Integer> Stack) {
		for(int i = 0; i < 5; i++) {
			Stack.push(i);
			System.out.print(i + " ");
		}
	}
	
	static void stack_pop(Stack<Integer> stack) {
		for (int i = 0;i < 5;i++) {
			Integer y = (Integer) stack.pop();
			System.out.println("Stack Pop: " + y);
		}
	}
	
	static void stack_peek(Stack<Integer> Stack) {
		Integer x = (Integer) Stack.peek();
		System.out.println("Stack Peek: " + x);
	}
	
	static void stack_search(Stack<Integer> stack, int element) {
		Integer search = (Integer) stack.search(element);
		System.out.println("Searched element: " + search);
	}

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack_push(stack);
		stack_pop(stack);
		stack_push(stack);
		stack_peek(stack);
		stack_search(stack, 3);
		stack_search(stack,10);

	}

}
