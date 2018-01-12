package custom;

import java.util.ArrayList;
import java.util.List;

public class ChiefPolandThread extends Thread {

	List<ControlPolandThread> list = new ArrayList<ControlPolandThread>();

	public ChiefPolandThread() {
		start();

		ControlPolandThread controlPolandThread1 = new ControlPolandThread();
		list.add(controlPolandThread1);

		ControlPolandThread controlPolandThread2 = new ControlPolandThread();
		list.add(controlPolandThread2);
		
	}

	public void run() {
		
		while (true) {
			try {
				Thread.sleep(120000);
			} catch (InterruptedException e) {

			}
			

			if (Custom.getCountCar() >= 5) {
				ControlPolandThread controlPolandThread = new ControlPolandThread();

				list.add(controlPolandThread);

				System.out.println("Poland chief add new controler");
			}

			if (Custom.getCountCar() < 5) {
				int max = 0;
				int numberNeedRemove = 0;

				for (int i = 0; i < list.size(); i++) {
					if (max < list.get(i).getSevreCount()) {
						max = list.get(i).getSevreCount();
						numberNeedRemove = i;
					}
				}

				list.get(numberNeedRemove).interrupt();
				list.remove(numberNeedRemove);
				System.out.println("Poland chief remove controler");
			}
		}
	}
}
