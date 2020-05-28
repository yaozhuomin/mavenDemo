package exercises;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author yaozhuomin
 * @Date 2020/5/28 23:54
 * @return
 */
public class UserList {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        User user = new User("张三","男",12);
        users.add(user);
        System.out.println(users.size());
       /* User temp = (User)users.get(0);
        System.out.println("========="+temp.sex+";"+temp.name+";"+temp.age);*/
        for (Iterator<User> iterator = users.iterator();iterator.hasNext();){
            User value = iterator.next();
            System.out.println(value);
        }
        for (int i = 0;i<users.size();i++){
            System.out.println(users.get(i));
        }
        for (User user1:users){
            System.out.println(user1);
        }
        Iterator<User> iterator1 = users.iterator();
        while (iterator1.hasNext()){
            User i = iterator1.next();
            System.out.println(i);
        }
    }
}
