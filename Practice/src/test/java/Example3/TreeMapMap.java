package Example3;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapMap {

	public static void main(String[] args) {
		Map<String,Integer> map = new TreeMap<>();
		
		map.put("Shobana", 500);
		map.put("Jishnu", 250);
		map.put("Isha", 249);
		map.put("Riyan", 400);
		
		for(Map.Entry<String, Integer> e : map.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}

	}

}
