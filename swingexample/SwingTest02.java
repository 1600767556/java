package swingexample;

import javax.swing.*;
import java.awt.*;

public class SwingTest02 {
    public static void main(String[] args) {
        JFrame fr = new JFrame();
        fr.setTitle("JPanel的用法");
        //创建一个布局管理器BorderLayout的对象b1
        BorderLayout bl = new BorderLayout();
        //设定fr的布局管理器为bl
        fr.getContentPane().setLayout(bl);
        //创建一个JPanel对象jp,其布局管理器为2行2列的GirdLayout
        JPanel jp = new JPanel( new GridLayout(2,2));
        //将容器jp加到窗口的中央
        fr.getContentPane().add("Center",jp);
        //创建一个JLable对象 名字为 this is test
        JLabel jLabel = new JLabel("this is test");
        //将jLable加到窗口fr南部
        fr.getContentPane().add("South",jLabel);

        JLabel l1 = new JLabel("First",JLabel.CENTER);
        jp.add(l1);

        JLabel l2 = new JLabel("First",JLabel.CENTER);
        jp.add(l2);

        JLabel l3 = new JLabel("First",JLabel.CENTER);
        jp.add(l3);

        JLabel l4 = new JLabel("First",JLabel.CENTER);
        jp.add(l4);

        JLabel l5 = new JLabel("First",JLabel.CENTER);
        jp.add(l5);
        //定义一个字体对象
        Font ft = new Font("Serif",Font.BOLD,18);
        jLabel.setFont(ft);
        l1.setFont(ft);
        l2.setFont(ft);
        l3.setFont(ft);
        l4.setFont(ft);
        //设定背景色
        fr.getContentPane().setBackground(Color.blue);
        jp.setBackground(Color.red);
        //设定窗口的初始位置
        fr.setLocation(300,500);
        //设定窗口可以关闭
        fr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        fr.setSize(400,300);
        fr.setResizable(true);
        fr.setVisible(true);




    }
}
