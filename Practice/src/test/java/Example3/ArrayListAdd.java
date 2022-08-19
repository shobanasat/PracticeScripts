package Example3;

import java.util.ArrayList;

public class ArrayListAdd {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Gold");
		list.add("Silver");
		list.add(1,"Diamond");
		System.out.println(list);
		
		list.set(1, "Ruby");
		System.out.println(list);
		
		list.remove(1);
		list.remove("Gold");
		System.out.println(list);
		
		for(String str: list) {
			System.out.print(str + " ");
		}
		
		System.out.println();
		
		for (int i = 0;i<list.size();i++) {
			System.out.print(list.get(i) + " ");
		}
	}

}
