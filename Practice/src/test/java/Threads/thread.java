package Threads;

public class thread implements Runnable {

	public void run() {
		try {
			Thread.sleep(1500);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("State of thread1 when join is called: " + threadMain.thread1.getState() );
		
		try {
			Thread.sleep(200);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
