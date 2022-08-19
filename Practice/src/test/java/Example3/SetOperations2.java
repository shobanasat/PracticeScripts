package Example3;

import java.util.HashSet;
import java.util.Set;

public class SetOperations2 {

	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<Integer>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		
		System.out.println("After addition: " + set1);
		
		set1.remove(3);
		
		System.out.println("After removal: " + set1);

	}

}
