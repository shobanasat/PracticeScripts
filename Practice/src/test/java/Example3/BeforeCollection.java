package Example3;

import java.util.*;

public class BeforeCollection {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		Vector<Integer> v = new Vector();
		Hashtable<Integer,String> h = new Hashtable();
		
		v.addElement(1);
		v.addElement(2);
		
		h.put(1,"Shobana");
		h.put(2, "Jishnu");
		
		System.out.println(arr[0]);
		System.out.println(v.elementAt(0));
		System.out.println(h.get(1));
		}

	}


