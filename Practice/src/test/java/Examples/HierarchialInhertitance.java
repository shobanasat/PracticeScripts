package Examples;

public class HierarchialInhertitance {
	public void method1() {
		System.out.println("This is Method1...");
	}
}

class sub1 extends HierarchialInhertitance{
	public void method2() {
		System.out.println("This is Method2...");
	}
}

class sub2 extends HierarchialInhertitance{
	public void method3() {
		System.out.println("This is Method3...");
	}
}

class sub3 extends HierarchialInhertitance{
	public void method4() {
		System.out.println("This is Method4...");
	}
}