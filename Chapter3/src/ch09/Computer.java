package ch09;

public abstract class Computer 
{
	public abstract void display();
	public abstract void typing();
	public void turnOn()
	{
		System.out.println("전원을 켭니다.");
	}
	public void turnOff()
	{
		System.out.println("전원을 끕니다.");
	}
}
// 추상클래스 만드는 이유: 하위클래스가 쓰기 위해 