package testingpackage;

import package1.Class1;
import package2.Class2;

public class TestMethod {

	public static void main(String[] args) {

		Class1 a = new Class1();
		Class2 b = new Class2();
		
		a.method1();
		System.out.println(a.a);
		b.method2();
		System.out.println(b.b);

	}

}
