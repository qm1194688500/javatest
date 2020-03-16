/*
import java.util.*;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();
        String C = AddLongInteger(A,B);
        System.out.println(C);
    }
    public static String AddLongInteger(String addend,String augend){
     String add = addend;
     String aug = augend;
     StringBuilder ret = new StringBuilder();
     while (add.length()<aug.length()){
         add = "0"+add;
     }
     while (aug.length()<add.length()){
         aug = "0"+aug;
     }
     int cur = 0;
     int temp = 0;
        for (int i = add.length()-1; i>=0  ; i--) {
            temp = add.charAt(i)-'0'+aug.charAt(i)-'0'+cur;
            if (temp>=10){
                cur = temp/10;
                temp = temp%10;
            }else{
                cur=0;
            }
            ret.append(temp);
        }
        if (cur>0){
            ret.append(cur);
        }
        return ret.reverse().toString();
    }
}
//1361680
//4750391361917973848562
*/
import java.util.Scanner;

public class demo
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext())
        {
            String num1 = scanner.next();
            String num2 = scanner.next();
            StringBuffer sb = new StringBuffer();
            while (num1.length() < num2.length())
                num1 = "0" + num1;
            while (num1.length() > num2.length())
                num2 = "0" + num2;
            int carry = 0;
            int tmp = 0;
            for (int i = num1.length() - 1; i >= 0; i--)
            {
                tmp = num1.charAt(i) - '0' + num2.charAt(i) - '0' + carry;
                if (tmp >= 10)
                {
                    carry = tmp / 10;
                    tmp = tmp % 10;
                }
                else
                    carry = 0;
                sb.append(tmp);
            }
            if (carry > 0)
                sb.append(carry);
            System.out.println(sb.reverse().toString());
        }
    }
}

