package Example2;
import java.lang.Cloneable;

public class InterfaceClone implements Cloneable {
		int a;
		String b;
		
		InterfaceClone(int a, String b){
			this.a = a;
			this.b = b;
		}
		
		protected Object clone() throws CloneNotSupportedException {
			return super.clone();
		}
}


