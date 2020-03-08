package study;

/**
 * @Author yaozhuomin
 * @Date 2020/3/3 17:15
 * @return 测试封装
 */
public class TestEncapsulation {
    public static void main(String[] args) {
    Persion2 persion2 = new Persion2();
    persion2.setId(100);
    persion2.getName("yaozhuomin");
        System.out.println(persion2.getId(1));
        persion2.setAge(111);
        System.out.println(persion2.getAge());
    }
}
