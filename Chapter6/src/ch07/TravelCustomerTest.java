package ch07;

import java.util.ArrayList;
import java.util.List;

public class TravelCustomerTest {

	public static void main(String[] args) 
	{
		TravelCustomer customerLee = new TravelCustomer("�̼���", 40, 1000000);
		TravelCustomer customerKim = new TravelCustomer("������", 20, 1000000);
		TravelCustomer customerHong = new TravelCustomer("ȫ�浿", 13, 500000);
		
		List<TravelCustomer> customerList = new ArrayList<>();
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerHong);
		
		System.out.println("�� ��� ���");
		customerList.stream().map(c->c.getName()).forEach(s -> System.out.println(s));
		
		System.out.println("������");
		System.out.println(customerList.stream().mapToLong(c->c.getPrice()).sum());
		
		System.out.println("���̰� 20�� �̻� ���̸� ����");
		customerList.stream().filter(c->c.getAge() >= 20).map(c->c.getName()).sorted().forEach(s->System.out.println(s));
	}

}
