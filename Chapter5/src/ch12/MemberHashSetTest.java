package ch12;

public class MemberHashSetTest
{

	public static void main(String[] args)
	{
		MemberHashSet memberHashSet = new MemberHashSet();
		Member memberLee = new Member(1001, "�̼���");
		Member memberKim = new Member(1002, "������");
		Member memberKang = new Member(1003, "������");
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberKim);
		memberHashSet.addMember(memberKang);
		
		memberHashSet.showAllMember();
	}

}
