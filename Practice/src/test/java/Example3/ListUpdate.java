package Example3;

import java.util.*;

public class ListUpdate {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Apple");
		list.add("Mango");
		list.add(1,"Grapes");
		
		System.out.println(list);
		
		list.set(1, "Orange");
		
		System.out.println(list);
	}

}
