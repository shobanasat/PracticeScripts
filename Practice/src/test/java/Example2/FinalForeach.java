package Example2;

public class FinalForeach {

	public static void main(String[] args) {
		int arr[] = {1,2,3};
		
		for(final int i: arr) {
			System.out.print(i + " ");
		}

	}

}
