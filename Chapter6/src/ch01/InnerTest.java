package ch01;


class OutClass{
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
	
	
	private class InClass{ //<-- private 선언 
		int iNum = 100;
		
		void inTest() {
			System.out.println("OutClass num = " +num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " +sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass iNum = " +iNum + "(내부 클래스의 인스턴스 변수)");
		}
	}
	
	public void usingClass() {
		inClass.inTest();
	}
	
	
}

public class InnerTest {

	public static void main(String[] args) {
		
		OutClass outClass = new OutClass();
		outClass.usingClass();
		
//		OutClass.InClass inner = outClass.new InClass();
//		inner.inTest();             <-- InClass가 private 선언 했으므로 이렇게는 사용 불가
	}

}
