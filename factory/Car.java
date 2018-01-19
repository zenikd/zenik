package factory;

public class Car {
	public static void main(String[] args) {
		Car car1 = carFactory(CarType.small);
		
		System.out.println(car1.getClass());
		
		Car car2 = carFactory(CarType.big);
		
		System.out.println(car2.getClass());
	}
	
	
	public static Car carFactory(CarType ext) {
		if(ext.equals(CarType.values()[0])) {
			return new SmallCar();
		} else if(ext.equals(CarType.values()[1])) {
				return new BigCar();
		}
		throw new RuntimeException("This type osn't supported");
			
	}

}
