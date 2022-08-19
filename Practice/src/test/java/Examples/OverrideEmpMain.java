package Examples;

public class OverrideEmpMain {
	
	static void printSalary(OverrideEmp o) {
		System.out.println(o.sal());
	}
	public static void main(String[] args) {
		
		OverrideEmp oe = new Manager();
		printSalary(oe);
		
		OverrideEmp om = new Clerk();
		printSalary(om);
				
	}

}
