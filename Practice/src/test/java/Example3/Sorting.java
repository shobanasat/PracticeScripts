package Example3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {

	public static void main(String[] args) {
		List<String> ls = new ArrayList<>();
		
		ls.add("Shobana");
		ls.add("Jishnu");
		
		Collections.addAll(ls, "Isha","Riyan");
		Collections.sort(ls);
		
		for (int i = 0; i<ls.size();i++) {
			System.out.print(ls.get(i) + " ");
		}
		
		System.out.println();
		
		Collections.sort(ls, Collections.reverseOrder());
		
		for (int i = 0; i<ls.size();i++) {
			System.out.print(ls.get(i) + " ");
		}

	}

}
