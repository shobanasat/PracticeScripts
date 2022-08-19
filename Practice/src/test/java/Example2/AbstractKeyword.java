package Example2;

public abstract class AbstractKeyword {
	
	abstract void method1();
	
	void method2() {
		System.out.println("This is a concrete method");
	}

}

class SubAbstract extends AbstractKeyword{

	@Override
	void method1() {
		System.out.println("Abstract Method1");
		
	}
	
	void method3() {
		System.out.println("This is subclass concrete method..");
	}
	
}