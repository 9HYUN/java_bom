package ch10;

public abstract class Car 
{
	
	public abstract void drive();
	public abstract void stop(); //�߻� �޼ҵ�
	public  void starCar()
	{
		System.out.println("�õ��� �մϴ�.");
	}
	public void turnOff()
	{
		System.out.println("�õ��� ���ϴ�.");
	}
	
	public void washCar() {} //���� �޼ҵ�(�� �޼���)
	
	final public void run()
	{
		starCar();
		drive();
		stop();
		turnOff();
		washCar();
	}
	
}
