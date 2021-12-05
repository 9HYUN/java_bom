package ch10;

public class BirthDay {
	//private 사용 이유: 객체사용시 오용을 막는다
	private int day;
	private int month;
	private int year;
	
	private boolean isValid;
	
	public int getDay() 
	{
		
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if(month < 1 || month >12)
		{
			isValid = false;
		}
		else
		{
		isValid = true;
		this.month = month;
		}
		
		
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public void showDate()
	{
		if(isValid) {
			System.out.println(year + "년" + month + "월" + day + "일");
		}
		else
		{
			System.out.println("유효하지 않은 날짜입니다.");
		}
	}
}
