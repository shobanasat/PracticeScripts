package Example3;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapOperations {

	public static void main(String[] args) {
		Map<Integer,String> map1 = new HashMap<>();
		
		map1.put(1, "Diamond");
		map1.put(2, "Gold");
		map1.put(3, "Silver");
		map1.put(4, "Bronze");
		System.out.println("Map after addition: ");
		
		for (Map.Entry<Integer, String> e : map1.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}
		
		map1.put(2, "Ruby");
		System.out.println("After update: " + map1);
		
		map1.remove(3);
		System.out.println("Map after removal: " + map1);

	}

}
