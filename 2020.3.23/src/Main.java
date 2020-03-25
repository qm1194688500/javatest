import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

    }
    public boolean[] chkSubStr(String[] p, int n, String s) {
        boolean[] array = new boolean[p.length];
        for (int i = 0; i <p.length ; i++) {
            if (s.contains(p[i])){
                array[i]=true;
            }else{
                array[i]=false;
            }
        }
        return array;
    }
}
