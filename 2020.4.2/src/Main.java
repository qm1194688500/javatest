import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i <n ; i++) {
                arr[i] = sc.nextInt();
            }
            int cur = sc.nextInt();
            boolean flag = false;
            for (int i = 0; i <n ; i++) {
                if (arr[i]==cur){
                    System.out.println(i);
                    flag=true;
                    break;
                }
            }
            if (!flag){
                System.out.println(-1);
            }
        }
    }
}
