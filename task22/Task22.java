package task22;

public class Task22 {
	
	int sec, min, hour;
	
	public Task22(int sec, int min, int hour) {
		this.sec = sec;
		this.min = min;
		this.hour = hour;
	}
	
	public Task22(int sec) {
		this.sec = sec;
	}
		
	public int getTime () {
		return sec;
	}
}
