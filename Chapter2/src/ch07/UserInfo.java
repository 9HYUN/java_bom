package ch07;

public class UserInfo 
{

	public String userId;
	public String userPassWord;
	public String userName;
	public String phoneNumber;
	public String userAddress;
	
	public UserInfo(){}
	
	public UserInfo(String userId, String userPassWord, String userName)
	{
		this.userId = userId;
		this.userPassWord = userPassWord;
		this.userName = userName;
	}
	
	public String showUserInfo()
	{
		return "������ ���̵��" + userId + "�̰�, ��ϵ� �̸���" + userName + "�Դϴ�.";
	}
}
