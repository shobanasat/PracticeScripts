package Exceptions;

public class TryCatchFinally {

	public static void main(String[] args) {
		try {
			int a = 10;
			int b = 0;
			int div = a/b;
			
			System.out.println(div);
		}
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		finally{
			System.out.println("This is in finally block");
		}
	}

}
