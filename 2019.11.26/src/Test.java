public class Test {
    public static boolean method(String string){
        int length = string.length();
        char[] data = string.toCharArray();
        for (int i = 0; i <length ;i++){
            if (data[i] < '0' || data[i] > '9')
                return false;
            }
        return true;
    }
    public static void main(String[] args) {
        String a = "123435a";
        System.out.println(method(a));
    }
}
