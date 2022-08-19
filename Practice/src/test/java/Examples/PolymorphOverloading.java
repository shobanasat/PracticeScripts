package Examples;

public class PolymorphOverloading {
	
	void method1(int a) {
		System.out.println("Method1 with one parameter: " + a);
	}
	
	void method1(int a,int b) {
		System.out.println("Method1 with 2 parameters: " + a + " " + b);
	}

	public static void main(String[] args) {
		
		PolymorphOverloading po = new PolymorphOverloading();
		po.method1(10);
		po.method1(10, 20);

	}

}
