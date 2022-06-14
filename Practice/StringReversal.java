package Examples;

import java.util.Scanner;

public class StringReversal {

	public static void main(String[] args) {

		System.out.println("String Reversal");
		System.out.println("Enter the string: ");
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		String revStr = "";
		
		for (int i=str.length()-1;i>=0;i--) {
			
	//		System.out.println(str.charAt(i));
			revStr = revStr + str.charAt(i);
			
		}
		System.out.println("The reversal of str is: " + revStr);
		
	}

}
