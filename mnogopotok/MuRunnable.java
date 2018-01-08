package mnogopotok;

public class MuRunnable implements Runnable {
		@Override
		public void run() {
			System.out.println("MyThread started3");

			int i = 0;
			while (i < 9) {
				i++;
			}
			System.out.println(i + "last");
			
			System.out.println("MyThread started ended3");
		}

	}
