package �ڹٹ�ǥ��;
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

        System.out.print("�̸��� �Է��ϼ��� : ");
        name = input.next();

        //seatMan.setSeat(seat,seat);
        seatMan.print();
        seatMan.currentSeat();

        System.out.print("���ϴ� �¼��� ������ : ");
        seat = input.nextInt();

        if((seat >= 11 && seat <= 15) || (seat >= 21 && seat <= 25)){
            if(seatMan.getSeat(seat/10-1, seat%10-1)){
                System.out.println("��� ��");
            }else{
                seatMan.setSeat(seat/10-1, seat%10-1);
                cst[currentNo].name = name;
                cst[currentNo].seadID = seat;
                currentNo++;
                System.out.println("���õǾ����ϴ�.");
            }
        }
       
    }

    public void setOut(){
    	
        String name = "";
        Scanner input = new Scanner(System.in);
      
       
        System.out.print("�̸��� �Է��ϼ��� : ");
        name = input.next();
        

        for(int i = 0; i < cst.length; i++){
            if(cst[i].name.equals(name)){
                if(cst[i].seadID > 0){
                    if(seatMan.getSeat(cst[i].seadID/10-1, cst[i].seadID%10-1)){
                        seatMan.releaseSeat(cst[i].seadID/10-1, cst[i].seadID%10-1);
                        cst[i].seadID = 0;
                        
                        cst[i].name = "";
                        currentNo--;
                       
                      
                        //System.out.println("����� �¼���ȣ�� "+seat+"�Դϴ�.");
                        System.out.println("�����Ǿ����ϴ�.");
                    }
                }
            }
        }
       
    }

    public void admin(){

        Scanner input = new Scanner(System.in);

        System.out.println("1. ���� �¼� ���� ����");
        System.out.println("2. ��ü �¼� ���� �ϱ�");
        System.out.println("3. �մ� ��Ȳ ����");
        System.out.println("4. �� ���� Ȯ���ϱ�");
        
        switch(input.nextInt()){
            case 1 :
            	System.out.println("[���� �¼� ����]");
                seatMan.print();
                System.out.println("�� �¼�: "+currentNo);
    			System.out.println("���� �¼�: "+(10-currentNo));
                break;
            case 2 :
                seatMan.clear();
                currentNo=0;
                System.out.println("��� �¼��� �����Ǿ����ϴ�.");
                cstClear();
                break;
            case 3:
            	pay.setCheckIn();
            	
            	System.out.println();
            	
            	break;
            case 4:
            	//System.out.println("�� ���� Ȯ���ϱ�");
            	break;
            default :
                break;
        }
       
    }

}
