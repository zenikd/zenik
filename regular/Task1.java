package regular;

import java.util.regex.*;


public class Task1 {

	public static void main(String[] args) {
		 String pattern = "<p[^>]*>";
	        String text = "code 2 <p> learn 43 <p sdf='dckhghsdkuc'>6 java tutorial";
	        Pattern p = Pattern.compile(pattern);
	        
	        Matcher m = p.matcher(text);
	        
	        String newStr = m.replaceAll("<p>");
	        System.out.print(newStr);
	       
	}

}
