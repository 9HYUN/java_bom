package ch08;

public class HumanInfo 
{

	int userHeight;
	int userWeight;
	int userAge;
	String userSex;
	String userName;
	
	public HumanInfo(int userHeight, int userWeight, int userAge, String userSex, String userName )
	{
		this.userHeight = userHeight;
		this.userWeight = userWeight;
		this.userAge = userAge;
		this.userSex = userSex;
		this.userName = userName;
	
	}
	
	public String showHunmanInfo()
	{
		
		return "Ű:" + userHeight  + " ������:" + userWeight + " ����:" + userSex + " �̸�:" + userName + " ����:" + userAge;
		
	}
	
}
