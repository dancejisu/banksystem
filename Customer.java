package 자바발표플;

public class Customer extends Person{
	 int seadID; // 손님의 좌석번호 저장
	 long statTime;
	 long endTime;
	 
	    Customer(){}
	    Customer(String name){
	        super(name);
	        seadID = 0;
}
}
