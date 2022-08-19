package Examples;

public abstract class AbstractO2 {
	
	AbstractO2(){
		System.out.println("Abstract Class Constructor");
	}
	
	abstract void fun();
}

class sub5 extends AbstractO2{
	
	sub5(){
		System.out.println("Derived Class - Sub5 class constructor");
	}

	@Override
	void fun() {

		System.out.println("Derived class method");
		
	}
	
}