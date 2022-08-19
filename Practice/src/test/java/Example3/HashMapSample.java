package Example3;

import java.util.HashMap;

public class HashMapSample {

	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<>();
		
		map.put("Diamond", 1);
		map.put("Gold", 2);
		map.put("Silver", 3);
		map.put("Ruby", 4);
		System.out.println("Size of the map is: " + map.size());
		
		System.out.println(map);
		
		if(map.containsKey("Ruby")) {
			int n = map.get("Ruby");
			System.out.println("Value of key " + "\" Vishal \" is: " + n);
		}

	}

}
