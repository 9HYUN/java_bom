package ch21;

public class BreakTest {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		//for(;sum <= 100 ; num++) �̰��� sum���� 100�� �Ѵ� num�� 14�ε� num�� �ϳ� ���ؼ� ���´�.
		for(; ; num++)
		{
			sum += num;
			if ( sum >= 100)
				break;
		}
		System.out.println(sum);
		System.out.println(num);
	}

}
