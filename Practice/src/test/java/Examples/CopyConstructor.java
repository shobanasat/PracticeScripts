package Examples;

public class CopyConstructor {
	
	double a;
	double b;
	
	public CopyConstructor(double a,double b) {
		
		System.out.println("1st constructor invoked...");
		this.a = a;
		this.b = b;
	}
	
	CopyConstructor(CopyConstructor c){
		System.out.println("2nd constructor....");
		a = c.a;
		b = c.b;	
	}
	
	public static void main(String[] args) {

		CopyConstructor c1 = new CopyConstructor (10.1,11.2);
		
		CopyConstructor c2 = new CopyConstructor (c1);
	}

}
