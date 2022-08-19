package Threads;

public class ExtendRunnableMain {

	public static void main(String[] args) {
		int n = 8;
		for(int i = 1;i<=n;i++) {
			Thread object = new Thread(new ExtendRunnable());
			object.start();
		}

	}

}
