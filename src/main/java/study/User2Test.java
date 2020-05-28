package study;

/**
 * @Author yaozhuomin
 * @Date 2020/3/1 21:26
 * @return 测试值传递
 */
public class User2Test {
    int id;
    String name;
    String pwd;
    public User2Test(int id, String name){
        this.id = id;
        this.name = name;
    }
    public void TestParameterTransfer01(User2Test u){
        u.name = "姚先生";
    }

    public void TestParameterTransfer02(User2Test u){
        u = new User2Test(200,"yzm");
    }

    public static void main(String[] args) {
        User2Test u1 = new User2Test(100,"姚卓敏");
        u1.TestParameterTransfer01(u1);
        System.out.println(u1.name);

        u1.TestParameterTransfer02(u1);
        System.out.println(u1.name);
    }
}
