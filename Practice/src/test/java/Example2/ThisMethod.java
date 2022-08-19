package Example2;

public class ThisMethod {
	
	void display() {
		System.out.println("Display Method");
	}
	
	void method1() {
		this.display();
		System.out.println("Method1");
	}

	public static void main(String[] args) {
		ThisMethod tm = new ThisMethod();
		tm.method1();

	}

}
