package Examples;

public class EncapsulationMain {

	public static void main(String[] args) {

		Encapsulation ec = new Encapsulation();
		ec.setAge(10);
		ec.setName("Shobana");
		ec.setRoll(10);
		
		System.out.println("Age is: " + ec.getAge());
		System.out.println("Name is: " + ec.getName());
		System.out.println("RollNo is: " + ec.getRollno());
	}

}
