package Example3;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetOperations {

	public static void main(String[] args) {
		LinkedHashSet<String> lhash = new LinkedHashSet<String>();
		
		lhash.add("D");
		lhash.add("B");
		lhash.add("C");
		lhash.add("A");
		System.out.println("After Additions: " + lhash);
		
		lhash.add("A");
		System.out.println("Duplicates cannot be added, so the list remains as: " + lhash);
		
		lhash.add("E");
		System.out.println("After some more additions: " + lhash);
		
		String check = "E";
		System.out.println("Checking contains: " + lhash.contains(check));
		
		System.out.println("Size of the list is: " + lhash.size());
		
		lhash.remove("C");
		System.out.println("After removal: " + lhash);
		
		Iterator<String> itr = lhash.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
