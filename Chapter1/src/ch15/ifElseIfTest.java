package ch15;

public class ifElseIfTest {

	public static void main(String[] args) {
		
		int age = 55;
		int charge = 3000;
		
		if( age < 8)
		{
			charge = 1000;
			System.out.println("꼬맹이 입니다.");
		}
		else if( age < 14)
		{
			charge = 2000;
			System.out.println("초딩입니다.");
		}
		else if( age < 20)
		{
			charge = 2500;
			System.out.println("중.고딩 입니다.");
		}
		System.out.println("어른이 입니다.");
		
	System.out.println("입장료는" + charge + "입니다.");
	}

}
