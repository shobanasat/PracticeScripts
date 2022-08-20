package Exercises;

import java.util.LinkedList;
import java.util.Scanner;

public class RemoveDuplicatesLL {

	//If there are more than 1 duplicate then not working
	public static void main(String[] args) {
		System.out.println("This program is to remove duplicates");
		System.out.println("************************************");
		
		System.out.println("Enter the size of the LL: ");
		Scanner sc1 = new Scanner(System.in);
		int size = sc1.nextInt();
		LinkedList<Integer> list = new LinkedList<>();
		System.out.println();
		
		System.out.println("Enter the values: ");
		for(int i = 0;i<size;i++) {
			list.add(sc1.nextInt());
		}
		
		System.out.println("The list is: " + list);
		
		for(int i =0;i<list.size()-1;i++) {
			for(int j = i+1;j<list.size();j++) {
				if(list.get(i) == list.get(j)) {
					list.remove(j);
				}
			}
		}
		
/*		for(int i =0;i<list.size()-1;i++) {
			if(list.get(i) == 0001) {
				list.remove(i);
			}
		}*/
		System.out.println();
		System.out.println("The list after removing duplicates: " + list);
	}

}
