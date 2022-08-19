package Examples;

public class ConstructorChaining2 {
	
	String name;

	ConstructorChaining2(){
		System.out.println("Constructor without parameters");
	}
	
	ConstructorChaining2(String name){
		this.name = name;
		System.out.println("Constructor with String parameter: " + name);
	}
}

class Derived extends ConstructorChaining2{
	
	Derived(){
		super();
		System.out.println("Subclass constructor without parameters");
	}
	
	Derived(String name){
		super(name);
		System.out.println("Subclass constructor with string parameter: " + name);
	}

}
