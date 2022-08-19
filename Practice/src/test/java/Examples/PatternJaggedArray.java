package Examples;

import java.util.Scanner;

public class PatternJaggedArray {

	public static void main(String[] args) {

		System.out.println("Enter the number of rows in the array: ");
		Scanner sc1 = new Scanner(System.in);
		int row = sc1.nextInt();
		
		int[][] arr = new int[row][];
		
		for(int i=0;i<row;i++) {	
			arr[i] = new int[i+1];
		}
		
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				arr[i][j] = count;
				count++;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
