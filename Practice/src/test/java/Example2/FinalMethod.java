package Example2;

public class FinalMethod {
	
	final void method1() {
		System.out.println("Final Method");
	}

}

class SubfinalMethod extends FinalMethod{
	
/*	void method1() {
		
	}*/
	
	public void method2(){
		System.out.println("Method2 - Different method");
	}
}
