package Example3;

import java.util.*;

public class ListRemove {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Gold");
		list.add("Diamond");
		list.add(1,"Silver");
		list.add(2,"Ruby");
		System.out.println(list);
		
		list.remove(1);
		System.out.println(list);
		
		list.remove("Ruby");
		System.out.println(list);
	}

}
