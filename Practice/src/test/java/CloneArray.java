
public class CloneArray {

	public static void main(String[] args) {

		int arr[] = {1,2,3};
		
		int cloneArray[] = arr.clone();
		
		System.out.println(cloneArray == arr);
		
//		for (int i = 0;i<=arr.length-1;i++) {
			//System.out.println("Clone index " + i + " has value: " + cloneArray[i]);
			System.out.println(cloneArray[0] == arr[0]);
			System.out.println(cloneArray[1] == arr[1]);
			System.out.println(cloneArray[2] == arr[2]);
//		}
		
		int multiArr[][] = {{1,2,3},{4,5,6}};
		
		int cloneArray2[][] = multiArr.clone();
		
		System.out.println(cloneArray2 == multiArr);
		
	}

}
