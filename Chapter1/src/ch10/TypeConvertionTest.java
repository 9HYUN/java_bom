package ch10;

public class TypeConvertionTest {

	public static void main(String[] args) {
		
		byte bNum = 125;
		int iNum = bNum;
		
		System.out.println(iNum);

		int iNum_1 = 255;
		byte bNum_1 = (byte)iNum_1;
		System.out.println(bNum_1);
		
		double dNum = 3.14;
		int inum = (int)dNum;
		System.out.println(inum);
		
		
		double dNum_2 = 1.2;
		float fNum_2 = 0.9f;
		
		int iNum1 = (int)dNum_2 +(int)fNum_2;
		int iNum2 = (int)(dNum_2 + fNum_2);
		System.out.println(iNum1);
		System.out.println(iNum2);
		
		
	}

}
