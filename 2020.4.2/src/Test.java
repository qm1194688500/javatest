import java.util.*;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            String str = sc.nextLine();
            if (JudgeChar(str)&&JudgeLength(str)&&ChildStr(str)){
                System.out.println("OK");
            }else{
                System.out.println("NG");
            }
        }
    }
    public static boolean JudgeLength(String str){
        if (str.length()>8){
            return true;
        }
        return false;
    }
    public static boolean ChildStr(String str){
        for (int i = 0; i <str.length()-2 ; i++) {
            if (str.substring(i+1).contains(str.substring(i,i+3))){
                return false;
            }
        }
        return true;
    }
    public static boolean JudgeChar(String str){
        int a=0,b=0,c=0,d = 0;
        char[] arr = str.toCharArray();
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>'a'&&arr[i]<'z'){
                a=1;
            }else if (arr[i]>'A'&&arr[i]<'Z'){
                b=1;
            }else if (arr[i]>'0'&&arr[i]<'9'){
                c=1;
            }else{
                d=1;
            }
            if ((a+b+c+d)>=3){
                return true;
            }
        }
        return false;
    }
}
