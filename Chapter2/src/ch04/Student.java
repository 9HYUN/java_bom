package ch04;

public class Student {
	
	int studentID;
	String address;
	String studentName;
	
	void showStudentInfo()
	{
		System.out.println( studentID + "�й��� �̸���" + studentName + "�̰�, �ּҴ�" + address + "�Դϴ�.");
	}
	
	String getStudentName()
	{
		return studentName;
	}
	
	void setStudentName(String name)
	{
		studentName = name;
	}
}
