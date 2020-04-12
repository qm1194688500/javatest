import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.nextLine();
            char[] arr = str.toCharArray();
            int[] ret = new int[26];
            for (char x: arr
                 ) {
                if ((x-65)>=0&&(x-65)<=25){
                    ret[x-65]++;
                }
            }
            for (int i = 'A'; i <='Z' ; i++) {
                System.out.println((char)i+":"+ret[i-65]);
            }
        }
    }
}
