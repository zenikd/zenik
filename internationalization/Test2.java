package internationalization;

import java.text.NumberFormat;
import java.util.Locale;

public class Test2 {

	public static void main(String[] args) {
		Locale locale  = new  Locale("be","BY");
		NumberFormat rubFormat = NumberFormat.getNumberInstance(locale);
		System.out.println(rubFormat.format(10000));
		
		
	}

}
