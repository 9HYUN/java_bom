package ch13;

import java.util.Comparator;
//import java.util.Comparable;

//public class Member implements Comparable<Member>
public class Member implements Comparator<Member>
{
	private int memberId;
	private String memberName;
	
	public Member() {}
	public Member(int memberId, String memberName) 
	{
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public int getMemberId()
	{
		return memberId;
	}

	public void setMemberId(int memberId)
	{
		this.memberId = memberId;
	}

	public String getMemberName()
	{
		return memberName;
	}

	public void setMemberName(String memberName)
	{
		this.memberName = memberName;
	}

	@Override
	public String toString()
	{
		return memberName + "회원님의 아이디는 " + memberId + "입니다.";
	}

//	@Override
//	public int compareTo(Member member)
	{
//		if (this.memberId > member.memberId)
//		return 1;
//		else if( this.memberId < member.memberId)
//		return -1;
//		else return 0;
//		오름 차순
		
//		return (this.memberId - member.memberId); //comparable
	}
	@Override
	public int compare(Member member1, Member member2)
	{
		
		return member1.memberId - member2.memberId;
	}
	
	
}
