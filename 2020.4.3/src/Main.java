
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            double sum1 = factorial(n);
            double sum2 = count(n);
            double result = (sum2 / sum1) * 100;
            System.out.println(String.format("%.2f", result) + "%");
        }
    }
    private static double count(int n) {
        if(n==1){
            return 0;
        }else if(n==2){
            return 1;
        }else {
            return (n-1)*(count(n-1)+count(n-2));
        }
    }
    private static double factorial(int n) {
        double sum=1;
        while(n>1){
            sum=sum*n;
            n--;
        }
        return sum;
    }
    private  static double factorical2(int n){
        if(n==0||n==1){
            return 1;
        }
        return n*factorical2(n-1);
    }
}
 