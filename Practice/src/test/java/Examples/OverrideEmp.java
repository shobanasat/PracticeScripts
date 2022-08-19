package Examples;

public class OverrideEmp {
	
	public int base = 10000;
	int sal() {
		return base;
	}
}

class Manager extends OverrideEmp{
	int sal() {
		return base + 20000;
	}
}

class Clerk extends OverrideEmp{
	int sal() {
		return base + 5000;
	}
}