package PlaneGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @Author yaozhuomin
 * @Date 2020/3/14 16:08
 * @return 图形绘制
 */
public class MyGameFrame02 extends JFrame {
    Image plane = GameUtil.getImage("images/plane.png");

    @Override
    public void paint(Graphics graphics){
        super.paint(graphics);
        graphics.drawImage(plane,250,250,null);

    }




    /*
     * 初始化窗口
     * */
    public void launchFrame(){
        this.setTitle("姚卓敏作品02");
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
        MyGameFrame02 myGameFrame02 = new MyGameFrame02();
        myGameFrame02.launchFrame();
    }
}
