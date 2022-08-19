package Examples;

public class AllInStringBuffer {

	public static void main(String[] args) {

		StringBuffer s = new StringBuffer("GeekforGeek");
		int l1 = s.length();
		System.out.println(l1);
		
		s=s.append("test");
		System.out.println(s);
		
		int c1 = s.capacity();
		System.out.println(c1);
		
		char chr1 = s.charAt(3);
		System.out.println(chr1);
		
		s=s.delete(1, 3);
		System.out.println(s);
		
		s=s.deleteCharAt(3);
		System.out.println(s);
		int c2 = s.capacity();
		System.out.println(c2);
		
		s.ensureCapacity(30);
		int c3 = s.capacity();
		System.out.println(c3);
		
		s=s.insert(3,"o");
		System.out.println(s);
		
		s=s.reverse();
		System.out.println(s);
		
		s=s.replace(1, 3, "abc");
		System.out.println(s);
		
		s=s.appendCodePoint(65);
		System.out.println(s);
		
		int n1 = s.codePointBefore(2);
		System.out.println(n1);
		
		int n2 = s.codePointCount(1, 3);
		System.out.println(n2);
	}

}
