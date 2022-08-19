package Example2;

public class SuperConstructor {
	
	SuperConstructor(){
		System.out.println("Super Class - Constructor");
	}
}

class SubclassConstructor extends SuperConstructor{
	SubclassConstructor(){
//		super();
		System.out.println("Subclass - Constructor");
	}
}