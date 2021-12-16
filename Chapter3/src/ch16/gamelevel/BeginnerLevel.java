package ch16.gamelevel;

public class BeginnerLevel extends PlayerLevel 
{

	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("no jump");
	}

	@Override
	public void turn() {
		System.out.println("no turn");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("************초급자 레벨입니다.**************");
	}
	
}
