package Exceptions;

public class ArithNullPtExceptions {

	public static void main(String[] args) {
		try {
			int a = 10;
			int b = 0;
			int div = a/b;
			System.out.println(div);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			String str = null;
			System.out.println(str.charAt(0));
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}

	}

}
