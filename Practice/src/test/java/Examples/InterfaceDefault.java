package Examples;

public interface InterfaceDefault {
	default void method1() {
		System.out.println("Default Method1 in Interface1");
	}
}

interface Interfce2{
	default void method1() {
		System.out.println("Default Method1 in Interface2");
	}
}

class TestClass implements InterfaceDefault, Interfce2{

	@Override
	public void method1() {
		
		InterfaceDefault.super.method1();
		Interfce2.super.method1();
	}
	
}