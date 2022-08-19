package Examples;

import java.beans.Statement;

public class Arrays {

	public static void main(String[] args) {
//Integer array
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("The Element at index " + i + " is: " + arr[i]);
		}
		
//Character arrays
		char[] arra = new char[3];
		arra[0] = 'A';
		arra[1] = 'B';
		arra[2] = 'C';
		
		for (int i=0;i<arra.length;i++) {
			System.out.println(arra[i]);
		}
		
//Functional Arrays
		
		Arrays[] farr = new Arrays[5];
		
		farr[0] = new Arrays (1,"name1");
		farr[1] = new Arrays (2,"name2");
		farr[2] = new Arrays (3,"name3");
		farr[3] = new Arrays (4,"name4");
		farr[4] = new Arrays (5,"name5");
		
		for (int i=0;i<farr.length;i++) {
			System.out.println(farr[i].rollno + " " + farr[i].name);
		}
		
	}
	
	int rollno;
	String name;
	
	Arrays (int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}

}
