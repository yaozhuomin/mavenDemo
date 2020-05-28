package study;

/**
 * @Author yaozhuomin
 * @Date 2020/3/8 17:24
 * @return 数组练习
 */
public class  ArraysTest01 {
    public static void main(String[] args) {
        int[] arr01 = new int[10];

        for (int i=0;i<arr01.length;i++ ){
            arr01[i] = 10*i;
            System.out.println(i);
            System.out.println(arr01[i]);
        }
        Username[] arr03 = new Username[3];
        arr03[0] = new Username(100,"姚先生1");
        arr03[1] = new Username(101,"姚先生2");
        arr03[2] = new Username(102,"姚先生3");
        for (int i=0;i<arr03.length;i++){
            System.out.println(arr03[i].getId());
            System.out.println(arr03[i].getName());
        }
        for (int m:arr01){
            System.out.println(m);
        }

        String[] arr02 ={"a","b","c"};
        for (String tmp:arr02){
            System.out.println(tmp);
        }

    }
}
class Username{
    private  int id;
    private  String name;
    public Username(int id,String name){
        super();
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }
}
