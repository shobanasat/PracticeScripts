package Threads;

public class ExtendThreadMain {

	public static void main(String[] args) {
		int n = 8;
		for (int i = 1;i<=n;i++) {
			ExtendThread object = new ExtendThread();
			object.start();
		}

	}

}
