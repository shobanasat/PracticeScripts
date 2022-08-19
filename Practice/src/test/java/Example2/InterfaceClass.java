package Example2;

public class InterfaceClass {
	
	static interface I1{
		void Method1();
	}

}

class sub11 implements InterfaceClass.I1{

	@Override
	public void Method1() {
		System.out.println("Implemented Class Method1");
		
	}
	
}
