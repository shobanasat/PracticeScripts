package Exercises;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Add1ToLinkedList {

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
		
		list.set(size - 1, list.getLast() + 1);
		
		System.out.println(" After adding 1: " + list);
		
	}

}
