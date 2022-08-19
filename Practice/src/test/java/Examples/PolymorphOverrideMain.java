package Examples;

public class PolymorphOverrideMain {

	public static void main(String[] args) {
		PolymorphOverride pm;
		
		pm = new subclass10();
		pm.method1();
		
		pm = new subclass11();
		pm.method1();
		
		pm = new PolymorphOverride();
		pm.method1();

	}

}
