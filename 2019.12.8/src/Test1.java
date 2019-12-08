import java.util.ArrayList;
import java.util.List;

class Student{
    public String name;
    public String calsses;
    public double mark;

    public Student(String name, String calsses, double mark) {
        this.name = name;
        this.calsses = calsses;
        this.mark = mark;
    }


 @Override
    public String toString() {
        return this.name+" " + this.calsses + " " +this.mark ;
    }
}
public class Test1 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("张三","一班",50.0));
        students.add(new Student("王五","二班",60.0));
        students.add(new Student("李四","三班",70.0));
        System.out.println(students.toString());
        /*for (Student student:students
             ) {
            System.out.println(student);
        }*/
    }
}
