import java.util.ArrayList;
import java.util.List;

class A<T> {

    T value;



    A(T value) {
        this.value = value;
    }


    T get() {

        return value;

    }

}
public class Test1{
   /* * A:泛型通配符<?>
	* 任意类型，如果没有明确，那么就是Object以及任意的Java类了
* B:? extends E
	* 向下限定，E及其子类
* C:? super E
	* 向上限定，E及其父类*/
   public static void main(String[] args) {
       A a = new A("aaa");
       System.out.println(a.get());
   }
    public static void main1(String[] args) {
        List<?> list = new ArrayList<String>();
    }
}