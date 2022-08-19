package Examples;

public class OverridingAccessModifiers {
	
	public char method1() {
		System.out.println("Super Class - Method1");
		return ('A');
	}
	
	protected void method2() {
		System.out.println("Super Class - Method2");
	}}

	class child15 extends OverridingAccessModifiers{
		public char method1() {
			System.out.println("Sub Class - Method1");
			return (10);
		}
		
		public void method2() {
			System.out.println("Sub Class - Method2");
		}
	}
