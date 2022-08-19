package Example3;

import java.util.HashMap;
import java.util.Map;

public class HashMapOperations {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(1, "Maths");
		hm.put(2, "English");
		hm.put(3, "Tamil");
		hm.put(4, "Physics");
		hm.put(5, "Chemistry");
		hm.put(6, "Biology");
		System.out.println("After Addition: " + hm);
		
		hm.put(6, "Biology");
		System.out.println("After adding duplicates: " + hm);
		
		hm.put(7, "History");
		System.out.println("More additions: " + hm);
		
		hm.remove(7);
		System.out.println("After removal: " + hm);
		
		for(Map.Entry<Integer, String> e: hm.entrySet()) {
			System.out.println("The key is: " + e.getKey() + " , and the value is: " + e.getValue());
		}

	}

}
