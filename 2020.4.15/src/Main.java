import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            if (Judeg(str)) {
                System.out.println("YES");
            } else {
                StringBuilder stringBuilder = new StringBuilder(str);
                boolean flag = false;
                for (int i = 0; i < str.length(); i++) {
                    StringBuilder str1 = stringBuilder.deleteCharAt(i);
                    if (Judeg(str1.toString())) {
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
    public static boolean Judeg(String str){
        StringBuilder stringBuilder = new StringBuilder(str);
        String str1 = stringBuilder.reverse().toString();
        if (str1.equals(stringBuilder.toString())){
            return true;
        }else{
            return false;
        }
    }
}
