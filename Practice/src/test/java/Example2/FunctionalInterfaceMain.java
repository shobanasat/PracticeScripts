package Example2;

class FunctionalInterfaceMain {

	public static void main(String[] args) {

		int b = 5;
		FuntionalInterfce s = (int a) -> a * a;
		
		System.out.println(s.calculate(b));

	}

}
