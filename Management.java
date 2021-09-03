package 자바발표플;
//import java.util.ArrayList;
import java.util.Scanner;
public class Management {
	private int currentNo = 0;
	Customer cst[] = new Customer[10];
	//ArrayList<Customer>cst=new ArrayList<Customer>(10);
    SeatManage seatMan = new SeatManage();
    Payment pay= new Payment();
  

    Management(){
        cstClear();
    }
    
    public void cstClear(){
        for(int i = 0; i < cst.length; i++){
            cst[i] = new Customer("");
        }
    }

    public void setIn(){
        String name = "";
        int seat = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("이름을 입력하세요 : ");
        name = input.next();

        //seatMan.setSeat(seat,seat);
        seatMan.print();
        seatMan.currentSeat();

        System.out.print("원하는 좌석을 고르세요 : ");
        seat = input.nextInt();

        if((seat >= 11 && seat <= 15) || (seat >= 21 && seat <= 25)){
            if(seatMan.getSeat(seat/10-1, seat%10-1)){
                System.out.println("사용 중");
            }else{
                seatMan.setSeat(seat/10-1, seat%10-1);
                cst[currentNo].name = name;
                cst[currentNo].seadID = seat;
                currentNo++;
                System.out.println("선택되었습니다.");
            }
        }
       
    }

    public void setOut(){
    	
        String name = "";
        Scanner input = new Scanner(System.in);
      
       
        System.out.print("이름을 입력하세요 : ");
        name = input.next();
        

        for(int i = 0; i < cst.length; i++){
            if(cst[i].name.equals(name)){
                if(cst[i].seadID > 0){
                    if(seatMan.getSeat(cst[i].seadID/10-1, cst[i].seadID%10-1)){
                        seatMan.releaseSeat(cst[i].seadID/10-1, cst[i].seadID%10-1);
                        cst[i].seadID = 0;
                        
                        cst[i].name = "";
                        currentNo--;
                       
                      
                        //System.out.println("당신의 좌석번호는 "+seat+"입니다.");
                        System.out.println("해제되었습니다.");
                    }
                }
            }
        }
       
    }

    public void admin(){

        Scanner input = new Scanner(System.in);

        System.out.println("1. 현재 좌석 상태 보기");
        System.out.println("2. 전체 좌석 리셋 하기");
        System.out.println("3. 손님 현황 보기");
        System.out.println("4. 총 수입 확인하기");
        
        switch(input.nextInt()){
            case 1 :
            	System.out.println("[현재 좌석 상태]");
                seatMan.print();
                System.out.println("찬 좌석: "+currentNo);
    			System.out.println("남은 좌석: "+(10-currentNo));
                break;
            case 2 :
                seatMan.clear();
                currentNo=0;
                System.out.println("모든 좌석이 해제되었습니다.");
                cstClear();
                break;
            case 3:
            	pay.setCheckIn();
            	
            	System.out.println();
            	
            	break;
            case 4:
            	//System.out.println("총 수입 확인하기");
            	break;
            default :
                break;
        }
       
    }

}
