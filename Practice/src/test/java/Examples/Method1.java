package Examples;

public class Method1 {
	
	public static int i=0;
	
	Method1(){
		
		i++;
	}
	
	public static int get() {
		return i;
	}
	
	public int m1() {
		
		System.out.println("Inside method M1");
		this.m2();
		
		return 1;
	}
	
	public void m2() {
		
		System.out.println("This is M2, called from M1");
	}

}
