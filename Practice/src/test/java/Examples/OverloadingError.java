package Examples;

public class OverloadingError {
	
	public int method1(int a, int b) {
		
		int sum = a + b;
		System.out.println(sum);
		return sum;
	}
	
	//int a gives error
	public double method1(double a, int b) {
		double sum = a + b;
		System.out.println(sum);
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
