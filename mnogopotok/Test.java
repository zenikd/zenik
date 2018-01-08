package mnogopotok;

public class Test {

	public static void main(String[] args) {
		System.out.println("Main thread started");
		
		MyThread myThread = new MyThread();
		
		myThread.setPriority(1);
		
		
		
		
		Thread myThread2 = new Thread(new MuRunnable());
		myThread2.setPriority(10);
		myThread.start();
		myThread2.setName("Thread 2");
		myThread2.start();
		
		System.out.println("Main thread ended");

	}

}
