package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FilenotFoundExceptions {

	public static void main(String[] args) {
		try {
			File file = new File("E:\\SomeFile");
			FileReader fr = new FileReader(file);
		}
		catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
	}

		
	}
}
