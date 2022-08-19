package Examples;

public class Method2 {

	public static void main(String[] args) {
		
		Method1 o = new Method1();
		o.m1();
		
		System.out.println("Print statement after returning from m1");
		
		Method1 o1 = new Method1();
		o1.get();
		System.out.println("No of objects: " + o1.i);

	}

}
