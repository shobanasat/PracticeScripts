package Example3;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapSample {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> lhm = new LinkedHashMap<Integer,String>();
		
		lhm.put(1, "Mercury");
		lhm.put(2, "Venus");
		lhm.put(3, "Earth");
		lhm.put(4, "Mars");
		lhm.put(5, "Jupiter");
		System.out.println("After Addition: " + lhm);
		
		System.out.println("Get Operation: " + lhm.get(1));
		
		System.out.println("Contains key 3: " + lhm.containsKey(3));
		System.out.println("Contains value Mars: " + lhm.containsValue("Mars"));
		
		lhm.put(5, "Saturn");
		System.out.println("After update at 5th position: " + lhm);
		
		lhm.remove(5);
		System.out.println("After removal: " + lhm);
		
		for(Map.Entry<Integer, String> e: lhm.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}
		
		System.out.println("Is Empty check: " + lhm.isEmpty());
	}

}
