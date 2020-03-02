package study;

/**
 * @Author yaozhuomin
 * @Date 2020/3/2 20:01
 * @return
 */
public class TestObiect {
    public static void main(String[] args) {
        TestObiect testObiect = new TestObiect();
        System.out.println(testObiect.toString());

        Presion2 presion2 = new Presion2("Tom",21);
        System.out.println(presion2.toString());
    }
    public String toString(){
        return "测试Object对象";
    }
}

class Presion2{
    String name;
    int age;

    @Override
    public String toString(){
        return name+",年龄："+age;
    }
    public Presion2(String name,int age){
        this.name = name;
        this.age = age;
    }
}
