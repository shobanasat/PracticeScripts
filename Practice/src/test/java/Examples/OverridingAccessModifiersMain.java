package Examples;


public class OverridingAccessModifiersMain {

	public static void main(String[] args) {

		OverridingAccessModifiers oa;
		oa = new OverridingAccessModifiers();
		oa.method2();
		oa = new child15();
		oa.method1();
		oa.method2();
	}

}
