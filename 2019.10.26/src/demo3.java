class Person{
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setAge(int age){
        if (age > 0 && age<200){
        this.age = age;
        }else{
            System.out.println("请输入有效年龄");
        }
    }

    public int getAge() {
        return age;
    }

    public void speak(){
        System.out.println(name + "..." + age);
    }
}
public class demo3 {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("张三");
        p.setAge(-1);
        p.speak();
    }
}
