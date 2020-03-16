abstract class Animal{
    abstract void say();
}
public class Cat extends Animal {
    public Cat(){
        System.out.println("cat");
    }
    public static void main(String[] args) {
        Cat cat = new Cat();
    }

    @Override
    void say() {

    }
}
