package Examples;

public class DefaultConstructor {
	
	int i;
	String s;
	
	DefaultConstructor(int i,String s){
		System.out.println("Default Constructor called...");
		this.i=1;
		this.s="Shobana";
	}

	public static void main(String[] args) {

		DefaultConstructor c = new DefaultConstructor(1,"Shobana");
		
		System.out.println(c.i);
		System.out.println(c.s);
		
	}

}
