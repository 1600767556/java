package Example8;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
/*
使用定时器定时任务
 */
public class TimerTest {
    public static void main(String[] args) throws Exception{
        Timer timer = new Timer();
        //Timer timer = new Timer(true);   这个是守护线程
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        Date firstTime = sdf.parse("2020-05-18 21:08:00:000");
        timer.schedule(new LogTimer(),firstTime,1000*10);


        /*也可以使用匿名内部类的方式
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("wancheng");
            }
        },firstTime,1000*10);*/
    }
}

class LogTimer extends TimerTask{

    @Override
    public void run() {
        //这里编写需要执行的任务就行了
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        String strTime = sdf.format(new Date());
        System.out.println(strTime+"完成了一次数据备份");
    }
}
