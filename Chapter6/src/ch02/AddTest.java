package ch02;

public class AddTest {
	
	public static void main(String[] args) 
	{
		//Add addL = (x, y) -> {return x+y;}; //���ٽ�
		Add addL = (x, y) ->  x+y; //���ٽ�2
		System.out.println(addL.add(2, 3));
	}
}
