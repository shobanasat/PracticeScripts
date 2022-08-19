package Exercises;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListRemove {

	public static void main(String[] args) {
		
		System.out.println("This program is to delete values from LinkedList");
		System.out.println("************************************************");
		System.out.println("Enter the size of LinkedList: ");
		Scanner sc1 = new Scanner(System.in);
		int size1 = sc1.nextInt();
		
		System.out.println();
		LinkedList<Integer> list1 = new LinkedList<>();
		System.out.println("Enter Linkedlist values: ");
		for(int i =0;i<size1;i++) {
			list1.add(sc1.nextInt());
		}
		System.out.println("The LinkedList is: " + list1);
		System.out.println();
		System.out.println("Enter the value to be removed: ");
		int remove = sc1.nextInt();
		
		for (int i = 0;i<list1.size();i++) {
			if(list1.get(i) == remove)
				list1.remove(i);
		}
		
		System.out.println();
		System.out.println("List after removal of value is: " + list1);

	}

}
