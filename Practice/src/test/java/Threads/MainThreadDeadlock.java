package Threads;

public class MainThreadDeadlock {

	public static void main(String[] args) {
		try {
			System.out.println("Entering Deadlock");
			Thread.currentThread().join();
			System.out.println("This statement will never get executed");
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}

	}

}
