package mnogopotok;

public class Test2 {

	public static void main(String[] args) {
		System.out.println("Main thread started");

		MyThread myThread = new MyThread();
		myThread.setName("Thread 1");
		myThread.start();

		final Thread myThread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + "started");
				System.out.println(Thread.currentThread().getName() + "started");
			}
		});
		myThread2.setName("Thread 2");
		myThread2.start();

		System.out.println("Main thread ended");

	}

}
