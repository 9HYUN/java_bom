package ch03;

public class VIPCustomer extends Customer{

	
	double salesRatio;
	protected String agentID;
	public VIPCustomer(int customerID, String customerName)
	{
		//super(); 상위클래스 constructor 호출(기입안해도 java내부에서 컴파일러 알아서 생성)
		super(customerID, customerName);
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";
		System.out.println("VIPCustomer() Call");
	}
	public String getAgentID() 
	{
		return agentID;
	}
}
