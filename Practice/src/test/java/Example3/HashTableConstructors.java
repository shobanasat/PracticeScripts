package Example3;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTableConstructors {

	public static void main(String[] args) {
		Hashtable<Integer,String> ht1 = new Hashtable<Integer,String>();
		ht1.put(1, "Maths");
		ht1.put(2, "Physics");
		ht1.put(3, "Chemistry");
		ht1.put(4, "Biology");
		ht1.put(5, "English");
		
		Hashtable<Integer,String> ht2 = new Hashtable<>();
		ht2.put(1, "India");
		ht2.put(2, "Australia");
		ht2.put(3, "Singapore");
		
		System.out.println("The first hashtable: " + ht1);
		System.out.println("The second hashtable: " + ht2);
		
		Hashtable<Integer,String> ht3 = new Hashtable<Integer,String>(2);
		ht3.put(1, "Maths");
		ht3.put(2, "Physics");
		ht3.put(3, "Chemistry");
		ht3.put(4, "Biology");
		ht3.put(5, "English");
		
		Hashtable<Integer,String> ht4 = new Hashtable<>(2);
		ht4.put(1, "India");
		ht4.put(2, "Australia");
		ht4.put(3, "Singapore");
		
		System.out.println("The first hashtable: " + ht3);
		System.out.println("The second hashtable: " + ht4);
		
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(1, "C");
		
		map.remove(1);
		
		Hashtable<Integer,String> ht5 = new Hashtable<>(map);
		System.out.println("Collection Constructor: " + ht5);
		
		System.out.println("Size of last last hashtable: " + ht5.size());
		
		
		ht4.remove(3);
		
		System.out.println(ht5);
		System.out.println(ht4);
		
		for(Map.Entry<Integer, String> e: ht3.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}
	}

}
