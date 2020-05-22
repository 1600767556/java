package Example3;

import java.util.Scanner;

public class HotelTest {
    public static void main(String[] args) {
        System.out.println("欢迎使用酒店管理系统,请认真阅读以下说明");
        Scanner input = new Scanner(System.in);

        Hotel hotel = new Hotel();

        System.out.println("输入[1]查看房间信息,输入[2]表示订房,输入[3]表示退房,[0]表示退出系统");

        while (true){
            System.out.println("请输入功能编号");
            int a = input.nextInt();
            switch (a){
                case 1:
                    System.out.println("查看房间列表");

                    hotel.print();
                    break;
                case 2:
                    System.out.println("表示订房");
                    System.out.println("请输入房间编号");
                    int number = input.nextInt();
                    hotel.order(number);
                    System.out.println("恭喜你预订成功!");
                    break;
                case 3:
                    System.out.println("表示退房");
                    System.out.println("请输入房间编号");
                    int number2 = input.nextInt();
                    hotel.exit(number2);
                    System.out.println("恭喜你退房成功,欢迎您的下次光临!");
                    break;
                case 0:
                    System.out.println("退出系统");
                    return;
                default:
                    System.out.println("出错啦!");
                    break;
            }
        }

    }
}
