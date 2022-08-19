package Exceptions;

import java.util.*;

public class ListInterface {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		list1.add(0,1);
		list1.add(1,2);
		System.out.println(list1);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(4);
		list2.add(5);
		list2.add(6);
		System.out.println(list2);
		
		list1.addAll(1,list2);
		System.out.println(list1);
		
		list1.remove(1);
		System.out.println(list1);
		
		System.out.println(list1.get(3));
		
		list1.set(0, 10);
		System.out.println(list1);

	}

}
