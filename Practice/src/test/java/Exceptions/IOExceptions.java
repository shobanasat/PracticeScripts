package Exceptions;

import java.util.Scanner;

public class IOExceptions {

	public static void main(String[] args) {
		Scanner scan = new Scanner("Hello Geeks");
		System.out.println(scan.nextLine());
		System.out.println(scan.ioException());
		scan.close();
	}

}
