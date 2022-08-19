package Examples;

import java.util.Scanner;

public class BitwiseOperator {

	public static void main(String[] args) {

		System.out.println("Enter the 1st number for bitwise operation: ");
		Scanner sc1 = new Scanner(System.in);
		int first = sc1.nextInt();
		
		System.out.println("Enter the 2nd number for bitwise operation: ");
		Scanner sc2 = new Scanner(System.in);
		int second = sc2.nextInt();
		
		System.out.println("Choose an option between 1 to 4: ");
		System.out.println("1 - Bitwise AND ");
		System.out.println("2 - Bitwise OR ");
		System.out.println("3 - Bitwise XOR ");
		System.out.println("4 - Bitwise Complement ");
		Scanner sc3 = new Scanner(System.in);
		int input = sc3.nextInt();
		
		switch(input) {
			
		case 1:
			System.out.println("The result of Bitwise AND is: " + (first & second));
			break;
		
		case 2:
			System.out.println("The result of Bitwise OR is: " + (first | second));
			break;
			
		case 3:
			System.out.println("The result of Bitwise XOR is: " + (first ^ second));
			break;
			
		case 4:
			System.out.println("The result first number complement is: " + (~first));
			System.out.println("The result second number complement is: " + (~second));
			break;
			
		default:
			System.out.println("Enter a valid option between 1 and 4 ");
			break;
		}

	}

}
