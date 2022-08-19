package Example3;
import java.util.*;

public class ArrayLists {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i=1;i<=5;i++)
		al.add(i);
		
		System.out.println(al);
		
		al.remove(3);
		
		System.out.println(al);
		
		for(int j = 0; j < al.size();j++) 
			System.out.print(al.get(j) + " ");
		
		}

}
