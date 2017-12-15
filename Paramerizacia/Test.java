package Paramerizacia;

public class Test {
	public static void main(String[] args) {
		
		Box<String,Integer> myBox = new Box<String,Integer>();
				myBox.setItem("Test");
		
		String item = myBox.getItem();
		myBox.setItem1(1);
		myBox.getItem1();
		Integer itemInt = (Integer)item;
	}

}
