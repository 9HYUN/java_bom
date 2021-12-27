package ch07;

public class GenericPrintTest 
{

	public static void main(String[] args) 
	{
		Powder powder = new Powder();
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();  // <> ���̾Ƹ�� ������
		powderPrinter.setMaterial(powder);
		
//		Powder powder = new Powder();
//		GenericPrinter powderPrinter = new GenericPrinter<>(); <-- ������Ʈ Ŭ������ replace �� 
//		powderPrinter.setMaterial(powder);
//		Powder p = (Powder) powderPrinter.getMaterial();  <-- generic�� �ȵǴ� ������ ȣȯ �ǰ� ����ȯ 
//		System.out.println(powderPrinter.toString());
		
		Powder p = powderPrinter.getMaterial();
		System.out.println(powderPrinter.toString());
		
		Plastic plastic = new Plastic();
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();  // <> ���̾Ƹ�� ������
		plasticPrinter.setMaterial(plastic);
		
		Plastic pl = plasticPrinter.getMaterial();
		System.out.println(plasticPrinter.toString());
		
	}

}
