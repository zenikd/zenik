package custom;

import java.util.Random;

public class ControlRBThread extends Thread{
	int serveCount;
	
	public ControlRBThread() {
		start();
		
		serveCount = 0;
	}
	
	public int getSevreCount() {
		return serveCount;
	}
	
	public void run() {
	
		Random rand = new Random();
		int passTime;
		
		
		
		while(!Thread.currentThread().isInterrupted()) {
			passTime = rand.nextInt(10) + 10;
			
			
			try {
				Thread.sleep(passTime * 1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				
			}
			
			Custom.incrementCountCar();
			
			serveCount++;
			
			System.out.println("Car add to custom. Now in custom " + Custom.getCountCar() + " car");
		}
		
	}

}
