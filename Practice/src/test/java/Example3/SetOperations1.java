package Example3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetOperations1 {

	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<Integer>();
		set1.addAll(Arrays.asList(new Integer[]{1,2,3,4,5,6,7,8,9}));
		
		Set<Integer> set2 = new HashSet<Integer>();
		set2.add(10);
		set2.add(11);
		set2.add(1);
		set2.add(2);
		
		System.out.println("Set1: " + set1);
		System.out.println(set2);
		
		Set<Integer> union = new HashSet<Integer>(set1);
		union.addAll(set2);
		System.out.println("The Union is: " + union);
		
		Set<Integer> intersection = new HashSet<Integer>(set1);
		intersection.retainAll(set2);
		System.out.println("The intersection is: " + intersection);
		
		Set<Integer> difference = new HashSet<Integer>(set1);
		difference.removeAll(set2);
		System.out.println("The difference is: " + difference);
	}

}
