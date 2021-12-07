package ch08;

public class Order {
	//long은 왜 안됨? String 쓰는이유는 숫자가 0부터 나올수 있기때문에 씀)
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
		System.out.println("주문 접수 번호 :" + userOrderNumber);
		System.out.println("주문 핸드폰 번호 :" + userPhoneNumber);
		System.out.println("주문 주소 :" + userAddress);
		System.out.println("주문 날짜 :" + userOrderData);
		System.out.println("주문 시간 :" + userOrderTime);
		System.out.println("주문 가격 :" + menuPrice);
		System.out.println("메뉴 번호 :" + menuNumber);
	}
}
