package ch07;

public class GenericPrintTest 
{

	public static void main(String[] args) 
	{
		Powder powder = new Powder();
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();  // <> 다이아몬드 연산자
		powderPrinter.setMaterial(powder);
		
//		Powder powder = new Powder();
//		GenericPrinter powderPrinter = new GenericPrinter<>(); <-- 오브젝트 클래스로 replace 됨 
//		powderPrinter.setMaterial(powder);
//		Powder p = (Powder) powderPrinter.getMaterial();  <-- generic이 안되는 버전과 호환 되게 형변환 
//		System.out.println(powderPrinter.toString());
		
		Powder p = powderPrinter.getMaterial();
		System.out.println(powderPrinter.toString());
		
		Plastic plastic = new Plastic();
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();  // <> 다이아몬드 연산자
		plasticPrinter.setMaterial(plastic);
		
		Plastic pl = plasticPrinter.getMaterial();
		System.out.println(plasticPrinter.toString());
		
	}

}
