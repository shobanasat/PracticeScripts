package Exceptions;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class NoSuchMethodExcep {

	public static void main(String[] args) {
		Set exampleSet = new HashSet();
		Hashtable exampleTable = new Hashtable();
		exampleSet.iterator().next();
		exampleTable.elements().nextElement();

	}

}
