package 자바발표플;

public class Payment {
	Customer na = new Customer();
	static int total_Income;
	final int FEE_PER_MINUTE=100;
	final int FEE_PER_HOUR=5000;
	
	long setCheckIn()
	{
		System.out.println("좌석번호"+"  "+"이름");
		System.out.println("-----------------");
		na.name="";
		na.seadID=0;
		System.out.println(na.seadID+"   "+na.name);
		
		return 0;
	}

}
