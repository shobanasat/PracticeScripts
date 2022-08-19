package Example3;

import java.util.EnumSet;
import java.util.Set;

enum colors {RED,BLUE,GREEN};

public class EnumSets {

	public static void main(String[] args) {
		Set<colors> set1;
		set1 = EnumSet.of(colors.RED,colors.BLUE);
		System.out.println(set1);
		
	}

}
