package ch10;

public class PassWordException extends Exception{
	                                 // IllegalArgumentException <- runtimeException이라 컴파일러에 디텍션이 안될 수도 있다. 
	public PassWordException(String message)
	{
		super(message);
	}

}
