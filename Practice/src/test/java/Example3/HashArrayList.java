package Example3;

import java.util.ArrayList;
import java.util.HashSet;

public class HashArrayList {

	public static void main(String[] args) {
		HashSet<ArrayList> hash1 = new HashSet<>();
		ArrayList<Integer> set1 = new ArrayList<Integer>();
		ArrayList<Integer> set2 = new ArrayList<Integer>();
		
		set1.add(1);
		set1.add(2);
		set2.add(3);
		set2.add(4);
		
		hash1.add(set1);
		hash1.add(set2);
		
		System.out.println(hash1);
	}

}
