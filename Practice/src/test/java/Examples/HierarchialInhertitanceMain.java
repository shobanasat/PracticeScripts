package Examples;

public class HierarchialInhertitanceMain {

	public static void main(String[] args) {

		sub3 s1 = new sub3();
		s1.method1();
		s1.method4();
		
		sub2 s2 = new sub2();
		s2.method1();
		s2.method3();
		
		sub1 s3 = new sub1();
		s3.method1();
		s3.method2();
		
		HierarchialInhertitance s4 = new HierarchialInhertitance();
		s4.method1();
	}

}
