package ch10;

public class PassWordExceptionTest {

	private String password;	

	public String getPassword() {
		return password;
	}


	public void setPassword(String password) throws PassWordException 
	{
	
		if(password == null)
		{
			throw new PassWordException("비밀번호는 null일 수 없습니다.");
		}
		
		else if(password.length() < 5)
		{
			throw new PassWordException("비밀번호는 5자 이상이어야 합니다.");
		}
		
		else if(password.matches("[a-zA-Z]+")) //정규식 표현
		{
			throw new PassWordException("비밀번호는 숫자나 특수문자를 포함해야 됩니다.");
		}
		
		this.password = password;
	}
	
	public static void main(String[] args) 
	{
	
		PassWordExceptionTest test = new PassWordExceptionTest();
		String password = null;
		try {
			test.setPassword(password);
			System.out.println("오류 없음");
		} catch (PassWordException e) {
			System.out.println(e.getMessage());
		}
		
		password = "abc";
		try {
			test.setPassword(password);
			System.out.println("오류 없음2");
		} catch (PassWordException e) {
			System.out.println(e.getMessage());
		}
		
		password = "abcdef";
		try {
			test.setPassword(password);
			System.out.println("오류 없음3");
		} catch (PassWordException e) {
			System.out.println(e.getMessage());
		}
		
		password = "abcdef#1";
		try {
			test.setPassword(password);
			System.out.println("오류 없음4");
		} catch (PassWordException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
