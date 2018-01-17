package regular;

import java.util.ArrayList;
import java.util.List;

public class test {

	private static List<test> list = new ArrayList<>();
	public static void main(String[] args) {
		
		
	}
	
	protected void finalize() throws Throwable {
		System.out.println("i am deleted" + hashCode());
	}

}
