package Exercises;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListInsertion {

	public static void main(String[] args) {
		System.out.println("This is program is to arrange LinkedList values");
		System.out.println("***********************************************");
		System.out.println();
		
		System.out.println("Enter the size of the LinkedList: ");
		Scanner sc1 = new Scanner(System.in);
		int size = sc1.nextInt();
		
		System.out.println();
		System.out.println("Enter values in LinkedList: ");
		LinkedList<Integer> list = new LinkedList<>();
		
		for(int i = 0;i<size;i++) {
			list.add(sc1.nextInt());
		}
		
		System.out.println();
		System.out.println("The LinkedList is: " + list);
		LinkedList<Integer> list1 = new LinkedList<>();
		
		for(int i = 1;i<size;i = i+2) {
			if(list.get(i) == 1) {
//				list1.addFirst(list.get(i));
				list1.addFirst(list.get(i-1));
			}
			else if(list.get(i) == 0) {
				list1.addLast(list.get(i-1));
//				list1.addLast(list.get(i));
			}
		}
		
		System.out.println("LinkedList after insertions: " + list1);

	}

}
