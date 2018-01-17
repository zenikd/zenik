package internationalization;

import java.text.Collator;
import java.util.Locale;

public class Test5 {

	public static void main(String[] args) {
		Locale loc  = new  Locale("ru","Ru");
		Collator collator = Collator.getInstance(loc);
		System.out.println(collator.compare("abc", "def"));
	}

}
