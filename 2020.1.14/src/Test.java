public class Test {
    public static void main(String[] args) {
        int x = 20;
        int y = 5;
        System.out.println(x+y+"" +(x+y)+y);
        mystery(1234);
    }
    public static void mystery (int x) {
        System.out.print(x % 10);
        if ((x / 10) != 0){
            mystery(x / 10);
        }
        System.out.print(x % 10);
    }
    public  static String toLowerCase(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]<='Z' && chars[i]>='A'){
                chars[i] = (char) ((byte)chars[i] + 32);
            }
        }
        return String.valueOf(chars);
    }
}
