import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(method(A,B));
    }
    public static int method(int A,int B){
        if (A<B&&B%A==0){

            return B;
        }
        if (A>B&&A%B==0){

            return A;
        }
        return A*B;
    }
}
