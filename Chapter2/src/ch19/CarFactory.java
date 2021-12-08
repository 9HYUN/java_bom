package ch19;

public class CarFactory {
	
	
	public static CarFactory instance = new CarFactory();
	private CarFactory() {}
	
	public static CarFactory getInstance()
	{
		if( instance == null );
		{
			instance = new CarFactory();
		}
		return instance;
	}
	
//	public Car createCar()
//	{
//		Car car = new Car();
//		return car;
//  여기 있으면 작동안됨 ..; 	

}
