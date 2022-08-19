package Examples;

public class ConstructorChaining {
	
	ConstructorChaining(){
		
		this(10,20);
		System.out.println("Constructor without parameters");
	}
	
	ConstructorChaining(int x,int y){
		
		this(10.1);
		System.out.println("Constructor with 2 parameters: " + (x+y));
	}	
	
	ConstructorChaining(double z){
		
		System.out.println("Constructor with 1 parameter: " + z);
	}	

	public static void main(String[] args) {

		ConstructorChaining c = new ConstructorChaining();
	}

}
