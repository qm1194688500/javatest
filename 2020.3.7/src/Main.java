import java.util.*;
public class Main {
    public static void main(String[] args) {
        //num1 = A-B;num2 = B-C;num3 = A+B;num4 = B+C;
        Scanner sc = new Scanner(System.in);
        int num1,num2,num3,num4;
        float A,B,C;
             num1 = sc.nextInt();
             num2 = sc.nextInt();
             num3 = sc.nextInt();
             num4 = sc.nextInt();
        A = (num1+num3)/2;
        B = (num2+num4)/2;
        C = (num4-num2)/2;
        if (A-(num1+num3)/2!=0){
            System.out.println("No");
            return;
        }
        if (B-(num2+num4)/2!=0||B-(num3-num1)/2!=0){
            System.out.println("No");
            return;
        }
        if (C-(num4-num2)/2!=0){
            System.out.println("No");
            return;
        }
        System.out.println((int)A +" " + (int)B + " " + (int)C);
        }

}
