package ch19;

public class Car {
	
	private static int carNum = 10000;
	private int creatCar;
	private Car() 
	{
		carNum++;
		creatCar = carNum; 

	}
	public int getCreatCar() {
		return creatCar;
	}
	
	
	
	
}
