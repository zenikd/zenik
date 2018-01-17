package enums;

public enum DayofWeek {
	monday, tuesday, wednasday;
	private boolean isWorkingDay;
	
	DayofWeek(){
		this(true);
	}
	
	DayofWeek(boolean isWokingDay){
		isWokingDay = true;
	}

}
