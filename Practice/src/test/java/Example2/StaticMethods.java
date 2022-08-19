package Example2;

public class StaticMethods {
	
	int a = 10;
	
	public int m1() {
		return 20;
	}
	
	static int b = 30;
	
	static void m2() {
		int c = b + 10;
		System.out.println(c);
	}

	public static void main(String[] args) {
		System.out.println(b);

	}

}
