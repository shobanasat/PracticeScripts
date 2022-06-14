package Examples;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		
		System.out.println("This is a program to print the sum of digits of a number");
		System.out.println("Enter the number: ");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int remainder = 0;
		int sum = 0;
		
		while (num != 0) {
		remainder = num % 10;
		sum = sum + remainder;
		num = num/10;
		
		}
		
		System.out.println("The sum of num is: " + sum);
	}

}
