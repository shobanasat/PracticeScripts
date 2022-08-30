package Exercises.Strings;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println("This Program is to reverse a String");
		System.out.println("***********************************");
		System.out.println();
		System.out.println("Enter any string of your choice: ");
		Scanner sc1 = new Scanner(System.in);
		StringBuilder str1 = new StringBuilder(sc1.next());
		
		
		System.out.println("Reversed string is: " + str1.reverse());

	}

}
