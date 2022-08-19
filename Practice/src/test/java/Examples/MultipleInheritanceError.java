package Examples;

public class MultipleInheritanceError {
	public void method1() {
		System.out.println("Method1");
	}
}

class class2{
	public void method2() {
		System.out.println("Method2");
	}
}

//On giving 2 parents, compilation error occurs
class MultipleInheritanceErrorMain extends MultipleInheritanceError {
	
}