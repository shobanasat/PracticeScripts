package Examples;

import java.util.Scanner;

public class NumberReversal {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number the number to be reversed: ");
		int n = sc.nextInt();
		
		int remainder = 0, reverse = 0;
				
		while (n!=0){
			
			remainder = n % 10;
			reverse = reverse * 10 + remainder;
			n = n/10;
		}
		
		System.out.println("The reversed number is: " + reverse);

	}

}
