package Threads;

public class ExtendRunnable implements Runnable {

	public void run() {
		try {
			System.out.println("Thread " + Thread.currentThread().getId() + " is running");
			System.out.println("Thread state " + Thread.currentThread().getState());
		}
		catch (Exception e) {
			System.out.println("Exception Caught");
		}
	}
}
