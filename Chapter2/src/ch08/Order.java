package ch08;

public class Order {
	//long�� �� �ȵ�? String ���������� ���ڰ� 0���� ���ü� �ֱ⶧���� ��)
	String userOrderNumber;
	String userPhoneNumber;
	String userAddress;
	int userOrderData;
	int userOrderTime;
	int menuPrice;
	int menuNumber;
	

	public Order(String userOrderNumber, String userPhoneNumber, String userAddress, int userOrderData, int userOrderTime, int menuPrice, int menuNumber)
	{
		
		this.userOrderNumber = userOrderNumber;
		this.userPhoneNumber = userPhoneNumber;
		this.userAddress = userAddress;
		this.userOrderData = userOrderData;
		this.userOrderTime = userOrderTime;
		this.menuPrice = menuPrice;
		this.menuNumber = menuNumber;
		
	}
	
	public void showOrderInfo()
	{
		System.out.println("�ֹ� ���� ��ȣ :" + userOrderNumber);
		System.out.println("�ֹ� �ڵ��� ��ȣ :" + userPhoneNumber);
		System.out.println("�ֹ� �ּ� :" + userAddress);
		System.out.println("�ֹ� ��¥ :" + userOrderData);
		System.out.println("�ֹ� �ð� :" + userOrderTime);
		System.out.println("�ֹ� ���� :" + menuPrice);
		System.out.println("�޴� ��ȣ :" + menuNumber);
	}
}
