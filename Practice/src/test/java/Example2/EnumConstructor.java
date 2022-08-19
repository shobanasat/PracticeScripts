package Example2;

import Example2.EnumInClass.colours;

public enum EnumConstructor {
		RED,
		BLUE,
		GREEN;
	
	EnumConstructor(){
		System.out.println(this.toString());
	}
	
	public void colorInfo() {
		System.out.println("Universal Colour");
	}
	
	public static void main(String[] args) {
		EnumConstructor c1 = EnumConstructor.RED;
		System.out.println(c1);
		c1.colorInfo();
	}
}
