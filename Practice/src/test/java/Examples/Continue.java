package Examples;

public class Continue {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			
			//System.out.println("Statement before continue");
			
			if (i == 3) {
				continue;
			}
			
			System.out.println(i);
		}

	}

}
