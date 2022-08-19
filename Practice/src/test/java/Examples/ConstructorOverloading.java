package Examples;

public class ConstructorOverloading {
	
	ConstructorOverloading(int i){
		
		System.out.println("1st constructor: " + i);
	}
	
	ConstructorOverloading(double i){
		
		System.out.println("2nd constructor: " + i);
	}
	
	ConstructorOverloading(String s){
		
		System.out.println("3rd constructor: " + s);
	}

	public static void main(String[] args) {

		ConstructorOverloading a1 = new ConstructorOverloading(10);
		ConstructorOverloading a2 = new ConstructorOverloading(10.1);
		ConstructorOverloading a3 = new ConstructorOverloading("Shobana");	

	}

}
