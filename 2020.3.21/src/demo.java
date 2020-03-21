public class demo {
    private int count;
    static boolean paddy;
    public static void main(String[] args) {
        demo d = new demo(88);
        System.out.println(d.count);
        System.out.println(paddy);
    }

     demo(int a) {
        count = a;
    }
}
