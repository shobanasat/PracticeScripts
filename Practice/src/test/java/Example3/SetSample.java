package Example3;

import java.util.HashSet;
import java.util.Set;

public class SetSample {

	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
		set1.add("Diamonds");
		set1.add("Gold");
		set1.add("Silver");
		set1.add("Ruby");
		
		System.out.println(set1);
		
		String check = "Silver";
		
		System.out.println("Checking set1 contains check value: " + set1.contains(check));

	}

}
