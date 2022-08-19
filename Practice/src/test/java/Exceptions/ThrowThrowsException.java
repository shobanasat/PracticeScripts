package Exceptions;

public class ThrowThrowsException {
	
	static void fun() throws IllegalAccessException{
		System.out.println("Method...");
		throw new IllegalAccessException("demo");
	}

	public static void main(String[] args) {
		try {
			fun();
		}
		catch (IllegalAccessException e){
			System.out.println("Main...");
		}

	}

}
