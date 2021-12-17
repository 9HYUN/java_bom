package ch02;

public class Student 
{
	private int studentNum;
	private String studentName;
	
	public Student(int studentnum, String studentName)
	{
		this.studentName = studentName;
		this.studentNum = studentnum;
	}
	
	public String toString()
	{
		return studentNum + "," + studentName;
	}

	@Override
	public int hashCode() {
		return studentNum;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student)
		{
			Student std = (Student)obj;
			if( this.studentNum == std.studentNum)
			{
				return true;
			}
			else return false; 
		}
		return super.equals(obj);
	}
	
}
