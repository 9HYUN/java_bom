package ch16.gamelevel;

public class AdvancedLevel extends PlayerLevel
{

	@Override
	public void run() {
		System.out.println("���� �޸��ϴ�.");
	}

	@Override
	public void jump() {
		System.out.println("���� jump�� �մϴ�.");
	}

	@Override
	public void turn() {
		System.out.println("no turn");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("***********�߱��� ���� �Դϴ�.************");
	}

}
