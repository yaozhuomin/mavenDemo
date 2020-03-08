package study;

/**
 * @Author yaozhuomin
 * @Date 2020/3/3 17:26
 * @return
 */
public class Persion2 {
    private int id;
    String name;
    private double age;

    public void setName(String name){
        this.name = name;
    }
    public String getName(String s){
        return this.name = name;
    }

    public void setId(int id){
        if (id>=1000&&id<=10000){
            this.id = id;
        }else {
            System.out.println("请输入正确的id");
        }
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public int getId(int id){
        return this.id = id;
    }
}
