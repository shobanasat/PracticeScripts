package Example3;

import java.util.*;

public class VectorClass {

	public static void main(String[] args) {
		Vector v1 = new Vector();
		
		v1.add(1);
		v1.add(1,2);
		v1.add("Shobana");
		v1.add(3,"Jishnu");
		System.out.println(v1);
		
		System.out.println("Updated Vector: " + v1.set(1, 3));
		System.out.println(v1);
		
		v1.remove(1);
		v1.remove("Shobana");
		System.out.println(v1);
		
		for(int i = 0; i< v1.size();i++) {
			System.out.print(v1.get(i) + " ");
		}
		
	}

}
