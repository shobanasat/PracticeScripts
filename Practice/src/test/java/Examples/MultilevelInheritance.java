package Examples;

public class MultilevelInheritance {
	
	public void method1() {
		System.out.println("This is Method1...");
	}
}

class subclass1 extends MultilevelInheritance{
	public void method2() {
		System.out.println("This is Method2...");
	}
}

class subclass2 extends subclass1{
	public void method3() {
		System.out.println("This is Method3...");
	}
}