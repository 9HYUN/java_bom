package ch11;

public class OperatorTest {

	public static void main(String[] args) {
		
		int gameScore = 150;
		int lastScore = ++gameScore; //gameScore += 1;  gameScore = gameScore +1;
		System.out.println(lastScore);
		System.out.println(gameScore);
		
		int gameScore_1 = 150;
		int lastScore_1 = gameScore_1++;
		System.out.println(lastScore_1);
		System.out.println(gameScore_1);
	}

}
