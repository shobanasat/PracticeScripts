package Example3;

import java.util.HashMap;
import java.util.Map;

public class MapHashMap {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("D", 100);
		map.put("C", new Integer(200));
		map.put("A", 300);
		map.put("B", new Integer(400));
		
		for(Map.Entry<String, Integer> e: map.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue() );
		}

	}

}
