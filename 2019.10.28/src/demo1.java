class Person{
    private int age;
    private String name;
    private String sex;
    public Person() {
        this.name = "caocao";
        this.age = 18;
        this.sex = "男";
    }
    public Person(String name,int age,String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public void show(){
        System.out.println("name: " + name + "age: " + age + "sex: " +sex);
    }
    }
public class demo1 {
    public static void main(String[] args) {
        Person s = new Person();
        s.show();
        Person s1 = new Person("cocao",18,"男");
        s1.show();

    }
}
