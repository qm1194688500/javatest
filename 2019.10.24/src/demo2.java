class Person{
    //字段：类中，方法外定义的变量，用于描述类中包含了那些数据
    public int age;
    public int stature;
    public String name;
    public void eat(){
        System.out.println("吃饭");
    }
    public void sleep(){
        System.out.println("睡觉");
    }
}
public class demo2 {
    public static void main(String[] args) {
        Person s = new Person();
        s.eat();
        s.sleep();
    }

}
