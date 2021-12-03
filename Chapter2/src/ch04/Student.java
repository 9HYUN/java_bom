package ch04;

public class Student {
	
	int studentID;
	String address;
	String studentName;
	
	void showStudentInfo()
	{
		System.out.println( studentID + "학번의 이름은" + studentName + "이고, 주소는" + address + "입니다.");
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
