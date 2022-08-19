package Exercises;

import java.sql.Array;
import java.util.Scanner;

public class MatrixTranspose {

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
		int arr2[][] = new int[row][column];
		int arr3[][] = new int[row][column];
		
		//Forming Array
		System.out.println("Original Array: ");
		for(int i = 0; i<row;i++) {
			for(int j = 0;j<column;j++) {
				arr[i][j] = num;
				num++;
				System.out.print(arr[i][j] + " ");
			}System.out.println();
		}
		
		//Transferring original array to another array
		for(int i = 0; i<row;i++) {
			for(int j = 0;j<column;j++) {
				arr1[i][j] = arr[i][j];
//				System.out.print(arr1[i][j] + " ");
				}	
			}//	System.out.println();
		
		
		//Changing the 1st column
		for(int i = 0; i<row;i++) {
			for(int j = 0;j<column;j++) {
				if (j == 0) {
				arr1[i][j] = arr1[j][i];
				}
//				System.out.print(arr1[i][j] + " ");
			}
//			System.out.println();
		}
		
		//Transferring original array to another array
		for(int i = 0; i<row;i++) {
			for(int j = 0;j<column;j++) {
				arr2[i][j] = arr[i][j];
//				System.out.print(arr2[i][j] + " ");
				}	
			}//	System.out.println();
		
		//Changing 2nd column
		for(int i = 0; i<row;i++) {
			for(int j = 0;j<column;j++) {
				if (j == 1) {
				arr2[i][j] = arr2[j][i];
				}
//				System.out.print(arr2[i][j] + " ");
			}
//			System.out.println();
		}
		
		//Transferring original array to another array
		for(int i = 0; i<row;i++) {
			for(int j = 0;j<column;j++) {
				arr3[i][j] = arr[i][j];
//				System.out.print(arr3[i][j] + " ");
				}	
			}//	System.out.println();
		
		//Changing 3rd column
		for(int i = 0; i<row;i++) {
			for(int j = 0;j<column;j++) {
				if (j == column-1) {
				arr3[i][j] = arr3[j][i];
				}
//				System.out.print(arr3[i][j] + " ");
			}
//			System.out.println();
		}
		
		System.out.println("Transposed Array: ");
		for(int i = 0; i<row;i++) {
			for(int j = 0;j<column;j++) {
				if ( j == 0) {
					arr[i][j] = arr1[i][j];}
				if (j == 1) {
					arr[i][j] = arr2[i][j];}
				if (j == column - 1) {
					arr[i][j] = arr3[i][j];}
				
				System.out.print(arr[i][j] + " ");	
				}System.out.println();	
				
				}
			}	

	

}
