package Example3;

import java.util.Iterator;
import java.util.Stack;

public class StackIterator {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("Shobana");
		stack.push("Jishnu");
		stack.push("Isha");
		stack.push("Riyan");
		
		Iterator<String> itr = stack.iterator();
		
		while(itr.hasNext()){
		System.out.print(itr.next() + " ");
		}
		
		System.out.println();
		stack.pop();
		
		itr=stack.iterator();
		
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
	}

}
