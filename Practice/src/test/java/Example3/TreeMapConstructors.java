package Example3;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class TreeMapConstructors {
	
	static void EmptyConstructor() {
		TreeMap<Integer,String> ec = new TreeMap<Integer,String>();
		ec.put(1, "Maths");
		ec.put(2, "Physics");
		ec.put(3, "Chemistry");
		ec.put(4,"Biology");
		
		System.out.println("TreeMap constructor values: " + ec);
	}
	
	static void MapConstructor() {
		Map<Integer,String> mc = new HashMap<Integer,String>();
		mc.put(1, "Map1");
		mc.put(2, "Map2");
		mc.put(3, "Map3");
		
		TreeMap<Integer,String> tm1 = new TreeMap<Integer,String>(mc);
		System.out.println("Map constructor values: " + tm1);
	}
	
	static void SortedMapConstructor() {
		SortedMap<Integer,String> sm = new ConcurrentSkipListMap<Integer,String>();
		sm.put(1, "SortedMap1");
		sm.put(2, "SortedMap2");
		sm.put(3, "SortedMap3");
		
		TreeMap<Integer,String> tm2 = new TreeMap<Integer,String>(sm);
		System.out.println("SortedMap Constructor: " + tm2);
	}

	public static void main(String[] args) {
		System.out.println("TreeMap Constructor...");
		
		EmptyConstructor();
		MapConstructor();
		SortedMapConstructor();
	}

}
