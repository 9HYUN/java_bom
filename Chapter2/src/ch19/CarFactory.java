package ch19;

public class CarFactory {
	
	
	public static CarFactory instance = new CarFactory();
	private CarFactory() {}
	
	public static CarFactory getInstance()
	{
		if( instance == null );
		{
			instance = new CarFactory();
		}
		return instance;
	}

}
