package Example3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch {

	public static void main(String[] args) {
		List<String> ls = new ArrayList<>();
		
		Collections.addAll(ls, "Shobana","Jishnu","Isha","Riyan");
		Collections.sort(ls);
		
		System.out.println(Collections.binarySearch(ls, "Riyan"));
		System.out.println(Collections.binarySearch(ls, "ShobaJish"));

	}

}
