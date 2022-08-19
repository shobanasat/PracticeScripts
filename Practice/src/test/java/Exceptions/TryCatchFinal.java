package Exceptions;

public class TryCatchFinal {

	public static void main(String[] args) {
		try {
			int arr[] = {1,2,3,4};
			int i = arr[3];
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("This is FINALLY block");
		}

	}

}
