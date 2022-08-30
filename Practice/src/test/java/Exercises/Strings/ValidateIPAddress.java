package Exercises.Strings;

import java.util.LinkedList;
import java.util.Scanner;

public class ValidateIPAddress {

	public static void main(String[] args) {
		System.out.println("This program is to validate IP Address");
		System.out.println("**************************************");
		System.out.println();
		
		System.out.println("Enter the IP Address: ");
		Scanner sc1 = new Scanner(System.in);
		String ipAddr = sc1.next();
		
		int cntDecimal = 0;
		LinkedList<Integer> list = new LinkedList<>();
		for(int i = 0;i<ipAddr.length();i++) {
			if(ipAddr.charAt(i) == '.') {
				list.add(i);
			}
		}
		
		int num = 0;
		int num1 = list.getFirst();
		int num2 = list.get(1);
		int num3 = list.get(2);
		int num4 = ipAddr.length();
		int valid = 0;
		int invalid = 0;
		
		int firstNumber = 0;
		int secondNumber = 0;
		int thirdNumber = 0;
		int fourthNumber = 0;
		
		if(list.size() == 3) {
			firstNumber = Integer.valueOf(ipAddr.substring(num, num1));
			secondNumber = Integer.valueOf(ipAddr.substring(num1 + 1, num2));
			thirdNumber = Integer.valueOf(ipAddr.substring(num2 + 1, num3));
			fourthNumber = Integer.valueOf(ipAddr.substring(num3 + 1, num4));
			if(firstNumber >= 0 && firstNumber <= 255 && secondNumber >= 0 && secondNumber <=255 && thirdNumber >= 0 && thirdNumber <=255 && fourthNumber >= 0 && fourthNumber <=255) {
				valid = valid + 1;
			}
			else {
				invalid = invalid + 1;
			}
		}
		else if (list.size() != 3) {
			invalid = invalid + 1;
		}
		
		if (valid > 0 && invalid == 0) {
			System.out.println("This is a valid IP Address");
		}
		else {
			System.out.println("This is a invalid IP Address");
		}

	}

}
