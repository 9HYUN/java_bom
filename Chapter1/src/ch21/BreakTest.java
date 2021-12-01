package ch21;

public class BreakTest {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		//for(;sum <= 100 ; num++) 이경우는 sum값이 100이 넘는 num은 14인데 num이 하나 더해서 나온다.
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
