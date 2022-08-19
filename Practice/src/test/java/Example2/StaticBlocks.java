package Example2;

public class StaticBlocks {
	
	static int a = 10;
	static int b;
	
	static {
		System.out.println("Static block");
		b= a*4;
	}

	public static void main(String[] args) {

		System.out.println("Main block");
		System.out.println(a);
		System.out.println(b);
	}

}
