package Threads;

public class ThreadPriority extends Thread {

	public static void main(String[] args) {
		
		System.out.println("Is this main thread: " + Thread.currentThread().getName());
		ThreadPriority t1 = new ThreadPriority();
		ThreadPriority t2 = new ThreadPriority();
		ThreadPriority t3 = new ThreadPriority();
		
		System.out.println("Priority of t1: " + t1.getPriority());
		System.out.println("Priority of t2: " + t2.getPriority());
		System.out.println("Priority of t3: " + t3.getPriority());
		
		t1.setPriority(MIN_PRIORITY);
		t2.setPriority(MAX_PRIORITY);
		t3.setPriority(NORM_PRIORITY);
		
		System.out.println("Priority of t1: " + t1.getPriority());
		System.out.println("Priority of t2: " + t2.getPriority());
		System.out.println("Priority of t3: " + t3.getPriority());
		
		System.out.println("Which thread is this? " + t1.getName());
		System.out.println("Which thread is this? " + t2.getName());
		System.out.println("Which thread is this? " + t3.getName());

	}

}
