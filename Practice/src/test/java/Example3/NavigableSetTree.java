package Example3;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetTree {

	public static void main(String[] args) {
		NavigableSet<String> nset = new TreeSet<String>();
		nset.add("Maths");
		nset.add("English");
		nset.add("Physics");
		nset.add("Chemistry");
		nset.add("Zoology");
		nset.add("Botany");
		nset.add("History");
		nset.add("Geography");
		System.out.println("After Additions: " + nset);
		
		NavigableSet<String> reverse = nset.descendingSet();
		System.out.println("After reversal Operation: " + reverse);
		
		NavigableSet<String> threeOrMore = nset.tailSet("Chemistry", true);
		System.out.println("Floor: " + nset.floor("Zoology"));
		System.out.println("Ceiling: " + nset.ceiling("History"));
		System.out.println("Higher: " + nset.higher("Maths"));
		System.out.println("Lower: " + nset.lower("Geography"));
		
		System.out.println("Pollfirst: " + nset.pollFirst());
		System.out.println("Polllast: " + nset.pollLast());
		
		System.out.println("Final list: " + nset);
		
		NavigableSet<Integer> nset2 = new TreeSet<Integer>();
		nset2.add(1);
		nset2.add(2);
		nset2.add(3);
		nset2.add(4);
		nset2.add(5);
		nset2.add(6);
		nset2.add(7);
		System.out.println("After Integer addition: " + nset2);
		
		nset2.add(6);
		System.out.println("After adding Duplicates: " + nset2);
		
		nset2.add(8);
		System.out.println("After some more addition: " + nset2);
		
		nset2.remove(4);
		System.out.println("After removal: " + nset2);
		
		Iterator<Integer> itr = nset2.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
