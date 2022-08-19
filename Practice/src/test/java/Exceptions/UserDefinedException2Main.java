package Exceptions;

public class UserDefinedException2Main {

	public static void main(String[] args) {
		try {
			throw new UserDefinedException2();
		}
		catch (UserDefinedException2 e) {
			System.out.println("Caught");
			System.out.println();
		}
	}

}
