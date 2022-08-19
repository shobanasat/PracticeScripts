package Exercises;

import java.util.Scanner;

public class SquareMatrix90 {

	public static void main(String[] args) {
		System.out.println("This Program is to rotate square matrix by 90degree");
		
		System.out.println("Enter no.of rows: ");
		Scanner sc1 = new Scanner(System.in);
		int row = sc1.nextInt();
		
		System.out.println("Enter no.of columns: ");
		Scanner sc2 = new Scanner(System.in);
		int column = sc2.nextInt();
		
		int num = 1;
		int arr[][] = new int[row][column];
		
		if(row == column){
			System.out.println();
			System.out.println("You have provided valid inputs for square matrix");
			System.out.println();
			
			System.out.println("The sequential square matrix is:");
			System.out.println("--------------------------------");
			
			for(int i=0;i<row;i++) {
				for(int j=0;j<column;j++) {
					arr[i][j] = num;
					num = num + 1;
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
			
//			System.out.println("Corner number changed: ");
			for(int i=0;i<row;i++) {
				for(int j=0;j<column;j++) {
					if(i == row - 1 && j == 0) {
						arr[i][j] = arr[j][row - row];
					}
//					System.out.print(arr[i][j] + " ");
				}
//				System.out.println();
			}
			
//			System.out.println("Changing rest of the rows in 1st column: ");
			for(int i=0;i<row;i++) {
				for(int j=0;j<column;j++) {
					if(i < row - 1 && j == 0) {
						arr[i][j] = arr[row - 1][0] + ((row - 1) - i);
					}
//					System.out.print(arr[i][j] + " ");
				}
//				System.out.println();
			}
			
			System.out.println("After 90degree rotation: ");
			for(int i=0;i<row;i++) {
				for(int j=0;j<column;j++) {
					if(i <= row - 1 && j > 0) {
						arr[i][j] = arr[i][j - 1] + (column);
					}
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
		}
		else {
			System.out.println("Please provide proper inputs. This is not a square matrix");
		}

	}

}
