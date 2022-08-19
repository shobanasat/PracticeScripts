package Exceptions;

public class IllegalStateExcep {

	public static void main(String[] args) {
		int n1 = 2;
		int n2 = -3;
		int sum = n1 + n2;
		if(sum>0) {
			System.out.println("Positive integers added and the sum is: " + sum);
		}
		else {
			throw new IllegalStateException("Illegal State Exception");
		}
	}

}
