package internationalization;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public class Test4 {

	public static void main(String[] args) {
		Locale loc  = new  Locale("ru","Ru");
		Date currentDate = new Date();
		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, loc);
		System.out.println(df.format(currentDate));
		try {
			Date date = df.parse("17.01.18");
			System.out.println(date.getTime());
		} catch (ParseException e) {
			
		}
		
	}

}
