package Examples;

public class Overloadingmain {

	public static void main(String[] args) {
		
		System.out.println("Main with default arg");
		Overloadingmain.main("Shobana");

	}
	
	public static void main(String arg1) {
		
		System.out.println("Main with 1 string arg");
		Overloadingmain.main("Shobana", "Sathyanathan");

	}
	
	public static void main(String arg1,String arg2) {
		
		System.out.println("Main with 2 string args");

	}

}
