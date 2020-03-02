package study;

/**
 * @Author yaozhuomin
 * @Date 2020/3/2 21:11
 * @return
 */
public class TestSuper {
    public static void main(String[] args) {
        new Child().f();
    }
}

class Father{
    public int value;
    public void f(){
        value = 100;
        System.out.println("Father.value"+value);
    }
}

class Child extends Father{
    public int value;
    public void f(){
        super.f();
        value = 200;
        System.out.println("Child.value="+value);
        System.out.println(value);
        System.out.println(super.value);

    }
}