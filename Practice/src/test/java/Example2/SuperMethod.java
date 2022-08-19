package Example2;

public class SuperMethod {
	
	void method1() {
		System.out.println("Super Class - Method1");
	}

}

class SubclassMethod extends SuperMethod{
	void method1() {
		System.out.println("Subclass - Method1");
	}
	
	void method2() {
		method1();
		super.method1();
	}
}
