package PlaneGame;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

/**
 * @Author yaozhuomin
 * @Date 2020/3/14 16:59
 * @return 工具类
 */
public class GameUtil {
    private GameUtil(){

    }
    public static Image getImage(String path){
        BufferedImage bufferedImage = null;
        try {
            URL url = GameUtil.class.getClassLoader().getResource(path);
            bufferedImage = ImageIO.read(url);
        }catch (IOException e){
            e.printStackTrace();
        }
        return bufferedImage;
    }
}
