package swingexample;

import javax.swing.*;
import java.awt.*;

public class SwingTest01 {
    public static void main(String[] args) {
        //创建一个无标题的JFram对象
        JFrame fr = new JFrame();
        //设置fr的标题
        fr.setTitle("这是一个JFram,它不同于AWT的Fram");
        //创建一个布局管理器FlowLayout的对象fl
        FlowLayout fl = new FlowLayout();
        //设定窗口fr的布局管理器为fl;
        fr.getContentPane().setLayout(fl);
        //设定fr的歀400,高300
        fr.setSize(400,300);
        //设置fr的背景色绿色
        fr.getContentPane().setBackground(Color.BLUE);
        //设定fr左上角的初始位置
        fr.setLocation(400,500);
        //设定fr为可调整大小
        fr.setResizable(true);
        //设定窗口可以关闭
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);

    }
}
