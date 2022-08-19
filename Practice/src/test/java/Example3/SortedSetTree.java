package Example3;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTree {

	public static void main(String[] args) {
		SortedSet<String> sset = new TreeSet<String>();
		sset.add("Z");
		sset.add("A");
		sset.add("X");
		sset.add("N");
		sset.add("S");
		System.out.println("After addition: " + sset);
		
		sset.add("X");
		System.out.println("Duplicates cannot be added, so the list remains as: " + sset);
		
		sset.add("B");
		System.out.println("After some more addition: " + sset);
		
		sset.remove("N");
		System.out.println("After Removal: " + sset);
		
		String check = "S";
		System.out.println("Checking contains: " + sset.contains(check));
		
		System.out.println("Size of the set: " + sset.size());
		
		Iterator<String> str = sset.iterator();
		while(str.hasNext()) {
			System.out.println(str.next());
		}
	}

}
