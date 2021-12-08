package ch19;

public class CarTest {

	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();
		Car myCar = Car.createCar();
		Car yourCar = Car.createCar();
		System.out.println(myCar.getCarNum());
		System.out.println(yourCar.getCarNum());
		
	}

}
