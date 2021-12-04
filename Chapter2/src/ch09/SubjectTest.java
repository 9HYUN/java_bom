package ch09;

public class SubjectTest {
	
	public static void main(String[] args)
	{
		Student studentLee = new Student(200, "Lee");
		studentLee.setKoreaSubject("국어", 10);
		studentLee.setMathSubject("수학", 55);
		
		Student studentPark = new Student(100, "Park");
		studentPark.setKoreaSubject("국어", 100);
		studentPark.setMathSubject("수학", 100);
		
		studentLee.showScoreInfo();
		studentPark.showScoreInfo();
	}
}
