package mnogopotok;

public class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println("MyThread started2");

		int i = 0;
		while (i < 9) {
			i++;
		}
		System.out.println(i + "firth");
		
		System.out.println("MyThread started ended2");
	}

}
