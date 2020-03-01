package study;

/**
 * @Author yaozhuomin
 * @Date 2020/3/1 18:00
 * @return
 */
public class Student {
    //属性
    int id;
    String name;
    int age;
    Computer computer;


    //方法
    void study(){
        System.out.println("我再认真学习"+computer.brand);
    }
    void play(){
        System.out.println("我在玩游戏");
    }

    public static void main(String[] args) {
        Student student = new Student(); //创建对象

        student.age = 18;
        student.id = 1001;
        student.name = "姚卓敏";
        Computer computer1 = new Computer();
        computer1.brand = "联想";

        student.computer = computer1;

        student.study();
        student.play();
    }
}
class Computer{
    String brand;
        }
