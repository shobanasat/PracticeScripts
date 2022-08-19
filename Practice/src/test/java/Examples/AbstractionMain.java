package Examples;

public class AbstractionMain {

	public static void main(String[] args) {

		Abstraction a1 = new Circle("Red",2.2);
		Abstraction a2 = new Rectangle("Black",4,2);
		
		System.out.println(a1.toString());
		System.out.println(a2.toString());
	}

}
