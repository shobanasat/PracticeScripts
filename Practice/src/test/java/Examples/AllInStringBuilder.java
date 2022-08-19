package Examples;

public class AllInStringBuilder {

	public static void main(String[] args) {

		StringBuilder str = new StringBuilder("GeekforGeeks");
		String str1 = str.toString();
		String str2 = "or";
		System.out.println(str);
		System.out.println(str1);
		
		str=str.append("test");
		System.out.println(str);
		str=str.appendCodePoint(65);
		System.out.println(str);
		
		int c1 = str.capacity();
		System.out.println(c1);
		
		char chr = str.charAt(0);
		System.out.println(chr);
		
		int c2 = str.codePointAt(8);
		System.out.println(c2);
		
		int c3 = str.codePointBefore(2);
		System.out.println(c3);
		
		str = str.delete(4, 5);
		System.out.println(str);
		
		int i1 = str.indexOf(str2);
		System.out.println(i1);
		
		int l2 = str.length();
		System.out.println(l2);
		
		str=str.reverse();
		System.out.println(str);
		
		String str7=str.substring(2,10);
		System.out.println(str7);
		
		System.out.println(str.capacity());
		
		str.trimToSize();
		System.out.println(str);
		
		int c10 = str.capacity();
		System.out.println(c10);
		
	}

}
