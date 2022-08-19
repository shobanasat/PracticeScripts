package Example2;

public class ThisObject {
	
	int a;
	int b;
	
	ThisObject(){
		a = 10;
		b = 20;
	}
	
	void display(ThisObject obj) {
		System.out.println(a + " " + b);
	}
	
	void get() {
		display(this);
	}

	public static void main(String[] args) {
		ThisObject to = new ThisObject();
		to.get();

	}

}
