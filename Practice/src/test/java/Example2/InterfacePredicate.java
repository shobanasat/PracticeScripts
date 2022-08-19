package Example2;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.*;

public class InterfacePredicate {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Geek","GeeksQuiz","g1","QA","Geek2");
		Predicate<String> p = (s) -> s.startsWith("G");
		
		for(String st: names) {
			if(p.test(st)) {
				System.out.println(st);
			}
		}

	}

}
