package Examples;

public class Inheritance {
	
	int x,y;
	
	Inheritance(){
		this(10,20);
		System.out.println("Constructor without parameters...");
	}
	
	Inheritance(int x,int y){
		int sum = x + y;
		System.out.println("Contructor with parameters, addition of params: " + sum);
	}
	
	public void method1() {
		System.out.println("Method1 of Super class");
	}
}

class subclass extends Inheritance{
	int z;
	
	subclass(){
		super();
		System.out.println("Constructor of subclass. Constructor without parameters");
	}
	
	subclass(int z){
		super(10,20);
		System.out.println("The other parameter in the subclass with parameter is: " + z);
	}
	
	public void method2() {
		super.method1();
		System.out.println("This is subclass method2..");
	}
}


