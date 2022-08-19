package Exercises;

import java.util.Scanner;

public class RomanToInt {

	public static void main(String[] args) {
		System.out.println("This program is to get Integer number of Rom equivalent passed");
		System.out.println("For your reference:");
		System.out.println("********************");
		System.out.println("Symbol	Value");
		System.out.println("------  -----");
		System.out.println("  I        1 ");
		System.out.println("  V        5 ");
		System.out.println("  X        10 ");
		System.out.println("  L        50 ");
		System.out.println("  C        100 ");
		System.out.println("  D        500 ");
		System.out.println("  M        1000 ");
		
		System.out.println("Enter a Roman number");
		Scanner sc1 = new Scanner(System.in);
		String romanNum = sc1.next();
		
		int Number = 0;
		int Integer = 0;
		
		for (int i = 0;i<romanNum.length();i++) {
			char c = romanNum.charAt(i);
				
			switch(c) {
			case 'I':
				Number = 1;
				break;
			case 'V':
				Number = 5;
				break;
			case 'X':
				Number = 10;
				break;
			case 'L':
				Number = 50;
				break;
			case 'C':
				Number = 100;
				break;
			case 'D':
				Number = 500;
				break;
			case 'M':
				Number = 1000;
				break;
			default:
				System.out.println("Enter a valid roman number");
				break;
			}
			
			if(i != 0 && (c == 'V' || c == 'X') && romanNum.charAt(i-1) == 'I' ) {
				
			Integer = (Integer + Number) - 2;
			
			}
			else {
			
			Integer = Integer + Number; }
			
		}
		System.out.println("The Integer Number is: " + Integer);
	}

}
