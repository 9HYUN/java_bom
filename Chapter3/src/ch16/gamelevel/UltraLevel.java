package ch16.gamelevel;

public class UltraLevel extends PlayerLevel
{

	@Override
	public void run() {
		System.out.println("광속으로 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("빌딩 위까지 점프 합니다.");
	}

	@Override
	public void turn() {
		System.out.println("자유자재로 턴 가능");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("**************울트라 레벨 입니다.***************");
	}

}
