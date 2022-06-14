package Examples;

import java.util.Scanner;

public class JavaOperatorsLargestOfThree {

	public static void main(String[] args) {

		System.out.println("This program is to find the largest of 3 numbers");
		System.out.println("Enter the 1st number");
		Scanner sc1 = new Scanner(System.in);
		int first = sc1.nextInt();
		System.out.println("Enter the 2nd number");
		Scanner sc2 = new Scanner(System.in);
		int second = sc2.nextInt();
		System.out.println("Enter the 3rd number");
		Scanner sc3 = new Scanner(System.in);
		int third = sc3.nextInt();
		
		//Logic to find the largest
		if (first >= second && first >= third) {
			System.out.println("The largest is: " + first);
		}
		else if (second >= third) {
			System.out.println("The largest is: " + second);
		}
		else {
			System.out.println("The largest is: " + third);
		}
	}

}
