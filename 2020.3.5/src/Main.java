import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(method(x));
    }
    public static int method(int x){
        if (x%2!=0||x<6||x==10){
            return -1;
        }
        if (x%8==0){
            return x/8;
        }
        return 1+x/8;
    }
}
