package custom;

import java.util.ArrayList;
import java.util.List;

public class ChiefRBThread extends Thread {

	List<ControlRBThread> list = new ArrayList<ControlRBThread>();

	public ChiefRBThread() {
		start();

		ControlRBThread controlRBThread = new ControlRBThread();

		list.add(controlRBThread);
	}

	public void run() {

		while (true) {
			try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {

			}

			if (Custom.getCountCar() < 3) {
				ControlRBThread controlRBThread = new ControlRBThread();

				list.add(controlRBThread);

				System.out.println("RB chief add new controler");
			}
			
			
			
			if (Custom.getCountCar() > 8 && list.size() > 1) {
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
				System.out.println("RB chief remove controler");
			}
		}
	}

}
