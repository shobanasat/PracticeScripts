package Example2;

public class ThisConstructor {
	
	int a;
	int b;
	
	ThisConstructor(){
		this(10,20);
		System.out.println("Constructor1");
		
	}
	
	ThisConstructor(int a,int b){
		int c = a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		ThisConstructor tc = new ThisConstructor();

	}

}
