package Example3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddAll {

	public static void main(String[] args) {
		List<String> ls = new ArrayList<>();
		
		ls.add("Shobana");
		ls.add("Jishnu");
		
		Collections.addAll(ls, "Isha","Riyan");
		
		for(int i = 0;i<ls.size();i++) {
			System.out.print(ls.get(i) + " ");
		}

	}

}
