import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
        int n = sc.nextInt();
        String str = GetSequeOddNum(n);
        System.out.println(str);
        }
    }
    public static String GetSequeOddNum(int m){
        int x = m*(m-1)+1;
        StringBuilder str = new StringBuilder();
        for(int i=0;i<m;i++){
            if(i==m-1){
                str.append(x);
            }else{
                str.append(x+"+");
            }
            x+=2;
        }
        return str.toString();
    }
}