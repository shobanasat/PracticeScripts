package Example2;

public class ThisVariable {
	
	int a;
	int b;
	
	ThisVariable(int a,int b){
		int c = a + b;
		System.out.println(c);
	}
	
	void display() {
		System.out.println("Method display");
	}

	public static void main(String[] args) {
		ThisVariable tv = new ThisVariable(10,20);
		tv.display();

	}

}
