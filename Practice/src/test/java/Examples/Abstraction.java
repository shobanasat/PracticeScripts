package Examples;

public abstract class Abstraction {
	
	String color;
	public abstract double area();
	public abstract String toString();
	
	public Abstraction (String color) {
		System.out.println("Constructor called...");
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
}

class Circle extends Abstraction{
	
	double radius;
	public Circle(String color, double radius) {
		super(color);
		System.out.println("Circle Constructor called..");
		this.radius = radius;
	}

	@Override
	public double area() {
		
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public String toString() {
		
		return "Circle color is" + super.getColor() + "and the area is: " + area(); 
	}	
}

class Rectangle extends Abstraction{
	
	double width;
	double length;
	public Rectangle(String color, double width, double length) {
		super(color);
		System.out.println("Rectangle Constructor called...");
		this.width = width;
		this.length = length;
	}

	@Override
	public double area() {
		
		return length * width;
	}

	@Override
	public String toString() {
		
		return "Rectangle color is: " + super.getColor() + "area is: " + area();
	}
	
}
