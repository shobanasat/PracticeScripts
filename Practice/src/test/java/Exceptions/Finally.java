package Exceptions;

public class Finally {

	public static void main(String[] args) {
		try {
			int arr[] = {1,2,3,4};
			int i = arr[2];
		}
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Finally block");
		}
		
		System.out.println("Outside block");

	}

}
