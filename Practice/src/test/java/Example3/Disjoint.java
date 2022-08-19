package Example3;

import java.util.*;

public class Disjoint {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		Collections.addAll(list1, "Diamond","Ruby","Gold","Silver");
		
		List<String> list2 = new ArrayList<>();
		Collections.addAll(list2, "Diamonds","Rubys","Golds","Silvers");
		
		System.out.println(Collections.disjoint(list1, list2));
	}

}
