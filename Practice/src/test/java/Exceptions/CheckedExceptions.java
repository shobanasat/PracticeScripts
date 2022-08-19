package Exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptions {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:\\Shobana");
		BufferedReader fileInput = new BufferedReader(fr);
		
		for(int counter = 0; counter < 5; counter++) {
			System.out.println(fileInput.readLine());
		}
		
		fileInput.close();
	}

}
