package Example3;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapInterface {

	public static void main(String[] args) {
		SortedMap<Integer,String> sm = new TreeMap<Integer,String>();
		
		sm.put(1, "Maths");
		sm.put(2, "Physics");
		sm.put(3, "Chemistry");
		sm.put(4, "Biology");
		sm.put(5, "English");
		System.out.println("After addition: " + sm);
		Set s = sm.entrySet();
		
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			Map.Entry m = (Map.Entry)itr.next();
			int key = (int) m.getKey();
			String value = (String) m.getValue();
			System.out.println("Key: " + key + " , " + "Value: " + value);
		}
	}

}
