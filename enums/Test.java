package enums;

public class Test {
	

	public static void main(String[] args) {
		DayofWeek monday2 = DayofWeek.monday;
		System.out.println(monday2.name());
		System.out.println(monday2.ordinal());
		
		System.out.println(DayofWeek.valueOf()[1]);

	}

}
