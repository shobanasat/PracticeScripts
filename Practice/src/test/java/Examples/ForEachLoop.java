package Examples;

public class ForEachLoop {

	public static void main(String[] args) {

		int[] marks = { 98, 99, 35, 78, 100};
		
		int highestMark = maximum(marks);
		System.out.println("The maximum mark is: " + highestMark);

	}
	
	public static int maximum(int[] marks) {
		
		int maxMark = marks[0];
		
		for (int mark: marks) {
			
			if (mark > maxMark) {
				maxMark = mark;
			}
		}
		
		return maxMark;
	}

}
