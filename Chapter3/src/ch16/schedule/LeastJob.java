package ch16.schedule;

public class LeastJob implements Scheduler
{

	@Override
	public void getNextCall() {
		System.out.println("삼당 전화를 순서대로 대기열에서 가져옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("현재 상담업무가 없거나 상담대기가 가장 적은 상담원에게 할달됩니다.");
	}
	
}
