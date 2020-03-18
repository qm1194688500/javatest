class A{
    public A(String str) {
    }
}
public class demo {
    public static void main(String[] args) {
        A classa = new A("str");
        A classb = new A("str");
        System.out.println(classa==classb);
        int a = 10;
        double b = 3.14;
        System.out.println('A' + a+b);
    }
}
