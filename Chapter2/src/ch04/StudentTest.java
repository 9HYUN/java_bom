package ch04;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student();
		
		studentLee.studentID = 12345;
		studentLee.setStudentName("LEE");
		studentLee.address = "���� ������";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		studentKim.studentID =123123;
		studentKim.studentName = "Kim";
		studentKim.address ="��� ����";
				
		studentKim.showStudentInfo();
		System.out.println(studentKim);
		System.out.println(studentLee);
	}

}
