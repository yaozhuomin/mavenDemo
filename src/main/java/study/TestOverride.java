package study;

/**
 * @Author yaozhuomin
 * @Date 2020/3/2 18:35
 * @return  测试重写
 */
public class TestOverride {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.run();
    }

}

class Vehicle{
    public  void run(){
        System.out.println("跑。。。");
    }
    public void stop(){
        System.out.println("停下");
    }
    public  Persion whoIsPsg(){
        return new Persion();
    }
}
class Horse extends Vehicle{
    public  void run(){
        System.out.println("四蹄翻飞，得得得");
    }

    //返回值类型小于等于父类得类型
    public Student1 whoIsPsg(){
        return new Student1();
    }
}