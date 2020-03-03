import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();
        int x = method(A,B);
        System.out.println(x);
    }
    public static int method(String A,String B){
        int i = 0;

        for (int j = 0; j <=A.length() ; j++) {
            StringBuilder stringBuilder = new StringBuilder(A);
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
