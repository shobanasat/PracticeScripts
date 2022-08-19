package Example3;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetOperations {

	public static void main(String[] args) {
		Set<String> ts = new TreeSet<String>();
		
		ts.add("Zebra");
		ts.add("Aligator");
		ts.add("Elephant");
		ts.add("Snake");
		ts.add("Kite");
		System.out.println("After addition: " + ts);
		
		ts.add("Elephant");
		System.out.println("After additing duplicates: " + ts);
		
		ts.add("Jackal");
		System.out.println("Additional items: " + ts);
		
		String check = "Kite";
		System.out.println("Checking contains: " + ts.contains(check));
		
		ts.remove(check);
		System.out.println("After Removal: " + ts);
		
		for(String str: ts) {
			System.out.println(str);
		}
	}

}
