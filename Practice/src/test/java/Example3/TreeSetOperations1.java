package Example3;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetOperations1 {

	public static void main(String[] args) {
		NavigableSet<String> nset = new TreeSet<String>();
		
		nset.add("Geek");
		nset.add("Geeks");
		nset.add("For");
		System.out.println("After addition: " + nset);
		
		System.out.println("Poll First: " + nset.pollFirst());
		System.out.println("Poll Last: " + nset.pollLast());
		
		System.out.println("After removal: " + nset);
		
		Set<StringBuffer> sset = new TreeSet<>();
		sset.add(new StringBuffer("Frog"));
		sset.add(new StringBuffer("Banana"));
		sset.add(new StringBuffer("Cat"));
		sset.add(new StringBuffer("Dog"));
		sset.add(new StringBuffer("Apple"));
		sset.add(new StringBuffer("Apple"));
		sset.add(new StringBuffer(1));
		System.out.println(sset);

	}

}
