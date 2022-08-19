package Example2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class InterfaceSerializeMain {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		InterfaceSerialize a = new InterfaceSerialize(10,"Shobana");
		
		//Serialization
		FileOutputStream fos = new FileOutputStream("xyz.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a);
		
		//Deserialization
		FileInputStream fis = new FileInputStream("xyz.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		InterfaceSerialize b = (InterfaceSerialize)ois.readObject();
		
		System.out.println(b.a + " " + b.b);
		oos.close();
		ois.close();
		
	}

}
