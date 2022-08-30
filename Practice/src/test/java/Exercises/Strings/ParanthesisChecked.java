package Exercises.Strings;

import java.util.Scanner;

public class ParanthesisChecked {
	
	//Balance in count - Handled
	//Order of closing - Handled
	//Interruption in order of closing (Ex: {[[(())]](())}

	public static void main(String[] args) {
		System.out.println("This Program is to check if there are equal number of paranthesis");
		System.out.println("*****************************************************************");
		System.out.println();
		
		System.out.println("Enter the expression with paranthesis: ");
		Scanner sc1 = new Scanner(System.in);
		String str = sc1.next();
		
		int openBracket = 0;
		int closedBracket = 0;
		int openSquareBracket = 0;
		int closedSquareBracket = 0;
		int openFlowerBracket = 0;
		int closedFlowerBracket = 0;
		int cnt = 0;
		
		
		for(int i = 0;i<str.length();i++) {
			if(str.charAt(i) == '(') {
				openBracket++;
			}
			else if(str.charAt(i) == ')') {
				closedBracket++;
			}
			else if(str.charAt(i) == '[') {
				openSquareBracket++;
			}
			else if(str.charAt(i) == ']') {
				closedSquareBracket++;
			}
			else if(str.charAt(i) == '{') {
				openFlowerBracket++;
			}
			else if(str.charAt(i) == '}') {
				closedFlowerBracket++;
			}
			
			if(closedBracket > openBracket || closedSquareBracket > openSquareBracket || closedFlowerBracket > openFlowerBracket) {
				cnt = cnt + 1;
			}
		}
		
		int orderCnt = 0;
		for (int i = 0;i<str.length();i++) {
			if(str.charAt(i) == ')' && str.charAt(str.length() - i-1) == '(') {
				orderCnt = orderCnt + 1;
			}
			else if(str.charAt(i) == ']' && str.charAt(str.length() - i-1) == '[') {
				orderCnt = orderCnt + 1;
			}
			else if(str.charAt(i) == '}' && str.charAt(str.length() - i-1) == '{') {
				orderCnt = orderCnt + 1;
			}
		}
		System.out.println(orderCnt);
		
		if(openBracket == closedBracket && openSquareBracket == closedSquareBracket && openFlowerBracket == closedFlowerBracket && cnt == 0 && orderCnt == str.length()/2) {
			System.out.println("Parathesis balances and is in order");
		}
		else {
			System.out.println("Paranthesis does not balance or not in order");
		}
		sc1.close();
	}
}
