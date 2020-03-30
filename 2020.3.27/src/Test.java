import java.util.*;
public class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] credit = new double[n];
        double[] mark = new double[n];
        for (int i = 0; i <n ; i++) {
            credit[i] = sc.nextInt();
        }
        for (int i = 0; i <n ; i++) {
            mark[i] = sc.nextInt();
        }
        for (int i = 0; i <n ; i++) {
           if ( mark[i]>=90.0 && mark[i]<=100.0 ){
               mark[i] = 4.0*credit[i];
           }else if (mark[i]>=85.0 && mark[i]<=89.0){
               mark[i] = 3.7*credit[i];
           }else if (mark[i]>=82.0 && mark[i]<=84.0){
               mark[i] = 3.3*credit[i];
           }else if (mark[i]>=78.0 && mark[i]<=81.0){
               mark[i] = 3.0*credit[i];
           }else if (mark[i]>=75.0 && mark[i]<=77.0){
               mark[i] = 2.7*credit[i];
           }else if (mark[i]>=72.0 && mark[i]<=74.0){
               mark[i] = 2.3*credit[i];
           }else if (mark[i]>=68.0 && mark[i]<=71.0){
               mark[i] = 2.0*credit[i];
           }else if (mark[i]>=64.0 && mark[i]<=67.0){
               mark[i] = 1.5*credit[i];
           }else if (mark[i]>=60.0 && mark[i]<=63.0){
               mark[i] = 1.0*credit[i];
           }else {
               mark[i] = 0*credit[i];
           }
        }
        double ret = 0.0;
        double ret2 = 0.0;
        for (int i = 0; i <n ; i++) {
            ret+=mark[i];
            ret2+=credit[i];
        }
        System.out.println(String.format("%.2f",ret/ret2));
    }
}