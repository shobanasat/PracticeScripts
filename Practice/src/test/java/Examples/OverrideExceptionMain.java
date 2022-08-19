package Examples;

public class OverrideExceptionMain {

	public static void main(String[] args) {

		OverridingException oe = new OverridingException();
		oe.m1();
		oe.m2();
		
		sub s = new sub();
		s.m1();
		s.m2();

	}

}
