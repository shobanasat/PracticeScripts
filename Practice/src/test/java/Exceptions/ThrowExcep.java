package Exceptions;

public class ThrowExcep {
	
	static void fun() {
		try {
			throw new NullPointerException("demo");
		}
		catch(NullPointerException e) {
			System.out.println("Method - Null Pointer Exception");
			throw e;
		}
	}

	public static void main(String[] args) {
		try {
			fun();
		}
		catch (NullPointerException e) {
			System.out.println("Main - Null Pointer Exception");
		}

	}

}
