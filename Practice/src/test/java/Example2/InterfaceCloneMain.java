package Example2;

public class InterfaceCloneMain {

	public static void main(String[] args) throws CloneNotSupportedException {
		InterfaceClone ic = new InterfaceClone(10,"Shobana");
		InterfaceClone ib = (InterfaceClone)ic.clone();
		
		System.out.println(ib.a);
		System.out.println(ib.b);
	}

}
