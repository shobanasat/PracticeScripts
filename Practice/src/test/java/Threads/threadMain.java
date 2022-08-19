package Threads;

public class threadMain implements Runnable {
	public static Thread thread1;
	public static threadMain obj;

	public static void main(String[] args) {
		obj = new threadMain();
		thread1 = new Thread(obj);
		
		System.out.println("State of thread1 after creating it: " + thread1.getState());
		thread1.start();
		System.out.println("State of thread1 after starting: " + thread1.getState());
	}


	public void run() {
		thread myThread = new thread();
		Thread thread2 = new Thread(myThread);
		
		System.out.println("State of thread2 after creating: " + thread2.getState());
		thread2.start();
		System.out.println("State of thread2 after starting: " + thread2.getState());
		
		try {
			Thread.sleep(200);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("State of thread2 after calling sleep: " + thread2.getState());
		
		try {
			thread2.join();
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("State of thread2 after completing execution: " + thread2.getState());
	}


}
