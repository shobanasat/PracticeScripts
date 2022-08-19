package Examples;

public class PolymorphOverride {
	
	void method1() {
		System.out.println("Superclass Method1");
	}

}

class subclass10 extends PolymorphOverride{
	void method1() {
		System.out.println("Subclass1 method1");
	}
}

class subclass11 extends PolymorphOverride{
	void method1() {
		System.out.println("Subclass2 method1");
	}
}