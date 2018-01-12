package race;


import java.util.ArrayList;
import java.util.Random;

public class Race extends Thread {

	private int countHource;

	public Race() {
		Random rand = new Random();
		countHource = rand.nextInt(5) + 5;
	}

	public void start() {

		ArrayList<RaceHorceThread> list = new ArrayList<RaceHorceThread>();

		for (Integer i = 0; i < countHource; i++) {
			RaceHorceThread horce = new RaceHorceThread("Horce " + i.toString());
			list.add(horce);
		}

		Random rand = new Random();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		RaceHorceThread horce = list.get(rand.nextInt(countHource));
		
		horce.interrupt();

	}

}
