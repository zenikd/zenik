package polimorf;

public class Test {
	public static void main(String[] args) {
		PassengerCar passengerCar = new PassengerCar();
		Truck truck = new Truck();
		
		statrTheCar(truck);
		statrTheCar(passengerCar);
	}
	
	private static void statrTheCar(PassengerCar passengerCar) {
		passengerCar.move();
	}
	
	private static void statrTheCar(Truck truck) {
		truck.move();
	}
	
}
