import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();
        System.out.println(method(str,n));
    }
    public static String method(String str,int n){
        int max = 0;
        int BeginIndex = 0;
        int length = str.length();
        for (int i = 0; i <length-n ; i++) {
            int count = 0;
            for (int j = i; j <i+n ; j++) {
                if (str.charAt(j)=='G'||str.charAt(j)=='C'){
                    count++;
                }
                if (count>max){
                    BeginIndex = i;
                    max = count;
                }
            }

        }
        return str.substring(BeginIndex,BeginIndex+n);
    }
}
