package study;

/**
 * @Author yaozhuomin
 * @Date 2020/3/1 23:31
 * @return 测试继承
 */
public class TestExtends {
    public static void main(String[] args) {
        Student1 stu = new Student1();
        stu.name = "yzm";
        stu.height = 178;
        stu.rest();

        Student1 stu2 = new Student1("yaosir",177,"计算机");
        System.out.println(stu2 instanceof Student1);
        System.out.println(stu2 instanceof  Persion);
        System.out.println(new Persion() instanceof Student1);
        System.out.println(stu2 instanceof Object);
    }

}
class Persion {
    String name;
    double height;

    public void rest() {
        System.out.println("休息一会");
    }
}
class Student1 extends Persion{

    String major;

    public void study(){
        System.out.println("学习俩小时");
    }
    public Student1(String name,double height,String major){
        this.name = name;
        this.height = height;
        this.major = major;
    }
    public Student1(){

    }

}