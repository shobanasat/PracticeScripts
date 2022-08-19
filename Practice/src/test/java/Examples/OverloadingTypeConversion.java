package Examples;

public class OverloadingTypeConversion {
	
	public int method1(int a) {
		System.out.println("Integer: " + a);
		return (10);
	}
	
	public String method1(String s) {
		System.out.println("String: " + s);
		return ("Shobana");
	}
	
	public byte method1(byte b) {
		System.out.println("Byte: " + b);
		return(25);
	}

	public static void main(String[] args) {
		
		OverloadingTypeConversion ot = new OverloadingTypeConversion();
		ot.method1(10);
		ot.method1("Shobana");
		ot.method1(0);
	}

}
