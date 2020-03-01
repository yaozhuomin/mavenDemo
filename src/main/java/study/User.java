package study;

/**
 * @Author yaozhuomin
 * @Date 2020/3/1 20:35
 * @return
 */
public class User {
    int id;
    String name;
    String pwd;

    public User(){

    }
    public  User(int id,String name){
        super();
        this.id = id;
        this.name = name;
    }
    public User(int id,String name,String pwd){
        this.name = name;
        this.id = id;
        this.pwd = pwd;
    }

    public static void main(String[] args) {
        User u1 = new User();
        User u2 = new User(1,"姚先生");
        User u3 = new User(2,"yzm","123456");
        System.out.println(u1.id);
        System.out.println(u2.name);
        System.out.println(u3.pwd );
    }
}