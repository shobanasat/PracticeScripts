package Exceptions;

public class ArrayStringOutofBoundException {

	public static void main(String[] args) {
		try {
			int arr[] = {1,2,3,4};
			System.out.println(arr[5]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			String str = "I am Shobana";
			System.out.println(str.charAt(50));
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}

}
