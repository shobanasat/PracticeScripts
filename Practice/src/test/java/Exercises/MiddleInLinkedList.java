package Exercises;

import java.util.LinkedList;
import java.util.Scanner;

public class MiddleInLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the number of elements in the linkedlist");
		int num = sc1.nextInt();
		
		System.out.println("Enter the numbers: ");
		for (int i = 0;i<num;i++) {
			list.add(sc1.nextInt());
		}
		
		System.out.println("The list is: " + list);
		
		int midnum = 0;
		midnum = (num/2);
		
		System.out.println("The middle number is: " + list.get(midnum));

	}

}
