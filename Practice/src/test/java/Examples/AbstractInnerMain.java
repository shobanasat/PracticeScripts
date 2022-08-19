package Examples;

public class AbstractInnerMain {

	public static void main(String[] args) {
		b outer = new b();
		b.c inner = outer.new c();
		
		inner.method1();

	}

}
