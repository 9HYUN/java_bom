package ch10;

public abstract class Car 
{
	
	public abstract void drive();
	public abstract void stop(); //추상 메소드
	public  void starCar()
	{
		System.out.println("시동을 켭니다.");
	}
	public void turnOff()
	{
		System.out.println("시동을 끕니다.");
	}
	
	public void washCar() {} //구현 메소드(훅 메서드)
	
	final public void run()
	{
		starCar();
		drive();
		stop();
		turnOff();
		washCar();
	}
	
}
