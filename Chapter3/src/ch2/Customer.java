package ch2;

public class Customer {
	
	private int customerID;
	private String customerName;
	private String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	
	public Customer()
	{
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		
	}
	
	public int calcPrice(int price)
	{
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo()
	{
		return customerName +"님의 등급은" + customerGrade + "이여, 보너스 포인트는" + bonusPoint + "입니다,";
	}
}
