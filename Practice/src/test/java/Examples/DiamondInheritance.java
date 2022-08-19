package Examples;

public interface DiamondInheritance {
	default void method1() {
		System.out.println("GP Method1");
	}
}

interface I1 extends DiamondInheritance{
	
}

interface I2 extends DiamondInheritance{
	
}

class Imp implements I1, I2{
/*	public void method1() {
		System.out.println("Subclass Method1");
	}*/
}