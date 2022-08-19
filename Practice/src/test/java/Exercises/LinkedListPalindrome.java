package Exercises;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListPalindrome {
	
	static void isPalindrome(LinkedList list) {
		int midNum = (list.size()/2);
		int length = list.size();
		int count = 0;
		
		for(int i = 0;i<midNum;i++) {
			if(list.get(i) == list.get(length-1)) 
			{
			length = length - 1;
			
			if(length == midNum-1) {
				break;
			}	
			count = count + 1;
		}
	}
		if(count == midNum) {
			System.out.println("The entered LinkedList is a palindrome");
		}
		else {
			System.out.println("The entered LinkedList is not a palindrome");
		}
	}
	public static void main(String[] args) {
		System.out.println("This Program is to verify if the LinkedList is a palindrome");
		System.out.println("Enter the number of elements in the LinkedList: ");
		System.out.println("************************************************");
		
		Scanner sc1 = new Scanner(System.in);
		int num = sc1.nextInt();
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		System.out.println("Enter the values for the list: ");
		for(int i = 0;i<num;i++) {
			list.add(sc1.nextInt());
		}
		
		System.out.println("The entered LinkedList is: " + list);
		
		//Check if its a palindrome
		isPalindrome(list);

	}

}
