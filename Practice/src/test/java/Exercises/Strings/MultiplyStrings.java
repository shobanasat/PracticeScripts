package Exercises.Strings;

import java.util.Scanner;

public class MultiplyStrings {

	public static void main(String[] args) {
		System.out.println("This Program is to multiply 2 strings");
		System.out.println("*************************************");
		System.out.println();
		System.out.println("Enter the 1st string number: ");
		Scanner sc1 = new Scanner(System.in);
		String str1 = sc1.next();
		
		System.out.println("Enter the 2nd string number: ");
		String str2 = sc1.next();
		
		int multiply = Integer.valueOf(str1) * Integer.valueOf(str2);
		System.out.println("The result after multiplication is: " + multiply);

	}

}
