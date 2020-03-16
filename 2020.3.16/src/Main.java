import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String c = sc.next();
        method(n,c);
    }
    public static void method(int n,String c){
        for (int i = 0; i <(n+1)/2 ; i++) {
            for (int j = 0; j <n ; j++) {
                if (i==0||i==(n+1)/2-1){
                    System.out.print(c);
                }else{
                    if (j==0||j==n-1){
                        System.out.print(c);
                    }else{
                        System.out.print(" ");
                    }
                }

            }
            System.out.println();
        }
    }
}
