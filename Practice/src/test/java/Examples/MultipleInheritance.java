package Examples;

public interface MultipleInheritance {
	
	public void method1();

}

interface Interface2{
	
	public void method2();
}

interface Interface3 extends MultipleInheritance,Interface2{
	public void method1();
}

class Child implements Interface3{
	public void method1() {
		System.out.println("Method1 of Interface1");
	}

	public void method2() {
		System.out.println("Method2 of Interface2");
		
	}

}