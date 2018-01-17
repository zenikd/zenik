package internationalization;

import java.util.Locale;
import java.util.ResourceBundle;

public class Test6 {

	public static void main(String[] args) {
		Locale loc  = new  Locale("ru","RU");
		ResourceBundle rb = ResourceBundle.getBundle("messagesBundle",loc);
		System.out.println(rb.getString("greetings"));
	}

}
