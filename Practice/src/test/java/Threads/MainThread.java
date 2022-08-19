package Threads;

public class MainThread {

	private static final int MAX_PRIORITY = 10;
	private static final int MIN_PRIORITY = 1;

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println("Name of the Main thread: " + t.getName());
		t.setName("MainThread");
		System.out.println("After name change of main thread: " + t.getName());
		System.out.println("Priority of main thread: " + t.getPriority());
		t.setPriority(MAX_PRIORITY);
		System.out.println("Priority after priority change: " + t.getPriority());
		
		Thread ct = new Thread();
		System.out.println("Get child thread priority: " + ct.getPriority());
		ct.setPriority(MIN_PRIORITY);
		System.out.println("Get child thread priority: " + ct.getPriority());

	}

}
