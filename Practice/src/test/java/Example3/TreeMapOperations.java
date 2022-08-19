package Example3;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapOperations {
	
	static TreeMap<Integer,String> tm;
	
	static void create() {
		tm = new TreeMap<Integer,String>();
	}
	
	static void insert() {
		tm.put(1, "Insert1");
		tm.put(2, "Insert2");
		tm.put(3, "Insert3");
		System.out.println("Insert Operation: " + tm);
	}
	
	static void search(int num) {
		System.out.println("Contains key: " + tm.containsKey(num));
	}
	
	static void search(String val) {
		System.out.println("Contains value: " + tm.containsValue(val));
		
	}
	
	static void display() {
		System.out.println("TreeMap: " + tm);
	}
	
	static void remove() {
		tm.remove(2);
		System.out.println("After removal: " + tm);
	}
	
	static void update() {
		tm.put(1, "Insert5");
		System.out.println("After update: " + tm);
	}
	
	static void iterate() {
		for(Map.Entry<Integer,String> me : tm.entrySet()) {
			System.out.println("Key: " + me.getKey() + " , " + "Value: " + me.getValue());
		}
		
	}

	public static void main(String[] args) {
		System.out.println("This Program is to learn TreeMap and its operations");
		create();
		insert();
		search(4);
		search("Insert2");
		display();
		remove();
		update();
		iterate();

	}

}
