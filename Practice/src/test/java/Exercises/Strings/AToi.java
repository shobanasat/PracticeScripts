package Exercises.Strings;

import java.util.Scanner;

public class AToi {
	
	public static void main(String[] args) {
		System.out.println("This Program is to check if there are any other characters apart from numbers in String");
		System.out.println("***************************************************************************************");
		System.out.println();
		
		System.out.println("Enter the string: ");
		Scanner sc1 = new Scanner(System.in);
		String str1 = sc1.next();
		
		int valid = 0;
		int invalid = 0;
		
		for(int i = 0;i<str1.length();i++) {
			if(Integer.valueOf(str1.charAt(i)) >= 48 && Integer.valueOf(str1.charAt(i)) <= 57) {
				valid = valid + 1;
			}
			else {
				invalid = invalid + 1;
			}
		}
		
		if(valid > 0 && invalid == 0) {
			System.out.println("This is a string with only numbers");
		}
		else {
			System.out.println("This string has characters apart from numbers");
		}

	}

}
