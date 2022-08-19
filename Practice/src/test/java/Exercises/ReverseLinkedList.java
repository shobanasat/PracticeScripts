package Exercises;

import java.util.LinkedList;
import java.util.Scanner;

public class ReverseLinkedList {
	
	public static void reverse() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		System.out.println("This program is to reverse LinkedList");
		System.out.println("#####################################");
		System.out.println();
		System.out.println("Enter the no of elements in the LinkedList: ");
		Scanner sc1 = new Scanner(System.in);
		int num = sc1.nextInt();
		
		System.out.println("Enter the elements: ");
		for(int i =0;i<num;i++) {
			list.add(sc1.nextInt());
		}
		
		System.out.println("Entered LinkedList: " + list);
		System.out.print("The reversed list is: [");
		for(int i = list.size()-1;i>=0;i--) {
			System.out.print(list.get(i) + " ,");
		}
		System.out.print("]");
	}

	public static void main(String[] args) {
		reverse();
	}

}
