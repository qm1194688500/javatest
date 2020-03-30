import java.util.*;
public class Main {
    public static int CGD(int a, int b){
        return a % b == 0 ? b : CGD(b, a % b);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNext()){
            int n = input.nextInt();
            int a = input.nextInt();
            int b;
            for(int i = 0; i < n; i++){
                b = input.nextInt();
                a += a >= b ? b : CGD(a, b);
            }
            System.out.println(a);
        }
    }
}
