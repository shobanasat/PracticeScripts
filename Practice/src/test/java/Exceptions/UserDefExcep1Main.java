package Exceptions;

public class UserDefExcep1Main {

	public static void main(String[] args) {
			try {
				throw new UserDefinedException1("Shobana");
			}
			catch (UserDefinedException1 e) {
				System.out.println("Caught");
				System.out.println(e.getMessage());
			}

		}


	}


