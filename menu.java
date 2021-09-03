package 자바발표플;
import java.util.Scanner;
public class menu {
	 public static void main(String[] args)
	    {
	        Management management = new Management();
	        int temp = 0;
	        Scanner input = new Scanner(System.in);
	        
	        while(temp != 4){
	        	System.out.println("[LaLaLa StudyRoom]");
	            System.out.println("1. 입장");
	            System.out.println("2. 퇴장");
	            System.out.println("3. 관리자");
	            System.out.println("4. 종료");
	            System.out.print("-->");
	            temp = input.nextInt();

	            switch(temp){
	                case 1 :
	                    management.setIn();
	                    break;
	                case 2 :
	                    management.setOut();
	                    break;
	                case 3 :
	                    management.admin();
	                    break;
	                default :
	                	System.out.println("프로그램이 종료됩니다.");
	                    break;
	            }
	        }
	    }
}
