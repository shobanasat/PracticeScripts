package Example3;

import java.util.Vector;

public class Vectors {

	public static void main(String[] args) {
		Vector<Integer> ve = new Vector<Integer>();
		
		for (int i = 1;i<=5;i++)
			ve.add(i);
		
		System.out.println(ve);
		
		ve.remove(3);
		
		System.out.println(ve);
		
		for(int i=0;i<ve.size();i++)
			System.out.print(ve.get(i) + " ");

	}

}
