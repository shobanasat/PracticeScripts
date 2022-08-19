package Exercises;

import java.util.Scanner;

public class MatrixTranspose2 {

	public static void main(String[] args) {
		
		System.out.println("This program is to transpose a matrix");
		System.out.println("Enter the no.of rows: ");
		Scanner sc1 = new Scanner(System.in);
		int row = sc1.nextInt();
		
		System.out.println("Enter the no.of columns: ");
		Scanner sc2 = new Scanner(System.in);
		int column = sc2.nextInt();
		
		int num = 1;
		int arr[][] = new int[row][column];
		int arr1[][] = new int[row][column];
		
		System.out.println("Original Array: ");
		for(int i = 0; i<row;i++) {
			for(int j = 0;j<column;j++) {
				arr[i][j] = num;
				num++;
				System.out.print(arr[i][j] + " ");
			}System.out.println();
		}
			
		System.out.println("Transposed Array: ");
		for(int i = 0; i<row;i++) {
			for(int j = 0;j<column;j++) {
				arr1[i][j] = arr[j][i];
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		
		sc1.close();
		sc2.close();
	}	

}
