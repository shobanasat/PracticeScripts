package Examples;

import java.util.Scanner;

public class JavaOperatorTernaryAssignment {

	public static void main(String[] args) {

		System.out.println("Which is lesser and How many time");
		System.out.println("Enter A: ");
		Scanner sc1 = new Scanner(System.in);
		int A = sc1.nextInt();
		
		System.out.println("Enter B: ");
		Scanner sc2 = new Scanner(System.in);
		int B = sc2.nextInt();		
		
		int num = (A < B)?A:B;
		System.out.println(num + " is the smallest");
		
		int a = 20;
		a+=4;
		System.out.println(a);
	}

}
