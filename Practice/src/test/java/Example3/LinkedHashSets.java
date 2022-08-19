package Example3;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSets {

	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("Shobana");
		lhs.add("Jishnu");
		lhs.add("Isha");
		lhs.add("Riyan");
		
		Iterator<String> ltr = lhs.iterator();
		while(ltr.hasNext()) {
			System.out.print(ltr.next() + " ");
		}
	}

}
