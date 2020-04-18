import java.util.*;
public class Test {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       while (sc.hasNext()){
           int year = sc.nextInt();
           int month = sc.nextInt();
           int day = sc.nextInt();
           int Day = Day(year,month,day);
           System.out.println(Day);
       }
    }
    public static int Day(int year,int month,int day){
        int[] Month = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (year%4==0&&year%100!=0||year%400==0){
            Month[1] = 29;
        }
        if (year<0||month<=0||month>12||day<0||day>Month[month-1]){
            return -1;
        }
        int sum = 0;
        for (int i = 0; i < month-1; i++) {
            sum+=Month[i];
        }
        return sum+day;
    }
}
