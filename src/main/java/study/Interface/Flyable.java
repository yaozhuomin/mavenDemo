package study.Interface;

/**
 * @Author yaozhuomin
 * @Date 2020/3/14 17:34
 * @return
 */
public interface Flyable {
    int MXA_SPEED = 11000;
    int MIN_HEIGHT = 1;
    void fly();
}
interface Attack{
    void Attack();
}
class Plane implements Flyable{
    @Override
    public void fly() {
        System.out.println("飞机依靠发动机飞行");
    }
}
class Man implements Flyable{
    @Override
    public void fly() {
        System.out.println("跳起来");
    }
}
class Stone implements Flyable,Attack{
    @Override
    public void Attack() {
        System.out.println("攻击");
    }

    @Override
    public void fly() {
        System.out.println("被人认出去");
    }
}