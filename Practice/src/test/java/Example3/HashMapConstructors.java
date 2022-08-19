package Example3;

import java.util.HashMap;
import java.util.Map;

public class HashMapConstructors {

	public static void main(String[] args) {
		HashMap<Integer,String> hm1 = new HashMap<Integer,String>();
		HashMap<String,Integer> hm2 = new HashMap<String,Integer>(2);
		HashMap<String,Integer> hm3 = new HashMap<String,Integer>(4,0.75f);
		
		hm1.put(1, "Sample1");
		hm1.put(2, "Sample2");
		hm1.put(3, "Sample3");
		
		hm2.put("Sample1", 1);
		hm2.put("Sample2", 2);
		hm2.put("Sample3", 3);
		
		hm3.put("Sample1", 1);
		hm3.put("Sample2", 2);
		hm3.put("Sample3", 3);
		hm3.put("Sample4", 4);
		
		System.out.println("First Constructor: " + hm1);
		System.out.println("Second Constructor: " + hm2);
		System.out.println("Third Constructor: " + hm3);
		
		Map<String,Integer> hm4 = new HashMap<String,Integer>();
		hm4.put("Sample1", 1);
		hm4.put("Sample2", 2);
		hm4.put("Sample3", 3);
		hm4.put("Sample4", 4);
		
		HashMap<String,Integer> hm5 = new HashMap<String,Integer>(hm4);
		
		System.out.println("Fourth Constructor: " + hm4);
		System.out.println("Fifth Constructor: " + hm5);
	}

}
