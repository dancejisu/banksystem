package �ڹٹ�ǥ��;

public class SeatManage {
	boolean setTable[][] = new boolean[2][5];
    int vecantSeat = 10;

    SeatManage(){
        clear();
    }

    public void clear(){
        for(int i = 0 ; i < setTable.length; i++){
            for(int j = 0 ; j < setTable[i].length; j++){
                setTable[i][j] = false;
            }
        }
        vecantSeat = 10;
    }

    public void print(){
        String str = "";

        for(int i = 0 , x = 1; i < setTable.length; i++, x++){
            for(int j = 0 , y = 1; j < setTable[i].length; j++, y++){
                if(setTable[i][j]){
                    str += "C["+x+y+"]";
                }else{
                    str += "V["+x+y+"]";
                } 
                str += "    ";
            }
            str += "\n";
        }
        System.out.println(str);
        
    }

    public void setSeat(int x, int y){
        if(setTable[x][y]){
            System.out.println("�̹� ��� �� �Դϴ�.");
        }else{
            setTable[x][y] = true;
            vecantSeat--;
        } 
    }

    public void releaseSeat(int x, int y){
        if(setTable[x][y]){
            setTable[x][y] = false;
            vecantSeat++;
        }
    }

    public void currentSeat(){
        System.out.println("���� ���� �¼��� "+vecantSeat+"�� �Դϴ�.(V:���¼�/C:���¼�).");
    }

    public boolean getSeat(int x, int y){
        return setTable[x][y];
    }
}
