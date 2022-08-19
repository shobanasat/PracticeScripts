package Exceptions;

public class IllegalArguExcep {
	
	public static void display(int a) {
		if (a>=18) {
			System.out.println("Eligible for voiting");
		}
		else {
			throw new IllegalArgumentException("Not Eligible for Voting");
		}
	}

	public static void main(String[] args) {
		display(10);

	}

}
