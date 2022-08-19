package Exercises;

import java.util.LinkedList;
import java.util.Scanner;

public class RotateLinkedList {

	public static void main(String[] args) {
		System.out.println("This program is to rotate a LinkedList");
		System.out.println("**************************************");
		System.out.println();
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		System.out.println("Enter the size of LinkedList: ");
		Scanner sc1 = new Scanner(System.in);
		int size = sc1.nextInt();
		
		System.out.println();
		System.out.println("Enter LinkedList values: ");
		for(int i = 0;i<size;i++) {
			list.add(sc1.nextInt());
		}
		
		System.out.println("The Linkedlist is: " + list);
		
		System.out.println();
		System.out.println("Enter the index for rotation: ");
		int rotateNum = sc1.nextInt();
		
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		if (rotateNum <= size - 1) {
			for(int i = rotateNum;i<size;i++) {
			list2.add(list.get(i));
			}
			
			int j = 0;
			for(int i = list2.size();i<size;i++) {
				list2.add(list.get(j));
				j= j+ 1;
			}
		}
		else {
			System.out.println("The entered number has exceeded the length or is invalid. Please enter valid number");
		}
		
		System.out.println();
		System.out.println("The rotated list is: " + list2);
		
	}

}
