package Example3;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapMap {

	public static void main(String[] args) {
		Map<String,Integer> map = new LinkedHashMap<>();
		
		map.put("Shobana", 500);
		map.put("Jishnu", 250);
		map.put("Isha", 249);
		map.put("Riyan", 400);
		
		for(Map.Entry<String, Integer> e : map.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}

	}

}
