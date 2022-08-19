package Exercises;

import java.util.LinkedList;
import java.util.Scanner;

public class RemoveDuplicateLinkedList {
	
	//More than 2 duplicates does not work - Should have it checked

	public static void main(String[] args) {
		System.out.println("This Program is to remove duplicates in LinkedList");
		System.out.println("**************************************************");
		System.out.println();
		
		System.out.println("Enter the size of LinkedList: ");
		Scanner sc1 = new Scanner(System.in);
		int size = sc1.nextInt();
		
		System.out.println();
		System.out.println("Enter the values in LinkedList: ");
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		for(int i = 0;i<size;i++) {
			list.add(sc1.nextInt());
		}
		System.out.println();
		System.out.println("The Linkedlist is: " + list);
		
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		for(int i = 0;i<size;i++) {
			list1.add(list.get(i));
		}
		for(int i = 0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(list.get(i) > list.get(j)) {
					list1.set(i, list.get(i));
					list.set(i, list.get(j));
					list.set(j, list1.get(i));
				}
			}
		}
		
		System.out.println();
		System.out.println("Sorted list: " + list);
		
		LinkedList<Integer> duplicate = new LinkedList<>();
		for(int i = 0;i<list.size();i++) {
			for(int j=i+1;j<list.size();j++) {
					if(list.get(i) == list.get(j)){
						list.remove(j);
				}
		}
	}
		System.out.println();
		System.out.println("Duplicates Removed: " + list);
		sc1.close();
		
	}

}
