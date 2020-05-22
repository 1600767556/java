package Example7;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 555516245443047316L;
    // private static final long serialVersionUID = 1600767556L;
   // private static final long serialVersionUID = 8683452581122892189L;

    private  int no;
    private String name;
private String address;
private String emil;
    public Student() {
    }

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }
}

