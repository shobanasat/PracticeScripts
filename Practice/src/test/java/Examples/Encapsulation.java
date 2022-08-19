package Examples;

public class Encapsulation {
	
	private String name;
	private int age;
	private int rollno;

	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getRollno() {
		return rollno;
	}
	
	public void setAge(int newAge) {
		age = newAge;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public void setRoll(int newRoll) {
		rollno = newRoll;
	}
}

