package Example2;

public class ThisCallConstructor {
	
	ThisCallConstructor obj;
	
	ThisCallConstructor(B obj){
		System.out.println("Class 1 constructor with object parameter");
		obj.display();
	}

}

class B{
	
	int x = 5;
	B(){
		ThisCallConstructor tcc = new ThisCallConstructor(this);
	}
	
	void display() {
		System.out.println("Class 2 Method and variable - " + x);
	}

}
