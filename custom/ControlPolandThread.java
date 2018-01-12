package custom;



public class ControlPolandThread extends Thread{

	int serveCount;
	int passTime;
	
	public ControlPolandThread() {
		start();
		
		serveCount = 0;
		passTime = 15;
	}
	
	public int getSevreCount() {
		return serveCount;
	}
	
	
	public void run() {	
		
		
		while(!Thread.currentThread().isInterrupted()) {
								
			try {
				Thread.sleep(passTime * 1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				
			}
			
			Custom.decrementCountCar();
			
			serveCount++;
			
			System.out.println("Car remove to custom. Now in custom " + Custom.getCountCar() + " car");
		}
		
	}
}


