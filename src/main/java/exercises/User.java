package exercises;

/**
 * @Author yaozhuomin
 * @Date 2020/5/28 23:45
 * @return
 */
public class User {
    /**
     * 姓名
     */
    String name;
    /**
     * 性别
     */
    String sex;
    /**
     * 年龄
     */
    int age;

    public User(String name, String sex, int age) {
        this.age = age;
        this.name = name;
        this.sex = sex;

    }


    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setSex(String sex){
        this.sex = sex;
    }
    public String getSex(){
        return sex;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}
