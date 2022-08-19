package Exceptions;

public class EExceptionError {

	public static void main(String[] args) {
		int[] arr = new int[4];
		
		try {
		int i = arr[4];
		
		System.out.println(i);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}

}
