package ch16.schedule;

import java.io.IOException;

public class ScheduleTest 
{

	public static void main(String[] args) throws IOException 
	{
		System.out.println("��ȭ ���� �Ҵ� ����� �����ϼ���");
		System.out.println("R : �Ѹ� ���ʴ��");
		System.out.println("L : ��Ⱑ ���� ���� �켱");
		System.out.println("P : �켱������ ���� ���켱 ���õ� ���� ����");
		
		int ch = System.in.read();
		Scheduler scheduler = null;
		
		if( ch == 'R' || ch == 'r')
		{
			scheduler = new RoundRobin();
		}
		else if( ch == 'L' || ch == 'l')
		{
			scheduler = new LeastJob();
		}
		else if( ch == 'P' || ch == 'p')
		{
			scheduler = new PriorityAllocation();
		}
		else 
		{
			System.out.println("�������� �ʴ� ����Դϴ�.");
			return;
		}
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}

}
