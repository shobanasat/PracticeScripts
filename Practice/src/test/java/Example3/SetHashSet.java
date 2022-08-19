package Example3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetHashSet {

	public static void main(String[] args) {
		System.out.println("HASHSET");
		Set<String> set1 = new HashSet<String>();
		set1.add("India");
		set1.add("South Africa");
		set1.add("Australia");
		System.out.println("After Addition: " + set1);
		
		set1.add("India");
		System.out.println("Duplicates added: " + set1);
		
		set1.remove("India");
		System.out.println(set1);
		
		Iterator<String> itr = set1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("LINKEDHASHSET");
		Set<String> set2 = new LinkedHashSet<String>();
		set2.add("Mumbai");
		set2.add("Chennai");
		set2.add("Kolkatta");
		set2.add("Chennai");
		System.out.println("After additions: " + set2);
		
		set2.remove("Mumbai");
		System.out.println("After Removal: " + set2);
		
		Iterator<String> itr1 = set2.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		System.out.println("TREESET");
		Set<String> set3 = new TreeSet<String>();
		set3.add("Mumbai");
		set3.add("Chennai");
		set3.add("Kolkatta");
		set3.add("Chennai");
		System.out.println("After additions: " + set3);
		
		set3.remove("Mumbai");
		System.out.println("After Removal: " + set3);
		
		Iterator<String> itr2 = set3.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}

}
