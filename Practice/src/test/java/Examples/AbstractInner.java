package Examples;

public abstract class AbstractInner {
	
	abstract class a {
		abstract void method1();
	}

}

class b extends AbstractInner{
	class c extends a{
		void method1() {
			System.out.println("Derived class - Method1...");
		}
	}
}