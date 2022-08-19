package Exceptions;

public class ClassNotFoundExcep {

	public static void main(String[] args) {
		try {
			Class.forName("Class1");
		}
		catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}

}
