package hashCode;

public class CarTest {
	public static void main(String[] args) {
		Car car1 = new Car(1,"sq", "sd");
		Car car2 = new Car(1,"sq", "sd");
		System.out.println(car1.equals(car2));
		System.out.println(new Object().hashCode());
	}

}
