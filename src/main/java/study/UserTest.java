package study;

/**
 * @Author yaozhuomin
 * @Date 2020/3/1 20:35
 * @return
 */
public class UserTest {
    int id;
    String name;
    String pwd;

    public UserTest(){

    }
    public UserTest(int id, String name){
        super();
        this.id = id;
        this.name = name;
    }
    public UserTest(int id, String name, String pwd){
        this.name = name;
        this.id = id;
        this.pwd = pwd;
    }

    public static void main(String[] args) {
        UserTest u1 = new UserTest();
        UserTest u2 = new UserTest(1,"姚先生");
        UserTest u3 = new UserTest(2,"yzm","123456");
        System.out.println(u1.id);
        System.out.println(u2.name);
        System.out.println(u3.pwd );
    }
}