package Example3;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetOperations1 {

	public static void main(String[] args) {
		HashSet<String> hash1 = new HashSet<String>();
		
		hash1.add("English");
		hash1.add("Maths");
		hash1.add("Tamil");
		hash1.add("Science");
		System.out.println("After addition: " + hash1);
		
		String check = "Maths";
		System.out.println("Checking Contains: " + hash1.contains(check));
		
		hash1.remove("Science");
		System.out.println("After removal: " + hash1);
		
		Iterator<String> itr = hash1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
