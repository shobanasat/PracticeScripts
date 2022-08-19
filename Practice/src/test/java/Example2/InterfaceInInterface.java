package Example2;

public interface InterfaceInInterface {	
	interface I2{
	void method1();}
}

class sub12 implements InterfaceInInterface.I2{

	@Override
	public void method1() {
		System.out.println("Implemented Class Method1");
		
	}
	
}