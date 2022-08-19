package Example2;

public class ThisInstance {
	
	int a;
	int b;
	
	ThisInstance(){
		a = 10;
		b = 30;
	}
	
	ThisInstance get() {
		return this;
	}
	
	void display() {
		System.out.println(a + " " + b);
	}

	public static void main(String[] args) {
		ThisInstance ti = new ThisInstance();
		ti.get().display();

	}

}
