package ch18;

public class Company {
	
	private static Company instance = new Company();
	private Company () {} //������
	
	public static Company getInsctance()
	{
		if( instance == null)
		{
			instance = new Company();
		}
		return instance;
	}
	
	
}
