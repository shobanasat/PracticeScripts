package Examples;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class AllInStrings {

	public static void main(String[] args) throws UnsupportedEncodingException {

		byte b_arr1[] = {71, 101, 101, 107, 115};
		String s1 = new String(b_arr1);
		String l1 = new String(b_arr1,1,3);
		System.out.println(s1 + " " + l1);

		byte b_arr2[] = {71, 101, 101, 107, 115};
		Charset c1 = Charset.defaultCharset();
		String s2 = new String(b_arr2,c1);
		String l2 = new String(b_arr2,1,3,c1);
		System.out.println(s2 + " " + l2);
		
		byte[] b_arr3 = {71, 101, 101, 107, 115};
		String s3 = new String(b_arr3,"US-ASCII");
		String l3 = new String(b_arr3,1,3,"US-ASCII");
		System.out.println(s3 + " " + l3);
	
		char chararr[] = {'G','e','e','k','s'};
		String s4 = new String(chararr);
		String l4 = new String(chararr,1,3);
		System.out.println(s4 + " " + l4);
		
		int intarr[] = {71, 101, 101, 107, 115};
		String s5 = new String(intarr,1,3);
		System.out.println(s5);
		
		StringBuffer s = new StringBuffer("Geeks");
		String s6 = new String(s);
		System.out.println(s6);
		
		StringBuilder sb = new StringBuilder("Geeks");
		String s7 = new String(sb);
		System.out.println(s7);
		
//String Methods
		
		System.out.println("String Methods...");
		String st1 = "GeeksforGeeks";
		System.out.println(st1.length());
		System.out.println(st1.charAt(3));
		System.out.println(st1.substring(3));
		System.out.println(st1.substring(2,5));
		
		String str1 = "Geeks";
		String str2 = "Feeks";
		String str3 = str1.concat(str2);
		System.out.println(str3);
		int str4 = str3.indexOf("ee");
		System.out.println(str4);
		String str6 = "Learn Share Learn";
		int str5 = str6.lastIndexOf("earn");
		System.out.println(str5);
		
		Boolean out1 = str1.equals("Geeks");
		System.out.println(out1);
		Boolean out2 = str1.equals("geeks");
		System.out.println(out2);
		
		Boolean out3 = str1.equalsIgnoreCase("Geeks");
		System.out.println(out3);
		Boolean out4 = str1.equalsIgnoreCase("geeks");
		System.out.println(out4);
		
		int out5 = str2.compareTo(str2);
		System.out.println(out5);
		
		String str7 = str1.toLowerCase();
		System.out.println(str7);
		
		String str8 = str1.toUpperCase();
		System.out.println(str8);
		
		String str9 = "Learn Share Learn ";
		System.out.println(str9.trim());
		
		String str10 = "nearn Share nearn";
		System.out.println(str10.replace("n", "L"));
		
	}

}
