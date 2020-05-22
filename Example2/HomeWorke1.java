package Example2;

public class HomeWorke1 {
    public static void main(String[] args) {
Vehicle v1 = new Vehicle();
v1.setSize(5);
v1.setSpeed(0);
        System.out.println("size: "+ v1.getSize()+"  speed: "+v1.getSpeed());
   //调用加速方法
        v1.speedup(10);

        System.out.println("speed: "+ v1.getSize()+"  size: "+v1.getSpeed());

        //调用减速方法
        v1.speedDown(5);
        System.out.println("size: "+ v1.getSize()+"  speed: "+v1.getSpeed());


    }
}

class Vehicle{
    private int speed;
    private int size;

    public Vehicle() {
    }

    public Vehicle(int speed, int size) {
        this.speed = speed;
        this.size = size;
    }

    public int getSpeed() {
        return speed;
    }
/*设置速度的方法*/
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public void move(){
        System.out.println("小汽车开始移动了哦!");
    }
//加速方法
    public void speedup(int addSpeed){
this .setSpeed(this.getSpeed()+addSpeed);
    }
//减速方法
    public void speedDown(int subSpeed){
this.setSpeed(this.getSpeed()-subSpeed);
    }
}