package study.Interface;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * @Author yaozhuomin
 * @Date 2020/3/14 17:26
 * @return
 */
public class MyClass implements MyInterface {
    @Override
    public void test01() {

    }

    @Override
    public int test02(int a, int b) {
        System.out.println("MyClass.test02()");
        return a+b;
    }
}
