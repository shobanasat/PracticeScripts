package Example3;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMaps {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "Shobana");
		hm.put(2, "Jishnu");
		hm.put(3, "Isha");
		hm.put(4, "Riyan");
		
//		System.out.println(hm.get(2));
		
		for(Map.Entry<Integer, String> e: hm.entrySet())
			System.out.println(e.getKey() + ":" + e.getValue());

	}

}
