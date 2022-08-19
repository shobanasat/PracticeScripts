package Examples;

public class WrapperClass {

	public static void main(String[] args) {

		byte a = 1;
		Byte byteobj = new Byte(a);
		
		int b = 100;
		Integer intobj = new Integer(b);
		
		float c = 100.1f;
		Float floatobj = new Float(c);
		Integer i = floatobj.intValue();
		System.out.println(i);
		
		double d = 100.1;
		Double doubleobj = new Double(d);
		
		char e = 'e';
		Character charobj = new Character(e);
		
		System.out.println(byteobj.TYPE);
		System.out.println(intobj.TYPE);
		System.out.println(floatobj.TYPE);
		System.out.println(doubleobj.TYPE);
		System.out.println(charobj.TYPE);
		
		byte a1 = byteobj;
		int b1 = intobj;
		float c1 = floatobj;
		double d1 = doubleobj;
		char e1 = charobj;

		System.out.println(a1);
		System.out.println(b1);
		System.out.println(c1);
		System.out.println(d1);
		System.out.println(e1);
		
		Integer j = Integer.valueOf("101",2);
		System.out.println(j);
		
	}

}
