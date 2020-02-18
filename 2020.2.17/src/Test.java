class Outer {
    public int num = 10;
    class Inner {
        public int num = 20;
        public void show() {
            int num = 30;
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(Outer.this.num);
        }
    }
}
abstract class Person {
    public abstract void show();
}

class PersonDemo {
    public void method(Person p) {
        p.show();
    }
}
interface Inter { void show(); }
class Outer1 {
    public static Inter method(){
        return new Inter() {
            @Override
            public void show() {
                System.out.println("hello world");
            }
        };
    }
}
    //要求在控制台输出”HelloWorld”
public class Test {
    public static void main(String[] args) {
       // Outer.Inner oi = new Outer().new Inner();
       // oi.show();
        PersonDemo pd = new PersonDemo ();
        pd.method(new Person() {
            @Override
            public void show() {
                System.out.println("show");
            }
        });
        Outer1.method().show();
    }
    }

