package Example2;

public class FinalDeclaration {
	
	final int a = 10;
	final int b;
	final int c;
	static final int d = 20;
	static final int e;
	
	{
		b = 30;
	}
	
	static {
		e = 40;
	}
	
	FinalDeclaration(){
		c=50;
	}
	
	FinalDeclaration(String f){
		this.c = 60;
		System.out.println(f);
	}

}
