package Examples;

public class SolarSystemInheritanceMain {

	public static void main(String[] args) {

		SolarSystemInheritance s = new SolarSystemInheritance();
		earth e = new earth();
		mars m = new mars();
		moon mo = new moon();
		
		System.out.println(s instanceof SolarSystemInheritance);
		System.out.println(s instanceof earth);
		System.out.println(e instanceof earth);
		System.out.println(s instanceof earth);
		System.out.println(m instanceof mars);
		System.out.println(s instanceof mars);
		System.out.println(mo instanceof moon);
		System.out.println(s instanceof moon);
	}

}
