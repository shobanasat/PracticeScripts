package Example2;

public class StaticVariables {
	
	static int a = m1();
	
	static {
		System.out.println("Static block");
	}
	
	static int m1() {
		System.out.println("Static Method");
		return 10;
	}
	public static void main(String[] args) {
		
		System.out.println(a);
		System.out.println("Main block");

	}

}
