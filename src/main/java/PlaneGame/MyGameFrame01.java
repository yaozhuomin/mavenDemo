package PlaneGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @Author yaozhuomin
 * @Date 2020/3/14 16:08
 * @return 飞机游戏主窗口
 */
public class MyGameFrame01 extends JFrame {
    /*
    * 初始化窗口
    * */
    public void launchFrame(){
        this.setTitle("姚卓敏作品");
        this.setVisible(true);
        this.setSize(500,500);
        this.setLocation(300,300);
        //关闭窗口
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        MyGameFrame01 myGameFrame = new MyGameFrame01();
        myGameFrame.launchFrame();
    }
}
