package Example2;

public interface Interfacevehicle {
	
	public void gear(int a);
	public void brake(int a);
	public void speedup(int a);
}

class Bicycle implements Interfacevehicle{
	
	int speed = 0;
	@Override
	public void gear(int newGear) {
		int gear = newGear;
		System.out.println(gear);
		
	}

	@Override
	public void brake(int decrement) {
		speed = speed - decrement;
		System.out.println(speed);
		
	}

	@Override
	public void speedup(int increment) {
		speed = speed + increment;
		System.out.println(speed);
		
	}
	
}

class Car implements Interfacevehicle{
	
	int speed = 0;
	@Override
	public void gear(int newGear) {
		int gear = newGear;
		System.out.println(gear);
		
	}

	@Override
	public void brake(int decrement) {
		speed = speed - decrement;
		System.out.println(speed);
		
	}

	@Override
	public void speedup(int increment) {
		speed = speed + increment;
		System.out.println(speed);
		
	}
	
}

class Bike implements Interfacevehicle{
	
	int speed = 0;
	@Override
	public void gear(int newGear) {
		int gear = newGear;
		System.out.println(gear);
		
	}

	@Override
	public void brake(int decrement) {
		speed = speed - decrement;
		System.out.println(speed);
	}

	@Override
	public void speedup(int increment) {
		speed = speed + increment;
		System.out.println(speed);
		
	}
	
}