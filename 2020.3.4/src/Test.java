public class Test {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "he" + new String("llo");
        System.out.println(str1==str2);
    }
}
