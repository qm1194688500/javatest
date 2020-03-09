import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(method2(A,B));
    }
    public static int method(int A,int B){
        int x = A;
        int y = B;
        while(y!=0){
            if (x>y){
                int temp = x;
                x = y;
                y = temp%y;
            }else{
                int temp = x;
                x = y;
                y = temp;
            }
        }
        return x;
    }
    public static int method2(int a, int b){
        return a*b/method(a,b);
    }
}
