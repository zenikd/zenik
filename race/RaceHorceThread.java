package race;

import java.util.Random;

public class RaceHorceThread extends Thread {

	String name;

	public RaceHorceThread(String name) {
		start();
		this.name = name;
	}

	@Override
	public void run() {
		Random rand = new Random();

		int currentPosition = 0;

		int currentTime = 0;

		while (currentPosition < 100 && !Thread.currentThread().isInterrupted()) {

			currentPosition += rand.nextInt(3) + 1;
			currentTime++;

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println(name + " dead");

			}

		}

		if (Thread.currentThread().isInterrupted()) {
			System.out.println("Horce dead");
			return;
		}

		System.out.println(name + " over race with time " + currentTime + " sec");
	}

}
