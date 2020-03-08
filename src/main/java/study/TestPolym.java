package study;

/**
 * @Author yaozhuomin
 * @Date 2020/3/3 17:59
 * @return  测试多态
 */
public class TestPolym {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animalCry(animal);

        Dog dog = new Dog();
        animalCry(dog);

        Cat cat = new Cat();
        animalCry(cat);
    }
    static void animalCry(Animal animal){
        animal.shout();
    }
}

class Animal{
    public void shout(){
        System.out.println("叫了一声");
    }
}
class Dog extends Animal{
    public void shout(){
        System.out.println("汪汪汪");
    }
}
class Cat extends Animal{
    public void shout(){
        System.out.println("喵喵喵");
    }
}
