import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        HashSet<String> hashSet = new HashSet<String>();
        while (sc.hasNextLine()){
            String s = sc.nextLine();
            String[] temp = s.split(" ");
            for (int i = 0; i <temp.length ; i++) {
                hashSet.add(temp[i]);
            }
        }
        System.out.println(hashSet.size());*/
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int x = 0;
        while (b<n){
            x = a+b;
            a=b;
            b=x;
        }
        if (Math.abs(b-n)>Math.abs(a-n)){
            System.out.println(Math.abs(a-n));
        }else{
            System.out.println(Math.abs(b-n));
        }
    }
}
