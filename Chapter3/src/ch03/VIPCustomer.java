package ch03;

public class VIPCustomer extends Customer{

	
	double salesRatio;
	protected String agentID;
	public VIPCustomer()
	{
		//super(); ����Ŭ���� constructor ȣ��(���Ծ��ص� java���ο��� �˾Ƽ� ����)
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
