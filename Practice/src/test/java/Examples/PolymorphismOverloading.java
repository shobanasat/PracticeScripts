package Examples;

public class PolymorphismOverloading {
	
	public int sum(int x, int y) {

		return (x+y);
		
	}
	
	public int sum(int x,int y,int z) {
		
		return (x+y+z);
		
	}
	
	public double sum(double x, double y) {

		return (x+y);
		
	}

	public static void main(String[] args) {
		
		PolymorphismOverloading o = new PolymorphismOverloading();
		System.out.println(o.sum(10,20));
		System.out.println(o.sum(10,20,30));
		System.out.println(o.sum(10.1,20.1));
		

	}

}
