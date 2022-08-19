package Example2;

public class SuperVariables {
	int a = 10;
}

class SubSuper extends SuperVariables{
	int a = 20;
	
	void display() {
		System.out.println(super.a);
	}
}