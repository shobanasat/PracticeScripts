package Example3;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetAdd {

	public static void main(String[] args) {
		HashSet<Integer> hash1 = new HashSet<Integer>();
		hash1.add(1);
		hash1.add(2);
		hash1.add(3);
		hash1.add(4);
		hash1.addAll(hash1);
		System.out.println("After addition: " + hash1);
		
		hash1.remove(4);
		System.out.println("After removal: " + hash1);
		
		Iterator<Integer> itr = hash1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		for(Integer i: hash1) {
			System.out.println(i);
		}
	}

}
