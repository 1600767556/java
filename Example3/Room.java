package Example3;

import java.util.Objects;

public class Room {
    private int no;
    private boolean status;
    private String type;

    public Room() {
    }

    public Room(int no, boolean status, String type) {
        this.no = no;
        this.status = status;
        this.type = type;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return no == room.no &&
                status == room.status &&
                Objects.equals(type, room.type);
    }

    @Override
    public String toString() {
        return "Room{" +
                "no=" + no +
                ", status=" + (status ?"空闲":"占用") +
                ", type=" + type +
                '}';
    }



}
