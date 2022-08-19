package Exceptions;

public class NumberFormatExceptions {

	public static void main(String[] args) {
		try {
			int num = Integer.parseInt("29");
			System.out.println(num);
		}
		catch(NumberFormatException e) {
			System.out.println(e.getMessage());
		}

	}

}
