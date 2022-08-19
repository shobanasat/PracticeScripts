package Exercises;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListAdd {

	public static void main(String[] args) {
		System.out.println("This program is to convert 2 linkedlist as numbers and add them");
		System.out.println("Enter the size of the LinkedList 1: ");
		Scanner sc1 = new Scanner(System.in);
		int size = sc1.nextInt();
		
		System.out.println("Enter the size of the LinkedList 2: ");
		Scanner sc2 = new Scanner(System.in);
		int size2 = sc2.nextInt();
		
		System.out.println();
		System.out.println("Enter values into 1st LinkedList: ");
		LinkedList<Integer> list1 = new LinkedList<>();
		for(int i=0;i<size;i++) {
			list1.add(sc1.nextInt());
		}
		
		System.out.println();
		System.out.println("Enter values into 2nd LinkedList: ");
		LinkedList<Integer> list2 = new LinkedList<>();
		for(int i=0;i<size2;i++) {
			list2.add(sc2.nextInt());
		}
		
		System.out.println();
		System.out.println("The 1st linked list is: " + list1);
		System.out.println("The 2nd linked list is: " + list2);
		
		StringBuilder stringBuilder1 = new StringBuilder();
		StringBuilder stringBuilder2 = new StringBuilder();
		if (size > 0 && size2 > 0) {
			for(Integer integer1 : list1) {
				stringBuilder1.append(integer1);
			}
		
		
			for(Integer integer1 : list2) {
				stringBuilder2.append(integer1);
			}
		
		String s1 = stringBuilder1.toString();
		int num1 = Integer.valueOf(s1);
		
		String s2 = stringBuilder2.toString();
		int num2 = Integer.valueOf(s2);
		
		int addition = num1 + num2;
		
		System.out.println("Addition of 2 Linkedlist results in: " + addition);
		}
		else {
			System.out.println("Linked List size is not valid. Enter a valid number");
		}
	}

}
