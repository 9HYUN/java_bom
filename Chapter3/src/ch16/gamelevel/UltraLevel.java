package ch16.gamelevel;

public class UltraLevel extends PlayerLevel
{

	@Override
	public void run() {
		System.out.println("�������� �޸��ϴ�.");
	}

	@Override
	public void jump() {
		System.out.println("���� ������ ���� �մϴ�.");
	}

	@Override
	public void turn() {
		System.out.println("��������� �� ����");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("**************��Ʈ�� ���� �Դϴ�.***************");
	}

}
