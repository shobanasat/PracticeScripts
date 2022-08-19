package Example3;

import java.util.*;

public class ListFor {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Maths");
		list.add(1," ");
		list.add("Physics");
		
		System.out.println(list);
		
		for(int i = 0;i<list.size();i++) {
			System.out.print(list.get(i) + " ");
		}
		
		list.add("Biology");
		System.out.println();
		
		for(String str: list) {
			System.out.print(str + " ");
		}
	}

}
