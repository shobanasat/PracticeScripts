package Example2;

public interface InterfaceDefault {
	
	default void method1() {
		System.out.println("Interface Default Method..");
	}

}

class sub2 implements InterfaceDefault{


}
