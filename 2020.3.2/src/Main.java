public class Main {
    public static void main(String[] args) {
        String A = "aba";
        String B = "b";
        int x = method(A,B);
        System.out.println(x);
    }
    public static int method(String A,String B){
        int i = 0;
        StringBuilder stringBuilder = new StringBuilder(A);
        for (int j = 0; j <=stringBuilder.length() ; j++) {
            stringBuilder.insert(j,B);

            if (judege(stringBuilder.toString())){
                i++;
            }
        }
        return i;
    }
    public static boolean judege(String temp){
        int length = temp.length();
        char[] chars = temp.toCharArray();
        for (int i = 0; i <length/2 ; i++) {
            if (chars [i] != chars[length-i-1]){
                return false;
            }
        }
        return true;
    }
}
