package Example3;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetInt {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Shobana");
		hs.add("Jishnu");
		hs.add("Isha");
		hs.add("Riyan");
		
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

	}

}
