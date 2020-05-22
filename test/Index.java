package test;
import java.util.Scanner;
public class Index {
    public static void main(String[] args) {
        System.out.println("欢迎使用哒哒租车系统");
        System.out.println("您是否要租车?1-是,0-否");
        Scanner input = new Scanner(System.in);
        int isRent = input.nextInt();
        if(isRent==1){
            System.out.println("您可租车的类型和价目表:");
            System.out.println("序号 汽车名称 租金 容客量");
            Car [] cars = {new AManned("载人1",500,4),
                           new AManned("载人2",400,5),
                           new AMulti("皮卡1",500,4,3),
                           new ATruck("载货1",700,600),
                           new ATruck("载货2",900,500),
            };

            for (int i = 0; i <cars.length ; i++) {
                int index = i+1;
                if (cars[i] instanceof AManned){
                    AManned car = (AManned) cars[i];
                    System.out.println(index+" "+car.getName()+" "+
                            car.getPrice()+"元/天"+"载人:"+
                            car.getPersonCount()+"人");


                }else if (cars[i] instanceof ATruck){
                    ATruck car = (ATruck) cars[i];
                    System.out.println(index+""+car.getName()+""+
                            car.getPrice()+"元/天"+"载货:"+
                            car.getProductCount()+"吨");


                }else{
                    AMulti car = (AMulti) cars[i];
                    System.out.println(index+""+car.getName()+""+
                            car.getPrice()+"元/天"+"载货:"+
                            car.getProductCount()+"吨"
                            +"载人:"+ car.getPersonCount()+"人");
                }

            }
            //选择要租的车,并且记录下来
            System.out.println("请选择要租车的数量");
            int carscount = input.nextInt();
            Car [] chooseCare = new Car[carscount];
            for (int i = 0; i < carscount; i++) {
                int cycle = i+1;
                System.out.println("请选择第"+cycle+"辆车");
                int carNum = input.nextInt();
                chooseCare[i] = cars[carNum-1];
            }
            //选择租车天数,并计算租金
            System.out.println("请选择租车的天数:");
            int days= input.nextInt();
            double singleSum = 0;
            double sum = 0;
            for (Car aCar: chooseCare
                 ) {
                singleSum += aCar.getPrice();
            }
            sum=singleSum*days;
            System.out.println("您的租金是:"+sum);
            
            
        }else{
            System.out.println("欢迎您的光临");
        }
    }
}
