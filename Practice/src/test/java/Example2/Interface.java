package Example2;

public interface Interface {
	
	final int a = 10;
	void method1();

}

class sub1 implements Interface{

	@Override
	public void method1() {
		System.out.println("Implement Class...Method1..");	
	}
	
}
