package study;

import java.util.Objects;

/**
 * @Author yaozhuomin
 * @Date 2020/3/2 20:38
 * @return
 */
public class TestEquals {
    public static void main(String[] args) {

        User1 u1 = new User1(100,"lisa","123456");
        User1 u2 = new User1(100, "jery", "123457");

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
    }
}
class User1{
    int id;
    String name;
    String pwd;

    public User1(int id,String name,String pwd) {
        super();
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User1 user1 = (User1) o;
        return id == user1.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
