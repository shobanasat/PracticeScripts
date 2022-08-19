package Example2;

public class StaticClass {
	
	static int a = 10;
	int b = 20;
	
	static class StaticClasses {
		public void method1() {
			System.out.println(a);
		}
	}

	public static void main(String[] args) {

		StaticClasses sc = new StaticClasses();
		sc.method1();
	}

}
