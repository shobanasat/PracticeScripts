package Example2;

public class FinalDeclarationMain {

	public static void main(String[] args) {
		FinalDeclaration fd = new FinalDeclaration();
		System.out.println(fd.a);
		System.out.println(fd.b);
		System.out.println(fd.c);
		System.out.println(fd.d);
		System.out.println(fd.e);
		
		final FinalDeclaration fi = new FinalDeclaration("Shobana");
		System.out.println(fi.c);
		
		
	}

}
