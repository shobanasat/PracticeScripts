package Examples;

public class OverridingException {
	
	void m1 () throws RuntimeException {
		System.out.println("Main Class - m1");
	}

	void m2() {
		System.out.println("Main Class - m2");
	}
}

class sub extends OverridingException{
	
	void m1() throws RuntimeException {
		System.out.println("Subclass - m1");
	}
	
	void m2() throws ArithmeticException {
		System.out.println("Subclass - m2");
	}
}
