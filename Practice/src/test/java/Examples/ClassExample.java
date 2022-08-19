package Examples;

public class ClassExample {
	
	String name;
	String breed;
	int age;
	String colour;
	
	public ClassExample(String name, String breed, int age, String colour) {
		
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.colour = colour;
		
	}

	public static void main(String[] args) {
		
		ClassExample o = new ClassExample("Dog","somebreed",5,"somecolour");
//		ClassExample("Dog","somebreed",5,"somecolour");
		
		System.out.println(o.name);

	}

}
