package Examples;

import java.util.Scanner;

public class JavaSwap {

	public static void main(String[] args) {
		
		System.out.println("Program to swap 2 variables");
		
		System.out.println("Enter the 1st number");
		Scanner sc1 = new Scanner(System.in);
		int first = sc1.nextInt();

		System.out.println("Enter the 2nd number");
		Scanner sc2 = new Scanner(System.in);
		int second = sc2.nextInt();
		
		int third = first;
		first = second;
		second = third;
		
		System.out.println("The swapped first number is: " + first);
		System.out.println("The swapped second number is: " + second);
	}

}
