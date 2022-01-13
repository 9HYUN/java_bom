package ch08;

public class ArrayIndexException 
{
	public static void main(String[] args)
	{
	
		int[] arr = {1,2,3,4,5};
	
		try
		{
			for(int i=0; i<=5; i++)
			{
				System.out.println(arr[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}
	
		//System.out.println("here"); <-- try catch가 없을 경우 요기까지 안옴 에러난 상태에서 멈춤
	}
}
