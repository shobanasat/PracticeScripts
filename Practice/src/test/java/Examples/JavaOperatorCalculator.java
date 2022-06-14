package Examples;

import java.util.Scanner;

public class JavaOperatorCalculator {

	public static void main(String[] args) {
		
		System.out.println("This is a calculator program...");
		System.out.println("What operation do you want to do?");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Mod operator");
		System.out.println("Choose any number 1 to 5");
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		int length = String.valueOf(i).length();
		
		if (length == 1) {
		System.out.println("Enter the 2 numbers: ");
		int firstNumber = sc.nextInt();
		int secondNumber = sc.nextInt();
		
		switch (i) {
		
		case 1:
			int add = firstNumber + secondNumber;
			System.out.println("The result of addition is: " + add);
			break;
		case 2:
			int sub = firstNumber - secondNumber;
			System.out.println("The result of subtraction is: " + sub);
			break;		
		case 3:
			int mul = firstNumber * secondNumber;
			System.out.println("The result of multiplication is: " + mul);
			break;	
		case 4:
			int div = firstNumber / secondNumber;
			System.out.println("The result of division is: " + div);
			break;	
		case 5:
			int mod = firstNumber % secondNumber;
			System.out.println("The result of mod is: " + mod);
			break;	
		default:
			System.out.println("Not a valid option. Should be between 1 and 5");
			break;
		}
		}
		else {
			System.out.println("Entered number should be between 1 and 5");
		}
	}

}
