package Exceptions;

public class ERunTime {
	
	static int divideByZero(int a,int b) {
		int divide = a/b;
		return divide;
	}
	
	static int computeDivision(int a,int b) {
		int res = 0;
		try {
			res = divideByZero(a,b);
		}
		catch(NumberFormatException e) {
			System.out.println("Number format Exception");
		}
		return res;
	}

	public static void main(String[] args) {
		int a = 1;
		int b = 0;
		
		try {
			int i = computeDivision(a,b);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}

	}

}
