package Exercises;
import java.util.Scanner;

public class MatrixRotation {

	public static void main(String[] args) {
		
		System.out.println("This Program is to rotate two dimensional Matrix");
		System.out.println("Enter the no of columns: ");
		Scanner sc1 = new Scanner(System.in);
		int column = sc1.nextInt();
		
		System.out.println("Enter the no of rows: ");
		Scanner sc2 = new Scanner(System.in);
		int row = sc2.nextInt();
		
		System.out.println("It is a " + row + " * " + column + " Matrix" );
		
		int num = 1;
		int arr[][] = new int[row][column];
		
		for (int i = 0;i< row;i++) {
			for(int j = 0;j<column;j++) {
				arr[i][j] = num;
				num = num + 1;
		}	
	}

		for (int i = 0;i< row;i++) {
			for(int j = 0;j<column;j++) {
				System.out.print(arr[i][j] + " ");
		}	
			System.out.println();
	}
		int diff = arr[row-1][column-1] - arr[row - 2][column - 1];

//Top Rotation		
		for (int i = 0;i< row;i++) {
			for(int j =column-1;j>=0;j--) {
				
				if(i == 0 && j!=0) {
				arr[i][j] = arr[i][j] - 1;
				}
		}	

	}
//		System.out.println("After Top Row Rotation");
		for (int i = 0;i< row;i++) {
			for(int j = 0;j<column;j++) {
//				System.out.print(arr[i][j] + " ");
		}	
//			System.out.println();
	}
		
//Right Side Rotation		
		for (int i = 0;i< row;i++) {
			for(int j =column-1;j>=0;j--) {
				
				if(i != 0 && j==column-1) {
				arr[i][j] = arr[i][j] - diff;
				}

		}	}
//			System.out.println("After right side Row Rotation");
			for (int i = 0;i< row;i++) {
				for(int j = 0;j<column;j++) {
//					System.out.print(arr[i][j] + " ");
			}	
//				System.out.println();
		}
			
//Bottom Rotation			
			for (int i = 0;i< row;i++) {
				for(int j =column-1;j>=0;j--) {
					
					if(i == row-1 && j<column-1) {
					arr[i][j] = arr[i][j] + 1;
					}

			}	}
//				System.out.println("After bottom Row Rotation");
				for (int i = 0;i< row;i++) {
					for(int j = 0;j<column;j++) {
//						System.out.print(arr[i][j] + " ");
				}	
//					System.out.println();
			}
				
//Left Side Rotation			
				for (int i = 0;i< row;i++) {
					for(int j =column-1;j>=0;j--) {
						
						if(i < row-1 && j==0) {
						arr[i][j] = arr[i][j] + diff;
						}

				}	}
					System.out.println("After Rotation");
					for (int i = 0;i< row;i++) {
						for(int j = 0;j<column;j++) {
							System.out.print(arr[i][j] + " ");
					}	
						System.out.println();
				}

}}
