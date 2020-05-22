package Example3;

import java.util.Random;

public class Hotel {
    private Room [][] rooms;

    public Hotel() {
        rooms = new Room[3][10];
        for (int i = 0; i <rooms.length ; i++) {
            for (int j = 0; j <rooms[i].length ; j++) {
                if (i==0) {
                    rooms[i][j] = new Room((i + 1) * 100 + j + 1, true, "单人间");
                }else if(i==1){
                    rooms[i][j] = new Room((i + 1) * 100 + j + 1, true, "标准间");
                }else if(i==2){
                    rooms[i][j] = new Room((i + 1) * 100 + j + 1, true, "总统套房间");
                }
            }
        }
    }
public void print(){
    for (int i = 0; i <rooms.length ; i++) {
        for (int j = 0; j <rooms[i].length ; j++) {
            System.out.print(rooms[i][j]);
        }
        System.out.println();
    }
}

public void order(int roomNo){
Room room = rooms[roomNo/100-1][roomNo%100-1];
room.setStatus(false);
    }


public void exit(int roomNo){
        Room room = rooms[roomNo/100-1][roomNo%100-1];
        room.setStatus(true);
    }
}
