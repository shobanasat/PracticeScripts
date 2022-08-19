package Example3;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapOperations {

	public static void main(String[] args) {
		SortedMap<Integer,String> sm = new TreeMap<Integer,String>();
		
		sm.put(1, "Maths");
		sm.put(2, "Physics");
		sm.put(3, "Chemistry");
		sm.put(4, "English");
		sm.put(5, "Tamil");
		System.out.println("After addition: " + sm);
		
		sm.put(5, "Biology");
		sm.put(5, "Biology");
		System.out.println("After updates and duplicates: " + sm);
		
		sm.remove(5);
		System.out.println("After removal: " + sm);
		
		for(Map.Entry<Integer,String> mapElement : sm.entrySet()) {
			System.out.println("Key is: " + mapElement.getKey() + " , " + "Value is: " + mapElement.getValue());
		}
		
		
	}

}
