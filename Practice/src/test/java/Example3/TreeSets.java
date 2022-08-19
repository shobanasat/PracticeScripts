package Example3;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSets {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Shobana");
		ts.add("Jishnu");
		ts.add("Isha");
		ts.add("Riyan");
		
		Iterator<String> ltr = ts.iterator();
		while(ltr.hasNext()) {
			System.out.print(ltr.next() + " ");
		}
		
	}

}
