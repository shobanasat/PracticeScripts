package Example2;

enum colors{
	RED,
	BLUE,
	GREEN;
}

public class EnumMethods {
	
	public static void main(String[] args) {
		colors arr[] = colors.values();
		
		for (colors col: arr) {
			System.out.print(col.ordinal() + " ");
		}
		
		System.out.println(colors.valueOf("RED"));
	}

}
