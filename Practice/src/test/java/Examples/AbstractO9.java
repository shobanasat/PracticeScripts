package Examples;

public abstract class AbstractO9 {
	
	abstract void method1();
	abstract void method2();
	abstract void method3();

}

abstract class sub9 extends AbstractO9{

	@Override
	void method1() {
	System.out.println("Method1...");
	}

	@Override
	void method2() {
	System.out.println("Method2...");
	}
}

class sub10 extends sub9{

	@Override
	void method3() {
		System.out.println("Method3...");
		
	}
	
}